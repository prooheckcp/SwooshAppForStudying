package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league : String = ""
    var skill : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()

    }

    fun onBeginnerClicked(view: View){
        ballerSkillButton.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view: View){
        beginnerSkillButton.isChecked = false
        skill = "baller"
    }

    fun finishOnClicked(view: View){

        if(beginnerSkillButton.isChecked || ballerSkillButton.isChecked){

            val newActivity = Intent(this, finish::class.java)
            newActivity.putExtra(EXTRA_LEAGUE, league)
            newActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(newActivity)

        }else{
            Toast.makeText(this, "You need to select a skill level", Toast.LENGTH_SHORT).show()
        }

    }

}