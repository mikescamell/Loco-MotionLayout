package com.mikescamell.locomotionlayout

import android.os.Bundle
import android.util.Log
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import androidx.core.view.isGone
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.mikezo_cards.*

class MikezoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mikezo_cards)

        bottomCardButton.setOnClickListener {
            when (root.currentState) {
                R.id.fanOut -> {
                    root.setTransition(R.id.fanOut, R.id.topCardOnTop)
                    root.transitionToEnd()
                    collapsedCardCompletedListener(R.id.bottomCardOnTop)
                    midnightPieCheckBox.isVisible = true
                }
                R.id.bottomCardOnTop -> {
                    Log.d("Mikezo", "Card 1 already on top")
                }
                R.id.middleCardOnTop -> {
                    root.setTransition(R.id.middleCardOnTop, R.id.bottomCardOnTop)
                    root.transitionToEnd()
                    legumeBlueCheckBox.isGone = true
                    midnightPieCheckBox.isVisible = true
                }
                R.id.topCardOnTop -> {
                    root.setTransition(R.id.topCardOnTop, R.id.bottomCardOnTop)
                    root.transitionToEnd()
                    hotWaffleCheckBox.isGone = true
                    midnightPieCheckBox.isVisible = true
                }
            }
        }
        middleCardButton.setOnClickListener {
            when (root.currentState) {
                R.id.fanOut -> {
                    root.setTransition(R.id.fanOut, R.id.topCardOnTop)
                    root.transitionToEnd()
                    collapsedCardCompletedListener(R.id.middleCardOnTop)
                    legumeBlueCheckBox.isVisible = true
                }
                R.id.bottomCardOnTop -> {
                    root.setTransition(R.id.bottomCardOnTop, R.id.middleCardOnTop)
                    root.transitionToEnd()
                    midnightPieCheckBox.isGone = true
                    legumeBlueCheckBox.isVisible = true
                }
                R.id.middleCardOnTop -> {
                    Log.d("Mikezo", "Card 2 already on top")
                }
                R.id.topCardOnTop -> {
                    root.setTransition(R.id.topCardOnTop, R.id.middleCardOnTop)
                    root.transitionToEnd()
                    hotWaffleCheckBox.isGone = true
                    legumeBlueCheckBox.isVisible = true
                }
            }
        }
        topCardButton.setOnClickListener {
            when (root.currentState) {
                R.id.fanOut -> {
                    root.setTransition(R.id.fanOut, R.id.topCardOnTop)
                    root.transitionToEnd()
                    hotWaffleCheckBox.isVisible = true
                }
                R.id.bottomCardOnTop -> {
                    root.setTransition(R.id.bottomCardOnTop, R.id.topCardOnTop)
                    root.transitionToEnd()
                    midnightPieCheckBox.isGone = true
                    hotWaffleCheckBox.isVisible = true
                }
                R.id.middleCardOnTop -> {
                    root.setTransition(R.id.middleCardOnTop, R.id.topCardOnTop)
                    root.transitionToEnd()
                    legumeBlueCheckBox.isGone = true
                    hotWaffleCheckBox.isVisible = true
                }
                R.id.topCardOnTop -> {
                    Log.d("Mikezo", "Card 3 already on top")
                }
            }
        }
    }

    private fun collapsedCardCompletedListener(@IdRes endStateId: Int) {
        root.setTransitionListener(object : MotionLayout.TransitionListener {

            override fun allowsTransition(transition: MotionScene.Transition): Boolean {
                return true
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout, startId: Int, endId: Boolean, progress: Float
            ) {
            }

            override fun onTransitionStarted(
                motionLayout: MotionLayout, startId: Int, endId: Int
            ) {
            }

            override fun onTransitionChange(
                motionLayout: MotionLayout,
                startId: Int,
                endId: Int,
                progress: Float
            ) {
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
                if (currentId == R.id.topCardOnTop) {
                    root.setTransition(R.id.topCardOnTop, endStateId)
                    root.transitionToEnd()
                }
                root.setTransitionListener(null)
            }
        })
    }
}
