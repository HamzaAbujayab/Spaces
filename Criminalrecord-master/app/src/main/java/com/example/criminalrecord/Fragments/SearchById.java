package com.example.criminalrecord.Fragments;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.criminalrecord.R;
import com.example.criminalrecord.Ui.Home;

import java.util.Arrays;


public class SearchById extends Fragment {
    Button btn_search_by_id;
    EditText ID_number;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search_by_id, container, false);

        //Start Animation
        LottieAnimationView animationView = view.findViewById(R.id.anamtin);
        animationView.setAnimation("idanima.json");
        //End Animation
        //Start find View By ID
        btn_search_by_id = view.findViewById(R.id.btn_search_by_id);
        ID_number = view.findViewById(R.id.ID_number);
        //End find View By ID

        //Start Method
        getDataAndCheckID();
        //End Method

        return view;
    }

    private void getDataAndCheckID(){

        btn_search_by_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ID_number.getText().toString().trim().isEmpty()){
                    Toast.makeText(getContext() , "الرجاء أدخال رقم الهويه" , Toast.LENGTH_SHORT).show();
                }else {
                    //search ID in API here

                    startActivity(new Intent(getContext() , Home.class));
                }

            }
        });


    }
}
