package com.example.erodad20sheet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.adapters.CharactersAdapter
import com.example.erodad20sheet.models.CharactersDataClass
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.adapter_characters.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val character = CharactersDataClass("Hazard Lefou", "Tiefling", "Necromante", 20)
        val charactersArrayList = arrayListOf(character, character, character, character, character)
        val charactersRecyclerView = findViewById<RecyclerView>(R.id.char_list_recycler)
        charactersRecyclerView.layoutManager = LinearLayoutManager(this)
        charactersRecyclerView.adapter = CharactersAdapter(charactersArrayList)

        add_char_fab.setOnClickListener {
            startActivity(Intent(this, CharacterSheetActivity::class.java))
        }
    }
}