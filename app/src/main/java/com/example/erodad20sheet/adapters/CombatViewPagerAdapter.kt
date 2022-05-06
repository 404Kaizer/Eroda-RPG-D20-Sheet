package com.example.erodad20sheet.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.erodad20sheet.fragments.TabCharPowersFragment
import com.example.erodad20sheet.fragments.TabCharSpellsFragment
import com.example.erodad20sheet.fragments.TabCharWeaponsFragment

class CombatViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragmentsArray : Array<Fragment> = arrayOf(
        TabCharPowersFragment(),
        TabCharWeaponsFragment(),
        TabCharSpellsFragment()
    )

    private val fragmentsTitleArray : ArrayList<String> = arrayListOf(
        "Habilidades",
        "Armas",
        "Magias"
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