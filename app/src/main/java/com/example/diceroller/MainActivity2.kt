package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme) // Make sure this is a descendant of Theme.AppCompat
        setContentView(R.layout.activity_main2)
        // other initialization code
    }
}
