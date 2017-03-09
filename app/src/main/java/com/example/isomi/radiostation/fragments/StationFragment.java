package com.example.isomi.radiostation.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.isomi.radiostation.R;
import com.example.isomi.radiostation.adapters.StationAdapter;
import com.example.isomi.radiostation.datasources.DataSource;
import com.example.isomi.radiostation.holders.StationViewHolder;


public class StationFragment extends Fragment {
    // Arguments
    private static final String ARG_PARAM1 = "param1";
    private String mParam1;

    private final String FEATURED_STATION = "featured";
    private final String RECENT_STATIOn = "recent";


    // UI Elements
    private TextView stationHeading;
    private TextView stationSubHeading;
    private RecyclerView stationRecycler;
    private RecyclerView.Adapter<StationViewHolder> adapter;
    private LinearLayoutManager layoutManager;

    public StationFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static StationFragment newInstance(String param1) {
        StationFragment fragment = new StationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_station, container, false);

        stationHeading = (TextView)v.findViewById(R.id.station_heading);
        stationSubHeading = (TextView)v.findViewById(R.id.station_sub_heading);
        stationRecycler = (RecyclerView)v.findViewById(R.id.station_recycler);
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        if (mParam1 == FEATURED_STATION) {
            stationHeading.setText("Featured Stations");
            stationSubHeading.setText("What is trending...");
            adapter = new StationAdapter(DataSource.ourInstance.getFeaturedStations());
        } else {
            stationHeading.setText("Recent Stations");
            stationSubHeading.setText("What you've been listening...");
            adapter = new StationAdapter(DataSource.ourInstance.getRecentStations());
        }

        stationRecycler.setAdapter(adapter);
        stationRecycler.setLayoutManager(layoutManager);

        return v;
    }
}
