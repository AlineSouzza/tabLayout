package com.example.tableview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager2 = findViewById(R.id.pager);

        AdapterDemo adapterDemo = new AdapterDemo(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(adapterDemo);

        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            tab.setText("Tab " + (position+1));
        }).attach();
    }
}