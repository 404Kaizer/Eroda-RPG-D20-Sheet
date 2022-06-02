package com.example.erodad20sheet.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.SkillsAddActivity
import com.example.erodad20sheet.models.SkillsDataClass
import kotlinx.android.synthetic.main.adapter_skills.view.*

class SkillsAdapter(private val skillsList: ArrayList<SkillsDataClass>)
    : RecyclerView.Adapter<SkillsAdapter.SkillsViewHolder>() {

    class SkillsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var increaseSkillValue: ImageView = itemView.increase_skill_value
        var decreaseSkillValue: ImageView = itemView.decrease_skill_value
        var skillCheckbox: CheckBox = itemView.skill_check
        var skillTitle: TextView = itemView.skill_title
        var skillAtribute: TextView = itemView.skill_atribute
        var skillValue: TextView = itemView.skill_value
        var listSkillLayout: ConstraintLayout = itemView.skills_container
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_skills, parent, false)
        return SkillsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SkillsViewHolder, position: Int) {
        holder.skillCheckbox.isChecked = skillsList[position].checkbox
        holder.skillTitle.text = skillsList[position].title
        holder.skillAtribute.text = skillsList[position].atribute
        holder.skillValue.text = skillsList[position].value
        holder.listSkillLayout.setOnClickListener {
            val intent = Intent(holder.itemView.context, SkillsAddActivity::class.java)
            intent.putExtra("Skill_ID", position)
            holder.itemView.context.startActivity(intent)
        }
        holder.increaseSkillValue.setOnClickListener {
            var value = holder.skillValue.text.toString().toInt()
            value++
            holder.skillValue.text = value.toString()
        }
        holder.decreaseSkillValue.setOnClickListener {
            var value = holder.skillValue.text.toString().toInt()
            value--
            holder.skillValue.text = value.toString()
        }
    }

    override fun getItemCount(): Int {
        return skillsList.size
    }
}