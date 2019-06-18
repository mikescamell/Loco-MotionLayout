package com.mikescamell.motionlayout.loco_motionlayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mikescamell.motionlayout.R
import kotlinx.android.synthetic.main.activity_loco_motionlayout.*

class LocoMotionLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loco_motionlayout)

        scene1Part1Button.setOnClickListener {
            startActivity(Intent(this, Scene1Part1::class.java))
        }
        scene1Part2Button.setOnClickListener {
            startActivity(Intent(this, Scene1Part2::class.java))
        }
        scene1Part3Button.setOnClickListener {
            startActivity(Intent(this, Scene1Part3::class.java))
        }
        scene1Part4Button.setOnClickListener {
            startActivity(Intent(this, Scene1Part4::class.java))
        }
        scene1Part5Button.setOnClickListener {
            startActivity(Intent(this, Scene1Part5::class.java))
        }
        scene1Part6Button.setOnClickListener {
            startActivity(Intent(this, Scene1Part6::class.java))
        }
        scene1Part7Button.setOnClickListener {
            startActivity(Intent(this, Scene1Part7::class.java))
        }
        scene2Part1Button.setOnClickListener {
            startActivity(Intent(this, Scene2Part1::class.java))
        }
        scene2Part2Button.setOnClickListener {
            startActivity(Intent(this, Scene2Part2::class.java))
        }
        scene2Part3Button.setOnClickListener {
            startActivity(Intent(this, Scene2Part3::class.java))
        }
        scene2Part4Button.setOnClickListener {
            startActivity(Intent(this, Scene2Part4::class.java))
        }
        scene2Part5Button.setOnClickListener {
            startActivity(Intent(this, Scene2Part5::class.java))
        }
        scene2Part6Button.setOnClickListener {
            startActivity(Intent(this, Scene2Part6::class.java))
        }
        scene2Part7Button.setOnClickListener {
            startActivity(Intent(this, Scene2Part7::class.java))
        }
        scene2Part7Button.setOnClickListener {
            startActivity(Intent(this, Scene2Part7::class.java))
        }
        combinedScenePart1.setOnClickListener {
            startActivity(Intent(this, CombinedScenePart1::class.java))
        }
        combinedScenePart2.setOnClickListener {
            startActivity(Intent(this, CombinedScenePart2::class.java))
        }
        combinedScenePart3.setOnClickListener {
            startActivity(Intent(this, CombinedScenePart3::class.java))
        }
        combinedScenePartLol.setOnClickListener {
            startActivity(Intent(this, CombinedSceneLol::class.java))
        }
    }
}
