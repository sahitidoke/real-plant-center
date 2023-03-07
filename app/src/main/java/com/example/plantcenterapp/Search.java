package com.example.plantcenterapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Search extends AppCompatActivity {

        ListView shapesListView ;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_search);
            shapesListView = (ListView)(findViewById(R.id.shapesListView));
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Indoor");
            arrayList.add("Outdoor");
            arrayList.add("Low maintenance");
            arrayList.add("Water");
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
            shapesListView.setAdapter(arrayAdapter);
            shapesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                }
            });

        }
    }
