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
 * Created by R.R on 4/10/2017.
 */

public class Versity extends BaseAdapter {

    String versity[];
    int picture[];
    LayoutInflater inflater;
    public Versity(Context context,String[]versity,int[]picture){
        this.versity=versity;
        this.picture=picture;
        inflater=(LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return versity.length;
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


        view=inflater.inflate(R.layout.versity_item,parent,false);
        TextView textView=(TextView)view.findViewById(R.id.textViewUni);
        ImageView imageView= (ImageView)view.findViewById(R.id.imageViewUni);
        textView.setText(versity[position]);
        textView.setTextColor(Color.RED);
        imageView.setImageResource(picture[position]);

        return view;
    }
}
