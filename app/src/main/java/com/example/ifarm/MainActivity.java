package com.example.ifarm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    HomeFragment homeFragment = new HomeFragment();
    PlantsFragment plantsFragment = new PlantsFragment();
    DiseasesFragment diseasesFragment = new DiseasesFragment();
    WeedsFragment weedsFragment = new WeedsFragment();
    HistoryFragment historyFragment = new HistoryFragment();

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv = findViewById(R.id.bnv);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, homeFragment).commit();

        bnv.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bnv_home:
                    break;
            }

            return false;
        });
    }
}