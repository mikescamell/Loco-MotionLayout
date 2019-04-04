package com.mikescamell.locomotionlayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Scene1Part4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout1_part4)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        setLightStatusBar(window.decorView)
    }

}