package com.example.criminalrecord.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.criminalrecord.Fragments.CriminalRecord;
import com.example.criminalrecord.Model.Criminal;
import com.example.criminalrecord.R;

import java.util.ArrayList;

public class CriminalRecordAdapter extends RecyclerView.Adapter<CriminalRecordAdapter.ViewHolder> {

    Context context;
    ArrayList<Criminal> listCriminal;

    public CriminalRecordAdapter(Context context, ArrayList<Criminal> listCriminal) {
        this.context = context;
        this.listCriminal = listCriminal;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.criminal_record_item, parent, false);
        return new CriminalRecordAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Criminal criminal =  listCriminal.get(position);
        holder.dateClosed.setText(criminal.getDateClosed());
        holder.historyOfCase.setText(criminal.getHistoryOfCase());
        holder.namePoliceStation.setText(criminal.getNamePoliceStation());
        holder.numberOfInference.setText(criminal.getNumberOfInference());


    }

    @Override
    public int getItemCount() {
        return listCriminal.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView numberOfInference , namePoliceStation , historyOfCase , dateClosed;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            numberOfInference = itemView.findViewById(R.id.number_of_inference);
            namePoliceStation = itemView.findViewById(R.id.name_police_station);
            historyOfCase = itemView.findViewById(R.id.history_of_case);
            dateClosed = itemView.findViewById(R.id.date_closed);

        }
    }
}
