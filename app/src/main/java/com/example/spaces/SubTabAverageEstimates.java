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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SubTabAverageEstimates  extends Fragment {
    LinearLayout layoutList;
    Button button_add;
    Button button_estimated_distance;
    EditText readings_of_namber;
    TextView output_pol_and_rec;
    TextView reading;
    double readings;

    double sum = 0;
    double num = 0;
    double avrg;
    int attempt = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_sub_tab_average_estimates, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        layoutList =  getActivity().findViewById(R.id.layout_list);

        button_add =  getActivity().findViewById(R.id.button_add);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (attempt < 10) {
                    attempt++;
                    addView();
                } else {
                    Toast.makeText(getContext(), "الحد الأقصى للقراءات هو 10", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button_estimated_distance = getActivity().findViewById(R.id.button_estimated_distance);
        button_estimated_distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum = 0;
                num = 0;
                avrg = 0;
                checkIfValidAndRead();
            }
        });

    }

    private void addView() {

        final View view = getLayoutInflater().inflate(R.layout.row_add_readings, null, false);

        reading = view.findViewById(R.id.reading);

        ImageView imageClose = view.findViewById(R.id.image_remove);
        imageClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attempt -= 1;
                removeView(view);
            }
        });
        layoutList.addView(view);
    }

    private void removeView(View view) {
        layoutList.removeView(view);
    }

    private void checkIfValidAndRead() {
        output_pol_and_rec = getActivity().findViewById(R.id.output_pol_and_rec);

        if (layoutList.getChildCount() == 0) {
            Toast.makeText(getContext(), "أضف قراءات!", Toast.LENGTH_SHORT).show();
        } else {
            for (int i = 0; i < layoutList.getChildCount(); i++) {
                View view = layoutList.getChildAt(i);
                readings_of_namber = view.findViewById(R.id.readings_of_namber);
                if (!readings_of_namber.getText().toString().equals("") && layoutList.getChildAt(i) != null) {
                    if (layoutList.getChildCount() >= 1 && layoutList.getChildCount() <= 10) {
                         readings = Double.parseDouble(readings_of_namber.getText().toString());
                            sum += readings;
                                if (i>=0) {
                                    layoutList.getChildAt(i).setBackgroundResource(R.drawable.shape_bac_item_is_empty_nothing);
                                    num += 1;
                                    avrg = sum / num;
                                    String stringOutputCorner = avrg+"";
                                    Float floatOutputCorner = Float.parseFloat(stringOutputCorner);
                                    output_pol_and_rec.setText(floatOutputCorner + "");
                                }
                    }else {
                        Toast.makeText(getContext(), "الحد الأقصى للقراءات هو 10", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getContext(), "أدخل كل القراءات المتاحة!", Toast.LENGTH_SHORT).show();
                    layoutList.getChildAt(i).setBackgroundResource(R.drawable.shape_bac_item_is_empty);
                    output_pol_and_rec.setText("الناتج");
                    break;
                }
            }
        }

    }
}