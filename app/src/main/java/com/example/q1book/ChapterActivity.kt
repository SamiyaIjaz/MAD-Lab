package com.example.q1book

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class ChapterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter)

        findViewById<CardView>(R.id.chapterCard1).setOnClickListener { navigate() }
        findViewById<CardView>(R.id.chapterCard2).setOnClickListener { navigate() }
        findViewById<CardView>(R.id.chapterCard3).setOnClickListener { navigate() }
        findViewById<CardView>(R.id.chapterCard4).setOnClickListener { navigate() }
        findViewById<CardView>(R.id.chapterCard5).setOnClickListener { navigate() }
    }

    private fun navigate() {
        val mIntent = Intent(this, ReadBookActivity::class.java)
        startActivity(mIntent)
    }
}