package com.esgi.android.exercices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val name = findViewById<TextView>(R.id.name)

        // TODO Changer cette ligne en fonction des layouts
        setContentView(R.layout.layout_detail)
        name.text = "Emmanuel"
    }
}