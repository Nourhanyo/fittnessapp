package com.example.fittnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class exercisesactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisesactivity);
        getWindow().setStatusBarColor(ContextCompat.getColor(exercisesactivity.this,R.color.black));
        ListView listView=findViewById(R.id.listview);
        List<String> list= new ArrayList<>();
        list.add("chest");
        list.add("arm");
        list.add("leg");
        list.add("shoulder");
        list.add("back");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),R.layout.row,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position==0){
                    startActivity(new Intent(exercisesactivity.this, chestactivity.class));

                }else if (position==1){
                    startActivity(new Intent(exercisesactivity.this,armactivity.class));

                }else if (position==2) {
                    startActivity(new Intent(exercisesactivity.this,legactivity.class));

                }else if (position==3){
                    startActivity(new Intent(exercisesactivity.this, shoulderactivity.class));

                }else if (position==4){
                    startActivity(new Intent(exercisesactivity.this, backaactivity.class));

                }else{

                }
            }
        });
    }
}