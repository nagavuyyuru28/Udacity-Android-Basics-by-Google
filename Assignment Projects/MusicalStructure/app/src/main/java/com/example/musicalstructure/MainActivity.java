package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the music category
        TextView music = (TextView) findViewById(R.id.music);

        // Set a click listener on that View
        music.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the music category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link browseMusicActivity}
                Intent musicIntent = new Intent(MainActivity.this, BrowseMusicActivity.class);

                // Start the new activity
                startActivity(musicIntent);
            }
        });

        // Find the View that shows the podcasts category
        TextView podcasts = (TextView) findViewById(R.id.podcasts);

        // Set a click listener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the podcasts category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link podcastsActivity}
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);

                // Start the new activity
                startActivity(podcastsIntent);
            }
        });

        // Find the View that shows the artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link artistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

    }
}
