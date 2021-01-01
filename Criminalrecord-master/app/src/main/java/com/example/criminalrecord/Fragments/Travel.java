package com.example.criminalrecord.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.criminalrecord.Adapter.TravelAdapter;
import com.example.criminalrecord.R;

import java.util.ArrayList;


public class Travel extends Fragment {
    RecyclerView RV_travel;
    ArrayList<com.example.criminalrecord.Model.Travel> travelArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_travel , container , false);

        //Statr find View By ID
        RV_travel = view.findViewById(R.id.RV_travel);
        //End find View by ID

        //Start Method
        read_API_Data();
        //End method

        return view;
    }

    private void read_API_Data(){
        travelArrayList = new ArrayList<>();
        travelArrayList.add(new com.example.criminalrecord.Model.Travel( "معبر رفح",  "وصول",  "10-10-2019",  "زيارة اهل و اصدقاء"));
        travelArrayList.add(new com.example.criminalrecord.Model.Travel( "معبر ايرز",  "سفر",  "10-10-2019",  "زيارة اهل و اصدقاء"));
        travelArrayList.add(new com.example.criminalrecord.Model.Travel( "معبر رفح",  "وصول",  "10-10-2019",  "زيارة اهل و اصدقاء"));
        travelArrayList.add(new com.example.criminalrecord.Model.Travel( "معبر رفح",  "وصول",  "10-10-2019",  "زيارة اهل و اصدقاء"));
        travelArrayList.add(new com.example.criminalrecord.Model.Travel( "معبر رفح",  "سفر",  "10-10-2019",  "زيارة اهل و اصدقاء"));
        travelArrayList.add(new com.example.criminalrecord.Model.Travel( "معبر ايرز",  "سفر",  "10-10-2019",  "زيارة اهل و اصدقاء"));
        travelArrayList.add(new com.example.criminalrecord.Model.Travel( "معبر ايرز",  "وصول",  "10-10-2019",  "زيارة اهل و اصدقاء"));
        RV_travel.setHasFixedSize(true);
        RV_travel.setLayoutManager(new GridLayoutManager(getContext(), 1));
        TravelAdapter travelAdapter = new TravelAdapter(getContext(), travelArrayList);

        RV_travel.setAdapter(travelAdapter);

    }
}
