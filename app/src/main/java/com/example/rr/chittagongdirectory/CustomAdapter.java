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
 * Created by R.R on 4/9/2017.
 */

public class CustomAdapter extends BaseAdapter {

    String marketList[];
    int pic[];
    LayoutInflater inflater;

    public CustomAdapter(Context context,String[] marketList,int[]pic){
        this.marketList=marketList;
        this.pic=pic;
        inflater=(LayoutInflater.from(context));

    }

    @Override
    public int getCount() {

        return marketList.length;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view=inflater.inflate(R.layout.list_iteam,parent,false);
        TextView textView=(TextView)view.findViewById(R.id.textView2);
        ImageView imageView= (ImageView)view.findViewById(R.id.imageView2);
        textView.setText(marketList[position]);
        textView.setTextColor(Color.BLUE);
        imageView.setImageResource(pic[position]);
        return view;
    }
}
