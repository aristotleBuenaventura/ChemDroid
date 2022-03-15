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

class Symbolism1Activity : AppCompatActivity() {
    lateinit var front_anim: AnimatorSet
    lateinit var back_anim: AnimatorSet
    var isFront = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symbolism1)

        val scale = applicationContext.resources.displayMetrics.density
        card_front.cameraDistance = 8000 * scale
        card_back.cameraDistance = 8000 * scale

        card_1.cameraDistance = 8000 * scale
        card_2.cameraDistance = 8000 * scale

        card_3.cameraDistance = 8000 * scale
        card_4.cameraDistance = 8000 * scale

        card_5.cameraDistance = 8000 * scale
        card_6.cameraDistance = 8000 * scale

        card_7.cameraDistance = 8000 * scale
        card_8.cameraDistance = 8000 * scale

        card_9.cameraDistance = 8000 * scale
        card_10.cameraDistance = 8000 * scale

        card_11.cameraDistance = 8000 * scale
        card_12.cameraDistance = 8000 * scale


        card_13.cameraDistance = 8000 * scale
        card_14.cameraDistance = 8000 * scale







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
                        flip_bt4.setOnClickListener {
                            if (isFront) {
                                front_anim.setTarget(card_7)
                                back_anim.setTarget(card_8)
                                front_anim.start()
                                back_anim.start()
                                isFront = false
                            } else {
                                front_anim.setTarget(card_8)
                                back_anim.setTarget(card_7)
                                back_anim.start()
                                front_anim.start()
                                isFront = true


                            }
                            flip_bt5.setOnClickListener {
                                if (isFront) {
                                    front_anim.setTarget(card_9)
                                    back_anim.setTarget(card_10)
                                    front_anim.start()
                                    back_anim.start()
                                    isFront = false
                                } else {
                                    front_anim.setTarget(card_10)
                                    back_anim.setTarget(card_9)
                                    back_anim.start()
                                    front_anim.start()
                                    isFront = true


                                }
                                flip_bt6.setOnClickListener {
                                    if (isFront) {
                                        front_anim.setTarget(card_11)
                                        back_anim.setTarget(card_12)
                                        front_anim.start()
                                        back_anim.start()
                                        isFront = false
                                    } else {
                                        front_anim.setTarget(card_12)
                                        back_anim.setTarget(card_11)
                                        back_anim.start()
                                        front_anim.start()
                                        isFront = true


                                    }
                                    flip_bt7.setOnClickListener {
                                        if (isFront) {
                                            front_anim.setTarget(card_13)
                                            back_anim.setTarget(card_14)
                                            front_anim.start()
                                            back_anim.start()
                                            isFront = false
                                        } else {
                                            front_anim.setTarget(card_14)
                                            back_anim.setTarget(card_13)
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
            }
        }
    }
}

