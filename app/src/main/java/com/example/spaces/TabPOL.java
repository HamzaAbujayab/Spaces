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
import android.widget.Toast;

public class TabPOL extends Fragment {
    EditText north_of_target_TabPOL;
    EditText oriental_target_TabPOL;
    EditText north_of_shop_TabPOL;
    EditText oriental_shop_TabPOL;
    Button button_TabPOL;
    TextView output_distance_TabPOL;
    TextView output_corner_TabPOL;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_tab_pol, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        north_of_target_TabPOL = getActivity().findViewById(R.id.north_of_target_TabPOL);
        oriental_target_TabPOL = getActivity().findViewById(R.id.oriental_target_TabPOL);
        north_of_shop_TabPOL = getActivity().findViewById(R.id.north_of_shop_TabPOL);
        oriental_shop_TabPOL = getActivity().findViewById(R.id.oriental_shop_TabPOL);
        button_TabPOL = getActivity().findViewById(R.id.button_TabPOL);
        output_distance_TabPOL = getActivity().findViewById(R.id.output_distance_TabPOL);
        output_corner_TabPOL = getActivity().findViewById(R.id.output_corner_TabPOL);

        button_TabPOL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!north_of_target_TabPOL.getText().toString().equals("") && !oriental_target_TabPOL.getText().toString().equals("") && !north_of_shop_TabPOL.getText().toString().equals("") &&!oriental_shop_TabPOL.getText().toString().equals("")){
                    double north_of_target = Double.parseDouble(north_of_target_TabPOL.getText().toString());
                    double oriental_target = Double.parseDouble(oriental_target_TabPOL.getText().toString());
                    double north_of_shop = Double.parseDouble(north_of_shop_TabPOL.getText().toString());
                    double oriental_shop = Double.parseDouble(oriental_shop_TabPOL.getText().toString());

                    double outputDistance = Math.sqrt(Math.pow((north_of_target-north_of_shop),2)+Math.pow((oriental_target-oriental_shop),2));
                    String stringOutputDistance = outputDistance+"";
                    Float floatOutputDistance = Float.parseFloat(stringOutputDistance);
                    output_distance_TabPOL.setText(floatOutputDistance+"");

                    double x = north_of_target-north_of_shop;
                    double y = oriental_target-oriental_shop;
                    double outputCorner = Math.atan2(y, x)*57.29578;
                    String stringOutputCorner = outputCorner+"";
                    Float floatOutputCorner = Float.parseFloat(stringOutputCorner);
                    output_corner_TabPOL.setText(floatOutputCorner+"");
                }
            }
        });
    }
}
