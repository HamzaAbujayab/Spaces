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

public class SubTabThumb extends Fragment {
    EditText thumb_offset_SubTabThumb;
    Button button_SubTabThumb;
    TextView output_SubTabThumb;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_sub_tab_thumb, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        thumb_offset_SubTabThumb = getActivity().findViewById(R.id.thumb_offset_SubTabThumb);
        button_SubTabThumb = getActivity().findViewById(R.id.button_SubTabThumb);
        output_SubTabThumb = getActivity().findViewById(R.id.output_SubTabThumb);

        button_SubTabThumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!thumb_offset_SubTabThumb.getText().toString().equals("")){
                    double thumb_offset = Double.parseDouble(thumb_offset_SubTabThumb.getText().toString());

                    double output = thumb_offset*10;
                    String stringOutput = output+"";
                    Float floatOutput = Float.parseFloat(stringOutput);
                    output_SubTabThumb.setText(floatOutput + "");
                }
            }
        });
    }
}