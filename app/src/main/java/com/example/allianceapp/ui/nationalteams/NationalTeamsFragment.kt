package com.example.allianceapp.ui.nationalteams

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.allianceapp.R

class NationalTeamsFragment : Fragment() {
    private var NationalTeamsViewModel: NationalTeamsViewModel? = null
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        NationalTeamsViewModel = ViewModelProviders.of(this).get<NationalTeamsViewModel>(com.example.allianceapp.ui.nationalteams.NationalTeamsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_nationalteams, container, false)
        val textView = root.findViewById<TextView>(R.id.text_nationalteams)
        NationalTeamsViewModel!!.text.observe(this, Observer<String?> { s -> textView.text = s })
        return root
    }
}