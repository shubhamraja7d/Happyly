package com.sr7d.happyly;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MotivationActivity extends AppCompatActivity {

    Button youtube,chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);
        youtube = findViewById(R.id.youtube_btn);
        chat = findViewById(R.id.chat_btn);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoClient = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=MvZ9dI_b72I"));
                startActivityForResult(videoClient,1234);

            }
        });
    }
}
