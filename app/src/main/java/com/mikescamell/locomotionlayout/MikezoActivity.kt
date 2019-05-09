package com.mikescamell.locomotionlayout

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.mikezo_cards.*

class MikezoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mikezo_cards)

        card1Button.setOnClickListener {
            when (root.currentState) {
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
}
