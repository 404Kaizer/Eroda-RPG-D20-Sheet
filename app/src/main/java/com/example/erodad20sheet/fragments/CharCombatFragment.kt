package com.example.erodad20sheet.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.CombatViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class CharCombatFragment : Fragment() {

    private lateinit var combatViewPager: ViewPager2
    private lateinit var combatTabLayout: TabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_char_combat, container, false)

        combatTabLayout = view.findViewById(R.id.combat_tab_nav)
        combatViewPager = view.findViewById(R.id.combat_view_pager)
        val combatViewPagerAdapter = CombatViewPagerAdapter(childFragmentManager, lifecycle)
        combatViewPager.adapter = combatViewPagerAdapter

        TabLayoutMediator(combatTabLayout, combatViewPager) { tab, position ->
            tab.text = combatViewPagerAdapter.getPageTitle(position)
        }.attach()

        return view
    }

    companion object {
        fun newInstance() = CharCombatFragment()
    }
}