package com.example.erodad20sheet

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.erodad20sheet.models.NotesDataObject
import kotlinx.android.synthetic.main.activity_notes_add.*

class NotesAddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes_add)

        changeNoteColor()

        notes_return_home_btn.setOnClickListener {
            finish()
        }

        save_note_float_btn.setOnClickListener {
            if(list_note_title_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_note_priority_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_note_desc_entry.text.toString().trim{it <= ' '}.isNotEmpty()) {

                var setNoteTitle = list_note_title_entry.text.toString()
                var setNotePriority = list_note_priority_entry.text.toString()
                var setNoteDescription = list_note_desc_entry.text.toString()

                NotesDataObject.setData(setNoteTitle, setNotePriority, setNoteDescription)
                val intent = Intent(this, CharacterSheetActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                finish()
            }
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
            list_note_desc_entry.setBackgroundColor(Color.parseColor("red"))
            list_note_desc_entry.setTextColor(Color.parseColor("white"))
            list_note_desc_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_note_priority_entry.setBackgroundColor(Color.parseColor("red"))
            list_note_priority_entry.setTextColor(Color.parseColor("white"))
            list_note_priority_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_note_title_entry.setBackgroundColor(Color.parseColor("red"))
            list_note_title_entry.setTextColor(Color.parseColor("white"))
            list_note_title_entry.setHintTextColor(Color.parseColor("#1A1B20"))
        }

        turnYellow.setOnClickListener {
            list_note_desc_entry.setBackgroundColor(Color.parseColor("yellow"))
            list_note_desc_entry.setTextColor(Color.parseColor("black"))
            list_note_desc_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_note_priority_entry.setBackgroundColor(Color.parseColor("yellow"))
            list_note_priority_entry.setTextColor(Color.parseColor("black"))
            list_note_priority_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_note_title_entry.setBackgroundColor(Color.parseColor("yellow"))
            list_note_title_entry.setTextColor(Color.parseColor("black"))
            list_note_title_entry.setHintTextColor(Color.parseColor("#1A1B20"))
        }

        turnGreen.setOnClickListener {
            list_note_desc_entry.setBackgroundColor(Color.parseColor("green"))
            list_note_desc_entry.setTextColor(Color.parseColor("black"))
            list_note_desc_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_note_priority_entry.setBackgroundColor(Color.parseColor("green"))
            list_note_priority_entry.setTextColor(Color.parseColor("black"))
            list_note_priority_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_note_title_entry.setBackgroundColor(Color.parseColor("green"))
            list_note_title_entry.setTextColor(Color.parseColor("black"))
            list_note_title_entry.setHintTextColor(Color.parseColor("#1A1B20"))
        }

        turnBlue.setOnClickListener {
            list_note_desc_entry.setBackgroundColor(Color.parseColor("blue"))
            list_note_desc_entry.setTextColor(Color.parseColor("white"))
            list_note_desc_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_note_priority_entry.setBackgroundColor(Color.parseColor("blue"))
            list_note_priority_entry.setTextColor(Color.parseColor("white"))
            list_note_priority_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_note_title_entry.setBackgroundColor(Color.parseColor("blue"))
            list_note_title_entry.setTextColor(Color.parseColor("white"))
            list_note_title_entry.setHintTextColor(Color.parseColor("#1A1B20"))
        }

        turnPurple.setOnClickListener {
            list_note_desc_entry.setBackgroundColor(Color.parseColor("purple"))
            list_note_desc_entry.setTextColor(Color.parseColor("white"))
            list_note_desc_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_note_priority_entry.setBackgroundColor(Color.parseColor("purple"))
            list_note_priority_entry.setTextColor(Color.parseColor("white"))
            list_note_priority_entry.setHintTextColor(Color.parseColor("#1A1B20"))
            list_note_title_entry.setBackgroundColor(Color.parseColor("purple"))
            list_note_title_entry.setTextColor(Color.parseColor("white"))
            list_note_title_entry.setHintTextColor(Color.parseColor("#1A1B20"))
        }

        turnDark.setOnClickListener {
            list_note_desc_entry.setBackgroundColor(Color.parseColor("#131417"))
            list_note_desc_entry.setTextColor(Color.parseColor("white"))
            list_note_desc_entry.setHintTextColor(Color.parseColor("gray"))
            list_note_priority_entry.setBackgroundColor(Color.parseColor("#131417"))
            list_note_priority_entry.setTextColor(Color.parseColor("white"))
            list_note_priority_entry.setHintTextColor(Color.parseColor("gray"))
            list_note_title_entry.setBackgroundColor(Color.parseColor("#131417"))
            list_note_title_entry.setTextColor(Color.parseColor("white"))
            list_note_title_entry.setHintTextColor(Color.parseColor("gray"))
        }
    }
}
