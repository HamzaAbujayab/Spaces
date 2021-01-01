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

public class SubTabSoundAndLight extends Fragment {
	EditText calculated_time_SubTabSoundAndLight;
	Button button_SubTabSoundAndLight;
	TextView output_SubTabSoundAndLight;
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.activity_sub_tab_sound_and_light, container, false);
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		calculated_time_SubTabSoundAndLight = getActivity().findViewById(R.id.calculated_time_SubTabSoundAndLight);
		button_SubTabSoundAndLight = getActivity().findViewById(R.id.button_SubTabSoundAndLight);
		output_SubTabSoundAndLight = getActivity().findViewById(R.id.output_SubTabSoundAndLight);

		button_SubTabSoundAndLight.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (!calculated_time_SubTabSoundAndLight.getText().toString().equals("")){
					double calculated_time = Double.parseDouble(calculated_time_SubTabSoundAndLight.getText().toString());

					double output = calculated_time * 340;
					String stringOutput = output+"";
					Float floatOutput = Float.parseFloat(stringOutput);
					output_SubTabSoundAndLight.setText(floatOutput + "");
				}
			}
		});
	}
}