package com.example.criminalrecord.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airbnb.lottie.LottieAnimationView;
import com.example.criminalrecord.R;


public class SearchByQr extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_search_by_qr, container, false);

        //Start Animation
        LottieAnimationView animationView = view.findViewById(R.id.anamtin_qr);
        animationView.setAnimation("qr.json");
        //End Animation

        return view;




    }
}
