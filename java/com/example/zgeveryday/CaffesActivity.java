package com.example.zgeveryday;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CaffesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caffes);


        // Create Array of caffes (should be done with data base!!)
        ArrayList<Places> cafes = new ArrayList<Places>();
        cafes.add(new Places("Cat Caffe", "Mon-Thu: 9-22h; Fri-Sun: 9-23h", "Caffe with cute cat, home atmosphere and awesome drinks", R.mipmap.catcaffe, "https://www.facebook.com/catcaffezagreb/" ));
        cafes.add(new Places("Kavantura", "Mon-Sun: 9-23h", "Great selection of coffee and casual but classy interior", R.mipmap.kavantura, "https://imperijakave.hr/"));
        cafes.add(new Places("Crni mačak","Mon-Thu: 7-23h; Fri-Sat: 7-00h; Sun: 10-22h", "Small caffe with PS2 and geeky events like board games and Ministy of magic meetings", R.mipmap.crnimacak, "https://www.facebook.com/bcczagreb/"));
        cafes.add(new Places("Caffe bar Friends","7-23:30h", "Small and cozzy place with specific decorations, home atmosphere and great prices", R.mipmap.friends, "https://www.facebook.com/pages/Caffe-bar-Friends/190103947692978"));
        cafes.add(new Places("Tolkien's House", "Mon-Sat: 7-00h, Sun: 7-23h", "Great selection of craft beer, really small place with interesting interior", R.mipmap.tolkienshouse, "https://www.facebook.com/tolkienszagreb"));

        final ListView listView = (ListView) findViewById(R.id.caffeList);
        CustomAdapter adapter = new CustomAdapter(this, cafes);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // getResources().getStringArray(R.cafes.url);
                //Toast.makeText(CaffesActivity.this, item.toString(), Toast.LENGTH_LONG).show();

                //Uri uri = Uri.parse(item.toString());
                //Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                //startActivity(intent);
            }
        });




    }}
