package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!

    }

    fun onBeginnerClicked(view: View){
        ballerSkillButton.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClicked(view: View){
        beginnerSkillButton.isChecked = false
        player.skill = "baller"
    }

    fun finishOnClicked(view: View){

        if(beginnerSkillButton.isChecked || ballerSkillButton.isChecked){

            val newActivity = Intent(this, finish::class.java)
            newActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(newActivity)

        }else{
            Toast.makeText(this, "You need to select a skill level", Toast.LENGTH_SHORT).show()
        }

    }

}