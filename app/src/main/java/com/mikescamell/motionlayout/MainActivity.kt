package com.mikescamell.motionlayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mikescamell.motionlayout.loco_motionlayout.LocoMotionLayoutActivity
import com.mikescamell.motionlayout.quickies.MotionLayoutQuickiesActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        locoMotionLayoutButton.setOnClickListener {
            startActivity(Intent(this, LocoMotionLayoutActivity::class.java))
        }
        motionLayoutQuickies.setOnClickListener {
            startActivity(Intent(this, MotionLayoutQuickiesActivity::class.java))
        }
        monzoCardSelectionAnimationButton.setOnClickListener {
            startActivity(Intent(this, MikezoActivity::class.java))
        }
    }
}
