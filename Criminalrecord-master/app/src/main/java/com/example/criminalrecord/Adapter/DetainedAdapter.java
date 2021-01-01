package com.example.criminalrecord.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.criminalrecord.Model.Detained;
import com.example.criminalrecord.R;

import java.util.ArrayList;

public class DetainedAdapter extends RecyclerView.Adapter<DetainedAdapter.ViewHolder> {
        Context context;
        ArrayList<Detained> detaineds;

    public DetainedAdapter(Context context, ArrayList<Detained> detaineds) {
        this.context = context;
        this.detaineds = detaineds;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detained_item, parent, false);
        return new DetainedAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Detained detained = detaineds.get(position);
        holder.TV_name_police_station_detained.setText(detained.getNamePoliceStation());
        holder.TV_start_of_arrest.setText(detained.getStartOfArrest());
        holder.TV_engorge_of_detained.setText(detained.getEngorge());
    }

    @Override
    public int getItemCount() {
        return detaineds.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView TV_name_police_station_detained , TV_start_of_arrest , TV_engorge_of_detained;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            TV_name_police_station_detained =  itemView.findViewById(R.id.TV_name_police_station_detained);
            TV_start_of_arrest =  itemView.findViewById(R.id.TV_start_of_arrest);
            TV_engorge_of_detained =  itemView.findViewById(R.id.TV_engorge_of_detained);

        }
    }
}
