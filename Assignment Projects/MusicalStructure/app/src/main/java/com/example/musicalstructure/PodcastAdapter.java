package com.example.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PodcastAdapter extends ArrayAdapter<Podcasts> {

    public PodcastAdapter(Activity context, ArrayList<Podcasts> podcasts) {
        super(context, 0, podcasts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.podcast_list_item, parent, false);
        }

        // Get the object located at this position in the list
        Podcasts currentPodcast = getItem(position);

        // Find the TextView in the podast_list_item.xml layout with the ID podcast text view
        TextView podcastTextView = (TextView) listItemView.findViewById(R.id.podcast_text_view);
        // Get the name from the current object and
        // set this text on the name TextView
        podcastTextView.setText(currentPodcast.getPodcastName());

        // Find the TextView in the podast_list_item.xml layout with the ID description text view
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the description from the current object and
        // set this text on the TextView
        descriptionTextView.setText(currentPodcast.getDescription());


        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}
