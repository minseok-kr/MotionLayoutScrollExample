package com.minseok.motionlayoutscrollexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // MotionLayout's progress is between 0F and 1F
        scrollView.viewTreeObserver.addOnScrollChangedListener {
            val realHeight = (scrollView.getChildAt(0).height) * scrollView.childCount
            layout.progress = scrollView.scrollY.toFloat() / (realHeight - scrollView.height)
        }
    }
}
