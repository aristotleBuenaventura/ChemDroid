package com.example.chemdroid

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_q1.*

class Q1Activity : AppCompatActivity(),View.OnClickListener {

    private var mCurrentPosition: Int =1
    private var mQuestionsList: ArrayList<Questions>? = null
    private var mSelectedOptionPosition: Int =0
    private var mCorrectAnswer: Int =0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q1)



        mQuestionsList = Constants1.getQuestions()

        setQuestion()

        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)
        buttonSubmit.setOnClickListener(this)
    }

    private fun setQuestion(){

        val question = mQuestionsList!!.get(mCurrentPosition -1)

        defaultOptionView()

        if(mCurrentPosition ==mQuestionsList!!.size) {
            buttonSubmit.text = "FINISH"
        } else {
            buttonSubmit.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        progressNum.text = "$mCurrentPosition" + "/" + progressBar.max

        questions1.text = question!!.question
        option1.text = question.option1
        option2.text = question.option2
        option3.text = question.option3
        option4.text = question.option4
    }

    private fun defaultOptionView() {
        val options = ArrayList<TextView>()
        options.add(0,option1)
        options.add(1,option2)
        options.add(2,option3)
        options.add(3,option4)

        for(option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background =ContextCompat.getDrawable(this,R.drawable.option_bg)

        }
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.option1 -> {
                selectedOptionView(option1,1)
            }
            R.id.option2 -> {
                selectedOptionView(option2,2)
            }
            R.id.option3 -> {
                selectedOptionView(option3,3)
            }
            R.id.option4 -> {
                selectedOptionView(option4,4)
            }
            R.id.buttonSubmit -> {
                if(mSelectedOptionPosition == 0) {
                    mCurrentPosition ++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants1.correctAnswer, mCorrectAnswer)
                            intent.putExtra(Constants1.totalQuestion, mQuestionsList!!.size)
                            startActivity(intent)
                        }
                    }
                }else {
                    val question = mQuestionsList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_bg)
                    }else {
                        mCorrectAnswer++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_bg)

                    if(mCurrentPosition == mQuestionsList!!.size) {
                        buttonSubmit.text = "FINISH"
                    }else {
                        buttonSubmit.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }

    }

    private fun answerView(answer: Int, drawablesView: Int) {
        when(answer) {
            1 -> {
                option1.background = ContextCompat.getDrawable(this,drawablesView)
            }
            2 -> {
                option2.background = ContextCompat.getDrawable(this,drawablesView)
            }
            3 -> {
                option3.background = ContextCompat.getDrawable(this,drawablesView)
            }
            4 -> {
                option4.background = ContextCompat.getDrawable(this,drawablesView)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#FF6CDADA"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background =ContextCompat.getDrawable(this,R.drawable.select_bg)

    }
}