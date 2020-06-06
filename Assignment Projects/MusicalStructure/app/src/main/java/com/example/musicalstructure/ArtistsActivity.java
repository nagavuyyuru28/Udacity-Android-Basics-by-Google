package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_view);

        //Create a list for artists
        ArrayList<Artists> artists = new ArrayList<>();
        artists.add(new Artists("Eminem","Recovery, Revival and more"));
        artists.add(new Artists("Ariana Grande","My Everything, Yours Truly and more"));
        artists.add(new Artists("Shawn Mendes","The Shawn Mendes EP, Life of the Party and more"));
        artists.add(new Artists("Ed Sheeran","x, plus and more"));
        artists.add(new Artists("Selena Gomez","Stars Dance, Slow down and more"));
        artists.add(new Artists("Bruno Mars","Unorthodox jukebox, Moonshine and more"));
        artists.add(new Artists("The Weeknd","Kissland, Thursday and more"));
        artists.add(new Artists("Billie Eilish","Don't smile at me and more"));
        artists.add(new Artists("Enrique Iglesias","7, Insomniac and more"));
        artists.add(new Artists("Post Malone","Hollywood's bleeding, Stoney and more"));
        artists.add(new Artists("Drake", "Scorpion, Views and more"));

        // Create an {@link ArtistAdapter}, whose data source is a list of {@link artist}s. The
        // adapter knows how to create list items for each item in the list.
        ArtistAdapter artistAdapter = new ArtistAdapter(this, artists);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // music_list_view.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link artistsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link artist} in the list.
        listView.setAdapter(artistAdapter);
    }
}
