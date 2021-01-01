package com.example.spaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
public class PolAndRec extends AppCompatActivity {
    Toolbar toolbar_PolAndRec;
    TabLayout tab_PolAndRec;
    ViewPager pager_PolAndRec;
    AdaptorPolAndRec adaptorPolAndRec;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pol_and_rec);

        toolbar_PolAndRec = findViewById(R.id.toolbar_PolAndRec);
        setSupportActionBar(toolbar_PolAndRec);
        setTitle("Pol And Rec");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tab_PolAndRec = findViewById(R.id.tab_PolAndRec);
        arrayList = new ArrayList<>();
        arrayList.add("Pol");
        arrayList.add("Rec");

        pager_PolAndRec = findViewById(R.id.pager_PolAndRec);
        tab_PolAndRec.setupWithViewPager(pager_PolAndRec);
        adaptorPolAndRec = new AdaptorPolAndRec(getApplicationContext(), getSupportFragmentManager(), 2, arrayList);
        pager_PolAndRec.setAdapter(adaptorPolAndRec);
        pager_PolAndRec.setOffscreenPageLimit(adaptorPolAndRec.getCount() > 1 ? adaptorPolAndRec.getCount() - 1 : 1);
        pager_PolAndRec.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_PolAndRec));

        tab_PolAndRec.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager_PolAndRec.setCurrentItem(tab.getPosition());
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
