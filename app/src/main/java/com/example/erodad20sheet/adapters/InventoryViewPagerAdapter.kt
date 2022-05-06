package com.example.erodad20sheet.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.erodad20sheet.fragments.*

class InventoryViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragmentsArray : Array<Fragment> = arrayOf(
        TabCharBackpackFragment(),
        TabCharStoredItemsFragment()
    )

    private val fragmentsTitleArray : ArrayList<String> = arrayListOf(
        "Mochila",
        "Guardados"
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