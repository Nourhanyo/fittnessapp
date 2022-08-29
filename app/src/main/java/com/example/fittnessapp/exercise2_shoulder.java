package com.example.fittnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class exercise2_shoulder extends AppCompatActivity {

    Button next1;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(exercise2_shoulder.this,R.color.black));
        setContentView(R.layout.activity_exercise2_shoulder);
        next1 =findViewById(R.id.next2_shoulder);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(exercise2_shoulder.this, com.example.fittnessapp.exercise3_shoulder.class);
                startActivity(intent);

            }

        });
    }
}