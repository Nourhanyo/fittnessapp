package com.example.fittnessapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class database extends SQLiteOpenHelper {
    private static final String databases = "food.db";
//    private static final String  DATABASE_BATH="/data/data/com.mimirosft.tutorial15_ID";
    private static String fooduse   = "create table fooduse (id integer primary key autoincrement ,name text,calories text );";
    private static String foodtable = "create table foodtable(id integer primary key autoincrement,name text,calories text ,totalfat integer ,satfat integer,cholest integer" +
            ",carb integer,fiber integer,sugers integer,protein  integer );";
//    private static String userdata   = "create table userdata (" +
//            "id integer primary key autoincrement ," +
//            "name text, " +
//            "age text ," +
//            "weight text," +
//            " height text , " +
//
//            " gender text ," +
//            " password text  );";


    public database(Context context) {
        super(context, databases, null, 1);
    }
    private SQLiteDatabase db;


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(foodtable);
        db.execSQL("insert into  foodtable (name,calories,totalfat  ,satfat ,cholest ,carb ,fiber,sugers ,protein )" + "values('pizza' , 250 ,' 9g','9g','9mg','9g','9g','9g','9g')");
        db.execSQL("INSERT INTO  foodtable (name,calories,totalfat  ,satfat ,cholest ,carb ,fiber,sugers ,protein ) " + "VALUES ('egg' , 72 , '5g','1.5g','18mg','0g','0g','0g','7g')");
        db.execSQL("INSERT INTO  foodtable (name,calories,totalfat  ,satfat ,cholest ,carb ,fiber,sugers ,protein ) " + "VALUES ('Apple' ,20  , '3g','5g','14mg','2g','1g','0g','7g')");
        db.execSQL("INSERT INTO  foodtable (name,calories,totalfat  ,satfat ,cholest ,carb ,fiber,sugers ,protein ) " + "VALUES ('burger' , 110 ,' 3g','5g','1,4mg','2g','1g','0g','7g')");
        db.execSQL("INSERT INTO  foodtable (name,calories,totalfat  ,satfat ,cholest ,carb ,fiber,sugers ,protein ) " + "VALUES ('rice' , 242,'0.2g' ,'0.1g','5mg','1g','2g','1g','0g')");
        db.execSQL("INSERT INTO  foodtable (name,calories,totalfat  ,satfat ,cholest ,carb ,fiber,sugers ,protein ) " + "VALUES ('coffee' , 2 ,' 3g','5g','0mg','2g','1g','0g','7g')");
        db.execSQL("INSERT INTO  foodtable (name,calories,totalfat  ,satfat ,cholest ,carb ,fiber,sugers ,protein ) " + "VALUES ('chicken' , 75 ,' 9g','3.3g','4mg','0g','0g','1.1g','3g')");
        db.execSQL("INSERT INTO  foodtable (name,calories,totalfat  ,satfat ,cholest ,carb ,fiber,sugers ,protein ) " + "VALUES ('meat' , 80 ,' 2g','0.1g','0mg','2g','4g','0g','0g')");
        db.execSQL("INSERT INTO  foodtable (name,calories,totalfat  ,satfat ,cholest ,carb ,fiber,sugers ,protein ) " + "VALUES ('ships' , 250 ,' 2.4g','9g','4mg','3g','2.2g','6g','1g')");
        db.execSQL("INSERT INTO  foodtable (name,calories,totalfat  ,satfat ,cholest ,carb ,fiber,sugers ,protein ) " + "VALUES ('fishsalmon' , 127 ,' 3','5','140mg','2g','1g','0g','7g')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        db.execSQL("drop TABLE if EXISTS foodtable ");
        db.execSQL("drop TABLE if EXISTS fooduse ");
        db.execSQL("drop TABLE if EXISTS userdata");


        onCreate(db);
    }
    public boolean insertdata2(String name,String a,int c,int e ,int t ,int y ,int i ,int o ,int p  ) {
        SQLiteDatabase db=this.getWritableDatabase(); //to make it able to write
        ContentValues contentValues= new ContentValues();
        contentValues .put("name",name);
        contentValues .put("calories",a);
        contentValues .put("totalfat",c);
        contentValues .put("satfat",e);
        contentValues .put("cholest",t);
        long result= db.insert("foodtable",null,contentValues);
        if (result==-1)
            return false;
        else
            return true;
    }
//    public boolean insertatlogin(String name,String password ) {
//        SQLiteDatabase db=this.getWritableDatabase(); //to make it able to write
//        ContentValues contentValues= new ContentValues();
//        contentValues.put("name ",name);
//        contentValues.put("password",password);
//        long result= db.insert("userdata",null,contentValues);
//        if (result==-1)
//            return false;
//        else
//            return true;
//    }
//    public boolean insertdatauser(String name,String age ,String weight,String height,String password ) {
//        SQLiteDatabase db=this.getWritableDatabase(); //to make it able to write
//        ContentValues contentValues= new ContentValues();
//        contentValues.put("name",name);
//        contentValues.put("age",age);
//        contentValues.put("weight",weight);
//        contentValues.put("height",height);
//        contentValues.put("password",password);
////        contentValues .put("gender", gender);
//       // long result= db.insert("userdata",null,contentValues);
//        long r=db.insert("userdata",null,contentValues);
//        db.close();
//        if (r==-1)
//            return false;
//        else
//            return true;
//    }
//    public Boolean checkusername(String name){
//
//        SQLiteDatabase db=this.getWritableDatabase();
//        Cursor cursor= db.rawQuery("select *from userdata where name =? ",new String[]{name});
//        if (cursor.getCount()> 0)
//            return true;
//        else
//            return false ;
////
////    }
//    public Boolean checkusernamepassword(String name,String password){
//        SQLiteDatabase db=this.getWritableDatabase();
//        Cursor cursor= db.rawQuery("select *from userdata where name =? and passward= ?",new String[]{name,password});
//        if (cursor.getCount()> 0)
//            return true;
//        else
//            return false ;
//
//    }
//   public boolean update(String name,String a,int c,int e ,int t ,int y ,int i ,int o ,int p  ){
//  SQLiteDatabase db= this.getWritableDatabase();
//  Cursor cursor=db.rawQuery("select * from foodtable",null);
//








//    create method to insert data which choose to calculate total calories for day
     public boolean insertdata(String name){
        SQLiteDatabase db=this.getWritableDatabase(); //to make it able to write
        ContentValues contentValues= new ContentValues();
        contentValues .put("name",name);
        long result= db.insert("fooduse",null,contentValues);
        if (result==-1)
            return false;
        else
            return true;
     }
    public boolean update(String name,int a,String c,String e ,String t ,String y ,String i ,String o ,String p  ){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",name);
        contentValues.put("name",a);
        contentValues.put("calories",c);
        contentValues.put("totalfat",e);
        contentValues.put("satfat",t);
        contentValues.put("cholest",y);
        contentValues.put("fiber",i);
        contentValues.put("sugers",o);
        contentValues.put("protein",p);
        db.update("foodtable",contentValues,"name=?",new String[]{String.valueOf(a)});
        return true;
    }




    //     create method to show the elements
     public Cursor viewdata(){
      SQLiteDatabase db=this.getReadableDatabase();
      String quary="select * from foodtable";
      Cursor cursor=db.rawQuery(quary,null);
      return cursor;

     }
  public ArrayList<fooditem> getdata(){
ArrayList<com.example.fittnessapp.fooditem>arrayList=new ArrayList<com.example.fittnessapp.fooditem>();
SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
Cursor c=sqLiteDatabase.rawQuery("select*from foodtable",null);
c.moveToFirst();
while (c.isAfterLast()==false){

    arrayList.add(new com.example.fittnessapp.fooditem(c.getInt(0),
            c.getString(1),
            c.getInt(2),
            c.getString(3),
            c.getString(4),
            c.getString(5),
            c.getString(6),
            c.getString(7),
            c.getString(8),
            c.getString(9)));
    c.moveToNext();
}
return arrayList;
  }


    }