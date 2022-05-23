package com.example.erodad20sheet.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.WeaponsAdapter
import com.example.erodad20sheet.models.WeaponsDataClass

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

        val weapon1 = WeaponsDataClass("1x", "Espada Longa", "Arma Marcial", "Nenhuma", "1d8 físico", "1 Ação", "1,5 metros",
            "Espada dada pelo rei Robert IV", "Versátil (1d10)")
        val weapon2 = WeaponsDataClass("2x", "Faca Média", "Arma Comum", "Nenhuma", "1d4 + 2 físico", "1 Ação", "1,5 metros",
            "Nenhuma", "Acuidade, arremesso (6/18m), leve")
        val weapon3 = WeaponsDataClass("2x", "Corrente Laminada", "Arma Exótica", "Nenhuma", "1d6 + 3 físico", "1 Ação", "3 metros",
            "Pode ser usada a até 3 metros de distância", "Acuidade, extensão")
        val weapon4 = WeaponsDataClass("2x", "Soco Inglês de Chamas", "Arma Comum", "Nenhuma", "1d4 físico + 3 de fogo", "1 Ação", "1,5 metros",
            "Soco inglês com compartimentos que expelem chamas ao acertar o alvo", "Leve")
        val weapon5 = WeaponsDataClass("1x", "Pistola de Combate", "Arma de Fogo", "8x", "1d8 físico", "1 (3) por turno", "Alcance Médio",
            "Nenhuma", "8x munições por pente")
        val weaponsArrayList = arrayListOf(weapon1, weapon2, weapon3, weapon4, weapon5)
        val weaponsRecyclerView = view.findViewById(R.id.weapons_recycler) as RecyclerView
        weaponsRecyclerView.layoutManager = LinearLayoutManager(view.context)
        weaponsRecyclerView.adapter = WeaponsAdapter(weaponsArrayList)

        return view
    }

    companion object {
        fun newInstance() = TabCharWeaponsFragment()
    }
}