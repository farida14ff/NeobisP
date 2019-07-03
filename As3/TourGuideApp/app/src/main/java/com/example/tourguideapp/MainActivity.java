package com.example.tourguideapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;



public class MainActivity extends AppCompatActivity {
    public TabLayout mtabLayout;
    public ViewPager mViewPager;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mViewPager = findViewById(R.id.pager);
        setupViewPager(mViewPager);

        mtabLayout = findViewById(R.id.tabs);
        mtabLayout.setupWithViewPager(mViewPager);

    }
    private void setupViewPager(ViewPager viewPager) {
        MyAdapter adapter = new MyAdapter(this, getSupportFragmentManager());
        adapter.addFramgent(new AttractionsFragment(), "Attractions");
        adapter.addFramgent(new ParksFragment(), "Parks");
        adapter.addFramgent(new RestaurantsFragment(), "Restaurants");

        viewPager.setAdapter(adapter);
    }
}


