package com.example.rr.chittagongdirectory;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class DiaActivity extends AppCompatActivity {
    ListView list;
    String[] dialist = {"Chevron Chittagong", "IBN Sina", "Epic Health Care", "Popular Diagonistics"};
    int[] pic_of_dia = {R.drawable.chevron, R.drawable.ibnsinajpg, R.drawable.epic, R.drawable.popularogo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Diagonstics List");
        list = (ListView) findViewById(R.id.listOfDia);
        Pathology path = new Pathology(getApplicationContext(), dialist, pic_of_dia);
        list.setAdapter(path);

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
