package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class herhalingActivity extends AppCompatActivity {

    Button btnY;
    Button btnN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herhaling);

        btnY = findViewById(R.id.buttonYes);
        btnN = findViewById(R.id.buttonNo);

        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}