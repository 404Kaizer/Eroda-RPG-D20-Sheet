package com.example.erodad20sheet.adapters

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.content.SharedPreferences
import android.provider.Settings.Global.getString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.CharacterSheetActivity
import com.example.erodad20sheet.R
import com.example.erodad20sheet.models.CharactersDataClass
import com.example.erodad20sheet.models.CharactersDataObject
import kotlinx.android.synthetic.main.adapter_characters.view.*


class CharactersAdapter(private val charactersList: ArrayList<CharactersDataClass>)
    : RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {

    class CharactersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var deleteCharBtn: ImageView = itemView.delete_character_btn
        var charPortrait: ImageView = itemView.character_portrait
        var charName: TextView = itemView.character_name
        var charRace: TextView = itemView.character_race
        var charOrigin: TextView = itemView.character_origin
        var charExp: TextView = itemView.character_lvl
        var listItemLayout: ConstraintLayout = itemView.characters_container
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersAdapter.CharactersViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_characters, parent, false)
        return CharactersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.charPortrait.setImageDrawable(charactersList[position].portrait)
        holder.charName.text = charactersList[position].name
        holder.charRace.text = charactersList[position].race
        holder.charOrigin.text = charactersList[position].origin
        holder.charExp.text = charactersList[position].exp
        holder.listItemLayout.setOnClickListener {
            val intent = Intent(holder.itemView.context, CharacterSheetActivity::class.java)
            intent.putExtra("ID", position)
            holder.itemView.context.startActivity(intent)
        }
        holder.deleteCharBtn.setOnClickListener {
            val items = CharactersDataObject.charactersListData
            items.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, items.size)
        }
    }

    override fun getItemCount(): Int {
        return charactersList.size
    }
}
