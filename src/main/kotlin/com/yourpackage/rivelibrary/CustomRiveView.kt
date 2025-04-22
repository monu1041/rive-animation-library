package com.yourpackage.rivelibrary
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import app.rive.runtime.kotlin.RiveAnimationView
import app.rive.runtime.kotlin.core.Loop

class CustomRiveView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null
) : RiveAnimationView(context, attrs) {
    init {
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.CustomRiveView)
            val resourceId = typedArray.getResourceId(R.styleable.CustomRiveView_riveRawResId, R.raw.default_rive_animation)
            Log.d("CustomRiveView", "Loaded resource ID: $resourceId")
            if (resourceId != -1) {
                    try {
                        setRiveResource(resourceId) // now safe, native lib is loaded

                    } catch (e: Exception) {
                        Log.e("CustomRiveView", "Error loading Rive animation", e)
                    }
            }
            typedArray.recycle()
        }
    }

    fun playAnimation(animationName: String ) {
        reset()
        play(animationName, Loop.LOOP)
    }

}
