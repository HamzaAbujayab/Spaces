package com.example.criminalrecord.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.criminalrecord.Adapter.FamilyRelationAdapter;
import com.example.criminalrecord.Model.FamilyRelation;
import com.example.criminalrecord.R;

import java.util.ArrayList;


public class FamilyRelations extends Fragment {
    RecyclerView RV_FamilyRelations ;
    ArrayList<FamilyRelation> familyRelationArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_family_relations , container , false);

        //Start find View By ID
        RV_FamilyRelations = view.findViewById(R.id.RV_FamilyRelations);
        //End find View By ID

        //Strat Method
        raed_API_Data();
        //End Method

        return view;

    }

    private void raed_API_Data(){

        familyRelationArrayList = new ArrayList<>();
        familyRelationArrayList.add(new FamilyRelation( "اسماعيل محمد الخليلي",  "أب",  "98153576",  "28-10-1999",  "image"));
        familyRelationArrayList.add(new FamilyRelation( "اسماعيل محمد الخليلي",  "أب",  "98153576",  "28-10-1999",  "image"));
        familyRelationArrayList.add(new FamilyRelation( "اسماعيل محمد الخليلي",  "أب",  "98153576",  "28-10-1999",  "image"));
        familyRelationArrayList.add(new FamilyRelation( "اسماعيل محمد الخليلي",  "أب",  "98153576",  "28-10-1999",  "image"));
        familyRelationArrayList.add(new FamilyRelation( "اسماعيل محمد الخليلي",  "أب",  "98153576",  "28-10-1999",  "image"));
        familyRelationArrayList.add(new FamilyRelation( "اسماعيل محمد الخليلي",  "أب",  "98153576",  "28-10-1999",  "image"));
        familyRelationArrayList.add(new FamilyRelation( "اسماعيل محمد الخليلي",  "أب",  "98153576",  "28-10-1999",  "image"));
        RV_FamilyRelations.setHasFixedSize(true);
        RV_FamilyRelations.setLayoutManager(new GridLayoutManager(getContext(), 1));
        FamilyRelationAdapter familyRelationAdapter = new FamilyRelationAdapter(getContext() , familyRelationArrayList);
        RV_FamilyRelations.setAdapter(familyRelationAdapter);

    }
}
