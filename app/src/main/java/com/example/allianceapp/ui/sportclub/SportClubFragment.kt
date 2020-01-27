package com.example.allianceapp.ui.sportclub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.allianceapp.R

class SportclubFragment : Fragment() {

    private var sportclubViewModel: SportclubViewModel? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        sportclubViewModel = ViewModelProviders.of(this).get(SportclubViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_nationalteams, container, false)
        val textView = root.findViewById<TextView>(R.id.text_nationalteams)
        sportclubViewModel!!.mText!!.observe(this, Observer { s -> textView.text = s })
        return root
    }}