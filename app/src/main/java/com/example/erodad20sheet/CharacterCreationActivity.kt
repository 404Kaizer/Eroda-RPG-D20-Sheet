package com.example.erodad20sheet

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.erodad20sheet.models.CharactersDataObject
import kotlinx.android.synthetic.main.activity_character_creation.*

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

        create_new_char_float_btn.setOnClickListener {
            if(selectedImgView.drawable != null
                && char_name_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && char_exp_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && char_race_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && char_origin_entry.text.toString().trim{it <= ' '}.isNotEmpty()) {

                var setCharPortrait = selectedImgView.drawable
                var setCharName = char_name_entry.text.toString()
                var setCharRace = char_race_entry.text.toString()
                var setCharOrigin = char_origin_entry.text.toString()
                var setCharExp = char_exp_entry.text.toString()

                CharactersDataObject.setData(setCharPortrait, setCharName, setCharRace, setCharOrigin, setCharExp)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                if(selectedImgView.drawable == null) {
                    Toast.makeText(this, "Selecione Uma Imagem Antes de Continuar", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Preencha os Campos Necessários * Antes de Continuar", Toast.LENGTH_LONG).show()
                }
            }
        }

        char_creation_return_home_btn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
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

    override fun onBackPressed() {
        finish()
    }
}