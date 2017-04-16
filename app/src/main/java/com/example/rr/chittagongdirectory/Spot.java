package com.example.rr.chittagongdirectory;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by R.R on 4/12/2017.
 */

public class Spot extends BaseAdapter {
    String[] spot;
    int [] pic;
    LayoutInflater inflater;
    public Spot(Context context, String[]spot, int[]pic){
        this.spot=spot;
        this.pic=pic;
        inflater=(LayoutInflater.from(context));

    }


    @Override
    public int getCount() {
        return spot.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view=inflater.inflate(R.layout.spot,parent,false);
        TextView textView=(TextView)view.findViewById(R.id.textView4);
        ImageView imageView= (ImageView)view.findViewById(R.id.imageViewSea);
        textView.setText(spot[position]);
        textView.setTextColor(Color.GREEN);
        imageView.setImageResource(pic[position]);

        return view;

    }
}
