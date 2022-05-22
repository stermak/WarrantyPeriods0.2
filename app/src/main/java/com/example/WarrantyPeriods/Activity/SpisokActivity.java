package com.example.WarrantyPeriods.Activity;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.WarrantyPeriods.R;
import com.example.WarrantyPeriods.Fragments.SpisokFragment;


public class SpisokActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.activitySpisok,new SpisokFragment()).commit();
    }
}