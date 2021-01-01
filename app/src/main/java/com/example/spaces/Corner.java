package com.example.spaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Corner extends AppCompatActivity {
    Toolbar toolbar;
    EditText distance_required_corner;
    EditText tribal_distance_corner;
    EditText tribal_corner_corner;
    EditText dimensional_distance_corner;
    EditText dimensional_corner_corner;
    Button button_corner;
    TextView output_corner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corner);

        toolbar = findViewById(R.id.toolbar_Corner);
        setSupportActionBar(toolbar);
        setTitle("قياس الزاوية");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        distance_required_corner = findViewById(R.id.distance_required_corner);
        tribal_distance_corner = findViewById(R.id.tribal_distance_corner);
        tribal_corner_corner = findViewById(R.id.tribal_corner_corner);
        dimensional_distance_corner = findViewById(R.id.dimensional_distance_corner);
        dimensional_corner_corner = findViewById(R.id.dimensional_corner_corner);
        button_corner = findViewById(R.id.button_corner);
        output_corner = findViewById(R.id.output_corner);

        button_corner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!distance_required_corner.getText().toString().equals("") && !tribal_distance_corner.getText().toString().equals("") && !tribal_corner_corner.getText().toString().equals("") && !dimensional_distance_corner.getText().toString().equals("") && !dimensional_corner_corner.getText().toString().equals("")) {
                    double input_distance_required_corner = Double.parseDouble(distance_required_corner.getText().toString());
                    double input_tribal_distance_corner = Double.parseDouble(tribal_distance_corner.getText().toString());
                    double input_tribal_corner_corner = Double.parseDouble(tribal_corner_corner.getText().toString());
                    double input_dimensional_distance_corner = Double.parseDouble(dimensional_distance_corner.getText().toString());
                    double input_dimensional_corner_corner = Double.parseDouble(dimensional_corner_corner.getText().toString());

                    double abs1 = Math.abs(input_tribal_corner_corner - input_dimensional_corner_corner);
                    double ads2 = Math.abs(input_tribal_distance_corner - input_dimensional_distance_corner);

                    double output = input_tribal_corner_corner - (((input_distance_required_corner - input_tribal_distance_corner) * abs1) / ads2);
                    String stringOutput = output+"";
                    Float floatOutput = Float.parseFloat(stringOutput);
                    output_corner.setText(floatOutput + "");
                }
            }
        });
    }
}
