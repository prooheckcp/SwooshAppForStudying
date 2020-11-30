package com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        val skill = intent.getStringExtra(EXTRA_SKILL).toString()

        searchLeaguesText.text = "Looking for $league $skill's league near you..."

    }
}