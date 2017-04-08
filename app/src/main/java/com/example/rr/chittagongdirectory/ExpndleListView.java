package com.example.rr.chittagongdirectory;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by R.R on 4/8/2017.
 */

public class ExpndleListView extends BaseExpandableListAdapter {

    String[] groupName={"Bangla Curriculum","English Curriculum","National Curriculum","Madrasha"};
    String[][] childernName={{"1.Alhaj Tajul Islam High School ","2.Alhaz Anowara Begum Girls High School ","3.Nurul Islam Municipal Girls High School ","4.Mohara S.K.Q. Girls High School ","5.Nurul Islam Municipal Girls High School ","6.Bangladesh Railway Government High School ","7.Barik Meah High School ","8.Halishahar Begumjan High School ","9.Port Authority High School ","10.Bepza Public School And College ","11.Agrabad Balika Bidyalay ","12.Bangladesh Bank Colony High School ","13.Chittagong Collegiat School ","14.Khaja Ajmeri High School ","15.Khan Shaheb Abdul Hakim High School ","16.Govt Muslim High School ","17.Govt High School ","18.Dr. Khastogir Girls High School ","19.Nasirabad Govt High School ","20.Nasirabad Govt Girls High School " },{"1.Chittagong Grammer School ","2.Meron Sun School ","3.Mastermind School ","4.Willam Carry Academy ","5.Oxbridge School "},{"1.CCPC ","2.BAWA ","3.BAF Shahin School "},{"1.Baitur Shorof Madrasa ","2.Port Dakhil Madrasha "}};

    Context context;

    public ExpndleListView (Context context){
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
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(30);
        return textView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View view, ViewGroup parent) {
        final TextView textView=new TextView(context);
        textView.setText(childernName[groupPosition][childPosition]);
        textView.setPadding(100,0,0,0);
        textView.setTextColor(Color.RED);
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
