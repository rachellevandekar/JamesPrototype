package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class vragenActivity extends AppCompatActivity {
    Button btnY;
    Button btnN;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vragen);


        btnY = findViewById(R.id.buttonYes);
        btnN = findViewById(R.id.buttonNo);
        tv = findViewById(R.id.textViewQuestion);



        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(vragenActivity.this, EindeActivity.class));

            }
        });


        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(vragenActivity.this, eindActivity.class));
                // playAudio();
            }
        });
        playAudio();
    }

    private void playAudio(){

        MediaPlayer stem = MediaPlayer.create(vragenActivity.this, R.raw.vragenjames);
        stem.start();
    }
}