package com.example.zgeveryday;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //region Cafes

        // Find the view that shows caffes
        TextView caffes = (TextView) findViewById(R.id.caffes);

        // Set on click listener on that view
        caffes.setOnClickListener(new OnClickListener() {

        // The code in this method will be executed when the caffes category is clicked on.
        @Override
        public void onClick(View view) {
            // Create a new intent to open the {@link CaffesActivity}
            Intent caffesIntent = new Intent(MainActivity.this, CaffesActivity.class);

            // Start the new activity
            startActivity(caffesIntent);
        }
});
        //endregion

        // region Shopping

        // Find the view that shows shopping category
        TextView shopping = (TextView) findViewById(R.id.shopping);

        // Set on click listener on that view
        shopping.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the shopping category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });

        // endregion

        // region Fun

        // Find the view that shows fun activity
        TextView games = (TextView) findViewById(R.id.fun);

        // Set on click listener on that view
        games.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the games category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FunActivity}
                Intent funIntent = new Intent(MainActivity.this, FunActivity.class);

                // Start the new activity
                startActivity(funIntent);
            }
        });

        // endregion

        // region Food

        // Find the view that shows movies
        TextView movies = (TextView) findViewById(R.id.food);

        // Set on click listener on that view
        movies.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the movies category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoodActivity}
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                // Start the new activity
                startActivity(foodIntent);
            }
        });

        // endregion

        // region Parks

        // Find the view that shows parks
        TextView parks = (TextView) findViewById(R.id.parks);

        // Set on click listener on that view
        parks.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the parks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ParksActivity}
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);

                // Start the new activity
                startActivity(parksIntent);
            }
        });

        // endregion

        // region Museums

        // Find the view that shows museums
        TextView museums = (TextView) findViewById(R.id.museums);

        // Set on click listener on that view
        museums.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the museums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MuseumsActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        // endregion
}}