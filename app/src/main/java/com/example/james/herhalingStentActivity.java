package com.example.james;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class herhalingStentActivity extends AppCompatActivity {
    Button btnY;
    Button btnN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herhaling_stent);
        btnY = findViewById(R.id.buttonYes);
        btnN = findViewById(R.id.buttonNo);

        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(herhalingStentActivity.this, stentActivity.class));
            }
        });

        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(herhalingStentActivity.this, vragenActivity.class));
            }
        });
    }
}