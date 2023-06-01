package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        btnStart = findViewById(R.id.buttonStart);

        playAudio();


        Handler handler = new Handler();
        btnStart.setVisibility(View.GONE);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                btnStart.setVisibility(View.VISIBLE);
                btnStart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(StartActivity.this, uitlegActivity.class));
                    }
                });
            }
        };
// run runnable after 5 seconds
        handler.postDelayed(runnable, 8000);
    }

    private void playAudio() {

        MediaPlayer stem = MediaPlayer.create(StartActivity.this, R.raw.informerenjames);
        stem.start();
    }
}