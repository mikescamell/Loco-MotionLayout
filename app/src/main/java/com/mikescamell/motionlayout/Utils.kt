package com.mikescamell.motionlayout

import android.view.View

fun setLightStatusBar(view: View) {
    var flags = view.systemUiVisibility
    flags = flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    view.systemUiVisibility = flags
}

fun calculateProgressAlpha(progress: Float) = ((progress * 100) * 2.55).toInt()

