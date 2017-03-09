package com.example.isomi.radiostation.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.isomi.radiostation.R;
import com.example.isomi.radiostation.holders.StationViewHolder;
import com.example.isomi.radiostation.models.Station;

import java.util.ArrayList;

/**
 * Created by Isomi on 3/9/17.
 */

public class StationAdapter extends RecyclerView.Adapter<StationViewHolder> {

    ArrayList<Station> stations;

    public StationAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {
        Station station = stations.get(position);
        holder.updateUI(station);
    }

    @Override
    public int getItemCount() {
        return stations.size();
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(v);
    }
}
