package com.example.erodad20sheet.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.models.SkillsDataClass

class SkillsAdapter(private val skillsList: ArrayList<SkillsDataClass>)
    : RecyclerView.Adapter<SkillsAdapter.SkillsViewHolder>() {

    class SkillsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val titleTextView : TextView = itemView.findViewById(R.id.skill_title)
        private val atributeTextView : TextView = itemView.findViewById(R.id.skill_atribute)
        private val valueTextView : TextView = itemView.findViewById(R.id.skill_value)

        fun populateAdapter(skills: SkillsDataClass) {
            titleTextView.text = skills.title
            atributeTextView.text = skills.atribute
            valueTextView.text = skills.value
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_skills, parent, false)
        return SkillsViewHolder(view)
    }

    override fun onBindViewHolder(holder: SkillsViewHolder, position: Int) {
        holder.populateAdapter(skillsList[position])
    }

    override fun getItemCount(): Int {
        return skillsList.size
    }
}