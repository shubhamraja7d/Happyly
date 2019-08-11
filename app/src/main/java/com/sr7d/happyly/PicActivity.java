package com.sr7d.happyly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class PicActivity extends AppCompatActivity {

    static int[] emo = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
            R.drawable.pic4, R.drawable.pic5, R.drawable.pic6,
            R.drawable.pic7, R.drawable.pic8, R.drawable.pic9, R.drawable.pic10,
            R.drawable.pic11, R.drawable.pic12};

    RecyclerView recyclerView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);
        recyclerView = findViewById(R.id.pic_rec_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        myAdapter = new MyAdapter(this, emo, new MyAdapter.MyClickListener() {
            @Override
            public void OnItemClick() {
                startActivity(new Intent(PicActivity.this,MotivationActivity.class));
            }
        });
        recyclerView.setAdapter(myAdapter);
    }
}
