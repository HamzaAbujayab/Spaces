package com.example.spaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Electricity extends AppCompatActivity {
    Toolbar toolbar;
    EditText load_resistance_electricity;
    EditText battery_voltage_electricity;
    EditText required_current_electricity;
    Button button_electricity;
    TextView output_current_electricity;
    TextView output_resulting_electricity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);

        toolbar = findViewById(R.id.toolbar_Electricity);
        setSupportActionBar(toolbar);
        setTitle("كهرباء");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        load_resistance_electricity = findViewById(R.id.load_resistance_electricity);
        battery_voltage_electricity = findViewById(R.id.battery_voltage_electricity);
        required_current_electricity = findViewById(R.id.required_current_electricity);
        button_electricity = findViewById(R.id.button_electricity);
        output_current_electricity = findViewById(R.id.output_current_electricity);
        output_resulting_electricity = findViewById(R.id.output_resulting_electricity);

        button_electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!load_resistance_electricity.getText().toString().equals("") && !battery_voltage_electricity.getText().toString().equals("") && !required_current_electricity.getText().toString().equals("")){
                    double load_resistance = Double.parseDouble(load_resistance_electricity.getText().toString());
                    double battery_voltage = Double.parseDouble(battery_voltage_electricity.getText().toString());
                    double required_current = Double.parseDouble(required_current_electricity.getText().toString());

                    double output = battery_voltage/load_resistance;
                    String stringOutput = output+"";
                    Float floatOutput = Float.parseFloat(stringOutput);
                    output_current_electricity.setText(floatOutput+"");

                    if (output >= required_current){
                        output_resulting_electricity.setText("يصلح");
                    }else {
                        output_resulting_electricity.setText("لا يصلح");
                    }
                }
            }
        });
    }
}
