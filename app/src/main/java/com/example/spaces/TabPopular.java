package com.example.spaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class TabPopular extends Fragment {
    TabLayout tab_Popular;
    ViewPager pager_Popular;
    AdaptorPagerTabPopular adaptorPagerTabPopular;
    ArrayList<String> arrayList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_tab_popular, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tab_Popular = getActivity().findViewById(R.id.tab_Popular);
        arrayList = new ArrayList<>();
        arrayList.add("عدد الخطوات");
        arrayList.add("اصبع الإبهام");
        arrayList.add("متوسط التقديرات");
        arrayList.add("تنصيف المسافة");
        arrayList.add("الإعتلام");

        pager_Popular = getActivity().findViewById(R.id.pager_Popular);
        tab_Popular.setupWithViewPager(pager_Popular);
        adaptorPagerTabPopular = new AdaptorPagerTabPopular(getContext(), getChildFragmentManager(), 5, arrayList);
        pager_Popular.setAdapter(adaptorPagerTabPopular);
        pager_Popular.setOffscreenPageLimit(adaptorPagerTabPopular.getCount() > 1 ? adaptorPagerTabPopular.getCount() - 1 : 1);
        pager_Popular.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_Popular));


        tab_Popular.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager_Popular.setCurrentItem(tab.getPosition());
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