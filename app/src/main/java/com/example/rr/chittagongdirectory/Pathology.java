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

public class Pathology extends BaseAdapter{


    String dia[];
    int pic_of_dia[];
    LayoutInflater inflater;
    public Pathology(Context context, String[]dia, int[]pic_of_dia){
        this.dia=dia;
        this.pic_of_dia=pic_of_dia;
        inflater=(LayoutInflater.from(context));

    }




    @Override
    public int getCount() {
        return dia.length;
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
        view=inflater.inflate(R.layout.pathology_item,parent,false);
        TextView textView=(TextView)view.findViewById(R.id.textView3);
        ImageView imageView= (ImageView)view.findViewById(R.id.imageView3);
        textView.setText(dia[position]);
        textView.setTextColor(Color.RED);
        imageView.setImageResource(pic_of_dia[position]);

        return view;



    }
}
