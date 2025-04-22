package com.yourpackage.rivelibrary

import app.rive.runtime.kotlin.RiveAnimationView

class RiveAnimationBridge(private val riveView: RiveAnimationView) {

    // Java-compatible method to set animation
//    @JvmOverloads
//    fun setAnimation(animationName: String, loop: Boolean = false) {
//        riveView.setAnimation(animationName)
//        riveView.setLooping(loop)
//    }

    companion object {
        // Java-compatible static method to play the animation
        @JvmStatic
        fun playAnimation(riveView: RiveAnimationView) {
            riveView.play()

        }

        // Java-compatible static method to pause the animation
        @JvmStatic
        fun pauseAnimation(riveView: RiveAnimationView) {
            riveView.pause()
        }

        @JvmStatic
        fun playOtherAnimation(riveView: RiveAnimationView) {
            riveView.pause()
        }
    }
}
