package com.example.erodad20sheet.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.models.ItemsDataClass

class ItemsAdapter(private val itemsList: ArrayList<ItemsDataClass>)
    : RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>() {

    class ItemsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val quantityTextView: TextView = itemView.findViewById(R.id.item_quantity)
        private val titleTextView: TextView = itemView.findViewById(R.id.item_title)
        private val valueTextView: TextView = itemView.findViewById(R.id.item_value)
        private val descriptionTextView: TextView = itemView.findViewById(R.id.item_description)

        fun populateAdapter(items: ItemsDataClass) {
            quantityTextView.text = items.quantity
            titleTextView.text = items.title
            valueTextView.text = items.value
            descriptionTextView.text = items.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_items, parent, false)
        return ItemsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.populateAdapter(itemsList[position])
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}