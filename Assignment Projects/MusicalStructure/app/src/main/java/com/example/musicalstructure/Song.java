package com.example.musicalstructure;

public class Song {

    //name of song
    private String songName;

    //name of artist
    private String artistName;
    private String action;

    public Song(String songName, String artistName, String action) {
        this.songName = songName;
        this.artistName = artistName;
        this.action = action;
    }

    //get name of song
    public String getSongName() {
        return songName;
    }

    //get name of artist
    public String getArtistName() {
        return artistName;
    }

    //get action
    public String getAction() {
        return action;
    }
}
