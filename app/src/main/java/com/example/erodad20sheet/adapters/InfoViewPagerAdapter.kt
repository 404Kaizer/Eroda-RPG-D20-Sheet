package com.example.erodad20sheet.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.erodad20sheet.fragments.*

class InfoViewPagerAdapter(fragment: FragmentManager, lifecycle: Lifecycle)
    : FragmentStateAdapter(fragment, lifecycle) {

    private val fragmentsArray : Array<Fragment> = arrayOf(
        TabCharCaractsFragment(),
        TabCharBackstoryFragment())

    private val fragmentsTitleArray : ArrayList<String> = arrayListOf(
        "Características",
        "Background")

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