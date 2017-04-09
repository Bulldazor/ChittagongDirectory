package com.example.rr.chittagongdirectory;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by R.R on 4/9/2017.
 */

public class Clg extends BaseExpandableListAdapter {

            String groupName[]= {"Bangla Curriculum","National Curriculum"};

            String[][]childernName={{"1.Chittagong College  ","2.Govt. Mohsin College  ","3.Govt. City College  ","4.Govt Women College  ","5.BAWA College "},{"1.CCPC ","2.BAF Shahin College","3. Meron Sun College "}};


    Context context;

    public Clg(Context context){
        this.context=context;
    }


    @Override
    public int getGroupCount() {
        return groupName.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childernName[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupName[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childernName[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        TextView textView=new TextView(context);
        textView.setText(groupName[groupPosition]);
        textView.setPadding(100,0,0,0);
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(30);
        return textView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View view, ViewGroup parent) {
        final TextView textView=new TextView(context);
        textView.setText(childernName[groupPosition][childPosition]);
        textView.setPadding(100,0,0,0);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(25);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return textView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}


