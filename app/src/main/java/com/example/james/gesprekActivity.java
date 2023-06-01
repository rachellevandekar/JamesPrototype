package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class gesprekActivity extends AppCompatActivity {
    Button btnY;
    Button btnN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesprek);
        btnY = findViewById(R.id.buttonYes);
        btnN = findViewById(R.id.buttonNo);

        playAudio();

        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gesprekActivity.this, BehandelingActivity.class));
            }
        });

        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gesprekActivity.this, laterActivity.class));
            }
        });
    }
        private void playAudio(){

            MediaPlayer stem = MediaPlayer.create(gesprekActivity.this, R.raw.intro);
            stem.start();



    }
}




