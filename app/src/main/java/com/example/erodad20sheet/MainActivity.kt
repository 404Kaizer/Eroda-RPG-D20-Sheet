package com.example.erodad20sheet

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.ImageViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.adapters.CharactersAdapter
import com.example.erodad20sheet.models.CharactersDataClass
import kotlinx.android.synthetic.main.activity_character_creation.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.adapter_characters.*
import kotlinx.android.synthetic.main.fragment_tab_char_perfil.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val character1 = CharactersDataClass(R.drawable.portrait_char1, "Hazard Lefou", "Tiefling", "Necromante", 5)
        val character2 = CharactersDataClass(R.drawable.portrait_char10, "Harzok", "Tiefling", "Bárbaro", 11)
        val character3 = CharactersDataClass(R.drawable.portrait_char11, "Sanin", "Humano", "Samurai", 3)
        val character4 = CharactersDataClass(R.drawable.portrait_char3, "Sombra", "Elfo", "Ladino", 9)
        val character5 = CharactersDataClass(R.drawable.portrait_char9, "Leonnard", "Gnomo", "Ladino", 15)
        val character6 = CharactersDataClass(R.drawable.portrait_char7, "Leon Ebonheart", "Humano", "Guerreiro", 13)
        val charactersArrayList = arrayListOf(character1, character2, character3, character4, character5, character6)
        val charactersRecyclerView = findViewById<RecyclerView>(R.id.char_list_recycler)
        charactersRecyclerView.layoutManager = LinearLayoutManager(this)
        charactersRecyclerView.adapter = CharactersAdapter(charactersArrayList)

        add_char_fab.setOnClickListener {
            startActivity(Intent(this, CharacterCreationActivity::class.java))
        }
    }
}