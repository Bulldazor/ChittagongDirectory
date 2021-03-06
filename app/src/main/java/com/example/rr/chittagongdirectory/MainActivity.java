package com.example.rr.chittagongdirectory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button skl,clg,ui,hos,dia,shpng,spot,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        skl=(Button)findViewById(R.id.School);
        clg=(Button)findViewById(R.id.College);
        ui=(Button)findViewById(R.id.uni);
        hos=(Button)findViewById(R.id.Hospital);
        dia=(Button)findViewById(R.id.dia);
        shpng=(Button)findViewById(R.id.Shpng);
        spot=(Button)findViewById(R.id.tourist);
        res=(Button)findViewById(R.id.res);

        skl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,SklActivity.class);
                startActivity(intent);
            }
        });
        clg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ClgActivity.class);
                startActivity(intent);
            }
        });
        shpng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MarketActivity.class);
                startActivity(intent);
            }
        });
        ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,UniversityActivity.class);
                startActivity(intent);
            }
        });
        hos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,HospitalActivity.class);
                startActivity(in);
            }
        });
        dia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,DiaActivity.class);
                startActivity(intent);
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,ResActivity.class);
                startActivity(in);
            }
        });
        spot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,TourActivity.class);
                startActivity(intent);
            }
        });
    }
}
