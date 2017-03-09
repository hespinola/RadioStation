package com.example.isomi.radiostation.datasources;

import com.example.isomi.radiostation.R;
import com.example.isomi.radiostation.models.Station;

import java.util.ArrayList;

/**
 * Created by Isomi on 3/9/17.
 */

public class DataSource {
    public static final DataSource ourInstance = new DataSource();

    static DataSource getInstance() {
        return ourInstance;
    }

    private DataSource() {
    }

    public ArrayList<Station> getFeaturedStations() {
        // Pretend data is being downloaded

        Station station1 = new Station("Flight Plan (Tunes for Travel)", R.drawable.flightplanmusic);
        Station station2 = new Station("Two-Wheelin' (Biking Playlist)", R.drawable.bicyclemusic);
        Station station3 = new Station("Kids Jams for Children", R.drawable.kidsmusic);

        ArrayList<Station> stations = new ArrayList<>();

        stations.add(station1);
        stations.add(station2);
        stations.add(station3);

        return stations;
    }

    public ArrayList<Station> getRecentStations() {
        // Pretend data is being downloaded

        Station station1 = new Station("Vinyl Music", R.drawable.vinylmusic);
        Station station2 = new Station("Social Trends", R.drawable.socialmusic);
        Station station3 = new Station("Key for Relaxing", R.drawable.keymusic);

        ArrayList<Station> stations = new ArrayList<>();

        stations.add(station1);
        stations.add(station2);
        stations.add(station3);

        return stations;
    }
}
