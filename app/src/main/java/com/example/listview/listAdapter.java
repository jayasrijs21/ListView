package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listAdapter extends BaseAdapter {
    Context context;
    String[] country;
    int[] image;

    public listAdapter (Context context , String[] country , int[] image) {
        this.context = context;
        this.country = country;
        this.image = image;
    }

    @Override
    public int getCount() {
        return country.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view==null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listviewlayout,viewGroup,false);
        }
        ImageView img =  view.findViewById(R.id.imageView);
        TextView text = view.findViewById(R.id.textView);

        img.setImageResource(image[position]);
        text.setText(country[position]);
        return view;


    }
}
