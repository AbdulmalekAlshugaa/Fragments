package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fragments.Fragments.Fragment1;
import com.example.fragments.Fragments.Fragment2;
import com.example.fragments.Fragments.Fragment3;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // XML
        mViewPager = findViewById(R.id.mPager);

        SetupViewPager(mViewPager);

    }

    public void SetupViewPager( ViewPager viewPager){
        SeceionStageAdapter adapter = new SeceionStageAdapter(getSupportFragmentManager());
        adapter.AddFragments(new Fragment1(), "Fragment 1");
        adapter.AddFragments(new Fragment2(), "Fragment 2");
        adapter.AddFragments(new Fragment3(), "Fragment 3");

        viewPager.setAdapter(adapter);
    }

    public void setmViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);

    }

}
