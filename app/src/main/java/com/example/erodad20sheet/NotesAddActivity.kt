package com.example.erodad20sheet

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_notes_add.*
import kotlinx.android.synthetic.main.activity_notes_add.return_home_btn

class NotesAddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes_add)

        changeNoteColor()

        return_home_btn.setOnClickListener {
            finish()
        }

        save_item_float_btn.setOnClickListener {
            finish()
        }
    }

    private fun changeNoteColor() {
        val turnRed = findViewById<View>(R.id.turn_red)
        val turnYellow = findViewById<View>(R.id.turn_yellow)
        val turnGreen = findViewById<View>(R.id.turn_green)
        val turnBlue = findViewById<View>(R.id.turn_blue)
        val turnPurple = findViewById<View>(R.id.turn_purple)
        val turnDark = findViewById<View>(R.id.turn_dark)

        turnRed.setOnClickListener {
            list_item_desc_entry.setBackgroundColor(Color.parseColor("red"))
            list_item_desc_entry.setTextColor(Color.parseColor("white"))
            list_item_desc_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_item_value_entry.setBackgroundColor(Color.parseColor("red"))
            list_item_value_entry.setTextColor(Color.parseColor("white"))
            list_item_value_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_item_title_entry.setBackgroundColor(Color.parseColor("red"))
            list_item_title_entry.setTextColor(Color.parseColor("white"))
            list_item_title_entry.setHintTextColor(Color.parseColor("#1A1B20"))
        }

        turnYellow.setOnClickListener {
            list_item_desc_entry.setBackgroundColor(Color.parseColor("yellow"))
            list_item_desc_entry.setTextColor(Color.parseColor("black"))
            list_item_desc_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_item_value_entry.setBackgroundColor(Color.parseColor("yellow"))
            list_item_value_entry.setTextColor(Color.parseColor("black"))
            list_item_value_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_item_title_entry.setBackgroundColor(Color.parseColor("yellow"))
            list_item_title_entry.setTextColor(Color.parseColor("black"))
            list_item_title_entry.setHintTextColor(Color.parseColor("#1A1B20"))
        }

        turnGreen.setOnClickListener {
            list_item_desc_entry.setBackgroundColor(Color.parseColor("green"))
            list_item_desc_entry.setTextColor(Color.parseColor("black"))
            list_item_desc_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_item_value_entry.setBackgroundColor(Color.parseColor("green"))
            list_item_value_entry.setTextColor(Color.parseColor("black"))
            list_item_value_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_item_title_entry.setBackgroundColor(Color.parseColor("green"))
            list_item_title_entry.setTextColor(Color.parseColor("black"))
            list_item_title_entry.setHintTextColor(Color.parseColor("#1A1B20"))
        }

        turnBlue.setOnClickListener {
            list_item_desc_entry.setBackgroundColor(Color.parseColor("blue"))
            list_item_desc_entry.setTextColor(Color.parseColor("white"))
            list_item_desc_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_item_value_entry.setBackgroundColor(Color.parseColor("blue"))
            list_item_desc_entry.setTextColor(Color.parseColor("white"))
            list_item_value_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_item_title_entry.setBackgroundColor(Color.parseColor("blue"))
            list_item_desc_entry.setTextColor(Color.parseColor("white"))
            list_item_title_entry.setHintTextColor(Color.parseColor("#1A1B20"))
        }

        turnPurple.setOnClickListener {
            list_item_desc_entry.setBackgroundColor(Color.parseColor("purple"))
            list_item_desc_entry.setTextColor(Color.parseColor("white"))
            list_item_desc_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_item_value_entry.setBackgroundColor(Color.parseColor("purple"))
            list_item_value_entry.setTextColor(Color.parseColor("white"))
            list_item_value_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_item_title_entry.setBackgroundColor(Color.parseColor("purple"))
            list_item_title_entry.setTextColor(Color.parseColor("white"))
            list_item_title_entry.setHintTextColor(Color.parseColor("#1A1B20"))
        }

        turnDark.setOnClickListener {
            list_item_desc_entry.setBackgroundColor(Color.parseColor("#131417"))
            list_item_desc_entry.setTextColor(Color.parseColor("white"))
            list_item_desc_entry.setHintTextColor(Color.parseColor("gray"))
            list_item_value_entry.setBackgroundColor(Color.parseColor("#131417"))
            list_item_value_entry.setTextColor(Color.parseColor("white"))
            list_item_value_entry.setHintTextColor(Color.parseColor("gray"))
            list_item_title_entry.setBackgroundColor(Color.parseColor("#131417"))
            list_item_title_entry.setTextColor(Color.parseColor("white"))
            list_item_title_entry.setHintTextColor(Color.parseColor("gray"))
        }
    }
}
