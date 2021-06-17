package com.vaishnavi.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class pranayamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pranayamaactivity);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.pranayam_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ArrayList yogaPoseList = new ArrayList<DataModel>();

        YogaPose pose1 = new YogaPose(R.drawable.kapalbhati, "Kapalabhati" , getResources().getString(R.string.kapalbhati_pranayama) , getResources().getString(R.string.treep_uses));
        yogaPoseList.add(pose1);

        YogaPose pose2 = new YogaPose(R.drawable.nadi, "Nadi Shuddhi Pranayam" , getResources().getString(R.string.nadi_shuddhi_pranayam) ,getResources().getString(R.string.downwardp_uses));
        yogaPoseList.add(pose2);

        YogaPose pose3 = new YogaPose(R.drawable.anulomvilom, "Anulom Vilom Pranayam", getResources().getString(R.string.anulom_vilom_pranayam) , getResources().getString(R.string.warriorp_uses));
        yogaPoseList.add(pose3);

        PranayamAdapter adapter = new PranayamAdapter(yogaPoseList, this);
        recyclerView.setAdapter(adapter);
    }

    }

