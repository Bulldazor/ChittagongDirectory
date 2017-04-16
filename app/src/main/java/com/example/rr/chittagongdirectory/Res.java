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

public class Res extends BaseAdapter {

    String res[];
    int pic_of_res[];
    LayoutInflater inflater;
    public Res(Context context, String[]res, int[]pic_of_res){
        this.res=res;
        this.pic_of_res=pic_of_res;
        inflater=(LayoutInflater.from(context));

    }






    @Override
    public int getCount() {
        return res.length;
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
        view=inflater.inflate(R.layout.res,parent,false);
        TextView textView=(TextView)view.findViewById(R.id.textViewRes);
        ImageView imageView= (ImageView)view.findViewById(R.id.imageViewRes);
        textView.setText(res[position]);
        textView.setTextColor(Color.RED);
        imageView.setImageResource(pic_of_res[position]);

        return view;


    }
}
