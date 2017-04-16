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

public class Hospital extends BaseAdapter {

    String hospital[];
    int pic_of_hospital[];
    LayoutInflater inflater;
    public Hospital(Context context,String[]hospital,int[]pic_of_hospital){
        this.hospital=hospital;
        this.pic_of_hospital=pic_of_hospital;
        inflater=(LayoutInflater.from(context));

    }




    @Override
    public int getCount() {
        return hospital.length;
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
        view=inflater.inflate(R.layout.hospital_item,parent,false);
        TextView textView=(TextView)view.findViewById(R.id.Hospital);
        ImageView imageView= (ImageView)view.findViewById(R.id.CMC);
        textView.setText(hospital[position]);
        textView.setTextColor(Color.RED);
        imageView.setImageResource(pic_of_hospital[position]);

        return view;



    }
}
