package com.example.q1book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class ReadBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_book)



        val textView = findViewById<TextView>(R.id.textView)
        var text = " ";

        try {
            val stream = assets.open("textfile.txt");
            val reader = BufferedReader(InputStreamReader(stream))
            text = reader.readText()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        textView.text = text


        val searchText = findViewById<EditText>(R.id.searchInput)

        findViewById<Button>(R.id.btnSearch).setOnClickListener {

            val textToHighlight = searchText.text.toString()
            val replaceWith =
                "<span style='background-color:yellow'>" + textToHighlight + "</span>"

            val modifiedText = text.replace(textToHighlight, replaceWith)
            textView.text = Html.fromHtml(modifiedText)
        }
    }
}