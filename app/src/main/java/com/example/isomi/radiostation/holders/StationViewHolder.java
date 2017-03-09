package com.example.isomi.radiostation.holders;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.isomi.radiostation.R;
import com.example.isomi.radiostation.models.Station;

/**
 * Created by Isomi on 3/9/17.
 */

public class StationViewHolder extends RecyclerView.ViewHolder {

    ImageView stationImage;
    TextView stationTitle;
    Context context;

    public StationViewHolder(View itemView) {
        super(itemView);

        stationImage = (ImageView)itemView.findViewById(R.id.station_image);
        stationTitle = (TextView)itemView.findViewById(R.id.station_title);
        context = itemView.getContext();
    }

    public void updateUI(Station station) {
        stationImage.setImageDrawable(ContextCompat.getDrawable(context, station.getImageResourceId()));
        stationTitle.setText(station.getStationTitle());
    }
}
