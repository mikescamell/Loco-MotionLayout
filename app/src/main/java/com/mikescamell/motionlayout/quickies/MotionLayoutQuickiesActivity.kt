package com.mikescamell.motionlayout.quickies

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mikescamell.motionlayout.R
import kotlinx.android.synthetic.main.activity_motionlayout_quickie.*

class MotionLayoutQuickiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motionlayout_quickie)

        motionQuickieSubElements.setOnClickListener {
            startActivity(Intent(this, MotionQuickieSubelements::class.java))
        }
        motionQuickieOnTouchUp.setOnClickListener {
            startActivity(Intent(this, MotionQuickieOnTouchUp::class.java))
        }
    }
}
