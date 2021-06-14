package com.vaishnavi.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SuryaNamskarDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_a_1);

        String name = getIntent().getStringExtra("name");
//        String description = getIntent().getStringExtra("description");
//        String uses = getIntent().getStringExtra("uses");
        int image = getIntent().getIntExtra("image",0);

        ImageView imageView = findViewById(R.id.descImageView);
        imageView.setImageDrawable(getResources().getDrawable(image));

        TextView nameTextView = findViewById(R.id.tvYogaTitle);
        nameTextView.setText(name);

//        TextView descTextView = findViewById(R.id.tvYogaDesc);
//        descTextView.setText(description);
//
//        TextView usesTextView = findViewById(R.id.tvUses);
//        usesTextView.setText(uses);
    }
}