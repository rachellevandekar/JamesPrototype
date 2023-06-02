package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class keuzeBehandelingActivity extends AppCompatActivity {
    Button btnI;
    Button btnID;
    Button btnHI;
    Button btnS;

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keuze_behandeling);

        btnI = findViewById(R.id.buttonI);
        btnID = findViewById(R.id.buttonID);
        btnHI = findViewById(R.id.buttonHI);
        btnS = findViewById(R.id.buttonS);

        tv = findViewById(R.id.textViewQuestion);

        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        playAudio();

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(keuzeBehandelingActivity.this, startStentActivity.class));
            }
        });

        btnID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(keuzeBehandelingActivity.this, StartActivity.class));
            }
        });

        btnHI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(keuzeBehandelingActivity.this, startAblatieActvity.class));
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(keuzeBehandelingActivity.this, startStentActivity.class));
            }
        });


    }

    private void playAudio(){

        MediaPlayer stem = MediaPlayer.create(keuzeBehandelingActivity.this, R.raw.behandelingjames);
        stem.start();
    }
}