package com.example.erodad20sheet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_character_creation.*
import kotlinx.android.synthetic.main.activity_character_sheet.return_home_btn

class CharacterCreationActivity : AppCompatActivity() {

    private lateinit var selectImgBtn: Button
    private lateinit var selectedImgView: ImageView

    companion object {
        const val IMAGE_REQUEST_CODE = 1_000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_creation)

        selectImgBtn = findViewById(R.id.select_char_img)
        selectedImgView = findViewById(R.id.selected_char_img)

        selectImgBtn.setOnClickListener {
            pickImageFromGallery()
        }

        return_home_btn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        create_new_char_float_btn.setOnClickListener {
            startActivity(Intent(this, CharacterSheetActivity::class.java))
        }
    }

    private fun pickImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK) {
            selectedImgView.setImageURI(data?.data)
        }
    }
}