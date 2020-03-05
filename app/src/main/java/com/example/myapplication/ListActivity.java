package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
   // private ListView listView;
   ArrayList<String> arrayList = new ArrayList<>();
    //private ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ListView listView = findViewById(R.id.listview1);
        arrayList.add("Android");
        arrayList.add("iPhone");
        arrayList.add("Windows");
        arrayList.add("Blackberry");
        arrayList.add("Linux");


        //Create Adapter
       ArrayAdapter<String> adapter = new ArrayAdapter(ListActivity.this, android.R.layout.simple_list_item_1,arrayList);

//assign adapter to listview
        listView.setAdapter(adapter);

//add listener to listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item=(String)listView.getItemAtPosition(position);
                Toast.makeText(ListActivity.this,item,Toast.LENGTH_LONG).show();
                Intent intent=new Intent(ListActivity.this,DeviceDetailActivity.class);
                startActivity(intent);
            }


      });
    }
}
