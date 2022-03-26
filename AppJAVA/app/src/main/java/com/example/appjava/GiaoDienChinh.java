package com.example.appjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.example.appjava.Adapter.AdapterPhim1;
import com.example.lib.Model.PhimModel;
import com.example.lib.Repository.Methods;
import com.example.lib.Repository.RetrofitClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GiaoDienChinh extends AppCompatActivity {

    RecyclerView theloai1;
    RecyclerView theloai2,theloai3,theloai4,theloai5;
    AdapterPhim1 adapterphim1,adapterphim2,adapterphim3,adapterphim4,adapterphim5;
    ArrayList<PhimModel> t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_giao_dien_chinh);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        theloai1 = findViewById(R.id.theloai1);
        theloai1.setHasFixedSize(true);
        theloai1.setLayoutManager(layoutManager);

        LinearLayoutManager layoutManager1= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        theloai2 = findViewById(R.id.theloai2);
        theloai2.setHasFixedSize(true);
        theloai2.setLayoutManager(layoutManager1);

        LinearLayoutManager layoutManager2= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        theloai3 = findViewById(R.id.theloai3);
        theloai3.setHasFixedSize(true);
        theloai3.setLayoutManager(layoutManager2);

        LinearLayoutManager layoutManager3= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        theloai4 = findViewById(R.id.theloai4);
        theloai4.setHasFixedSize(true);
        theloai4.setLayoutManager(layoutManager3);

        LinearLayoutManager layoutManager4= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        theloai5 = findViewById(R.id.theloai5);
        theloai5.setHasFixedSize(true);
        theloai5.setLayoutManager(layoutManager4);

        Methods methods = RetrofitClient.getRetrofit().create(Methods.class);
        Call<PhimModel[]> call =  methods.getTheloai1();
        call.enqueue(new Callback<PhimModel[]>() {
            @Override
            public void onResponse(Call<PhimModel[]> call, Response<PhimModel[]> response) {
                PhimModel[] data = response.body();
                adapterphim1 = new AdapterPhim1(GiaoDienChinh.this,data);
                theloai1.setAdapter(adapterphim1);
                theloai1.setVisibility(View.VISIBLE);

            }
            @Override
            public void onFailure(Call<PhimModel[]> call, Throwable t) {
            }
        });
        Call<PhimModel[]> call1 =  methods.getTheloai2();
        call1.enqueue(new Callback<PhimModel[]>() {
            @Override
            public void onResponse(Call<PhimModel[]> call, Response<PhimModel[]> response) {
                PhimModel[] data = response.body();
                adapterphim2 = new AdapterPhim1(GiaoDienChinh.this,data);
                theloai2.setAdapter(adapterphim2);
                theloai2.setVisibility(View.VISIBLE);
                for (PhimModel dt:data)
                {
                    Toast.makeText(GiaoDienChinh.this,dt.getLinkimg(),Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onFailure(Call<PhimModel[]> call, Throwable t) {
            }
        });
        Call<PhimModel[]> call2 =  methods.getTheloai3();
        call2.enqueue(new Callback<PhimModel[]>() {
            @Override
            public void onResponse(Call<PhimModel[]> call, Response<PhimModel[]> response) {
                PhimModel[] data = response.body();
                adapterphim3 = new AdapterPhim1(GiaoDienChinh.this,data);
                theloai3.setAdapter(adapterphim3);
                theloai3.setVisibility(View.VISIBLE);
            }
            @Override
            public void onFailure(Call<PhimModel[]> call, Throwable t) {
            }
        });
        Call<PhimModel[]> call3 =  methods.getTheloai4();
        call3.enqueue(new Callback<PhimModel[]>() {
            @Override
            public void onResponse(Call<PhimModel[]> call, Response<PhimModel[]> response) {
                PhimModel[] data = response.body();
                adapterphim4 = new AdapterPhim1(GiaoDienChinh.this,data);
                theloai4.setAdapter(adapterphim4);
                theloai4.setVisibility(View.VISIBLE);
            }
            @Override
            public void onFailure(Call<PhimModel[]> call, Throwable t) {
            }
        });
        Call<PhimModel[]> call4 =  methods.getTheloai5();
        call4.enqueue(new Callback<PhimModel[]>() {
            @Override
            public void onResponse(Call<PhimModel[]> call, Response<PhimModel[]> response) {
                PhimModel[] data = response.body();
                adapterphim5 = new AdapterPhim1(GiaoDienChinh.this,data);
                theloai5.setAdapter(adapterphim5);
                theloai5.setVisibility(View.VISIBLE);
            }
            @Override
            public void onFailure(Call<PhimModel[]> call, Throwable t) {
            }
        });
    }

    public void goTimKiem(View view) {
        Intent intent = new Intent(GiaoDienChinh.this, TimKiem.class);
        startActivity(intent);
    }
}