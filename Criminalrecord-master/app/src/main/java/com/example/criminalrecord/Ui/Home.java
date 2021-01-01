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

import com.example.criminalrecord.Fragments.CriminalRecord;
import com.example.criminalrecord.Fragments.Detained;
import com.example.criminalrecord.Fragments.FamilyRelations;
import com.example.criminalrecord.Fragments.PersonalData;
import com.example.criminalrecord.Fragments.Travel;
import com.example.criminalrecord.Fragments.Wanted;
import com.example.criminalrecord.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    View view;
    TextView item_name;
    ImageView item_image;
    String rule = "B";
    TabLayout tabLayout;
    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Start find View By ID
          tabLayout = findViewById(R.id.tab_layout);
          viewPager = findViewById(R.id.view_pager);
        //End find View By ID

          viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
         //Start Method
            CheckRoleToTabBar();
        //End Method

    }


    private void CheckRoleToTabBar(){
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tabItem =  tabLayout.getSelectedTabPosition();

                Log.d("item", "count :" + tabItem);

                switch (tabItem){
                    case 0 :
                        view = getLayoutInflater().inflate(R.layout.layout_item, null);
                        item_name = view.findViewById(R.id.name_item_slected);
                        item_image = view.findViewById(R.id.image_item_slected);
                        item_image.setImageResource(ViewPagerAdapter.icons.get(tabItem));
                        item_name.setText(ViewPagerAdapter.titles.get(tabItem));
                        item_name.setTextColor(Color.BLUE);
                        tab.setCustomView(view);
                        Log.d("item", "title :" + ViewPagerAdapter.titles.get(tabItem));
                        break;

                    case 1 :
                        view = getLayoutInflater().inflate(R.layout.layout_item, null);
                        item_name = view.findViewById(R.id.name_item_slected);
                        item_image = view.findViewById(R.id.image_item_slected);
                        item_image.setImageResource(ViewPagerAdapter.icons.get(tabItem));
                        item_name.setText(ViewPagerAdapter.titles.get(tabItem));
                        item_name.setTextColor(Color.BLUE);
                        tab.setCustomView(view);
                        break;

                    case 2 :
                        view = getLayoutInflater().inflate(R.layout.layout_item, null);
                        item_name = view.findViewById(R.id.name_item_slected);
                        item_image = view.findViewById(R.id.image_item_slected);
                        item_image.setImageResource(ViewPagerAdapter.icons.get(tabItem));
                        item_name.setText(ViewPagerAdapter.titles.get(tabItem));
                        item_name.setTextColor(Color.BLUE);
                        tab.setCustomView(view);
                        break;

                    case 3:
                        view = getLayoutInflater().inflate(R.layout.layout_item, null);
                        item_name = view.findViewById(R.id.name_item_slected);
                        item_image = view.findViewById(R.id.image_item_slected);
                        item_image.setImageResource(ViewPagerAdapter.icons.get(tabItem));
                        item_name.setText(ViewPagerAdapter.titles.get(tabItem));
                        item_name.setTextColor(Color.BLUE);
                        tab.setCustomView(view);
                        break;

                    case 4:
                        view = getLayoutInflater().inflate(R.layout.layout_item, null);
                        item_name = view.findViewById(R.id.name_item_slected);
                        item_image = view.findViewById(R.id.image_item_slected);
                        item_image.setImageResource(ViewPagerAdapter.icons.get(tabItem));
                        item_name.setText(ViewPagerAdapter.titles.get(tabItem));
                        item_name.setTextColor(Color.BLUE);
                        tab.setCustomView(view);
                        break;

                    case 5:
                        view = getLayoutInflater().inflate(R.layout.layout_item, null);
                        item_name = view.findViewById(R.id.name_item_slected);
                        item_image = view.findViewById(R.id.image_item_slected);
                        item_image.setImageResource(ViewPagerAdapter.icons.get(tabItem));
                        item_name.setText(ViewPagerAdapter.titles.get(tabItem));
                        item_name.setTextColor(Color.BLUE);
                        tab.setCustomView(view);
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.setIcon(null);
                tab.setCustomView(null);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        if (rule.equals("D")){
            viewPagerAdapter.addFragment(new CriminalRecord(),"السجل الجنائي" , R.drawable.criminal_record);
            viewPagerAdapter.addFragment(new Travel(),"السفر" , R.drawable.ic_local_airport_black_24dp);
            viewPagerAdapter.addFragment(new FamilyRelations(),"العلاقات العائلية" , R.drawable.family_relations);
            viewPagerAdapter.addFragment(new PersonalData(),"بيانات شخصية" , R.drawable.parsonal_info);

        }else if (rule.equals("B")){

            viewPagerAdapter.addFragment(new Wanted(),"المطلوبين" , R.drawable.detained);
            viewPagerAdapter.addFragment(new Detained(),"الموقوفين" , R.drawable.wanted);
            viewPagerAdapter.addFragment(new CriminalRecord(),"السجل الجنائي" , R.drawable.criminal_record);
            viewPagerAdapter.addFragment(new Travel(),"السفر" , R.drawable.ic_local_airport_black_24dp);
            viewPagerAdapter.addFragment(new FamilyRelations(),"العلاقات العائلية" , R.drawable.family_relations);
            viewPagerAdapter.addFragment(new PersonalData(),"بيانات شخصية" , R.drawable.parsonal_info);
        }


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
