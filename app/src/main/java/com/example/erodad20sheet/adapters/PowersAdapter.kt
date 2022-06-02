package com.example.erodad20sheet.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.PowersAddActivity
import com.example.erodad20sheet.R
import com.example.erodad20sheet.models.PowersDataClass
import com.example.erodad20sheet.models.PowersDataObject
import kotlinx.android.synthetic.main.adapter_powers.view.*

class PowersAdapter(private val powersList: ArrayList<PowersDataClass>)
    : RecyclerView.Adapter<PowersAdapter.PowersViewHolder>() {

    class PowersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var deletePowerBtn: ImageView = itemView.delete_power
        var powerTitle: TextView = itemView.power_title
        var powerType: TextView = itemView.power_type
        var powerExecution: TextView = itemView.power_execution
        var powerCosts: TextView = itemView.power_costs
        var powerDescription: TextView = itemView.power_description
        var powerBuffs: TextView = itemView.power_buffs
        var listPowerLayout: ConstraintLayout = itemView.powers_container
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PowersViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_powers, parent, false)
        return PowersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PowersViewHolder, position: Int) {
        holder.powerTitle.text = powersList[position].title
        holder.powerType.text = powersList[position].type
        holder.powerExecution.text = powersList[position].execution
        holder.powerCosts.text = powersList[position].costs
        holder.powerDescription.text = powersList[position].description
        holder.powerBuffs.text = powersList[position].buffs
        holder.listPowerLayout.setOnClickListener {
            val intent = Intent(holder.itemView.context, PowersAddActivity::class.java)
            intent.putExtra("Power_ID", position)
            holder.itemView.context.startActivity(intent)
        }
        holder.deletePowerBtn.setOnClickListener {
            val powers = PowersDataObject.powersListData
            powers.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, powers.size)
        }
    }

    override fun getItemCount(): Int {
        return powersList.size
    }
}