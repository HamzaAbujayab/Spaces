package com.example.spaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    Button btn_conversions, btn_corner, btn_correct_in_error, btn_estimate_distance, btn_POL_and_REC, btn_dimensions_crater, btn_electricity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar_MainActivity);
        setSupportActionBar(toolbar);
        setTitle("الشاشة الرئيسية");

        btn_conversions = findViewById(R.id.btn_conversions);
        btn_corner = findViewById(R.id.btn_corner);
        btn_correct_in_error = findViewById(R.id.btn_correct_in_error);
        btn_estimate_distance = findViewById(R.id.btn_estimate_distance);
        btn_POL_and_REC = findViewById(R.id.btn_POL_and_REC);
        btn_dimensions_crater = findViewById(R.id.btn_dimensions_crater);
        btn_electricity = findViewById(R.id.btn_electricity);

        btn_conversions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Conversions.class));
            }
        });

        btn_corner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Corner.class));
            }
        });

        btn_correct_in_error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CorrectingMistake.class));
            }
        });

        btn_estimate_distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), EstimatingDistances.class));
            }
        });

        btn_POL_and_REC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PolAndRec.class));
            }
        });

        btn_dimensions_crater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HoleDimensions.class));
            }
        });

        btn_electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Electricity.class));
            }
        });


    }
}
