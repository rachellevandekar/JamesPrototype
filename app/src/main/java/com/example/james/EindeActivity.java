package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class EindeActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einde);
        videoView = findViewById(R.id.video);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.jamesvraag));
        videoView.start();

        int timeout = 6000;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                QuitApp();
            }
        }, timeout);



    }

    public void QuitApp() {
        EindeActivity.this.finishAffinity();

        System.exit(0);
    }
}