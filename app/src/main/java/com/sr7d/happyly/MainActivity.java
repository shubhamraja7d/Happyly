package com.sr7d.happyly;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button login;
    RelativeLayout header, footer;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            header.setVisibility(View.VISIBLE);
            footer.setVisibility(View.VISIBLE);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        header = findViewById(R.id.header);
        footer = findViewById(R.id.footer);
        login = findViewById(R.id.login_btn);
        handler.postDelayed(runnable, 2000);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DetailsActivity.class));
            }
        });

    }


}
