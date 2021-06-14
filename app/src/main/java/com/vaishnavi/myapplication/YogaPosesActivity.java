package com.vaishnavi.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class YogaPosesActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yoga_poses_activity);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ArrayList yogaPoseList = new ArrayList<DataModel>();

        YogaPose pose1 = new YogaPose(R.drawable.brige, "Bridge Pose" , getResources().getString(R.string.bridge_desc) , getResources().getString(R.string.bridge_uses));
        yogaPoseList.add(pose1);

        YogaPose pose2 = new YogaPose(R.drawable.camel, "Camel Pose" , getResources().getString(R.string.camel_desc) , getResources().getString(R.string.camel_uses));
        yogaPoseList.add(pose2);

        YogaPose pose3 = new YogaPose(R.drawable.tree, "Tree Pose" , getResources().getString(R.string.tree_desc) , getResources().getString(R.string.tree_uses));
        yogaPoseList.add(pose3);

        YogaPose pose4 = new YogaPose(R.drawable.downward, "Downward Pose" , getResources().getString(R.string.downward_desc) , getResources().getString(R.string.downward_uses));
        yogaPoseList.add(pose4);

        YogaPose pose5 = new YogaPose(R.drawable.warrior, "Warrior Pose", getResources().getString(R.string.warrior_desc) , getResources().getString(R.string.warrior_uses));
        yogaPoseList.add(pose5);

        YogaPose pose6 = new YogaPose(R.drawable.wheel, "Wheel Pose" , getResources().getString(R.string.wheel_desc) , getResources().getString(R.string.wheel_uses));
        yogaPoseList.add(pose6);

//        removedItems = new ArrayList<Integer>();

        YogaAdapter adapter = new YogaAdapter(yogaPoseList, this);
        recyclerView.setAdapter(adapter);
    }


}
