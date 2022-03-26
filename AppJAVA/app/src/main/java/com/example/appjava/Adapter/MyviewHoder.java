package com.example.appjava.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.appjava.R;

public class MyviewHoder extends RecyclerView.ViewHolder{
    public TextView txtName;
    public ImageView hinh;
    androidx.cardview.widget.CardView layoutitem;
    public MyviewHoder(View item){
        super(item);
        layoutitem = item.findViewById(R.id.layout_item);
        txtName= item.findViewById(R.id.txtName);
        hinh = item.findViewById(R.id.imgPhim);
    }
}