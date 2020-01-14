package com.example.allianceapp.ui.cafedra;

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

public class CafedraFragment extends Fragment {

    private CafedraViewModel cafedraViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cafedraViewModel =
                ViewModelProviders.of(this).get(CafedraViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cafedra, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        cafedraViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}