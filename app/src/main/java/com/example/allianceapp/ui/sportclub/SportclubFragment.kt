package com.example.allianceapp.ui.sportclub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.allianceapp.R

class SportclubFragment : Fragment() {
    private var sportclubViewModel: SportclubViewModel? = null
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        sportclubViewModel = ViewModelProviders.of(this).get<SportclubViewModel>(SportclubViewModel::class.java)
        return inflater.inflate(R.layout.fragment_sportclub, container, false)
    }
}