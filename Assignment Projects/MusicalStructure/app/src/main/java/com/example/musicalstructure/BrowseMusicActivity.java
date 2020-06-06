package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BrowseMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_view);

        //Create a list of Songs to browse
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Lose Yourself", "Eminem","Play"));
        songs.add(new Song("Bad Guy", "Billie Eilish","Play"));
        songs.add(new Song("Senorita", "Shawn Mendes","Play"));
        songs.add(new Song("Sucker", "Jonas Brothers","Play"));
        songs.add(new Song("Circles", "Post Malone","Play"));
        songs.add(new Song("Liar", "Camila Cabello","Play"));
        songs.add(new Song("Memories", "Maroon 5","Play"));
        songs.add(new Song("Blinding Lights", "The Weeknd","Play"));
        songs.add(new Song("The Box", "Roddy Ricch","Play"));
        songs.add(new Song("Falling", "Trevor Daniel","Play"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // music_list_view.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

    }
}
