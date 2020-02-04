package com.example.allianceapp.ui.nationalteams

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.allianceapp.R
import com.example.allianceapp.ui.nationalteams.basketball.BasketballTeamFragment
import com.example.allianceapp.ui.nationalteams.cheerleading.CheerleadingTeamFragment
import com.example.allianceapp.ui.nationalteams.football.FootballTeamFragment
import com.example.allianceapp.ui.nationalteams.handball.HandballTeamFragment
import com.example.allianceapp.ui.nationalteams.volleyball.VolleyballTeamFragment

class NationalTeamsFragment : Fragment() {
    private var NationalTeamsViewModel: NationalTeamsViewModel? = null
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        NationalTeamsViewModel = ViewModelProviders.of(this).get<NationalTeamsViewModel>(com.example.allianceapp.ui.nationalteams.NationalTeamsViewModel::class.java)
        return inflater.inflate(R.layout.fragment_nationalteams, container, false)
    }


    fun goToFragmentsNationalTeams() {

        val footballIntent = Intent(context, FootballTeamFragment::class.java)
        startActivity(footballIntent)

        val basketballIntent = Intent(context, BasketballTeamFragment::class.java)
        startActivity(basketballIntent)

        val cheerleadingIntent = Intent(context, CheerleadingTeamFragment::class.java)
        startActivity(cheerleadingIntent)

        val handballIntent = Intent(context, HandballTeamFragment::class.java)
        startActivity(handballIntent)

        val volleyballIntent = Intent(context, VolleyballTeamFragment::class.java)
        startActivity(volleyballIntent)
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
}