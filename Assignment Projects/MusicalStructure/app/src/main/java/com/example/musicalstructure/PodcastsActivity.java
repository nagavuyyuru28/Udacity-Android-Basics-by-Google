package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_view);

        //Create a list of Podcasts to browse
        ArrayList<Podcasts> podcasts = new ArrayList<>();
        podcasts.add(new Podcasts("This Week in Tech", "Current Tech News and Reviews"));
        podcasts.add(new Podcasts("Switched On", "future of tech trends"));
        podcasts.add(new Podcasts("Fintech Insider", "how technology is changing our relationship with money"));
        podcasts.add(new Podcasts("Rocket","discusses everything from tech books, movies, games etc"));
        podcasts.add(new Podcasts("Science: Disrupt", "discusses science and technology"));

        // Create an {@link PodcastAdapter}, whose data source is a list of {@link podcast}s. The
        // adapter knows how to create list items for each item in the list.
        PodcastAdapter podcastsAdapter = new PodcastAdapter(this, podcasts);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // music_list_view.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link podcastsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link podcast} in the list.
        listView.setAdapter(podcastsAdapter);


    }
}
