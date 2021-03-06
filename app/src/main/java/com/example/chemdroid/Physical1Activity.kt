package com.example.chemdroid

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chemdroid.R
import kotlinx.android.synthetic.main.activity_essential1.*

class Physical1Activity : AppCompatActivity() {
    lateinit var front_anim: AnimatorSet
    lateinit var back_anim: AnimatorSet
    var isFront = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physical1)

        val scale = applicationContext.resources.displayMetrics.density
        card_front.cameraDistance = 8000 * scale
        card_back.cameraDistance = 8000 * scale

        card_1.cameraDistance = 8000 * scale
        card_2.cameraDistance = 8000 * scale

        card_3.cameraDistance = 8000 * scale
        card_4.cameraDistance = 8000 * scale

        card_5.cameraDistance = 8000 * scale
        card_6.cameraDistance = 8000 * scale


        front_anim = AnimatorInflater.loadAnimator(applicationContext, R.animator.front_animator) as AnimatorSet

        back_anim = AnimatorInflater.loadAnimator(applicationContext, R.animator.back_animator) as AnimatorSet

        flip_btn.setOnClickListener {
            if (isFront) {
                front_anim.setTarget(card_front)
                back_anim.setTarget(card_back)
                front_anim.start()
                back_anim.start()
                isFront = false
            } else {
                front_anim.setTarget(card_back)
                back_anim.setTarget(card_front)
                back_anim.start()
                front_anim.start()
                isFront = true


            }


            flip_bt1.setOnClickListener {
                if (isFront) {
                    front_anim.setTarget(card_1)
                    back_anim.setTarget(card_2)
                    front_anim.start()
                    back_anim.start()
                    isFront = false
                } else {
                    front_anim.setTarget(card_2)
                    back_anim.setTarget(card_1)
                    back_anim.start()
                    front_anim.start()
                    isFront = true


                }

                flip_bt2.setOnClickListener {
                    if (isFront) {
                        front_anim.setTarget(card_3)
                        back_anim.setTarget(card_4)
                        front_anim.start()
                        back_anim.start()
                        isFront = false
                    } else {
                        front_anim.setTarget(card_4)
                        back_anim.setTarget(card_3)
                        back_anim.start()
                        front_anim.start()
                        isFront = true


                    }
                    flip_bt3.setOnClickListener {
                        if (isFront) {
                            front_anim.setTarget(card_5)
                            back_anim.setTarget(card_6)
                            front_anim.start()
                            back_anim.start()
                            isFront = false
                        } else {
                            front_anim.setTarget(card_6)
                            back_anim.setTarget(card_5)
                            back_anim.start()
                            front_anim.start()
                            isFront = true


                        }
                    }

                }
            }
        }
    }
}
