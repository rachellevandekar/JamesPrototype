package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import android.provider.MediaStore;

import java.util.Timer;
import java.util.TimerTask;

public class laterActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_later);

        videoView = findViewById(R.id.video);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.jameslater));
        videoView.start();

        int timeout = 8000;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                QuitApp();
            }
        }, timeout);



    }

    public void QuitApp() {
        laterActivity.this.finishAffinity();

        System.exit(0);
    }
}