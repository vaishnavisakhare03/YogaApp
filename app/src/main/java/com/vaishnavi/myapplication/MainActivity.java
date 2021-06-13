package com.vaishnavi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
    }

    public void Yoga(View view) {
        Toast.makeText(this, "This is yoga", Toast.LENGTH_SHORT).show();
    }public void Breath(View view) {
        Toast.makeText(this, "This is pranayama", Toast.LENGTH_SHORT).show();
    }public void Meditation(View view) {
        Toast.makeText(this, "This is Meditation", Toast.LENGTH_SHORT).show();
    }


    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.yoga);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYogaActivity();
            }
        });

        button2 = (Button) findViewById(R.id.pranayama);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpranayamaActivity();
            }
        });

        button3 = (Button) findViewById(R.id.meditation);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
    }

    private void openYogaActivity() {
        Intent intent = new Intent(this, yogaactivity.class);
        startActivity(intent);
            }

    private void openpranayamaActivity() {
        Intent intent = new Intent(this, pranayamaActivity.class);
        startActivity(intent);
    }

    private void openActivity4() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }
}