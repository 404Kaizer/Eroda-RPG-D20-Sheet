package com.example.erodad20sheet.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.erodad20sheet.ItemsAddActivity
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.ItemsAdapter
import com.example.erodad20sheet.models.ItemsDataClass
import com.example.erodad20sheet.models.ItemsDataObject
import kotlinx.android.synthetic.main.adapter_items.*
import kotlinx.android.synthetic.main.adapter_items.view.*
import kotlinx.android.synthetic.main.fragment_char_inventory.view.*

class CharInventoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_char_inventory, container, false)

        view.items_recycler.adapter = ItemsAdapter(ItemsDataObject.getAllData() as ArrayList<ItemsDataClass>)
        view.items_recycler.layoutManager = LinearLayoutManager(view.context)
        view.add_item_fab.setOnClickListener {
            val intent = Intent(view.context, ItemsAddActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {
        fun newInstance() = CharInventoryFragment()
    }
}