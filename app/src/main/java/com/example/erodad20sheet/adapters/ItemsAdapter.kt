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
import com.example.erodad20sheet.models.ItemsDataClass
import com.example.erodad20sheet.models.ItemsDataObject
import kotlinx.android.synthetic.main.adapter_items.view.*

class ItemsAdapter(private val itemsList: ArrayList<ItemsDataClass>)
    : RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>() {

    class ItemsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var deleteItemBtn: ImageView = itemView.delete_item
        var itemQuantity: TextView = itemView.item_quantity
        var itemTitle: TextView = itemView.item_title
        var itemValue: TextView = itemView.item_value
        var itemDescription: TextView = itemView.item_description
        var listItemLayout: ConstraintLayout = itemView.items_container
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_items, parent, false)
        return ItemsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.itemQuantity.text = itemsList[position].quantity
        holder.itemTitle.text = itemsList[position].title
        holder.itemValue.text = itemsList[position].value
        holder.itemDescription.text = itemsList[position].description
        holder.listItemLayout.setOnClickListener {
            val intent = Intent(holder.itemView.context, ItemsAddActivity::class.java)
            intent.putExtra("Item_ID", position)
            holder.itemView.context.startActivity(intent)
        }
        holder.deleteItemBtn.setOnClickListener {
            val items = ItemsDataObject.itemsListData
            items.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, items.size)
        }
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}