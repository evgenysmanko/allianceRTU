package com.example.allianceapp.ui.cafedra

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.allianceapp.R

class CafedraFragment : Fragment() {
    private var cafedraViewModel: CafedraViewModel? = null
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        cafedraViewModel = ViewModelProviders.of(this).get<CafedraViewModel>(CafedraViewModel::class.java)
        return inflater.inflate(R.layout.fragment_cafedra, container, false)
    }
}