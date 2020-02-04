package com.example.allianceapp.ui.nationalteams

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.allianceapp.R

class NationalTeamsFragment : Fragment() {
    lateinit var NationalTeamsViewModel: NationalTeamsViewModel

    companion object;

    private lateinit var viewModel: NationalTeamsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val allSportsIntent = Intent(activity, NationalTeamActivity::class.java)

        val clickListner = View.OnClickListener {
            allSportsIntent.putExtra(String(), view!!.id)
            startActivity(allSportsIntent)
        }

        container!!.findViewById<Button>(R.id.btn_cheerleading).setOnClickListener(clickListner)
        container.findViewById<Button>(R.id.btn_backetball_team).setOnClickListener(clickListner)
        container.findViewById<Button>(R.id.btn_handball_team).setOnClickListener(clickListner)
        container.findViewById<Button>(R.id.btn_volleyball_team).setOnClickListener(clickListner)
        container.findViewById<Button>(R.id.btn_football_team).setOnClickListener(clickListner)

        return inflater.inflate(R.layout.fragment_nationalteams, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = activity?.run {
            ViewModelProviders.of(this)[NationalTeamsViewModel::class.java]
        } ?: throw Exception("Invalid Activity")
    }
}


    /* override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
         inflater.inflate(R.menu.national_team_menu, menu)
         super.onCreateOptionsMenu(menu, inflater)
     }

     override fun onOptionsItemSelected(item: MenuItem): Boolean {
         when (item.itemId){
         }
         return super.onOptionsItemSelected(item)
     } */
