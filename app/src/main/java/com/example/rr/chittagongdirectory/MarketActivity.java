package com.example.rr.chittagongdirectory;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class MarketActivity extends AppCompatActivity {
    ListView lstView;
    String marketList[] = {"Sanmar Ocean City", "Lucky Plaza", "Finlay Square", "New Market"};
    int pic[] = {R.drawable.sanmar, R.drawable.luckyplazajpg, R.drawable.finlay, R.drawable.newket};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Shopping Mall");
        lstView = (ListView) findViewById(R.id.Lisst);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), marketList, pic);

        lstView.setAdapter(customAdapter);


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
