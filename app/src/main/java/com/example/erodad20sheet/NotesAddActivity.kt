package com.example.erodad20sheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_notes_add.*
import kotlinx.android.synthetic.main.activity_notes_add.return_home_btn

class NotesAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes_add)

        return_home_btn.setOnClickListener {
            val intent = Intent(this, CharacterSheetActivity::class.java)
            startActivity(intent)
        }

        save_list_item_float_btn.setOnClickListener {
            val intent = Intent(this, CharacterSheetActivity::class.java)
            startActivity(intent)
        }
    }
}