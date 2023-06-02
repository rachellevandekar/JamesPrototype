package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import android.media.AudioManager;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // playAudio();

        videoView = findViewById(R.id.video);
       // MediaController mediaController = new MediaController(this);
       // mediaController.setAnchorView(videoView);
      //  videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.jamesin));


        // playAudio();
        videoView.start();

        int timeout = 10000; // make the activity visible for 4 seconds

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, gesprekActivity.class);
                startActivity(intent);
            }
        }, timeout);



    }
   // public static final int ADJUST_MUTE = -100;






    private void playAudio(){
        MediaPlayer stem = MediaPlayer.create(MainActivity.this, R.raw.intro_j);
        stem.start();


/*
        try{
        Uri myUri = Uri.fromFile(new File("/storage/emulated/0/zbos_media_library/intro.m4a")); // initialize Uri here
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(
                new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
        );
        mediaPlayer.setDataSource(getApplicationContext(), myUri);
        mediaPlayer.prepare();
        mediaPlayer.start();}
        catch (Exception ex) {
            ex.printStackTrace();
        }
*/
    }
}