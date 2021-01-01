package com.example.criminalrecord.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.criminalrecord.Adapter.CriminalRecordAdapter;
import com.example.criminalrecord.Model.Criminal;
import com.example.criminalrecord.R;

import java.util.ArrayList;


public class CriminalRecord extends Fragment {

    RecyclerView RV_Criminal;
    ArrayList<Criminal> criminalArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_criminal_record, container, false);

        //Start find View By Id
        RV_Criminal = view.findViewById(R.id.RV_Criminal);
        //End find View By ID

        //Start Method
        read_API_Data();
        //End Method

        return view;
    }

    private void read_API_Data(){

        criminalArrayList = new ArrayList<>();
        criminalArrayList.add(new Criminal("11111/2020 ", "10/10/2020 ", "مركز شرطة الشيخ رضوان ", " 20/10/3000"));
        criminalArrayList.add(new Criminal("11111/2020 ", "10/10/2020 ", "الرمال ", " 20/10/3000"));
        criminalArrayList.add(new Criminal("11111/2020 ", "10/10/2020 ", "الرمال ", " 20/10/3000"));
        criminalArrayList.add(new Criminal("11111/2020 ", "10/10/2020 ", "الرمال ", " 20/10/3000"));
        criminalArrayList.add(new Criminal("11111/2020 ", "10/10/2020 ", "الرمال ", " 20/10/3000"));
        criminalArrayList.add(new Criminal("11111/2020 ", "10/10/2020 ", "الرمال ", " 20/10/3000"));
        criminalArrayList.add(new Criminal("11111/2020 ", "10/10/2020 ", "الرمال ", " 20/10/3000"));
        criminalArrayList.add(new Criminal("11111/2020 ", "10/10/2020 ", "الرمال ", " 20/10/3000"));
        criminalArrayList.add(new Criminal("11111/2020 ", "10/10/2020 ", "الرمال ", " 20/10/3000"));

        RV_Criminal.setHasFixedSize(true);
        RV_Criminal.setLayoutManager(new GridLayoutManager(getContext(), 1));
        CriminalRecordAdapter criminalRecordAdapter = new CriminalRecordAdapter(getContext() , criminalArrayList);
        RV_Criminal.setAdapter(criminalRecordAdapter);

    }

}
