package com.example.fittnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class exercise5 extends AppCompatActivity {

    Button next5;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(exercise5.this,R.color.black));
        setContentView(R.layout.activity_exercise5);
        next5 =findViewById(R.id.next6_legs);

        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(exercise5.this,exercise6.class);
                startActivity(intent);

            }

        });

    }
}