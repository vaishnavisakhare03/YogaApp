package com.vaishnavi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yogaactivity extends AppCompatActivity {

    private Button button1a;
    private Button button1b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yogaactivity);

        button1a = (Button) findViewById(R.id.yogaposes);
        button1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2_a();
            }
        });

        button1b = (Button) findViewById(R.id.suryanamskar);
        button1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivtiy2_b();
            }
        });
    }

    private void openActivity2_a() {
        Intent intent = new Intent(this, YogaPosesActivity.class);
        startActivity(intent);
    }

    private void openActivtiy2_b() {
        Intent intent = new Intent(this, SuryaNamskarPosesActivity.class);
        startActivity(intent);
    }
}