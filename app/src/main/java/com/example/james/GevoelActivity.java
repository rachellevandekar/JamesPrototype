package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GevoelActivity extends AppCompatActivity {
    Button btn;
    ImageButton slecht;
    ImageButton nietzogoed;
    ImageButton gaatwel;
    ImageButton goed;
    ImageButton erggoed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gevoel);
        btn = findViewById(R.id.buttonBegin);
        slecht = findViewById(R.id.slecht);
        nietzogoed = findViewById(R.id.nietzogoed);
        gaatwel = findViewById(R.id.gaatwel);
        goed = findViewById(R.id.goed);
        erggoed = findViewById(R.id.erggoed);


        playAudio();
/*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GevoelActivity.this, keuzeBehandelingActivity.class));
            }
        });*/

        slecht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GevoelActivity.this, verpleegkundigeActivity.class));

            }
        });
        nietzogoed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GevoelActivity.this, verpleegkundigeActivity.class));
            }
        });
        gaatwel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GevoelActivity.this, keuzeBehandelingActivity.class));

            }
        });
        goed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GevoelActivity.this, keuzeBehandelingActivity.class));
            }
        });
        erggoed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GevoelActivity.this, keuzeBehandelingActivity.class));
            }
        });

    }

    private void playAudio(){

        MediaPlayer stem = MediaPlayer.create(GevoelActivity.this, R.raw.gevoeljames);
        stem.start();
    }
}