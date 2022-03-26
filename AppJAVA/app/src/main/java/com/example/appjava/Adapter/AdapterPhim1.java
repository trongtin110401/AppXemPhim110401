package com.example.appjava.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appjava.R;
import com.example.appjava.detail;
import com.example.lib.Model.PhimModel;
import com.squareup.picasso.Picasso;

public class AdapterPhim1 extends RecyclerView.Adapter<MyviewHoder> {
    Context context;
    final PhimModel[] phimModels;
    public AdapterPhim1(Context context, PhimModel[] phimModels){
        this.context= context;
        this.phimModels=phimModels;
    }
    @NonNull
    @Override
    public MyviewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.phim_activity,parent,false);
        return new  MyviewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHoder holder, int position) {
        final PhimModel temp = phimModels[position];
        holder.txtName.setText(phimModels[position].getTenPhim());
        Picasso.get().load(phimModels[position].getLinkimg()).into(holder.hinh);
        holder.layoutitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickgotoDetail(temp);
            }
        });
    }
    private void onClickgotoDetail(PhimModel temp){
        Intent intent = new Intent(context, detail.class);
        intent.putExtra("key_1",temp.getLinkPhim());
        intent.putExtra("key_2",temp.getTenPhim());
        intent.putExtra("key_3", temp.getMota());
        intent.putExtra("key_4", temp.getLinkimg());
        context.startActivity(intent);
    }
    @Override
    public int getItemCount() {
        return phimModels.length;
    }
}