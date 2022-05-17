package com.example.erodad20sheet.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.models.SpellsDataClass

class SpellsAdapter(private val spellsList: ArrayList<SpellsDataClass>)
    : RecyclerView.Adapter<SpellsAdapter.SpellsViewHolder>() {

        class SpellsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            private val titleTextView : TextView = itemView.findViewById(R.id.spells_title)
            private val typeTextView : TextView = itemView.findViewById(R.id.spells_type)
            private val lvlTextView : TextView = itemView.findViewById(R.id.spells_lvl)
            private val componentsTextView : TextView = itemView.findViewById(R.id.spells_components)
            private val executionTextView : TextView = itemView.findViewById(R.id.spells_execution)
            private val rangeTextView : TextView = itemView.findViewById(R.id.spells_range)
            private val durationTextView : TextView = itemView.findViewById(R.id.spells_duration)
            private val resistenceTextView : TextView = itemView.findViewById(R.id.spells_resistence)
            private val costsTextView : TextView = itemView.findViewById(R.id.spells_costs)
            private val descriptionTextView : TextView = itemView.findViewById(R.id.spells_description)
            private val buffsTextView : TextView = itemView.findViewById(R.id.spells_buffs)

            fun populateAdapter(spells: SpellsDataClass) {
                titleTextView.text = spells.title
                typeTextView.text = spells.type
                lvlTextView.text = spells.lvl
                componentsTextView.text = spells.components
                executionTextView.text = spells.execution
                rangeTextView.text = spells.range
                durationTextView.text = spells.duration
                resistenceTextView.text = spells.resistence
                costsTextView.text = spells.costs
                descriptionTextView.text = spells.description
                buffsTextView.text = spells.buffs
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpellsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_spells, parent, false)
        return SpellsViewHolder(view)
    }

    override fun onBindViewHolder(holder: SpellsViewHolder, position: Int) {
        holder.populateAdapter(spellsList[position])
    }

    override fun getItemCount(): Int {
        return spellsList.size
    }
}