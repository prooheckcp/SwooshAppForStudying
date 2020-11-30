package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    var selectedLeague: String = ""

    fun leagueNextClicked(view: View){

        if(womensLeagueBtn.isChecked || coedLeagueBtn.isChecked || mensLeagueBtn.isChecked){

            //Change to the next window
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)

            startActivity(skillActivity)
        }else{

            Toast.makeText(this, "Please select a league.", 1).show()

        }


    }


    //Clicked the mens button
    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "mens"
    }

    //Clicked on womens button
    fun onWomensClicked(view: View){
        coedLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        selectedLeague = "womens"
    }

    //Clicked on coed button
    fun onCoedClicked(view: View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        selectedLeague = "co-ed"
    }

}