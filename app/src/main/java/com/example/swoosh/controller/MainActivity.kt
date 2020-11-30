package com.example.swoosh.controller

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import com.example.swoosh.R


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get the button event
        val startingButton = findViewById<Button>(R.id.finishButton)

        startingButton.setOnClickListener{

            //Create the intent
            val leagueIntent = Intent(this, LeagueActivity::class.java)

            //Start the next intent
            startActivity(leagueIntent)

        }

    }



}