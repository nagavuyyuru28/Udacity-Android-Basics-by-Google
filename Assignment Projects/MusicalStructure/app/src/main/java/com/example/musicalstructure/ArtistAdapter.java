package com.example.musicalstructure;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artists> {

    public ArtistAdapter(Activity context, ArrayList<Artists> artists) {
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.artist_list_item, parent, false);
        }

        // Get the object located at this position in the list
        Artists currentArtist = getItem(position);

        // Find the TextView in the artist_list_item.xml layout with the ID artist text view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the name from the current object and
        // set this text on the name TextView
        artistTextView.setText(currentArtist.getArtistName());

        // Find the TextView in the artist_list_item.xml layout with the ID details text view
        TextView detailsTextView = (TextView) listItemView.findViewById(R.id.details_text_view);
        // Get the details from the current object and
        // set this text on the TextView
        detailsTextView.setText(currentArtist.getAlbumDetails());


        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }

}
