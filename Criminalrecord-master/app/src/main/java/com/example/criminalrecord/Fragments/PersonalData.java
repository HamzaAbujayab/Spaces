package com.example.criminalrecord.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.criminalrecord.R;


public class PersonalData extends Fragment {

    TextView name_user_data_person , id_user_data_person , city_user_data_person;
    TextView date_Of_Birth_user ,number_home , name_mather;
    ImageView image_personal;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        View view = inflater.inflate(R.layout.fragment_personal_data , container , false);

        //Start Animation
        LottieAnimationView animationView = view.findViewById(R.id.anamtin_personal);
        animationView.setAnimation("idanima.json");
        //End Animation

        //Start find View By ID
        name_user_data_person = view.findViewById(R.id.name_user_data_person);
        id_user_data_person = view.findViewById(R.id.id_user_data_person);
        city_user_data_person = view.findViewById(R.id.city_user_data_person);
        date_Of_Birth_user = view.findViewById(R.id.date_Of_Birth_user);
        number_home = view.findViewById(R.id.number_home);
        name_mather = view.findViewById(R.id.name_mather);
        image_personal = view.findViewById(R.id.image_personal);
        //End find View By ID

        return view;
    }
}
