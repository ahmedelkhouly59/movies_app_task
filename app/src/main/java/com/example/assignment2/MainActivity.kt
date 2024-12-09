package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnMoviesList = findViewById<Button>(R.id.signInButton)
        val etPassword = findViewById<EditText>(R.id.passwordInput)
        val etUsername = findViewById<EditText>(R.id.usernameInput)

        btnMoviesList.setOnClickListener {
            val password = etPassword.text.toString()
            val username = etUsername.text.toString()

            if ((password.length >= 8) and (username.length >= 1) and (password.any { it.isLetter() } && password.any { it.isDigit() })) {
                val intent = Intent(this, movies_list::class.java)
                startActivity(intent)            }

        }
    }
}