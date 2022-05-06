package com.example.erodad20sheet.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.InventoryViewPagerAdapter
import com.example.erodad20sheet.adapters.StatsViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_char_inventory.*

class CharInventoryFragment : Fragment() {

    private lateinit var inventoryViewPager: ViewPager2
    private lateinit var inventoryTabLayout: TabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_char_inventory, container, false)

        inventoryTabLayout = view.findViewById(R.id.inventory_tab_nav)
        inventoryViewPager = view.findViewById(R.id.inventory_view_pager)
        val inventoryViewPagerAdapter = InventoryViewPagerAdapter(childFragmentManager, lifecycle)
        inventoryViewPager.adapter = inventoryViewPagerAdapter

        TabLayoutMediator(inventoryTabLayout, inventoryViewPager) { tab, position ->
            tab.text = inventoryViewPagerAdapter.getPageTitle(position)
        }.attach()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance() = CharInventoryFragment()
    }
}