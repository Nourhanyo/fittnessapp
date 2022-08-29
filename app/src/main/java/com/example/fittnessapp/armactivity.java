package com.example.fittnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class armactivity extends AppCompatActivity {
    Intent intent;
    Button start_button;
    Vector<myitem> items;
    ListView listView;
    myarrayadapter myarray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(armactivity.this,R.color.black));
        setContentView(R.layout.activity_armactivity);
        items=new Vector<myitem>();
        items.add(new myitem("Barbell Bench Press ",R.mipmap.arm1));
        items.add(new myitem("Dumbbell Bench Press",R.mipmap.arm2));
        items.add(new myitem("Brusttraining",R.mipmap.arm3));
        items.add(new myitem("Dumbbell chest press",R.mipmap.arm4));
        items.add(new myitem("Knee Push Up",R.mipmap.arm5));
        items.add(new myitem("Dumbbell fly",R.mipmap.arm6));


        listView=findViewById(R.id.list);
        myarray=new myarrayadapter(this,R.layout.row2,R.id.textView,items);

        listView.setAdapter(myarray);
        start_button=findViewById(R.id.next);
        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(armactivity.this,exercise1_arm.class);
                @SuppressLint("SimpleDateFormat") SimpleDateFormat formatterm = new SimpleDateFormat("mm");
                @SuppressLint("SimpleDateFormat") SimpleDateFormat formatterh = new SimpleDateFormat("hh");
                Date date = new Date();
                finish.m1 = formatterm.format(date);
                finish.h1 = formatterh.format(date);

                startActivity(intent);

            }
        });
    }
}