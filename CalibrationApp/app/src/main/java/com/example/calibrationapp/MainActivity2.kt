package com.example.calibrationapp

import com.example.calibrationapp.R
import android.content.Intent
import android.os.Bundle

import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun openActivity3(v: View?) {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
}