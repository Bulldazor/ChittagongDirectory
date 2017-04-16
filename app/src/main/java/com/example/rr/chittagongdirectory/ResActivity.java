package com.example.rr.chittagongdirectory;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class ResActivity extends AppCompatActivity {
    ListView listView;
    String[]resName={"Avalon","Dum Phoonk","Errante","Cafe Milano","Muno Cafe Bistro","Pitstop","Rio Coffee","Window 85","Wok N Roll"};

    int[] pic={R.drawable.ava,R.drawable.dum,R.drawable.errante,R.drawable.milano,R.drawable.muno,R.drawable.pit,R.drawable.rio,R.drawable.wind,R.drawable.wok};


//    getSupportActionBar().setHomeButtonEnabled(true);
//    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//    getSupportActionBar().setTitle("Restaurant");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar=getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Restaurant");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        listView = (ListView) findViewById(R.id.listOfRes);
        Res res = new Res(getApplicationContext(), resName, pic);
        listView.setAdapter(res);
    }
    public  boolean onOptionItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                //app icon in action bar clicked;goto parent activity
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




}
