package com.example.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
         Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song text view
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        // Get the name from the current object and
        // set this text on the name TextView
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist text view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist from the current object and
        // set this text on the TextView
        artistTextView.setText(currentSong.getArtistName());

        // Find the TextView in the list_item.xml layout with the button ID action
        Button actionButton = (Button) listItemView.findViewById(R.id.action);
        // Get the action from the current object and
        // set this text on the TextView
        actionButton.setText(currentSong.getAction());

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}

