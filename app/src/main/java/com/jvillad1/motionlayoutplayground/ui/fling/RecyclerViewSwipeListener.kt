package com.jvillad1.motionlayoutplayground.ui.fling

import androidx.recyclerview.widget.RecyclerView.OnFlingListener
import kotlin.math.abs

open class RecyclerViewSwipeListener internal constructor(
    private val isScrollingVertically: Boolean,
    private val onSwipeListener: OnSwipeListener
) : OnFlingListener() {

    override fun onFling(velocityX: Int, velocityY: Int): Boolean {
        if (isScrollingVertically && abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
            if (velocityY < 0) {
                onSwipeListener.onSwipeDown()
            } else {
                onSwipeListener.onSwipeUp()
            }
            return true
        }
        return false
    }

    interface OnSwipeListener {
        fun onSwipeUp()

        fun onSwipeDown()
    }

    companion object {
        private const val SWIPE_VELOCITY_THRESHOLD = 1000
    }
}
