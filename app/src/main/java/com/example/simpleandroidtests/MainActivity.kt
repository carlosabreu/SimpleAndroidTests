package com.example.simpleandroidtests

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val nextVisibility = getNextVisibility(textview.visibility)
            textview.visibility = nextVisibility
            button.text = getNextText(nextVisibility)
        }
    }

    private fun getNextVisibility(currentVisibility: Int): Int {
        return if (currentVisibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
    }

    private fun getNextText(nextVisibility: Int): String {
        return if (nextVisibility == View.VISIBLE) "Hide the text" else "Show text"
    }
}