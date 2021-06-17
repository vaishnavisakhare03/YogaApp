package com.vaishnavi.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class YogaPosesActivity extends AppCompatActivity {

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

        YogaPose pose1 = new YogaPose(R.drawable.brigdepose, "Brigde Pose" , getResources().getString(R.string.bridge_desc) , getResources().getString(R.string.bridge_uses));
        yogaPoseList.add(pose1);

        YogaPose pose2 = new YogaPose(R.drawable.camel, "Camel Pose" , getResources().getString(R.string.camel_desc) , getResources().getString(R.string.camel_uses));
        yogaPoseList.add(pose2);

        YogaPose pose3 = new YogaPose(R.drawable.treepose, "Tree Pose" , getResources().getString(R.string.tree_desc) , getResources().getString(R.string.tree_uses));
        yogaPoseList.add(pose3);

        YogaPose pose4 = new YogaPose(R.drawable.downwarddogpose, "Downward dog Pose" , getResources().getString(R.string.downward_desc) , getResources().getString(R.string.downward_uses));
        yogaPoseList.add(pose4);

        YogaPose pose5 = new YogaPose(R.drawable.warriorpose, "Warrior Pose", getResources().getString(R.string.warrior_desc) , getResources().getString(R.string.warrior_uses));
        yogaPoseList.add(pose5);

        YogaPose pose6 = new YogaPose(R.drawable.wheelhard, "Wheel Pose" , getResources().getString(R.string.wheel_desc) , getResources().getString(R.string.wheel_uses));
        yogaPoseList.add(pose6);

        YogaPose pose7 = new YogaPose(R.drawable.ploughpose, "Plow Pose" , getResources().getString(R.string.plow_desc) , getResources().getString(R.string.plow_uses));
        yogaPoseList.add(pose7);

        YogaPose pose8 = new YogaPose(R.drawable.cobrapose, "Cobra Pose" , getResources().getString(R.string.cobra_desc) , getResources().getString(R.string.cobra_uses));
        yogaPoseList.add(pose8);

        YogaPose pose9 = new YogaPose(R.drawable.dancerpose, "Dancer Pose" , getResources().getString(R.string.dancer_desc) , getResources().getString(R.string.dancer_uses));
        yogaPoseList.add(pose9);

        YogaPose pose10 = new YogaPose(R.drawable.elbowstand, "Elbow stand Pose" , getResources().getString(R.string.elbow_desc) , getResources().getString(R.string.elbow_uses));
        yogaPoseList.add(pose10);

        YogaPose pose11 = new YogaPose(R.drawable.headstand, "Headstand Pose" , getResources().getString(R.string.headstand_desc) , getResources().getString(R.string.headstand_uses));
        yogaPoseList.add(pose11);

        YogaPose pose12 = new YogaPose(R.drawable.trianglepose, "Triangle Pose" , getResources().getString(R.string.triangle_desc) , getResources().getString(R.string.triangle_uses));
        yogaPoseList.add(pose12);

        YogaPose pose13 = new YogaPose(R.drawable.mermaid, "Mermaid Pose" , getResources().getString(R.string.mermaid_desc) , getResources().getString(R.string.mermaid_uses));
        yogaPoseList.add(pose13);

        YogaAdapter adapter = new YogaAdapter(yogaPoseList, this);
        recyclerView.setAdapter(adapter);
    }


}
