package com.example.fittnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {
    Button btn1;
    Button btn2;
    database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(second.this,R.color.black));
        setContentView(R.layout.activity_second);
        btn1 = findViewById(R.id.secbtn1);
        btn2 = findViewById(R.id.secbtn2);
        db=new database(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(second.this, login.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(second.this, UserPage.class);
                startActivity(intent);
            }
        });

    }
}