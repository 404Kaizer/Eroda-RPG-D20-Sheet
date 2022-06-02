package com.example.erodad20sheet.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.erodad20sheet.R
import com.example.erodad20sheet.SpellsAddActivity
import com.example.erodad20sheet.adapters.SpellsAdapter
import com.example.erodad20sheet.models.SpellsDataClass
import com.example.erodad20sheet.models.SpellsDataObject
import kotlinx.android.synthetic.main.fragment_tab_char_spells.view.*

class TabCharSpellsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab_char_spells, container, false)

        view.spells_recycler.adapter = SpellsAdapter(SpellsDataObject.getAllData() as ArrayList<SpellsDataClass>)
        view.spells_recycler.layoutManager = LinearLayoutManager(view.context)
        view.add_spell_fab.setOnClickListener {
            val intent = Intent(view.context, SpellsAddActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    companion object {
        fun newInstance() = TabCharSpellsFragment()
    }
}