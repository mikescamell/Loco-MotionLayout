package com.mikescamell.locomotionlayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MotionQuickieOnTouchUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.motion_quickie_on_touch_up)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        setLightStatusBar(window.decorView)
    }

}