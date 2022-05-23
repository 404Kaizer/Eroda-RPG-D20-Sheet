package com.example.erodad20sheet.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.models.WeaponsDataClass

class WeaponsAdapter(private val weaponsList: ArrayList<WeaponsDataClass>)
    : RecyclerView.Adapter<WeaponsAdapter.WeaponsViewHolder>() {

        class WeaponsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val quantityTextView : TextView = itemView.findViewById(R.id.weapon_quantity)
            private val titleTextView : TextView = itemView.findViewById(R.id.weapon_title)
            private val typeTextView : TextView = itemView.findViewById(R.id.weapon_type)
            private val ammunitionTextView : TextView = itemView.findViewById(R.id.weapon_ammunition)
            private val damageTextView : TextView = itemView.findViewById(R.id.weapon_damage)
            private val executionTextView : TextView = itemView.findViewById(R.id.weapon_execution)
            private val rangeTextView : TextView = itemView.findViewById(R.id.weapon_range)
            private val descriptionTextView : TextView = itemView.findViewById(R.id.weapon_description)
            private val propertiesTextView : TextView = itemView.findViewById(R.id.weapon_properties)

            fun populateAdapter(weapons: WeaponsDataClass) {
                quantityTextView.text = weapons.quantity
                titleTextView.text = weapons.title
                typeTextView.text = weapons.type
                ammunitionTextView.text = weapons.ammunition
                damageTextView.text = weapons.damage
                executionTextView.text = weapons.execution
                rangeTextView.text = weapons.range
                descriptionTextView.text = weapons.description
                propertiesTextView.text = weapons.properties
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeaponsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_weapons, parent, false)
        return WeaponsViewHolder(view)
    }

    override fun onBindViewHolder(holder: WeaponsViewHolder, position: Int) {
        holder.populateAdapter(weaponsList[position])
    }

    override fun getItemCount(): Int {
        return weaponsList.size
    }
}