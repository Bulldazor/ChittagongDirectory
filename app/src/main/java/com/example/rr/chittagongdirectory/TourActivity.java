package com.example.rr.chittagongdirectory;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class TourActivity extends AppCompatActivity {
    ListView listView;
    String[] placeName={"Patenga","Sea World","Neaval Academy","Zia Complex","Batali Hill","Shah Amanat Bridge","Foyslake"};
    int[] pic={R.drawable.patenga,R.drawable.sea,R.drawable.neval,R.drawable.zia,R.drawable.batali,R.drawable.notun,R.drawable.foys};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Tourist Spot");
        listView=(ListView)findViewById(R.id.listTour);
        Spot spot= new Spot(getApplicationContext(),placeName,pic);
        listView.setAdapter(spot);
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
