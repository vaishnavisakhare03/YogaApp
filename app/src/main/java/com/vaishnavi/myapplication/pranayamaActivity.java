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

//    private Button button1;
//    private Button button2;
//    private Button button3;
//    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pranayamaactivity);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ArrayList yogaPoseList = new ArrayList<DataModel>();

//        YogaPose pose1 = new YogaPose(R.drawable.brige, "Bridge pose" , getResources().getString(R.string.bridge_desc) , getResources().getString(R.string.bridge_uses));
//        yogaPoseList.add(pose1);

        YogaPose pose2 = new YogaPose(R.drawable.camel, "Camel Pose" , getResources().getString(R.string.camelp_desc) , getResources().getString(R.string.camelp_uses));
        yogaPoseList.add(pose2);

        YogaPose pose3 = new YogaPose(R.drawable.tree, "Tree Pose" , getResources().getString(R.string.treep_desc) , getResources().getString(R.string.treep_uses));
        yogaPoseList.add(pose3);

        YogaPose pose4 = new YogaPose(R.drawable.downward, "Downward Pose" , getResources().getString(R.string.downwardp_desc) , getResources().getString(R.string.downwardp_uses));
        yogaPoseList.add(pose4);

        YogaPose pose5 = new YogaPose(R.drawable.warrior, "Warrior Pose", getResources().getString(R.string.warriorp_desc) , getResources().getString(R.string.warrior_uses));
        yogaPoseList.add(pose5);

        YogaPose pose6 = new YogaPose(R.drawable.wheel, "Wheel Pose" , getResources().getString(R.string.wheelp_desc) , getResources().getString(R.string.wheelp_uses));
        yogaPoseList.add(pose6);
//
//        YogaPose pose7 = new YogaPose(R.drawable.wheel, "Wheel Pose" , getResources().getString(R.string.wheelp_desc) , getResources().getString(R.string.wheelp_uses));
//        yogaPoseList.add(pose6);

//        removedItems = new ArrayList<Integer>();

        PranayamAdapter adapter = new PranayamAdapter(yogaPoseList, this);
        recyclerView.setAdapter(adapter);
    }




//        button1 = (Button) findViewById(R.id.nadi);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { openActivity3_a(); }
//        });
//
//        button2 = (Button) findViewById(R.id.ujjayi);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {openActivity3_b();}
//        });
//
//        button3 = (Button) findViewById(R.id.suryanbhedan);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {openActivity3_c();}
//        });
//
//        button4 = (Button) findViewById(R.id.anulomaviloma);
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {openActivity3_d();}
//        });
    }
//    private void openActivity3_a() {
//        Intent intent = new Intent(this, Activity3_a.class);
//        startActivity(intent);
//    }
//
//    private void openActivity3_b() {
//        Intent intent = new Intent(this, Activity3_b.class);
//        startActivity(intent);
//    }
//    private void openActivity3_c() {
//        Intent intent = new Intent(this, Activity3_c.class);
//        startActivity(intent);
//    }
//    private void openActivity3_d() {
//        Intent intent = new Intent(this, Activity3_d.class);
//        startActivity(intent);
//    }

