package com.example.spaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Conversions extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Toolbar toolbar;
    EditText input_conversions;
    Spinner spinner_conversions;
    Button button_conversions;
    TextView output_conversions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversions);

        toolbar = findViewById(R.id.toolbar_Conversions);
        setSupportActionBar(toolbar);
        setTitle("التحويلات");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        input_conversions = findViewById(R.id.input_conversions);
        spinner_conversions = findViewById(R.id.spinner_conversions);
        button_conversions = findViewById(R.id.button_conversions);
        output_conversions = findViewById(R.id.output_conversions);

        spinner_conversions.setOnItemSelectedListener(this);

        String[] arrayConversions = getResources().getStringArray(R.array.conversions);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayConversions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_conversions.setAdapter(adapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (parent.getId() == R.id.spinner_conversions) {
            //String valueFromSpinner = parent.getItemAtPosition(position).toString();
            //button_conversions.setText("تحويل "+valueFromSpinner);
            if (position == 0){
                button_conversions.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!input_conversions.getText().toString().equals("")) {
                            double input = Double.parseDouble(input_conversions.getText().toString());
                            double output = input * 17.7778;
                            String stringOutput = output+"";
                            Float floatOutput = Float.parseFloat(stringOutput);
                            output_conversions.setText(floatOutput+"");
                        }
                    }
                });
            }

            if (position == 1){
                button_conversions.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!input_conversions.getText().toString().equals("")) {
                            double input = Double.parseDouble(input_conversions.getText().toString());
                            double output = input * 16.6667;
                            String stringOutput = output+"";
                            Float floatOutput = Float.parseFloat(stringOutput);
                            output_conversions.setText(floatOutput+"");

                        }
                    }
                });
            }

            if (position == 2){
                button_conversions.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!input_conversions.getText().toString().equals("")) {
                            double input = Double.parseDouble(input_conversions.getText().toString());
                            double output = input * 15/16;
                            String stringOutput = output+"";
                            Float floatOutput = Float.parseFloat(stringOutput);
                            output_conversions.setText(floatOutput+"");
                        }
                    }
                });
            }

            if (position == 3){
                button_conversions.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!input_conversions.getText().toString().equals("")) {
                            double input = Double.parseDouble(input_conversions.getText().toString());
                            double output = input * 16/15;
                            String stringOutput = output+"";
                            Float floatOutput = Float.parseFloat(stringOutput);
                            output_conversions.setText(floatOutput+"");
                        }
                    }
                });
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
