package com.example.fittnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class exercise2 extends AppCompatActivity {

    Button next2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(exercise2.this,R.color.black));
        setContentView(R.layout.activity_exercise2);
        next2 =findViewById(R.id.nextt2);

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(exercise2.this,exercise3.class);
                startActivity(intent);

            }

        });
    }
}