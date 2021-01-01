package com.example.spaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class EstimatingDistances extends AppCompatActivity {
    Toolbar toolbar_EstimatingDistances;
    TabLayout tab_EstimatingDistances;
    ViewPager pager_EstimatingDistances;
    AdaptorPagerEstimatingDistances adaptorPagerEstimatingDistances;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimating_distances);

        toolbar_EstimatingDistances = findViewById(R.id.toolbar_EstimatingDistances);
        setSupportActionBar(toolbar_EstimatingDistances);
        getSupportActionBar().setTitle("تقدير المسافات");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tab_EstimatingDistances = findViewById(R.id.tab_EstimatingDistances);
        arrayList = new ArrayList<>();
        arrayList.add("الطرق الشعبية");
        arrayList.add("الطرق العلمية");

        pager_EstimatingDistances = findViewById(R.id.pager_EstimatingDistances);
        tab_EstimatingDistances.setupWithViewPager(pager_EstimatingDistances);
        adaptorPagerEstimatingDistances = new AdaptorPagerEstimatingDistances(getApplicationContext(), getSupportFragmentManager(), 2, arrayList);
        pager_EstimatingDistances.setAdapter(adaptorPagerEstimatingDistances);
        pager_EstimatingDistances.setOffscreenPageLimit(adaptorPagerEstimatingDistances.getCount() > 1 ? adaptorPagerEstimatingDistances.getCount() - 1 : 1);
        pager_EstimatingDistances.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_EstimatingDistances));


        tab_EstimatingDistances.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager_EstimatingDistances.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

    }
}
