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

public class SubTabRuler extends Fragment {
    EditText mujahids_arm_length_SubTabRuler;
    EditText length_of_target_on_ruler_SubTabRuler;
    EditText true_target_length_SubTabRuler;
    Button button_SubTabRuler;
    TextView output_SubTabRuler;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_sub_tab_ruler, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mujahids_arm_length_SubTabRuler = getActivity().findViewById(R.id.mujahids_arm_length_SubTabRuler);
        length_of_target_on_ruler_SubTabRuler = getActivity().findViewById(R.id.length_of_target_on_ruler_SubTabRuler);
        true_target_length_SubTabRuler = getActivity().findViewById(R.id.true_target_length_SubTabRuler);
        button_SubTabRuler = getActivity().findViewById(R.id.button_SubTabRuler);
        output_SubTabRuler = getActivity().findViewById(R.id.output_SubTabRuler);

        button_SubTabRuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mujahids_arm_length_SubTabRuler.getText().toString().equals("") && !length_of_target_on_ruler_SubTabRuler.getText().toString().equals("") && !true_target_length_SubTabRuler.getText().toString().equals("")) {
                    double mujahids_arm_length = Double.parseDouble(mujahids_arm_length_SubTabRuler.getText().toString());
                    double length_of_target_on_ruler = Double.parseDouble(length_of_target_on_ruler_SubTabRuler.getText().toString());
                    double true_target_length = Double.parseDouble(true_target_length_SubTabRuler.getText().toString());

                    double output = ((mujahids_arm_length/100)*true_target_length)/(length_of_target_on_ruler/100);
                    String stringOutput = output+"";
                    Float floatOutput = Float.parseFloat(stringOutput);
                    output_SubTabRuler.setText(floatOutput+"");
                }
            }
        });
    }
}
