package com.sr7d.happyly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class EmoActivity extends AppCompatActivity {

    static int[] emo = {R.drawable.emo_happy, R.drawable.emo_angry, R.drawable.emo_bored,
            R.drawable.emo_confused, R.drawable.emo_crying, R.drawable.emo_happy1,
            R.drawable.emo_happy2, R.drawable.emo_quiet, R.drawable.emo_sad, R.drawable.emo_smiling,
            R.drawable.emo_surprised, R.drawable.emo_unhappy};

    RecyclerView recyclerView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emo);

        recyclerView = findViewById(R.id.emo_rec_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        myAdapter = new MyAdapter(this, emo, new MyAdapter.MyClickListener() {
            @Override
            public void OnItemClick() {
                startActivity(new Intent(EmoActivity.this,PicActivity.class));
            }
        });
        recyclerView.setAdapter(myAdapter);
    }
}
