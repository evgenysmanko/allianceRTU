package com.example.allianceapp.ui.sportclub;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.allianceapp.R;

public class SportclubFragment extends Fragment {

    private SportclubViewModel sportclubViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sportclubViewModel =
                ViewModelProviders.of(this).get(SportclubViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sportclub, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        sportclubViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}