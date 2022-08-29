package com.example.fittnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class exercise6 extends AppCompatActivity {

    Button next6;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(exercise6.this,R.color.black));
        setContentView(R.layout.activity_exercise6);
        next6 =findViewById(R.id.next6_legs);

        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(exercise6.this,finish.class);
                startActivity(intent);

            }

        });

    }
}