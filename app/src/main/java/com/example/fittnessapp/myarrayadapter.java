package com.example.fittnessapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Vector;

public class myarrayadapter extends ArrayAdapter {
    private Vector<com.example.fittnessapp.myitem>myitems;
    private Context context;



    public myarrayadapter(Context context, int resource, int textViewResourceId, List items) {
        super(context, resource, textViewResourceId, items);
        myitems= (Vector<com.example.fittnessapp.myitem>) items;
        this.context=context;
    }

    public View getView(int position, View convertView, ViewGroup listview) {
        View row =null;
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        row=inflater.inflate(R.layout.row2,listview,false);

        ImageView img=row.findViewById(R.id.imageView2);
        TextView textView=row.findViewById(R.id.textView);

        img.setImageResource(myitems.get(position).getVedioicon());
        textView.setText(myitems.get(position).getItemname());

        return row;
    }

    }

