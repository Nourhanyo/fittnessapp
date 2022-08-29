package com.example.fittnessapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class signup_db extends SQLiteOpenHelper {
public static final String dbname="dataname";
SQLiteDatabase s;
  public signup_db(Context con)
  {
      super(con,dbname,null,1);
  }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table signup ( id integer primary key autoincrement ," +
                "name text," +
                "age text," +
                "weight text ," +
                "height text ," +
                "password text," +
                "gender text ) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
      sqLiteDatabase.execSQL("drop table if exists signup");
      onCreate(sqLiteDatabase);
    }
    public String insert_Data(String n,String a,String w,String h,String p)
    {
      s=this.getWritableDatabase();
      ContentValues values=new ContentValues();
      values.put("name",n);
      values.put("age",a);
      values.put("weight",w);
      values.put("height",h);
      values.put("password",p);
      long re=s.insert("signup",null,values);
      s.close();
      if(re==-1)
        return "Registration Failed ";
      else
        return "Registration Done Successfully";

    }
  public Boolean checkusername(String name){

        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor= db.rawQuery("select *from signup where name =? ",new String[]{name});
        if (cursor.getCount()> 0)
            return true;
        else
            return false ;

   }
  public Boolean checkusernamepassword(String name,String password){
    SQLiteDatabase db=this.getWritableDatabase();
    Cursor cursor= db.rawQuery("select * from  signup where name =? and passward= ?",new String[]{name,password});
    if (cursor.getCount()> 0)
      return true;
    else
      return false ;

  }
}
