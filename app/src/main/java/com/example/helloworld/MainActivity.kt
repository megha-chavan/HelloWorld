package com.example.helloworld

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnClick = findViewById<Button>(R.id.btnClick)
        btnClick.setOnClickListener {
            Toast.makeText(this, "Moved to next page",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, androidPageActivity::class.java))
        }
    }
}