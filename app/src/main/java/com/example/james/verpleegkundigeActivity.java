package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class verpleegkundigeActivity extends AppCompatActivity {
    Button btnY;
    Button btnN;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verpleegkundige);

        btnY = findViewById(R.id.buttonYes);
        btnN = findViewById(R.id.buttonNo);
        tv = findViewById(R.id.textViewQuestion);

        playAudio();


        Handler handler = new Handler();
        btnY.setVisibility(View.GONE);
        btnN.setVisibility(View.GONE);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                btnY.setVisibility(View.VISIBLE);
                btnN.setVisibility(View.VISIBLE);

                btnY.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(verpleegkundigeActivity.this, EindeActivity.class));

                    }
                });

                btnN.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(verpleegkundigeActivity.this, keuzeBehandelingActivity.class));
                    }
                });
            }
        };
        handler.postDelayed(runnable, 10000);
    }

    private void playAudio(){

        MediaPlayer stem = MediaPlayer.create(verpleegkundigeActivity.this, R.raw.verpleegkundigejames);
        stem.start();
    }
}