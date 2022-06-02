package com.example.erodad20sheet.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.ItemsAddActivity
import com.example.erodad20sheet.R
import com.example.erodad20sheet.SpellsAddActivity
import com.example.erodad20sheet.models.ItemsDataObject
import com.example.erodad20sheet.models.SpellsDataClass
import com.example.erodad20sheet.models.SpellsDataObject
import kotlinx.android.synthetic.main.adapter_spells.view.*

class SpellsAdapter(private val spellsList: ArrayList<SpellsDataClass>)
    : RecyclerView.Adapter<SpellsAdapter.SpellsViewHolder>() {

        class SpellsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var deleteSpellBtn: ImageView = itemView.delete_spells
            var spellsTitle: TextView = itemView.spells_title
            var spellsType: TextView = itemView.spells_type
            var spellsLvl: TextView = itemView.spells_lvl
            var spellsComponents: TextView = itemView.spells_components
            var spellsExecution: TextView = itemView.spells_execution
            var spellsRange: TextView = itemView.spells_range
            var spellsDuration: TextView = itemView.spells_duration
            var spellsResistence: TextView = itemView.spells_resistence
            var spellsCosts: TextView = itemView.spells_costs
            var spellsDescription: TextView = itemView.spells_description
            var spellsBuffs: TextView = itemView.spells_buffs
            var listSpellLayout: ConstraintLayout = itemView.spells_container
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpellsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_spells, parent, false)
        return SpellsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SpellsViewHolder, position: Int) {
        holder.spellsTitle.text = spellsList[position].title
        holder.spellsType.text = spellsList[position].type
        holder.spellsLvl.text = spellsList[position].lvl
        holder.spellsComponents.text = spellsList[position].components
        holder.spellsExecution.text = spellsList[position].execution
        holder.spellsRange.text = spellsList[position].range
        holder.spellsDuration.text = spellsList[position].duration
        holder.spellsResistence.text = spellsList[position].resistence
        holder.spellsCosts.text = spellsList[position].costs
        holder.spellsDescription.text = spellsList[position].description
        holder.spellsBuffs.text = spellsList[position].buffs
        holder.listSpellLayout.setOnClickListener {
            val intent = Intent(holder.itemView.context, SpellsAddActivity::class.java)
            intent.putExtra("Item_ID", position)
            holder.itemView.context.startActivity(intent)
        }
        holder.deleteSpellBtn.setOnClickListener {
            val items = SpellsDataObject.spellsListData
            items.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, items.size)
        }
    }

    override fun getItemCount(): Int {
        return spellsList.size
    }
}