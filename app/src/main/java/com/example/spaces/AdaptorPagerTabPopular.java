package com.example.spaces;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class AdaptorPagerTabPopular extends FragmentStatePagerAdapter {
    int tabCount;
    Context context;
    ArrayList<String> arrayList;

    public AdaptorPagerTabPopular(Context context, FragmentManager fm, int tabCount, ArrayList<String> arrayList) {
        super(fm);
        this.tabCount = tabCount;
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new SubTabNumberSteps();
            case 1:
                return new SubTabThumb();
            case 2:
                return new SubTabAverageEstimates();
            case 3:
                return new SubTabDistanceRating();
            case 4:
                return new SubTabDarkening();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}

