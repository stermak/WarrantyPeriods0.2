package com.example.WarrantyPeriods.Fragments;

import android.content.Intent;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.WarrantyPeriods.Activity.LogActivity;
import com.example.WarrantyPeriods.R;
import com.google.firebase.auth.FirebaseAuth;

public class ProfileFragment extends Fragment {
    public Button signOut;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        //Button
        signOut = view.findViewById(R.id.signOutButton);

        signOut.setOnClickListener(view12 -> {
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(getContext(), LogActivity.class);
            startActivity(intent);
        });
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button BtnHome = view.findViewById(R.id.BtnHome);
        Button BtnSpisok = view.findViewById(R.id.BtnSpisok);
        Button BtnSettings = view.findViewById(R.id.BtnSettings);
        Button BtnPrivacy = view.findViewById(R.id.BtnPrivacy);
        BtnHome.setOnClickListener(viewCreate -> {
            Bundle bundleHome = new Bundle();
            Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_mainFragment, bundleHome);
        });
        BtnSpisok.setOnClickListener(viewCreate -> {
            Bundle bundleSpisok = new Bundle();
            Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_spisokFragment, bundleSpisok);
        });
        BtnSettings.setOnClickListener(viewCreate -> {
            Bundle bundleSettings = new Bundle();
            Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_settingsFragment, bundleSettings);
        });
        BtnPrivacy.setOnClickListener(viewCreate -> {
            Bundle bundlePrivacy = new Bundle();
            Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_privacyFragment, bundlePrivacy);
        });
    }
}