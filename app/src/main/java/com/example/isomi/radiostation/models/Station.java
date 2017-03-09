package com.example.isomi.radiostation.models;

/**
 * Created by Isomi on 3/9/17.
 */

public class Station {

    private String stationTitle;
    private int imageResourceId;

    public Station(String stationTitle, int imageResourceId) {
        this.stationTitle = stationTitle;
        this.imageResourceId = imageResourceId;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
