package com.example.fragmentmodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager mViewPager;
    TabLayout tabLayout;
    SectionPagerAdapter mSectionsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.pager);
        tabLayout = findViewById(R.id.tablayout);

        tabLayout.setupWithViewPager(mViewPager);

        setupViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        if(mSectionsPagerAdapter == null) {
          mSectionsPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());
          mSectionsPagerAdapter.addFragment(new FirstFragment(), "First");
          mSectionsPagerAdapter.addFragment(new SecondFragment(), "Second");
          viewPager.setAdapter(mSectionsPagerAdapter);
        }
    }
}