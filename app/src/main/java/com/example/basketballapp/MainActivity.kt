package com.example.basketballapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val teamAscore: TextView=findViewById(R.id.zeroteamA)
        val teamBscore: TextView=findViewById(R.id.zeroteamB)

    val add3ptsBtnTeamA: Button = findViewById(R.id.points3btn)
    val add2ptsBtnTeamA: Button = findViewById(R.id.points2btn)
    val fthrowBtnTeamA: Button = findViewById(R.id.freethrowbtn)
        val add3ptsBtnTeamB: Button = findViewById(R.id.points3btnTeamB)
        val add2ptsBtnTeamB: Button = findViewById(R.id.points2btnTeamB)
        val fthrowBtnTeamB: Button = findViewById(R.id.freethrowbtnTeamB)
        val resetBtn: Button = findViewById(R.id.resetbtn)

        add3ptsBtnTeamA.setOnClickListener { plusScore(3,teamAscore)}
        add2ptsBtnTeamA.setOnClickListener { plusScore(2,teamAscore) }
        fthrowBtnTeamA.setOnClickListener { plusScore(1,teamAscore) }
        add2ptsBtnTeamB.setOnClickListener { plusScore(2,teamBscore) }
        add3ptsBtnTeamB.setOnClickListener { plusScore(3,teamBscore) }
        fthrowBtnTeamB.setOnClickListener { plusScore(1,teamBscore) }
        resetBtn.setOnClickListener { teamAscore.text="0"
        teamBscore.text="0"}


    }
    private fun plusScore(points:Int,label:TextView){
        val currentScore=label.text.toString().toInt()
        val newScore=currentScore+points
        label.text="$newScore"
    }
}