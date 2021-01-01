package com.example.spaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class TabScientific extends Fragment {
    TabLayout tab_Scientific;
    ViewPager pager_Scientific;
    AdaptorPagerTabScientific adaptorPagerTabScientific;
    ArrayList<String> arrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_tab_scientific, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tab_Scientific = getActivity().findViewById(R.id.tab_Scientific);
        arrayList = new ArrayList<>();
        arrayList.add("الصوت والضوء");
        arrayList.add("المسطرة");
        arrayList.add("الملز");

        pager_Scientific = getActivity().findViewById(R.id.pager_Scientific);
        tab_Scientific.setupWithViewPager(pager_Scientific);
        adaptorPagerTabScientific = new AdaptorPagerTabScientific(getContext(), getChildFragmentManager(), 3, arrayList);
        pager_Scientific.setAdapter(adaptorPagerTabScientific);
        pager_Scientific.setOffscreenPageLimit(adaptorPagerTabScientific.getCount() > 1 ? adaptorPagerTabScientific.getCount() - 1 : 1);
        pager_Scientific.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_Scientific));


        tab_Scientific.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager_Scientific.setCurrentItem(tab.getPosition());
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