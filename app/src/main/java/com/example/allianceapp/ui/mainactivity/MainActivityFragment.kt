package com.example.allianceapp.ui.mainactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.allianceapp.R

class MainActivityFragment : Fragment() {
    private lateinit var mainActivityViewModel: MainActivityViewModel
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_mainactivity, container, false)
        val textView = root.findViewById<TextView>(R.id.text_nationalteams)
        mainActivityViewModel!!.getText()!!.observe(this, Observer { s -> textView.text = s })
        return root
    }
}