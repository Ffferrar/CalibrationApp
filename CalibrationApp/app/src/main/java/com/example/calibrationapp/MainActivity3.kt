package com.example.calibrationapp


import android.os.Bundle

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.calibrationapp.R
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface

class MainActivity3 : AppCompatActivity() {
    private var slidr: SlidrInterface? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        slidr = Slidr.attach(this)
    }

    fun lockSlide(v: View?) {
        slidr?.lock()
    }

    fun unlockSlide(v: View?) {
        slidr?.unlock()
    }
}