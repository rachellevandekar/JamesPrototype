package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class eindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eind);

        playAudio();

        int timeout = 4000;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                QuitApp();
            }
        }, timeout);


    }

    private void playAudio(){

        MediaPlayer stem = MediaPlayer.create(eindActivity.this, R.raw.bedanktjames);
        stem.start();
    }

    public void QuitApp() {
        eindActivity.this.finishAffinity();

        System.exit(0);
    }

}