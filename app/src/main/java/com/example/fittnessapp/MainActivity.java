package com.example.fittnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button nextbtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.black));
        setContentView(R.layout.activity_main);

        nextbtn = (Button) findViewById(R.id.nextbtn1);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this , second.class) ;
                startActivity(intent);

            }
        });

    }
}