package com.example.erodad20sheet.adapters

import android.graphics.drawable.Drawable
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.models.CharactersDataClass
import kotlin.math.nextUp
import kotlin.random.Random

class CharactersAdapter(private val charactersList: ArrayList<CharactersDataClass>)
    : RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {

    class CharactersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val portraitList = mutableListOf(R.drawable.portrait_char1, R.drawable.portrait_char2, R.drawable.portrait_char3,
            R.drawable.portrait_char4, R.drawable.portrait_char5, R.drawable.portrait_char6, R.drawable.portrait_char7
            , R.drawable.portrait_char8, R.drawable.portrait_char9, R.drawable.portrait_char10, R.drawable.portrait_char11
            , R.drawable.portrait_char12)
        private val randomPortrait = portraitList.asSequence().shuffled().take(6).toList()

        private val portraitImageView = itemView.findViewById(R.id.character_portrait) as ImageView
        private val nameTextView = itemView.findViewById(R.id.character_name) as TextView
        private val raceTextView = itemView.findViewById(R.id.character_race) as TextView
        private val classTextView = itemView.findViewById(R.id.character_class) as TextView
        private val lvlTextView = itemView.findViewById(R.id.character_lvl) as TextView

        fun populateAdapter(characters: CharactersDataClass) {
            portraitImageView.setImageResource(randomPortrait.random())
            nameTextView.text = characters.name
            raceTextView.text = characters.race
            classTextView.text = characters.classes
            lvlTextView.text = characters.lvl.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_characters, parent, false)
        return CharactersViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.populateAdapter(charactersList[position])
    }

    override fun getItemCount(): Int {
        return charactersList.size
    }
}
