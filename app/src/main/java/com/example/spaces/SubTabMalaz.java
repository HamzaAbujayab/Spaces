package com.example.spaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SubTabMalaz extends Fragment implements AdapterView.OnItemSelectedListener {
    Spinner spinner_SubTabMalaz;
    EditText target_width_in_meters_SubTabMalaz;
    EditText target_angle_in_milling_SubTabMalaz;
    Button button_SubTabMalaz;
    TextView output_SubTabMalaz;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_sub_tab_malaz, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        spinner_SubTabMalaz = getActivity().findViewById(R.id.spinner_SubTabMalaz);
        target_width_in_meters_SubTabMalaz = getActivity().findViewById(R.id.target_width_in_meters_SubTabMalaz);
        target_angle_in_milling_SubTabMalaz = getActivity().findViewById(R.id.target_angle_in_milling_SubTabMalaz);
        button_SubTabMalaz = getActivity().findViewById(R.id.button_SubTabMalaz);
        output_SubTabMalaz = getActivity().findViewById(R.id.output_SubTabMalaz);

        spinner_SubTabMalaz.setOnItemSelectedListener(this);

        String[] arrayMalaz = getResources().getStringArray(R.array.malaz);
        ArrayAdapter adapter = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arrayMalaz);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_SubTabMalaz.setAdapter(adapter);

        button_SubTabMalaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!target_width_in_meters_SubTabMalaz.getText().toString().equals("") && !target_angle_in_milling_SubTabMalaz.getText().toString().equals("")) {
                    double target_width_in_meters = Double.parseDouble(target_width_in_meters_SubTabMalaz.getText().toString());
                    double target_angle_in_milling = Double.parseDouble(target_angle_in_milling_SubTabMalaz.getText().toString());

                    double output = target_width_in_meters/target_angle_in_milling;
                    String stringOutput = output+"";
                    Float floatOutput = Float.parseFloat(stringOutput);
                    output_SubTabMalaz.setText(floatOutput+"");
                }
            }
        });


    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.spinner_SubTabMalaz) {
            if (position == 0){
                target_width_in_meters_SubTabMalaz.setEnabled(false);
                target_width_in_meters_SubTabMalaz.setText("150");
            }

            if (position == 1){
                target_width_in_meters_SubTabMalaz.setEnabled(false);
                target_width_in_meters_SubTabMalaz.setText("20");
            }

            if (position == 2){
                target_width_in_meters_SubTabMalaz.setEnabled(false);
                target_width_in_meters_SubTabMalaz.setText("30");
            }

            if (position == 3){
                target_width_in_meters_SubTabMalaz.setEnabled(false);
                target_width_in_meters_SubTabMalaz.setText("30");
            }

            if (position == 4){
                target_width_in_meters_SubTabMalaz.setEnabled(false);
                target_width_in_meters_SubTabMalaz.setText("30");
            }

            if (position == 5){
                target_width_in_meters_SubTabMalaz.setEnabled(false);
                target_width_in_meters_SubTabMalaz.setText("40");
            }

            if (position == 6){
                target_width_in_meters_SubTabMalaz.setEnabled(true);
                target_width_in_meters_SubTabMalaz.setText("");
            }
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}