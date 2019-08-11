package com.sr7d.happyly;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    Context context;
    int [] emo;
    MyClickListener myClickListener;
    public MyAdapter(Context context, int[] emo, MyClickListener myClickListener) {
        this.context = context;
        this.emo = emo;
        this.myClickListener = myClickListener;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.emo_item_layout,viewGroup,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.imageView.setImageResource(emo[i]);
        myHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myClickListener.OnItemClick();
            }
        });
    }

    @Override
    public int getItemCount() {
        return emo.length;
    }


    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.emo_img);
        }
    }
    public interface MyClickListener{
        void OnItemClick();
    }
}
