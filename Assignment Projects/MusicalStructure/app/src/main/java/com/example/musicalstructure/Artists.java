package com.example.musicalstructure;

public class Artists {

    //name of artist
    private String artistName;

    //details of albums of an artist
    private String albumDetails;

    public Artists(String artistName, String albumDetails) {
        this.artistName = artistName;
        this.albumDetails = albumDetails;
    }

    //get artist name
    public String getArtistName() {
        return artistName;
    }


    //get album details
    public String getAlbumDetails() {
        return albumDetails;
    }
}
