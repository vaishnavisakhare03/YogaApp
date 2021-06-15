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

        YogaPose pose1 = new YogaPose(R.drawable.brige, "Bridge pose" , getResources().getString(R.string.bridge_desc) , getResources().getString(R.string.bridge_uses));
        yogaPoseList.add(pose1);

        YogaPose pose2 = new YogaPose(R.drawable.camel, "Camel Pose" , getResources().getString(R.string.camelp_desc) , getResources().getString(R.string.camelp_uses));
        yogaPoseList.add(pose2);

        YogaPose pose3 = new YogaPose(R.drawable.tree, "Tree Pose" , getResources().getString(R.string.treep_desc) , getResources().getString(R.string.treep_uses));
        yogaPoseList.add(pose3);

        YogaPose pose4 = new YogaPose(R.drawable.downward, "Downward Pose" , getResources().getString(R.string.downwardp_desc) , getResources().getString(R.string.downwardp_uses));
        yogaPoseList.add(pose4);

        YogaPose pose5 = new YogaPose(R.drawable.warrior, "Warrior Pose", getResources().getString(R.string.warriorp_desc) , getResources().getString(R.string.warriorp_uses));
        yogaPoseList.add(pose5);

        YogaPose pose6 = new YogaPose(R.drawable.wheel, "Wheel Pose" , getResources().getString(R.string.wheelp_desc) , getResources().getString(R.string.wheelp_uses));
        yogaPoseList.add(pose6);

//        YogaPose pose7 = new YogaPose(R.drawable.wheel, "Wheel Pose" , getResources().getString(R.string.wheelp_desc) , getResources().getString(R.string.wheelp_uses));
//        yogaPoseList.add(pose6);

        PranayamAdapter adapter = new PranayamAdapter(yogaPoseList, this);
        recyclerView.setAdapter(adapter);
    }

    }

