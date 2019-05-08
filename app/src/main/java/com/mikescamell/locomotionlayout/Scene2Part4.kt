package com.mikescamell.locomotionlayout

import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import androidx.core.graphics.ColorUtils
import androidx.vectordrawable.graphics.drawable.Animatable2Compat
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import kotlinx.android.synthetic.main.layout2_part4.*

/**
 * Demonstrates adding the synopsis header text and review stars
 */
class Scene2Part4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2_part4)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        setLightStatusBar(window.decorView)

        val topLeftAnimationForward =
            AnimatedVectorDrawableCompat.create(this, R.drawable.top_left_liquid_forward)
        val topLeftAnimationReverse =
            AnimatedVectorDrawableCompat.create(this, R.drawable.top_left_liquid_reverse)

        val bottomRightAnimationForward =
            AnimatedVectorDrawableCompat.create(this, R.drawable.bottom_right_liquid_forward)
        val bottomRightAnimationReverse =
            AnimatedVectorDrawableCompat.create(this, R.drawable.bottom_right_liquid_reverse)

        val topLeftImageView = (findViewById<ImageView>(R.id.bookSynopsisFluidTopLeft)).apply {
            setImageDrawable(topLeftAnimationForward)
        }
        val bottomRightImageView =
            (findViewById<ImageView>(R.id.bookSynopsisFluidBottomRight)).apply {
                setImageDrawable(bottomRightAnimationForward)
            }

        root.setTransitionListener(object : MotionLayout.TransitionListener {

            override fun allowsTransition(p0: MotionScene.Transition?): Boolean {
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
                val color =
                    ColorUtils.setAlphaComponent(Color.WHITE, calculateProgressAlpha(progress))
                bottomRightAnimationForward?.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
                bottomRightAnimationReverse?.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
            }
        })

        topLeftAnimationForward?.registerAnimationCallback(object :
            Animatable2Compat.AnimationCallback() {
            override fun onAnimationEnd(drawable: Drawable?) {
                topLeftImageView.setImageDrawable(topLeftAnimationReverse)
                topLeftAnimationReverse?.start()
            }
        })
        topLeftAnimationReverse?.registerAnimationCallback(object :
            Animatable2Compat.AnimationCallback() {
            override fun onAnimationEnd(drawable: Drawable?) {
                topLeftImageView.setImageDrawable(topLeftAnimationForward)
                topLeftAnimationForward?.start()
            }
        })

        bottomRightAnimationForward?.registerAnimationCallback(object :
            Animatable2Compat.AnimationCallback() {
            override fun onAnimationEnd(drawable: Drawable?) {
                bottomRightImageView.setImageDrawable(bottomRightAnimationReverse)
                bottomRightAnimationReverse?.start()
            }
        })
        bottomRightAnimationReverse?.registerAnimationCallback(object :
            Animatable2Compat.AnimationCallback() {
            override fun onAnimationEnd(drawable: Drawable?) {
                bottomRightImageView.setImageDrawable(bottomRightAnimationForward)
                bottomRightAnimationForward?.start()
            }
        })

        topLeftAnimationForward?.start()
        bottomRightAnimationForward?.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        root.setTransitionListener(null)
    }
}