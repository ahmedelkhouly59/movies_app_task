package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class movies_list_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movies_list2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val goBackButton = findViewById<Button>(R.id.btnGoBack1)
        goBackButton.setOnClickListener {
            finishAffinity()
        }
        val btnMoviesList = findViewById<Button>(R.id.btnViewMore1)
        btnMoviesList.setOnClickListener {
            val intent = Intent(this, movies_list::class.java)
            startActivity(intent)
        }
    }
}