package com.example.fittnessapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class UserPage extends AppCompatActivity {
signup_db db=new signup_db(UserPage.this);
    Button mybutton ;
    TextView text1 ;
    EditText nametxt;
    EditText agetxt;
    EditText weighttxt;
    EditText heighttxt;
    EditText pass;
    RadioButton radioButton1 ;
    RadioButton radioButton2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(UserPage.this,R.color.black));
        setContentView(R.layout.activity_user_page);
        mybutton=(Button) findViewById(R.id.button) ;
        text1= (TextView) findViewById(R.id.welcome) ;
        nametxt=(EditText) findViewById(R.id.name) ;
        agetxt=( EditText)findViewById(R.id.Agetxt) ;
        radioButton1=(RadioButton) findViewById(R.id.radioButton1) ;
        radioButton2=(RadioButton)findViewById(R.id.radioButton2) ;
        weighttxt=(EditText)findViewById(R.id.weighttxt) ;
        heighttxt=(EditText)findViewById(R.id.heighttxt) ;
        pass=(EditText)findViewById(R.id.password) ;


        //---------------------------------------------------------
        mybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ContentValues contentValues=new ContentValues();
                String namest = nametxt.getText().toString();
                String agest = agetxt.getText().toString();
                String weightst = weighttxt.getText().toString();
                String heightst = heighttxt.getText().toString();
                String password = pass.getText().toString();



                if (namest == null || agest == null || weightst == null || heightst==null) {

                                            Toast toast =  Toast.makeText(UserPage.this, "Please Fill Your Data", Toast.LENGTH_SHORT);
                                            toast.show();
                                        }
               else{
//                   if (radioButton1.isChecked()){
//                       contentValues.put("gender",radioButton1.getText().toString());
//                   }else
//                   {contentValues.put("gender",radioButton2.getText().toString());}
                    signup_db sign=new signup_db(UserPage.this);//
                    // insert= db.insertdatauser(namest,agest,weightst,heightst,password);
                    String insert =sign.insert_Data(namest,agest,weightst,heightst,password);

                       Toast.makeText(UserPage.this,insert,Toast.LENGTH_SHORT).show();
                       Intent intent = new Intent(UserPage.this, login
                               .class);
                       startActivity(intent);}
                  // else if (insert==false){
                     //  Toast.makeText(UserPage.this,"registered failed",Toast.LENGTH_SHORT).show();




            }
        });
    }
}