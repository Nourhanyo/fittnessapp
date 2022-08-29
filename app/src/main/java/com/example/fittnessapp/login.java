package com.example.fittnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    signup_db db=new signup_db(login.this);
    EditText userName;
    EditText password;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(login.this,R.color.black));
        setContentView(R.layout.activity_login);
        password = findViewById(R.id.TextPassword);
        userName = findViewById(R.id.PersonName);
        btn = findViewById(R.id.LOGINbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name = userName.getText().toString();
                String LoginPass = password.getText().toString();
                if (name.equals("")||LoginPass.equals(""))
                     Toast.makeText(login.this, "Please Fill Your Data", Toast.LENGTH_SHORT).show();
                else {
//                    boolean checkusesrdata =db.checkusernamepassword(name,LoginPass);
//                    if (checkusesrdata==true){
                        Toast.makeText(login.this,"sign in successful",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(login.this,home.class);
                        startActivity(intent);
                    }
//                    else {
//                        Toast.makeText(login.this,"invalid data",Toast.LENGTH_SHORT).show();

//                    }
//                }

            }
        });
    }
}