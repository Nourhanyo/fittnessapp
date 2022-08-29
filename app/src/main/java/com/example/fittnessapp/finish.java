package com.example.fittnessapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class finish extends AppCompatActivity {
    Button contune;
    Intent intent;
    TextView    textViewtime;
    static String m1;
    static String h1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(finish.this,R.color.black));
        setContentView(R.layout.activity_finish);
        textViewtime = findViewById(R.id.textViewtime);

        @SuppressLint("SimpleDateFormat") SimpleDateFormat formatterm = new SimpleDateFormat("mm");
        @SuppressLint("SimpleDateFormat") SimpleDateFormat formatterh = new SimpleDateFormat("hh");
        Date date = new Date();
        String m2 = formatterm.format(date);
        String h2 = formatterh.format(date);
        int hour1 = Integer.parseInt(h1);
        int min1 = Integer.parseInt(m1);
        int hour2 = Integer.parseInt(h2);
        int min2 = Integer.parseInt(m2);
        int total = (min1 <= min2 ? min2 - min1 : (60 - min1) + min2);
        total += ((hour2 - hour1) * 60);
        String s = String.valueOf(total);
        textViewtime.setText(s);

        contune =findViewById(R.id.contnue);

        contune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(finish.this,home.class);
                startActivity(intent);

            }

        });
    }
}