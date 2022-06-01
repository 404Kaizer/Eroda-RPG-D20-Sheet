package com.example.erodad20sheet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.erodad20sheet.adapters.CharactersAdapter
import com.example.erodad20sheet.fragments.CharPerfilFragment
import com.example.erodad20sheet.models.CharactersDataClass
import com.example.erodad20sheet.models.CharactersDataObject
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.adapter_characters.*
import kotlinx.android.synthetic.main.adapter_characters.view.*
import kotlinx.android.synthetic.main.adapter_items.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        char_list_recycler.adapter = CharactersAdapter(CharactersDataObject.getAllData() as ArrayList<CharactersDataClass>)
        char_list_recycler.layoutManager = LinearLayoutManager(this)
        add_char_fab.setOnClickListener {
            val intent = Intent(this, CharacterCreationActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        finish()
    }
}