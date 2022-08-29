package com.example.fittnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class exercise3 extends AppCompatActivity {

    Button next3;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(exercise3.this,R.color.black));
        setContentView(R.layout.activity_exercise3);
        next3 =findViewById(R.id.nextt3);

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(exercise3.this, com.example.fittnessapp.exercise4.class);
                startActivity(intent);

            }

        });

    }
}