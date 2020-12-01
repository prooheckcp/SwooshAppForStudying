package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    var selectedLeague: String = ""
    var player = Player("","")

    fun leagueNextClicked(view: View){

        if(womensLeagueBtn.isChecked || coedLeagueBtn.isChecked || mensLeagueBtn.isChecked){

            //Change to the next window
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)

            startActivity(skillActivity)
        }else{

            Toast.makeText(this, "Please select a league.", 1).show()

        }


    }


    //Clicked the mens button
    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "mens"
    }

    //Clicked on womens button
    fun onWomensClicked(view: View){
        coedLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        player.league = "womens"
    }

    //Clicked on coed button
    fun onCoedClicked(view: View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        player.league = "co-ed"
    }

}