package com.example.q1book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnBoook)
            .setOnClickListener {
                val mIntent = Intent(this, BooksActivity::class.java)
                startActivity(mIntent)
            }
    }
}