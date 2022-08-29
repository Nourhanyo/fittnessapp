package com.example.fittnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class activityy1nourr extends AppCompatActivity {
    database db = new database(this);
    public final static String idd="com.example.fittnessapp.id";
    public static EditText name;
    public static String NAME ;

    Button add;
    ListView foodlist;
    ArrayList<String> list;
    ArrayAdapter adapter;
//    String id = cursor.getString( cursor.getColumnIndex("id") ); // id is column name in db

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(activityy1nourr.this,R.color.black));
        setContentView(R.layout.activityy1nourr);
        database dbs = new database(this);


        list = new ArrayList<>();
        name = (EditText) findViewById(R.id.textnour);
        add = (Button) findViewById(R.id.buttonnour);
        foodlist = findViewById(R.id.listnour);
        viewdata();
//        String id = Cursor.getString( foodlist.getColumnIndex("id") ); // id is column name in db

        foodlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(activityy1nourr.this, " " + foodlist  , Toast.LENGTH_SHORT).show();

            }


        });

        add.setOnClickListener((view) -> {
            String Name = name.getText().toString();

            boolean result = db.insertdata(Name);
            if (result == true && !name.equals("")) {
                Toast.makeText(activityy1nourr.this, "ok", Toast.LENGTH_SHORT).show();
                add.setText("");
                list.clear();
                viewdata();
            } else {
                Toast.makeText(activityy1nourr.this, "ok", Toast.LENGTH_SHORT).show();
            }

        });
//        to open new activity when click on item
        foodlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                {
                    NAME = foodlist.getItemAtPosition(i).toString();
                    Intent intent = new Intent(view.getContext(), activityy2nourr.class);
                    startActivity(intent);

                }
            }
        });
    }
//   private AdapterView.OnItemClickListener onlistclick =new AdapterView.OnItemClickListener() {
//       @Override
//       public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//           Intent intent=new Intent(MainActivity.this,Activity2.class);
//            intent.putExtra(idd,String.valueOf(l));
//            startActivity(intent);
//       }
//
//
//    };

    private void viewdata() {
        Cursor cursor = db.viewdata();
        if (cursor.getCount() == 0) {
            Toast.makeText(this, "no data to show", Toast.LENGTH_SHORT).show();

        } else {
            while (cursor.moveToNext())
                list.add(cursor.getString(1));
        }
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        foodlist.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menunour, menu);
        MenuItem searchitem = menu.findItem(R.id.menunourr);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchitem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            //
            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<String> userslist = new ArrayList<>();
//
                for (String user : list) {
                    if (user.toLowerCase().contains(newText.toLowerCase())) {
                        userslist.add(user);
                    }
                }
//
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(activityy1nourr.this,
                        android.R.layout.simple_list_item_1,userslist);
                foodlist.setAdapter(adapter);
                return true;

            }
//
        });
        return super.onCreateOptionsMenu(menu);
//
    }



}



