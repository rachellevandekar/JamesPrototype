package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BehandelingActivity extends AppCompatActivity {
    Button btnY;
    Button btnN;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behandeling);




            btnY = findViewById(R.id.buttonYes);
            btnN = findViewById(R.id.buttonNo);
            tv = findViewById(R.id.textViewQuestion);

            playAudio();

            btnY.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    startActivity(new Intent(BehandelingActivity.this, GevoelActivity.class));

                }
            });


            btnN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(BehandelingActivity.this, GevoelActivity.class));

                }
            });
        }


        private void playAudio(){

            MediaPlayer stem = MediaPlayer.create(BehandelingActivity.this, R.raw.behandelinggehadjames);
            stem.start();
    /*
        try{
           Uri myUri = Uri.fromFile(new File("/Internal storage/Download/wond.m4a")); // initialize Uri here

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

    }*/}

    }