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

public class SubTabDistanceRating extends Fragment {
    EditText smallest_specified_distance_SubTabDistanceRating;
    EditText number_of_halves_SubTabDistanceRating;
    Button button_SubTabDistanceRating;
    TextView output_SubTabDistanceRating;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_sub_tab_distance_rating, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        smallest_specified_distance_SubTabDistanceRating = getActivity().findViewById(R.id.smallest_specified_distance_SubTabDistanceRating);
        number_of_halves_SubTabDistanceRating = getActivity().findViewById(R.id.number_of_halves_SubTabDistanceRating);
        button_SubTabDistanceRating = (Button) getActivity().findViewById(R.id.button_SubTabDistanceRating);
        output_SubTabDistanceRating = getActivity().findViewById(R.id.output_SubTabDistanceRating);

        button_SubTabDistanceRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!smallest_specified_distance_SubTabDistanceRating.getText().toString().equals("") && !number_of_halves_SubTabDistanceRating.getText().toString().equals("")) {
                    double smallest_specified_distance = Double.parseDouble(smallest_specified_distance_SubTabDistanceRating.getText().toString());
                    double number_of_halves = Double.parseDouble(number_of_halves_SubTabDistanceRating.getText().toString());

                    double output = smallest_specified_distance*(Math.pow(2,number_of_halves));
                    String stringOutput = output+"";
                    Float floatOutput = Float.parseFloat(stringOutput);
                    output_SubTabDistanceRating.setText(floatOutput+"");
                }
            }
        });

    }
}
