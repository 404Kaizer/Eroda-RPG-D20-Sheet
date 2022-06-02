package com.example.erodad20sheet.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.WeaponsAddActivity
import com.example.erodad20sheet.models.WeaponsDataClass
import com.example.erodad20sheet.models.WeaponsDataObject
import kotlinx.android.synthetic.main.activity_weapons_add.view.*
import kotlinx.android.synthetic.main.adapter_weapons.view.*
import org.w3c.dom.Text

class WeaponsAdapter(private val weaponsList: ArrayList<WeaponsDataClass>)
    : RecyclerView.Adapter<WeaponsAdapter.WeaponsViewHolder>() {

        class WeaponsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var deleteWeaponBtn: ImageView = itemView.delete_weapon
            var weaponQuantity: TextView = itemView.weapon_quantity
            var weaponTitle: TextView = itemView.weapon_title
            var weaponType: TextView = itemView.weapon_type
            var weaponValue: TextView = itemView.weapon_value
            var weaponAmmunition: TextView = itemView.weapon_ammunition
            var weaponDamage: TextView = itemView.weapon_damage
            var weaponExecution: TextView = itemView.weapon_execution
            var weaponRange: TextView = itemView.weapon_range
            var weaponDescription: TextView = itemView.weapons_description
            var weaponProperties: TextView = itemView.weapon_properties
            var listWeaponLayout: ConstraintLayout = itemView.weapons_container
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeaponsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_weapons, parent, false)
        return WeaponsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WeaponsViewHolder, position: Int) {
        holder.weaponQuantity.text = weaponsList[position].quantity
        holder.weaponTitle.text = weaponsList[position].title
        holder.weaponType.text = weaponsList[position].type
        holder.weaponValue.text = weaponsList[position].value
        holder.weaponAmmunition.text = weaponsList[position].ammunition
        holder.weaponDamage.text = weaponsList[position].damage
        holder.weaponExecution.text = weaponsList[position].execution
        holder.weaponRange.text = weaponsList[position].range
        holder.weaponDescription.text = weaponsList[position].description
        holder.weaponProperties.text = weaponsList[position].properties
        holder.listWeaponLayout.setOnClickListener {
            val intent = Intent(holder.itemView.context, WeaponsAddActivity::class.java)
            intent.putExtra("Weapon_ID", position)
            holder.itemView.context.startActivity(intent)
        }
        holder.deleteWeaponBtn.setOnClickListener {
            val weapon = WeaponsDataObject.weaponsListData
            weapon.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, weapon.size)
        }
    }

    override fun getItemCount(): Int {
        return weaponsList.size
    }
}