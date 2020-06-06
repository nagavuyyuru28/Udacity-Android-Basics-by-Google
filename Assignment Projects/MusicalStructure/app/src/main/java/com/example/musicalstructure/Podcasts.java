package com.example.musicalstructure;

public class Podcasts {

    //name of podcast
    private String podcastName;

    //description of podcast
    private String description;

    public Podcasts(String podcastName, String description) {
        this.podcastName = podcastName;
        this.description = description;
    }

    //get name of podcast
    public String getPodcastName() {
        return podcastName;
    }

    //get description of podcast
    public String getDescription() {
        return description;
    }
}