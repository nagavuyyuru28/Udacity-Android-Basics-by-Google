package com.example.tourguide;

import android.media.Image;

public class Location {

    // name of an attraction
    private String mName;

    //descripton of attraction
    private String mDescription;

    //Image resoure ID
    private int mImageResourceId;

    /**
     * Create a new Location object.
     *
     * @param mName is the name of an attraction in the location
     *
     * @param mDescription is the description of an attraction
     *
     * @param mImageResourceId is the drawable image resource ID
     */
    public Location(String mName, String mDescription, int mImageResourceId) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.mImageResourceId = mImageResourceId;

    }

    //get the name of attraction
    public String getmName() {
        return mName;
    }

    //get the description of attraction
    public String getmDescription() {
        return mDescription;
    }

    //set the name of attraction
    public void setmName(String mName) {
        this.mName = mName;
    }

    //set the description of attraction
    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    //get the Image Resource ID of the word
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    //get the Image Resource ID of the word.
    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
