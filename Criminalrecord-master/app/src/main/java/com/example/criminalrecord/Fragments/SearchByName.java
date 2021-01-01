package com.example.criminalrecord.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.airbnb.lottie.LottieAnimationView;
import com.example.criminalrecord.R;


public class SearchByName extends Fragment {

    EditText first_name , father_name , grandfather_name , last_name ;
    Button btn_search_by_name;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_search_by_name, container, false);

        //Start Code Animation
        LottieAnimationView animationView = view.findViewById(R.id.anamtin_name);
        animationView.setAnimation("nameanimation.json");
        //End Code Animation

        //Start find View By ID
        first_name = view.findViewById(R.id.first_name);
        father_name = view.findViewById(R.id.father_name);
        grandfather_name = view.findViewById(R.id.grandfather_name);
        last_name = view.findViewById(R.id.last_name);
        btn_search_by_name = view.findViewById(R.id.btn_search_by_name);
        //End find View By ID


        return view;
    }



}
