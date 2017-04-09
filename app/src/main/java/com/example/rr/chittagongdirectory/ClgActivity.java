package com.example.rr.chittagongdirectory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class ClgActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clg);
        expandableListView=(ExpandableListView)findViewById(R.id.expndlbleCLg);
        Clg clg = new Clg(ClgActivity.this);
        expandableListView.setAdapter(clg);
    }
}
