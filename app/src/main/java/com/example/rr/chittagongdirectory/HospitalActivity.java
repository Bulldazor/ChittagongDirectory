package com.example.rr.chittagongdirectory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class HospitalActivity extends AppCompatActivity {
    ExpandableListView expndleListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        expndleListView=(ExpandableListView)findViewById(R.id.list);


    }
}
