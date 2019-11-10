package com.example.zgeveryday;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomAdapter extends ArrayAdapter<Places> {

    public CustomAdapter(Activity context, ArrayList<Places> places){
        super(context,0,  places);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_design, parent, false);
        }
        Places currentPlace = getItem(position);

        // get name of the current place
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);
        nameTextView.setText(currentPlace.getName());

        // get working hours of the current place
        TextView workingHoursTextView = (TextView) listItemView.findViewById(R.id.place_working_hours);
        workingHoursTextView.setText(currentPlace.getWorkingHours());

        // get short description for the current place
        TextView bioTextView = (TextView) listItemView.findViewById(R.id.place_bio);
        bioTextView.setText(currentPlace.getBio());

        // get image of the current place
        ImageView imgView = (ImageView) listItemView.findViewById(R.id.place_img);
        imgView.setImageResource(currentPlace.getImgResourceId());

        TextView url = (TextView) listItemView.findViewById(R.id.place_url);
        url.setText(currentPlace.getUrl());


        return listItemView;
}


}
