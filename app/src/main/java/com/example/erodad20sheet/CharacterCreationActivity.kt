package com.example.erodad20sheet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_character_creation.*
import kotlinx.android.synthetic.main.activity_character_sheet.return_home_btn

class CharacterCreationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_creation)

        return_home_btn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        create_new_char_float_btn.setOnClickListener {
            startActivity(Intent(this, CharacterSheetActivity::class.java))
        }
    }
}