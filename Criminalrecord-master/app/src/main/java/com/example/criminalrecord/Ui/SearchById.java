package com.example.criminalrecord.Ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.criminalrecord.Fragments.SearchByName;
import com.example.criminalrecord.Fragments.SearchByQr;
import com.example.criminalrecord.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SearchById extends AppCompatActivity {

    TextView item_name;
    ImageView item_image;
    View view;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_id);

        //Start find View By ID
         tabLayout = findViewById(R.id.tab_layout_for_search);
         viewPager = findViewById(R.id.view_pager_for_search);
        //End find view By ID

         viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

         //Start Method
         TabBar();
         //End Method
    }


    private void TabBar(){
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tabPosition =  tabLayout.getSelectedTabPosition();
                View view = getLayoutInflater().inflate(R.layout.layout_item_search, null);
                item_name = view.findViewById(R.id.name_item_slected_for_search);
                item_image = view.findViewById(R.id.image_item_slected_for_search);
                switch (tabPosition){
                    case 0 :
                        item_name.setTextColor(Color.BLUE);
                        item_image.setImageResource(ViewPagerAdapter.icons.get(tabPosition));
                        item_name.setText(ViewPagerAdapter.titles.get(tabPosition));
                        tab.setCustomView(view);
                        break;
                    case 1 :
                        item_name.setTextColor(Color.BLUE);
                        item_image.setImageResource(ViewPagerAdapter.icons.get(tabPosition));
                        item_name.setText(ViewPagerAdapter.titles.get(tabPosition));
                        tab.setCustomView(view);
                        break;
                    case 2 :
                        item_name.setTextColor(Color.BLUE);
                        item_image.setImageResource(ViewPagerAdapter.icons.get(tabPosition));
                        item_name.setText(ViewPagerAdapter.titles.get(tabPosition));
                        tab.setCustomView(view);
                        break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.setCustomView(null);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPagerAdapter.addFragment(new SearchByQr(),"QR" , R.drawable.family_relations);
        viewPagerAdapter.addFragment(new SearchByName(),"الاسم" , R.drawable.criminal_record);
        viewPagerAdapter.addFragment(new com.example.criminalrecord.Fragments.SearchById(),"رقم الهويه" , R.drawable.parsonal_info);

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(tabLayout.getTabCount());

    }

    static class ViewPagerAdapter extends FragmentPagerAdapter {

        private ArrayList<Fragment> fragments;
        public static  ArrayList<String> titles;
        public static ArrayList<Integer> icons ;

        ViewPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.fragments = new ArrayList<>();
            this.titles = new ArrayList<>();
            this.icons = new ArrayList<>();
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        public  void  addFragment(Fragment fragment , String title , int icon){
            fragments.add(fragment);
            titles.add(title);
            icons.add(icon);

        }
        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);

        }


        @Override
        public int getItemPosition(@NonNull Object object) {
            return super.getItemPosition(object);
        }
    }

}
