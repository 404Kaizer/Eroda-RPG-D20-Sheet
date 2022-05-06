package com.example.erodad20sheet.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.erodad20sheet.fragments.TabCharAtributesFragment
import com.example.erodad20sheet.fragments.TabCharSkillsFragment
import com.example.erodad20sheet.fragments.TabCharStatusFragment

class StatsViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragmentsArray : Array<Fragment> = arrayOf(
        TabCharStatusFragment(),
        TabCharAtributesFragment(),
        TabCharSkillsFragment()
    )

    private val fragmentsTitleArray : ArrayList<String> = arrayListOf(
        "Status",
        "Atributos",
        "Perícias"
    )

    override fun getItemCount(): Int {
        return fragmentsArray.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentsArray[position]
    }

    fun getPageTitle(position : Int) : String{
        return fragmentsTitleArray[position]
    }
}