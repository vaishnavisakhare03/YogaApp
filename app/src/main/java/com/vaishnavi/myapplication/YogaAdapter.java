package com.vaishnavi.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class YogaAdapter extends RecyclerView.Adapter<YogaAdapter.MyViewHolder> {

    private ArrayList<YogaPose> dataSet;
    private Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        LinearLayout yogaCard;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
            this.yogaCard = (LinearLayout) itemView.findViewById(R.id.llYogaCard);
        }
    }

    public YogaAdapter(ArrayList<YogaPose> data, Context context) {
        this.dataSet = data;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.yoga_item, parent, false);

        view.setOnClickListener(v -> {
            //TODO open yoga description activity
        });

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;
        LinearLayout yogaCard = holder.yogaCard;

        YogaPose yogaPose = dataSet.get(listPosition);

        yogaCard.setOnClickListener( v -> {//TODO open yoga description activity
             Toast.makeText(context, "This is " +yogaPose.poseName,Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, YogaPoseDescriptionActivity.class);
                    intent.putExtra("name", yogaPose.getPoseName());
                    intent.putExtra("image", yogaPose.image);
                    intent.putExtra("description", yogaPose.getDescription());
                    intent.putExtra("uses", yogaPose.getUses());
                    context.startActivity(intent);
        }
        );

        textViewName.setText(dataSet.get(listPosition).getPoseName());
        imageView.setImageResource(dataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
