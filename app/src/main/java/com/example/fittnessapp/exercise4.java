package com.example.fittnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class exercise4 extends AppCompatActivity {

    Button next4;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(exercise4.this,R.color.black));
        setContentView(R.layout.activity_exercise4);
        next4 =findViewById(R.id.next6_legs);

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(exercise4.this,exercise5.class);
                startActivity(intent);

            }

        });

    }
}