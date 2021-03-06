package com.vaishnavi.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SuryaNamskarPosesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surya_namskar_poses);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.suryanamskar_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ArrayList yogaPoseList = new ArrayList<DataModel>();

        YogaPose pose1 = new YogaPose(R.drawable.prayer, "1. Prayer pose or Pranamasana" , getResources().getString(R.string.bridge_desc) , getResources().getString(R.string.bridge_uses));
        yogaPoseList.add(pose1);

        YogaPose pose2 = new YogaPose(R.drawable.backbendpose, "2. Raised arms pose or Hastauttanasana" , getResources().getString(R.string.camel_desc) , getResources().getString(R.string.camel_uses));
        yogaPoseList.add(pose2);

        YogaPose pose3 = new YogaPose(R.drawable.toetouch, "3. Hand to foot pose or Hasta Padasana" , getResources().getString(R.string.tree_desc) , getResources().getString(R.string.tree_uses));
        yogaPoseList.add(pose3);

        YogaPose pose4 = new YogaPose(R.drawable.lookup, "4. Equestrian pose or Ashwa Sanchalanasana" , getResources().getString(R.string.downward_desc) , getResources().getString(R.string.downward_uses));
        yogaPoseList.add(pose4);

        YogaPose pose5 = new YogaPose(R.drawable.plank, "5. Stick pose or Dandasana", getResources().getString(R.string.warrior_desc) , getResources().getString(R.string.warrior_uses));
        yogaPoseList.add(pose5);

        YogaPose pose6 = new YogaPose(R.drawable.chaturang, "6. Salute with eight parts or points or Ashtanga Namaskara" , getResources().getString(R.string.wheel_desc) , getResources().getString(R.string.wheel_uses));
        yogaPoseList.add(pose6);

        YogaPose pose7 = new YogaPose(R.drawable.cobrapose, "7. Cobra pose or Bhujangasana" , getResources().getString(R.string.bridge_desc) , getResources().getString(R.string.bridge_uses));
        yogaPoseList.add(pose7);

        YogaPose pose8 = new YogaPose(R.drawable.downwarddogpose, "8. Mountain pose or Parvatasana" , getResources().getString(R.string.camel_desc) , getResources().getString(R.string.camel_uses));
        yogaPoseList.add(pose8);

        YogaPose pose9 = new YogaPose(R.drawable.lookup, "9. Equestrian pose or Ashwa Sanchalanasana" , getResources().getString(R.string.tree_desc) , getResources().getString(R.string.tree_uses));
        yogaPoseList.add(pose9);

        YogaPose pose10 = new YogaPose(R.drawable.toetouch, "10. Hand to foot pose or Hasta Padasana" , getResources().getString(R.string.downward_desc) , getResources().getString(R.string.downward_uses));
        yogaPoseList.add(pose10);

        YogaPose pose11 = new YogaPose(R.drawable.backbendpose, "11. Raised Arms Pose or Hastauttanasana", getResources().getString(R.string.warrior_desc) , getResources().getString(R.string.warrior_uses));
        yogaPoseList.add(pose11);

        YogaPose pose12 = new YogaPose(R.drawable.prayer, "12. Standing Mountain pose or Tadasana" , getResources().getString(R.string.wheel_desc) , getResources().getString(R.string.wheel_uses));
        yogaPoseList.add(pose12);

        SuryanamskarAdapter adapter = new SuryanamskarAdapter(yogaPoseList, this);
        recyclerView.setAdapter(adapter);
    }
}