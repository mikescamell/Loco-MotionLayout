package com.mikescamell.motionlayout.loco_motionlayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.mikescamell.motionlayout.R
import com.mikescamell.motionlayout.setLightStatusBar
import kotlinx.android.synthetic.main.layout1_part3.*

class Scene1Part3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout1_part3)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        setLightStatusBar(window.decorView)

        bookSynopsisCard.isGone = true
        bookCover.isVisible = true
    }

}