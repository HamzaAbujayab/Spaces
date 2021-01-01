package com.example.criminalrecord.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.criminalrecord.Adapter.DetainedAdapter;
import com.example.criminalrecord.Adapter.FamilyRelationAdapter;
import com.example.criminalrecord.R;

import java.util.ArrayList;


public class Detained extends Fragment {
    RecyclerView RV_detained;
    ArrayList<com.example.criminalrecord.Model.Detained> detainedArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detained , container , false);

        //Start find View By ID
        RV_detained = view.findViewById(R.id.RV_detained);
        //End find View By ID

        //Start Method
        read_API_Data();
        //End Method

        return view;
    }

    private void read_API_Data(){
        detainedArrayList = new ArrayList<>();
        detainedArrayList.add(new com.example.criminalrecord.Model.Detained("الزيتون","10-80-1999","10-10-1900","التهمه"));
        detainedArrayList.add(new com.example.criminalrecord.Model.Detained("الزيتون","10-80-1999","10-10-1900","التهمه"));
        detainedArrayList.add(new com.example.criminalrecord.Model.Detained("الزيتون","10-80-1999","10-10-1900","التهمه"));
        detainedArrayList.add(new com.example.criminalrecord.Model.Detained("الزيتون","10-80-1999","10-10-1900","التهمه"));
        detainedArrayList.add(new com.example.criminalrecord.Model.Detained("الزيتون","10-80-1999","10-10-1900","التهمه"));
        detainedArrayList.add(new com.example.criminalrecord.Model.Detained("الزيتون","10-80-1999","10-10-1900","التهمه"));
        detainedArrayList.add(new com.example.criminalrecord.Model.Detained("الزيتون","10-80-1999","10-10-1900","التهمه"));
        detainedArrayList.add(new com.example.criminalrecord.Model.Detained("الزيتون","10-80-1999","10-10-1900","التهمه"));

        RV_detained.setHasFixedSize(true);
        RV_detained.setLayoutManager(new GridLayoutManager(getContext(), 1));
        DetainedAdapter detainedAdapter = new DetainedAdapter(getContext() , detainedArrayList);
        RV_detained.setAdapter(detainedAdapter);
    }
}
