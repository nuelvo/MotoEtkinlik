package com.example.demo.motoetkinlik.view;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.demo.motoetkinlik.R;

public class PermissionsActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SlideAdaptoru slideAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permissions);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        slideAdapter = new SlideAdaptoru(this);
        viewPager.setAdapter(slideAdapter);
    }
}
