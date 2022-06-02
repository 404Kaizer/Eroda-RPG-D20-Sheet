package com.example.erodad20sheet.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.erodad20sheet.PowersAddActivity
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.PowersAdapter
import com.example.erodad20sheet.models.PowersDataClass
import com.example.erodad20sheet.models.PowersDataObject
import kotlinx.android.synthetic.main.fragment_tab_char_powers.view.*

class TabCharPowersFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab_char_powers, container, false)

        view.powers_recycler.adapter = PowersAdapter(PowersDataObject.getAllData() as ArrayList<PowersDataClass>)
        view.powers_recycler.layoutManager = LinearLayoutManager(view.context)
        view.add_power_fab.setOnClickListener {
            val intent = Intent(view.context, PowersAddActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    companion object {
        fun newInstance() = TabCharPowersFragment()
    }
}