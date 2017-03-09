package com.example.isomi.radiostation.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.isomi.radiostation.R;
import com.example.isomi.radiostation.fragments.StationFragment;


public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        StationFragment stationFragment = StationFragment.newInstance("featured");
        fragmentManager.beginTransaction().add(R.id.top_station_container, stationFragment).commit();

        stationFragment = StationFragment.newInstance("recent");
        fragmentManager.beginTransaction().add(R.id.bottom_station_container, stationFragment).commit();
    }
}
