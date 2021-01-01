package com.example.spaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HoleDimensions extends AppCompatActivity {
    Toolbar toolbar;
    EditText box_length_hole_dimensions;
    EditText shooting_angle_hole_dimensions;
    EditText show_box_hole_dimensions;
    EditText backfill_height_hole_dimensions;
    EditText chimney_width_hole_dimensions;
    Button button_hole_dimensions;
    TextView output_depth_of_hole_hole_dimensions;
    TextView output_hole_length_hole_dimensions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hole_dimensions);

        toolbar = findViewById(R.id.toolbar_HoleDimensions);
        setSupportActionBar(toolbar);
        setTitle("أبعاد الحفرة");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        box_length_hole_dimensions = findViewById(R.id.box_length_hole_dimensions);
        shooting_angle_hole_dimensions = findViewById(R.id.shooting_angle_hole_dimensions);
        show_box_hole_dimensions = findViewById(R.id.show_box_hole_dimensions);
        backfill_height_hole_dimensions = findViewById(R.id.backfill_height_hole_dimensions);
        chimney_width_hole_dimensions = findViewById(R.id.chimney_width_hole_dimensions);
        button_hole_dimensions = findViewById(R.id.button_hole_dimensions);
        output_depth_of_hole_hole_dimensions = findViewById(R.id.output_depth_of_hole_hole_dimensions);
        output_hole_length_hole_dimensions = findViewById(R.id.output_hole_length_hole_dimensions);

        button_hole_dimensions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!box_length_hole_dimensions.getText().toString().equals("") && !shooting_angle_hole_dimensions.getText().toString().equals("") && !show_box_hole_dimensions.getText().toString().equals("") && !backfill_height_hole_dimensions.getText().toString().equals("") && !chimney_width_hole_dimensions.getText().toString().equals("")) {
                    double box_length = Double.parseDouble(box_length_hole_dimensions.getText().toString());
                    double shooting_angle = Double.parseDouble(shooting_angle_hole_dimensions.getText().toString());
                    double show_box = Double.parseDouble(show_box_hole_dimensions.getText().toString());
                    double backfill_height = Double.parseDouble(backfill_height_hole_dimensions.getText().toString());
                    double chimney_width = Double.parseDouble(chimney_width_hole_dimensions.getText().toString());

                    double outputDepth = (box_length*Math.sin(shooting_angle/57.29578)+show_box+backfill_height);
                    String stringOutputDepth = outputDepth+"";
                    Float floatOutputDepth = Float.parseFloat(stringOutputDepth);
                    output_depth_of_hole_hole_dimensions.setText(floatOutputDepth+"");

                    double outputLength = (box_length*Math.cos(shooting_angle/57.29578))+chimney_width;
                    String sringOutputLength = outputLength+"";
                    Float floatOutputLength = Float.parseFloat(sringOutputLength);
                    output_hole_length_hole_dimensions.setText(floatOutputLength+"");
                }
            }
        });


    }
}
