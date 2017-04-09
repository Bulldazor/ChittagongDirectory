package com.example.rr.chittagongdirectory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button skl,clg,uni,hos,dia,shpng,spot,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        skl=(Button)findViewById(R.id.School);
        clg=(Button)findViewById(R.id.College);
        uni=(Button)findViewById(R.id.uni);
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
    }
}
