package com.example.spaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CorrectingMistake extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Toolbar toolbar;
    EditText error_correcting_mistake;
    EditText distance_correcting_mistake;
    Spinner spinner_direction_correcting_mistake;
    Button button_correcting_mistake;
    TextView output_displacement_correcting_mistake;
    TextView output_pheasant_correcting_mistake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcting_mistake);

        toolbar = findViewById(R.id.toolbar_CorrectingMistake);
        setSupportActionBar(toolbar);
        setTitle("تصحيح الخطأ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        error_correcting_mistake = findViewById(R.id.error_correcting_mistake);
        distance_correcting_mistake = findViewById(R.id.distance_correcting_mistake);
        spinner_direction_correcting_mistake = findViewById(R.id.spinner_direction_correcting_mistake);
        button_correcting_mistake = findViewById(R.id.button_correcting_mistake);
        output_displacement_correcting_mistake = findViewById(R.id.output_displacement_correcting_mistake);
        output_pheasant_correcting_mistake = findViewById(R.id.output_pheasant_correcting_mistake);

        spinner_direction_correcting_mistake.setOnItemSelectedListener(this);

        String[] arrayCorrectingMistake = getResources().getStringArray(R.array.correcting_mistake);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayCorrectingMistake);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_direction_correcting_mistake.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.spinner_direction_correcting_mistake) {
            if (position == 0){
                button_correcting_mistake.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!error_correcting_mistake.getText().toString().equals("")) {
                            double error = Double.parseDouble(error_correcting_mistake.getText().toString());
                            double distance = Double.parseDouble(distance_correcting_mistake.getText().toString());
                            double output = error / distance;
                            String stringOutput = output+"";
                            Float floatOutput = Float.parseFloat(stringOutput);
                            output_displacement_correcting_mistake.setText(floatOutput + "");
                            output_pheasant_correcting_mistake.setText("الأسود");
                        }
                    }
                });
            }
            if (position == 1){
                button_correcting_mistake.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!error_correcting_mistake.getText().toString().equals("")) {
                            double error = Double.parseDouble(error_correcting_mistake.getText().toString());
                            double distance = Double.parseDouble(distance_correcting_mistake.getText().toString());
                            double output = error / distance;
                            String stringOutput = output+"";
                            Float floatOutput = Float.parseFloat(stringOutput);
                            output_displacement_correcting_mistake.setText(floatOutput + "");
                            output_pheasant_correcting_mistake.setText("الأبيض");
                        }
                    }
                });
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
