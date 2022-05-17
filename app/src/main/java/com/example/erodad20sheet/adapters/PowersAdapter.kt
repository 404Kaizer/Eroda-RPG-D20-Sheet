package com.example.erodad20sheet.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.models.PowersDataClass

class PowersAdapter(private val powersList: ArrayList<PowersDataClass>)
    : RecyclerView.Adapter<PowersAdapter.PowersViewHolder>() {

    class PowersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val titleTextView : TextView = itemView.findViewById(R.id.power_title)
        private val typeTextView : TextView = itemView.findViewById(R.id.power_type)
        private val costsTextView : TextView = itemView.findViewById(R.id.power_costs)
        private val descriptionTextView : TextView = itemView.findViewById(R.id.power_description)
        private val buffsTextView : TextView = itemView.findViewById(R.id.power_buffs)

        fun populateAdapter(powers: PowersDataClass) {
            titleTextView.text = powers.title
            typeTextView.text = powers.type
            costsTextView.text = powers.costs
            descriptionTextView.text = powers.description
            buffsTextView.text = powers.buffs
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PowersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_powers, parent, false)
        return PowersViewHolder(view)
    }

    override fun onBindViewHolder(holder: PowersViewHolder, position: Int) {
        holder.populateAdapter(powersList[position])
    }

    override fun getItemCount(): Int {
        return powersList.size
    }
}