package com.example.chemdroid

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chemdroid.R
import kotlinx.android.synthetic.main.activity_essential1.card_1
import kotlinx.android.synthetic.main.activity_essential1.card_2
import kotlinx.android.synthetic.main.activity_essential1.card_3
import kotlinx.android.synthetic.main.activity_essential1.card_4
import kotlinx.android.synthetic.main.activity_essential1.card_5
import kotlinx.android.synthetic.main.activity_essential1.card_6
import kotlinx.android.synthetic.main.activity_essential1.card_back
import kotlinx.android.synthetic.main.activity_essential1.card_front
import kotlinx.android.synthetic.main.activity_essential1.flip_bt1
import kotlinx.android.synthetic.main.activity_essential1.flip_bt2
import kotlinx.android.synthetic.main.activity_essential1.flip_bt3
import kotlinx.android.synthetic.main.activity_essential1.flip_btn
import kotlinx.android.synthetic.main.activity_phases1.*

class Early1Activity : AppCompatActivity() {
    lateinit var front_anim: AnimatorSet
    lateinit var back_anim: AnimatorSet
    var isFront = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_early1)

        val scale = applicationContext.resources.displayMetrics.density
        card_front.cameraDistance = 8000 * scale
        card_back.cameraDistance = 8000 * scale

        card_1.cameraDistance = 8000 * scale
        card_2.cameraDistance = 8000 * scale








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




            }

        }
    }
}