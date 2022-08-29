package com.example.fittnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class activityy2nourr extends AppCompatActivity {
    Cursor result;
    public database data;
    public TextView calories;
    public TextView totalfat;
    public TextView satfat;
    public TextView cholest;
    public TextView carb;
    public TextView fiber;
    public TextView sugers;
    public TextView protein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(activityy2nourr.this,R.color.black));
        setContentView(R.layout.activityy2nourr);
// to show the data in textview
        calories = (TextView) findViewById(R.id.textview17);
        totalfat = (TextView) findViewById(R.id.textView10);
        satfat = (TextView) findViewById(R.id.textView11);
        cholest = (TextView) findViewById(R.id.textView12);
        carb = (TextView) findViewById(R.id.textView14);
        fiber = (TextView) findViewById(R.id.textView15);
        sugers = (TextView) findViewById(R.id.textView13);
        protein = (TextView) findViewById(R.id.textView16);


        data = new database(this);
//  String n =data.insertdata2("apple" , 20, 3,5,140,2,1,0,7);

//        TextView textView = findViewById(R.id.textview17);
//        Cursor cursor = data.viewdata();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        while (cursor.moveToNext()) {
//            stringBuilder.append("\n " + cursor.getString(2));
////        column index
//
//        }
//        textView.setText(stringBuilder);

        fun();
        database database = new database(this);
        result = data.viewdata();


    }


    public void fun() {
        fooditem f = get_item();
        System.out.println(f.getname());
        System.out.println(f.getCalories());
        System.out.println(f.getCarb());
        System.out.println(f.getCholest());
        System.out.println(f.getFiber());
        System.out.println(f.getProtein());
        System.out.println(f.getTotalfat());


        if (f != null) {

            calories.setText(String.valueOf(f.getCalories()));
            totalfat.setText(String.valueOf(f.getTotalfat()));
            satfat.setText(String.valueOf(f.getSatfat()));
            cholest.setText(String.valueOf(f.getCholest()));
            carb.setText(String.valueOf(f.getCarb()));
            fiber.setText(String.valueOf(f.getFiber()));
            sugers.setText(String.valueOf(f.getSugers()));
            protein.setText(String.valueOf(f.getProtein()));
        } else
            System.out.println("يالهويي");


    }

    public fooditem get_item() {
        ArrayList<fooditem> food = data.getdata();
        System.out.println("sizeeeeeeee:" + food.size());
        System.out.println("NAMEEEEE: " + activityy1nourr.NAME);
        for (int i = 0; i < food.size(); i++) {
            if (activityy1nourr.NAME.equals(food.get(i).getname())) {
                System.out.println("////////////////////////////" + activityy1nourr.name.getText().toString());
                return food.get(i);
            }
        }
        return null;
    }
//    public void readnext(View vw){
//TextView caloriesd=(TextView) findViewById(R.id.textview16);
//
//     if (result.moveToNext())
//     {
//         caloriesd.setText(result.getString(1));
//
//
//
//     }
//    }

    class add extends BaseAdapter {
        ArrayList<fooditem> f = new ArrayList<fooditem>();

        public add(ArrayList<fooditem> v) {
            this.f = v;
        }


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view1, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.activityy2nourr, null);
            TextView calories = (TextView) view.findViewById(R.id.textview17);
            TextView totalfat = (TextView) view.findViewById(R.id.textView10);
            TextView satfat = (TextView) view.findViewById(R.id.textView11);
            TextView cholest = (TextView) view.findViewById(R.id.textView12);
            TextView carb = (TextView) view.findViewById(R.id.textView14);
            TextView fiber = (TextView) view.findViewById(R.id.textView15);
            TextView sugers = (TextView) view.findViewById(R.id.textView13);
            TextView protein = (TextView) view.findViewById(R.id.textView16);

//            calories.setText(f.get(Position).getCalories());
//            totalfat.setText(f.get(Position).getTotalfat());
//            satfat.setText(f.get(Position).getSatfat());
//            cholest.setText(f.get(Position).getCholest());
//            carb.setText(f.get(Position).getCarb());
//            fiber.setText(f.get(Position).getFiber());
//            sugers.setText(f.get(Position).getSugers());
//            protein.setText(f.get(Position).getProtein());


            return view;
        }

    }
}

