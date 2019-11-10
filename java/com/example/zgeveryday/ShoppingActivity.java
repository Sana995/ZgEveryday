package com.example.zgeveryday;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        ArrayList<Places> shopping = new ArrayList<>();
       // shopping.add(new Places("Here be dragons", "Mon-Sun: 11-21h", "Store with all the geeky like Marvel and DC, Harry Potter, GoT and lot more", R.mipmap.herebedragons));
        //shopping.add(new Places("Greencajg", "Mon-Sat 8-20h", "Healthy food and spices", R.mipmap.greencajg));
      //  shopping.add(new Places("Carta Magica", "Mon-Sat: 9-21h, Sun: 11-17h", "Store with board and card games with gameroom nearby so you can try some games for free", R.mipmap.cartamagica));
        //shopping.add(new Places("Ikea", "Mon-Sat: 10-21h, Sun: 10-18h", "Swedish restoraunt with great food, bistro and caffe that you can visit after shopping. You can find anything for interior there", R.mipmap.ikea));
        //shopping.add(new Places("Arena centar", "Mon-Fri: 10-21h, Sat-Sun: 9-21h", "The biggest shopping centar in Zagreb, a lot of stores, food court and caffes. Also, only Cinestar with IMAX", R.mipmap.arena));


        CustomAdapter adapter = new CustomAdapter(this, shopping);

        ListView listView = (ListView) findViewById(R.id.shoppingList);

        listView.setAdapter(adapter);
}}
