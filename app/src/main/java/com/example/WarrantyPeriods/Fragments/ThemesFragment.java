package com.example.WarrantyPeriods.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.WarrantyPeriods.R;


public class ThemesFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_themes, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button BtnHome = view.findViewById(R.id.BtnHome);
        Button BtnSpisok = view.findViewById(R.id.BtnSpisok);
        Button BtnSettings = view.findViewById(R.id.BtnSettings);
        BtnHome.setOnClickListener(viewCreate -> {
            Bundle bundleHome = new Bundle();
            Navigation.findNavController(view).navigate(R.id.action_themesFragment_to_mainFragment, bundleHome);
        });
        BtnSpisok.setOnClickListener(viewCreate -> {
            Bundle bundleSpisok = new Bundle();
            Navigation.findNavController(view).navigate(R.id.action_themesFragment_to_spisokFragment, bundleSpisok);
        });
        BtnSettings.setOnClickListener(viewCreate -> {
            Bundle bundleSettings = new Bundle();
            Navigation.findNavController(view).navigate(R.id.action_themesFragment_to_settingsFragment, bundleSettings);
        });
    }
}