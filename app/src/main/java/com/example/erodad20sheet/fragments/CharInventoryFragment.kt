package com.example.erodad20sheet.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.ItemsAdapter
import com.example.erodad20sheet.models.ItemsDataClass
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_char_inventory.*

class CharInventoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_char_inventory, container, false)

        val item1 = ItemsDataClass("5x", "Tochas", "5 Pratas", "Quando acesa ilumina 9 metros de raio.")
        val item2 = ItemsDataClass("1x", "Bag of Holding", "1000 Pratas", "Uma mochila quase infinita. Consegue suportar até 500kg.")
        val item3 = ItemsDataClass("1x", "Ampulheta", "25 Pratas", "Apenas conta o tempo.")
        val item4 = ItemsDataClass("1x", "Diário de Jane", "Nenhum", "Diário encontrado na casa abandonada de Jane.")
        val item5 = ItemsDataClass("1x", "Mapa de Leoni", "10 Pratas", "Mapa completo da cidade de Leoni, incluindo locais escondidos.")
        val item6 = ItemsDataClass("7x", "Orbes", "Desconhecido", "Um orbe estranho que emite uma forte luz azul.")
        val item7 = ItemsDataClass("1x", "Grimório de Frietz", "5000 Pratas", "Grimório perdido do Lich Frietz. Aqui há inúmeras magias que podem ser aprendidas.")
        val item8 = ItemsDataClass("1x", "Corda de Cânhamo", "20 Pratas", "Uma corda que se estende por 15 metros. Bastante durável, podendo ser utilizada 15 vezes até que se rompa.")
        val itemsArrayList = arrayListOf(item1, item2, item3, item4, item5, item6, item7, item8)
        val itemsRecyclerView = view.findViewById(R.id.items_recycler) as RecyclerView
        itemsRecyclerView.layoutManager = LinearLayoutManager(view.context)
        itemsRecyclerView.adapter = ItemsAdapter(itemsArrayList)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance() = CharInventoryFragment()
    }
}