package com.example.fittnessapp;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.Calendar;

public class ProfilePage_h extends AppCompatActivity implements ExampleDialog_h.ExampleDialogListener {
    private TextView userName;
    private TextView textgender;
    private TextView tage;
    private TextView tweight;
    private TextView theight;
    private Button editButton;

    private Button calendarB;
    private TextView date;
    DatePickerDialog datePickerDialog;
    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(ProfilePage_h.this,R.color.black));
        setContentView(R.layout.activity_profile_h);
        userName = (TextView) findViewById(R.id.textview_username);
        textgender = (TextView) findViewById(R.id.textview_gender);
        tage = (TextView) findViewById(R.id.textview_age);
        tweight = (TextView) findViewById(R.id.textview_weight);
        theight = (TextView) findViewById(R.id.textview_height);
        editButton = (Button) findViewById(R.id.button);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
        calendarB = (Button) findViewById(R.id.button2);
        date = (TextView) findViewById(R.id.textView2);
        calendarB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(ProfilePage_h.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                date.setText(day + "/" + (month + 1) + "/" + year);
                            }
                        },year,month,dayOfMonth);
                datePickerDialog.show();
            }
        });
    }
    public void openDialog()
    {
        ExampleDialog_h exampleDialog = new ExampleDialog_h();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }

    @Override
    public void applyTexts(String name, String gender, String age, String weight, String Height) {
        userName.setText(name);
        textgender.setText(gender);
        tage.setText(age);
        tweight.setText(weight);
        theight.setText(Height);

    }
}