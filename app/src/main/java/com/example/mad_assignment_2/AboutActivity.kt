package com.example.mad_assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        setContentView(R.layout.activity_about)

        supportActionBar?.title = "About"
        val aboutText :TextView = findViewById(R.id.aboutText)
        aboutText.text = aboutText()
    }
    private fun aboutText(): String{
        return "\nProvide Feedback."
    }
}