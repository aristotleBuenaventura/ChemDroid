package com.example.chemdroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawer.MainActivity1
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val totalQuestions = intent.getIntExtra(Constants1.totalQuestion,0)
        val correctAnswer = intent.getIntExtra(Constants1.correctAnswer,0)

        result_score.text = "Your Score is $correctAnswer out of $totalQuestions"

        result_button.setOnClickListener() {
            startActivity(Intent(this,MainActivity1::class.java))
        }


    }
}