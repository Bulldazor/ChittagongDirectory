package com.example.rr.chittagongdirectory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class SklActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skl);

        expandableListView=(ExpandableListView)findViewById(R.id.listView);
        ExpndleListView expndleList= new ExpndleListView(SklActivity.this);
        expandableListView.setAdapter(expndleList);


    }
}
