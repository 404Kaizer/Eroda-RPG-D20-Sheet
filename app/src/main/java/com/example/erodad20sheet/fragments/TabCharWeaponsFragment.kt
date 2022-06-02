package com.example.erodad20sheet.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.ItemsAddActivity
import com.example.erodad20sheet.R
import com.example.erodad20sheet.WeaponsAddActivity
import com.example.erodad20sheet.adapters.WeaponsAdapter
import com.example.erodad20sheet.models.WeaponsDataClass
import com.example.erodad20sheet.models.WeaponsDataObject
import kotlinx.android.synthetic.main.activity_items_add.*
import kotlinx.android.synthetic.main.activity_weapons_add.*
import kotlinx.android.synthetic.main.adapter_weapons.*
import kotlinx.android.synthetic.main.fragment_tab_char_weapons.view.*

class TabCharWeaponsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab_char_weapons, container, false)

        view.weapons_recycler.adapter = WeaponsAdapter(WeaponsDataObject.getAllData() as ArrayList<WeaponsDataClass>)
        view.weapons_recycler.layoutManager = LinearLayoutManager(view.context)
        view.add_weapon_fab.setOnClickListener {
            val intent = Intent(view.context, WeaponsAddActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    companion object {
        fun newInstance() = TabCharWeaponsFragment()
    }
}