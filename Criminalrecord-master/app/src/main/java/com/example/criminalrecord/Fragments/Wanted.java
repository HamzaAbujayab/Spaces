package com.example.criminalrecord.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.criminalrecord.Adapter.CriminalRecordAdapter;
import com.example.criminalrecord.Adapter.WantedAdapter;
import com.example.criminalrecord.R;

import java.util.ArrayList;


public class Wanted extends Fragment {
    RecyclerView RV_wanted;
    ArrayList<com.example.criminalrecord.Model.Wanted> wantedArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wanted , container , false);
        //Start Find View By ID
        RV_wanted =  view.findViewById(R.id.RV_wanted);
        //End find View By ID

        //Start method
        read_API_Data();
        //End method

        return view;
    }

    private void read_API_Data(){
        wantedArrayList = new ArrayList<>();
        wantedArrayList.add(new com.example.criminalrecord.Model.Wanted("الزيتون","10-20-1999" ,"مطلوب للمحكمخ"));
        wantedArrayList.add(new com.example.criminalrecord.Model.Wanted("الزيتون","10-20-1999" ,"مطلوب للمحكمخ"));
        wantedArrayList.add(new com.example.criminalrecord.Model.Wanted("الزيتون","10-20-1999" ,"مطلوب للمحكمخ"));
        wantedArrayList.add(new com.example.criminalrecord.Model.Wanted("الزيتون","10-20-1999" ,"مطلوب للمحكمخ"));
        wantedArrayList.add(new com.example.criminalrecord.Model.Wanted("الزيتون","10-20-1999" ,"مطلوب للمحكمخ"));
        wantedArrayList.add(new com.example.criminalrecord.Model.Wanted("الزيتون","10-20-1999" ,"مطلوب للمحكمخ"));
        wantedArrayList.add(new com.example.criminalrecord.Model.Wanted("الزيتون","10-20-1999" ,"مطلوب للمحكمخ"));
        wantedArrayList.add(new com.example.criminalrecord.Model.Wanted("الزيتون","10-20-1999" ,"مطلوب للمحكمخ"));
        wantedArrayList.add(new com.example.criminalrecord.Model.Wanted("الزيتون","10-20-1999" ,"مطلوب للمحكمخ"));
        RV_wanted.setHasFixedSize(true);
        RV_wanted.setLayoutManager(new GridLayoutManager(getContext(), 1));
        WantedAdapter wantedAdapter = new WantedAdapter(getContext() , wantedArrayList);
        RV_wanted.setAdapter(wantedAdapter);

    }
}
