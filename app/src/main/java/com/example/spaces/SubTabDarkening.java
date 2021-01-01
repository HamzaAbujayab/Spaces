package com.example.spaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubTabDarkening  extends Fragment {
    EditText number_of_features_SubTabDarkening;
    EditText space_between_two_parameters_SubTabDarkening;
    Button button_SubTabDarkening;
    TextView output_SubTabDarkening;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_sub_tab_darkening, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        number_of_features_SubTabDarkening = getActivity().findViewById(R.id.number_of_features_SubTabDarkening);
        space_between_two_parameters_SubTabDarkening = getActivity().findViewById(R.id.space_between_two_parameters_SubTabDarkening);
        button_SubTabDarkening = getActivity().findViewById(R.id.button_SubTabDarkening);
        output_SubTabDarkening = getActivity().findViewById(R.id.output_SubTabDarkening);

        button_SubTabDarkening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!number_of_features_SubTabDarkening.getText().toString().equals("") && !space_between_two_parameters_SubTabDarkening.getText().toString().equals("")) {
                    double number_of_features = Double.parseDouble(number_of_features_SubTabDarkening.getText().toString());
                    double space_between_two_parameters = Double.parseDouble(space_between_two_parameters_SubTabDarkening.getText().toString());

                    double output = (number_of_features-1)*space_between_two_parameters;
                    String stringOutput = output+"";
                    Float floatOutput = Float.parseFloat(stringOutput);
                    output_SubTabDarkening.setText(floatOutput+"");
                }
            }
        });
    }
}