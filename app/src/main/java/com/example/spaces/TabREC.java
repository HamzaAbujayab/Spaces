package com.example.spaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TabREC extends Fragment {
    EditText corner_TabREC;
    EditText distance_TabREC;
    EditText north_of_shop_TabREC;
    EditText oriental_shop_TabREC;
    Button button_TabREC;
    TextView output_north_of_target_TabREC;
    TextView output_oriental_target_TabREC;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_tab_rec, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        corner_TabREC = getActivity().findViewById(R.id.corner_TabREC);
        distance_TabREC = getActivity().findViewById(R.id.distance_TabREC);
        north_of_shop_TabREC = getActivity().findViewById(R.id.north_of_shop_TabREC);
        oriental_shop_TabREC = getActivity().findViewById(R.id.oriental_shop_TabREC);
        button_TabREC = getActivity().findViewById(R.id.button_TabREC);
        output_north_of_target_TabREC = getActivity().findViewById(R.id.output_north_of_target_TabREC);
        output_oriental_target_TabREC = getActivity().findViewById(R.id.output_oriental_target_TabREC);

        button_TabREC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!corner_TabREC.getText().toString().equals("") && !distance_TabREC.getText().toString().equals("") && !north_of_shop_TabREC.getText().toString().equals("") &&!oriental_shop_TabREC.getText().toString().equals("")){
                    double corner = Double.parseDouble(corner_TabREC.getText().toString());
                    double distance = Double.parseDouble(distance_TabREC.getText().toString());
                    double north_of_shop = Double.parseDouble(north_of_shop_TabREC.getText().toString());
                    double oriental_shop = Double.parseDouble(oriental_shop_TabREC.getText().toString());

                    double outputnorth = distance*Math.cos(corner/57.29578)+north_of_shop;
                    String stringOutputnorth = outputnorth+"";
                    Float intOutputnorth = Float.parseFloat(stringOutputnorth);
                    output_north_of_target_TabREC.setText(intOutputnorth+"");

                    double outputoriental = distance*Math.sin(corner/57.29578)+oriental_shop;
                    String stringOriental_target = outputoriental+"";
                    Float intOutputoriental = Float.parseFloat(stringOriental_target);
                    output_oriental_target_TabREC.setText(intOutputoriental+"");
                }
            }
        });
    }
}
