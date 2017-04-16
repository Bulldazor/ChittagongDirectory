package com.example.rr.chittagongdirectory;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;

public class SklActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skl);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("School List");

        expandableListView=(ExpandableListView)findViewById(R.id.listView);
        ExpndleListView expndleList= new ExpndleListView(SklActivity.this);
        expandableListView.setAdapter(expndleList);



    }
    public boolean onOptionItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //app icon in action bar clicked;goto parent activity
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
