package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locationAttractions) {
        super(context, 0, locationAttractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the object located at this position in the list
        Location currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name text view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name from the current object and
        // set this text on the name TextView
        nameTextView.setText(currentAttraction.getmName());

        // Find the TextView in the list_item.xml layout with the ID description text view
        TextView descTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the artist from the current object and
        // set this text on the TextView
        descTextView.setText(currentAttraction.getmDescription());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the version number from the current object and
        // set this image on the ImageView
        imageView.setImageResource(currentAttraction.getmImageResourceId());

        return listItemView;
    }
}
