package com.example.criminalrecord.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.criminalrecord.Model.Wanted;
import com.example.criminalrecord.R;

import java.util.ArrayList;

public class WantedAdapter extends RecyclerView.Adapter<WantedAdapter.ViewHolder> {
    Context context ;
    ArrayList<Wanted> wantedArrayList;

    public WantedAdapter(Context context, ArrayList<Wanted> wantedArrayList) {
        this.context = context;
        this.wantedArrayList = wantedArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wanted_item, parent, false);
        return new WantedAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       Wanted item = wantedArrayList.get(position);
       holder.TV_name_police_station_wanted.setText(item.getName_police_station());
       holder.TV_date_for_wanted.setText(item.getDate_for_wanted());
       holder.TV_state_for_wanted.setText(item.getState_for_wanted());
    }

    @Override
    public int getItemCount() {
        return wantedArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView TV_name_police_station_wanted , TV_date_for_wanted , TV_state_for_wanted;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TV_name_police_station_wanted = itemView.findViewById(R.id.TV_name_police_station_wanted);
            TV_date_for_wanted = itemView.findViewById(R.id.TV_date_of_wanted);
            TV_state_for_wanted = itemView.findViewById(R.id.TV_state_for_wanted);

        }
    }
}
