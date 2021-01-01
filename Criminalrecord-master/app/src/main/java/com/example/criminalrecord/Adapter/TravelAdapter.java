package com.example.criminalrecord.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.criminalrecord.Model.Travel;
import com.example.criminalrecord.R;

import java.util.ArrayList;

public class TravelAdapter extends RecyclerView.Adapter<TravelAdapter.ViewHolder> {
    Context context ;
    ArrayList<Travel> travelArrayList;

    public TravelAdapter(Context context, ArrayList<Travel> travelArrayList) {
        this.context = context;
        this.travelArrayList = travelArrayList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.travel_item, parent, false);
        return new TravelAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Travel travel = travelArrayList.get(position);
        holder.name_crossing.setText(travel.getNameCrossing());
        holder.date_of_visit.setText(travel.getDateOfVisit());
        holder.reason_for_visit.setText(travel.getReasonForVisit());
        holder.type_of_travel.setText(travel.getTypeOfTravel());
        if (travel.getTypeOfTravel().equals("وصول")){
            holder.type_of_travel.setBackgroundResource(R.drawable.access_to_crossing);
        }else if (travel.getTypeOfTravel().equals("سفر")){
            holder.type_of_travel.setBackgroundResource(R.drawable.leave_crossing);
        }
    }

    @Override
    public int getItemCount() {
        return travelArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView type_of_travel , name_crossing , reason_for_visit , date_of_visit ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            type_of_travel = itemView.findViewById(R.id.type_of_travel);
            name_crossing = itemView.findViewById(R.id.name_crossing);
            reason_for_visit = itemView.findViewById(R.id.reason_for_visit);
            date_of_visit = itemView.findViewById(R.id.date_of_visit);

        }
    }
}
