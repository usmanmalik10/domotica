package com.example.domotica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listview extends AppCompatActivity {

    ListView listView;

    String[] devices = {"Electric Fan", "Tube Light", "TV","Entrance", "Living Room",
            "LED Light", "Fridge", "AC", "Seilling Fan", "Warm Light", "Bedroom Light", "Owen"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(listview.this, android.R.layout.simple_dropdown_item_1line, devices);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(listview.this, "Turn On "+ devices[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}