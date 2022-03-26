package com.example.appjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appjava.Adapter.UserAdapter;
import com.example.lib.Model.UserModel;
import com.example.lib.Repository.Methods;
import com.example.lib.Repository.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DangNhap extends AppCompatActivity {
    Button DangNhap,dangKi;
    EditText tk,mk;
    String id;
    Boolean kt=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dang_nhap);
        DangNhap = findViewById(R.id.btnDangNhap);
        dangKi = findViewById(R.id.btnDangKi);
        kt=false;
        dangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangNhap.this,DangKi.class);
                startActivity(intent);
            }
        });
        DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tk = findViewById(R.id.txtTK);
                mk = findViewById(R.id.txtMK);
                UserAdapter userAdapter = new UserAdapter(DangNhap.this,R.layout.itemuser);
                Methods methods = RetrofitClient.getRetrofit().create(Methods.class);
                Call<UserModel[]> call = methods.getUser();
                call.enqueue(new Callback<UserModel[]>() {
                    @Override
                    public void onResponse(Call<UserModel[]> call, Response<UserModel[]> response) {
                        UserModel[] data = response.body();
                        for (UserModel dt:data
                        ) {
                            if(dt.getTKUser().equals(tk.getText().toString()) && dt.getMKUser().equals(mk.getText().toString())){
                                kt = true;
                            }
                        }
                    }
                    @Override
                    public void onFailure(Call<UserModel[]> call, Throwable t) {

                    }
                });
                if(kt==true){
                    Intent intent = new Intent(DangNhap.this,GiaoDienChinh.class);
                    startActivity(intent);
                }
            }
        });
    }
}