package com.vaishnavi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pranayamaActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pranayamaactivity);

        button1 = (Button) findViewById(R.id.nadi);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity3_a(); }
        });

        button2 = (Button) findViewById(R.id.ujjayi);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openActivity3_b();}
        });

        button3 = (Button) findViewById(R.id.suryanbhedan);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openActivity3_c();}
        });

        button4 = (Button) findViewById(R.id.anulomaviloma);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openActivity3_d();}
        });
    }
    private void openActivity3_a() {
        Intent intent = new Intent(this, Activity3_a.class);
        startActivity(intent);
    }

    private void openActivity3_b() {
        Intent intent = new Intent(this, Activity3_b.class);
        startActivity(intent);
    }
    private void openActivity3_c() {
        Intent intent = new Intent(this, Activity3_c.class);
        startActivity(intent);
    }
    private void openActivity3_d() {
        Intent intent = new Intent(this, Activity3_d.class);
        startActivity(intent);
    }
}