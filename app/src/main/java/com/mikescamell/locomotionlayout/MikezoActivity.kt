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

        card1Button.setOnClickListener {
            when (root.currentState) {
                R.id.fanOut -> {
                    root.setTransition(R.id.fanOut, R.id.card3OnTop)
                    root.transitionToEnd()
                    collapsedCardCompletedListener(R.id.card1OnTop)
                    midnightPieCheckBox.isVisible = true
                }
                R.id.card1OnTop -> {
                    Log.d("Mikezo", "Card 1 already on top")
                }
                R.id.card2OnTop -> {
                    root.setTransition(R.id.card2OnTop, R.id.card1OnTop)
                    root.transitionToEnd()
                    legumeBlueCheckBox.isGone = true
                    midnightPieCheckBox.isVisible = true
                }
                R.id.card3OnTop -> {
                    root.setTransition(R.id.card3OnTop, R.id.card1OnTop)
                    root.transitionToEnd()
                    hotWaffleCheckBox.isGone = true
                    midnightPieCheckBox.isVisible = true
                }
            }
        }
        card2Button.setOnClickListener {
            when (root.currentState) {
                R.id.fanOut -> {
                    root.setTransition(R.id.fanOut, R.id.card3OnTop)
                    root.transitionToEnd()
                    collapsedCardCompletedListener(R.id.card2OnTop)
                    legumeBlueCheckBox.isVisible = true
                }
                R.id.card1OnTop -> {
                    root.setTransition(R.id.card1OnTop, R.id.card2OnTop)
                    root.transitionToEnd()
                    midnightPieCheckBox.isGone = true
                    legumeBlueCheckBox.isVisible = true
                }
                R.id.card2OnTop -> {
                    Log.d("Mikezo", "Card 2 already on top")
                }
                R.id.card3OnTop -> {
                    root.setTransition(R.id.card3OnTop, R.id.card2OnTop)
                    root.transitionToEnd()
                    hotWaffleCheckBox.isGone = true
                    legumeBlueCheckBox.isVisible = true
                }
            }
        }
        card3Button.setOnClickListener {
            when (root.currentState) {
                R.id.fanOut -> {
                    root.setTransition(R.id.fanOut, R.id.card3OnTop)
                    root.transitionToEnd()
                    hotWaffleCheckBox.isVisible = true
                }
                R.id.card1OnTop -> {
                    root.setTransition(R.id.card1OnTop, R.id.card3OnTop)
                    root.transitionToEnd()
                    midnightPieCheckBox.isGone = true
                    hotWaffleCheckBox.isVisible = true
                }
                R.id.card2OnTop -> {
                    root.setTransition(R.id.card2OnTop, R.id.card3OnTop)
                    root.transitionToEnd()
                    legumeBlueCheckBox.isGone = true
                    hotWaffleCheckBox.isVisible = true
                }
                R.id.card3OnTop -> {
                    Log.d("Mikezo", "Card 3 already on top")
                }
            }
        }
    }

    private fun collapsedCardCompletedListener(@IdRes endStateId: Int) {
        root.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
            }

            override fun allowsTransition(p0: MotionScene.Transition?): Boolean = true

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                if (p1 == R.id.card3OnTop) {
                    root.setTransition(R.id.card3OnTop, endStateId)
                    root.transitionToEnd()
                }
                root.setTransitionListener(null)
            }
        })
    }
}
