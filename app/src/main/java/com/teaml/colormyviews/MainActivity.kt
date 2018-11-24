package com.teaml.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews = listOf(
            box_one_text, box_two_text, box_three_text,
            box_four_text, box_five_text, rootView,
            red_button, blue_button, green_button
        )

        for (view in clickableViews) {
            view.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_purple)

            R.id.red_button -> box_three_text.setBackgroundColor(Color.RED)
            R.id.green_button -> box_four_text.setBackgroundColor(Color.GREEN)
            R.id.blue_button -> box_five_text.setBackgroundColor(Color.BLUE)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
