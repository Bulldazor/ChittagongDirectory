package com.example.rr.chittagongdirectory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class UniversityActivity extends AppCompatActivity {
    ListView listViewUni;
    String Versity[]={"Chittagong University","Chittagong University of Engineering & Technology","International Islamic University","University Of Science And Technology","Southern University","Port City International University","Chittagong Medical College","Chittagong Independent University"};
    int picture[]={R.drawable.cu,R.drawable.cuet,R.drawable.iiuc,R.drawable.ustc,R.drawable.su,R.drawable.pc,R.drawable.cmc,R.drawable.ciu};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
        listViewUni=(ListView)findViewById(R.id.listViewUni);
        Versity versity= new Versity(getApplicationContext(),Versity,picture);
        listViewUni.setAdapter(versity);

    }
}
