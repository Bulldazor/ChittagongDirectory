package com.example.rr.chittagongdirectory;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class HospitalActivity extends AppCompatActivity {
    ListView list;
    String[] hospitalname={"Chiitagong Medical Collage","Chittagong Eye Infirmary & Training Complex", "Chattagram Maa-Shishu O General Hospital", "Chittagong Metropolitan Hospital Pvt. Ltd.","Southern Medical College and Hospital", "Epic Health Care", "Lions Eye Hospital"};
    int[]pic={R.drawable.cmc,R.drawable.eye,R.drawable.maa,R.drawable.metro,R.drawable.suth,R.drawable.epic,R.drawable.lion};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Hospital List");
        list=(ListView)findViewById(R.id.ListOfHospital);
        Hospital hospital= new Hospital(getApplicationContext(),hospitalname,pic);
        list.setAdapter(hospital);



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
