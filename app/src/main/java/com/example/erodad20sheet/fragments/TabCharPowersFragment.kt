package com.example.erodad20sheet.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.PowersAdapter
import com.example.erodad20sheet.models.PowersDataClass

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

        val power = PowersDataClass("Título", "Lorem Ipsum Dolor Imet Penis")
        val powersArrayList = arrayListOf(power, power, power, power, power, power, power, power, power, power, power,
            power, power, power, power, power, power, power, power, power, power, power, power, power, power, power)
        val powersRecyclerView = view.findViewById(R.id.powers_recycler) as RecyclerView
        powersRecyclerView.layoutManager = LinearLayoutManager(view.context)
        powersRecyclerView.adapter = PowersAdapter(powersArrayList)

        return view
    }

    companion object {
        fun newInstance() = TabCharPowersFragment()
    }
}