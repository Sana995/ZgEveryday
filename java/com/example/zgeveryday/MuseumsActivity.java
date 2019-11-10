package com.example.zgeveryday;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);


    ArrayList<Places> museums = new ArrayList<>();


    CustomAdapter adapter = new CustomAdapter(this, museums);

    ListView listView = (ListView) findViewById(R.id.shoppingList);
    listView.setAdapter (adapter);
}}
