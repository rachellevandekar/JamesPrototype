package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class uitlegActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uitleg);


        videoView = findViewById(R.id.video);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.uitlegjames));
        // playAudio();
        videoView.start();

        int timeout = 48000; // make the activity visible for 4 seconds

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                Intent intent = new Intent (uitlegActivity.this, herhalingActivity.class);
                startActivity(intent);
            }
        }, timeout);





    }/*
        private void playVideo(){
            videoView = findViewById(R.id.video);
            MediaPlayer stem = MediaPlayer.create(uitlegActivity.this, R.raw.pacemaker);
            stem.start();
        }
*/





   /* private void playAudio() {

        MediaPlayer stem = MediaPlayer.create(uitlegActivity.this, R.raw.advies);
        stem.start();
    }*/
}