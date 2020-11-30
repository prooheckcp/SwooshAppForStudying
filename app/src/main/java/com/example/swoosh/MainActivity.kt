package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get the button event
        val startingButton = findViewById<Button>(R.id.getStartedButton)

        startingButton.setOnClickListener{

            //Create the intent
            val leagueIntent = Intent(this, LeagueActivity::class.java)

            //Start the next intent
            startActivity(leagueIntent)

        }

    }



}