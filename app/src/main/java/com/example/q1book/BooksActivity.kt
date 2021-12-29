package com.example.q1book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)


        findViewById<CardView>(R.id.card1).setOnClickListener { navigate() }
        findViewById<CardView>(R.id.card2).setOnClickListener {  navigate()}
        findViewById<CardView>(R.id.card3).setOnClickListener {  navigate()}
    }

    private fun navigate()
    {
        val mIntent = Intent(this, ChapterActivity::class.java)
        startActivity(mIntent)
    }
}