package com.example.erodad20sheet.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.StatsViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class CharStatsFragment : Fragment() {

    private lateinit var statsViewPager: ViewPager2
    private lateinit var statsTabLayout: TabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_char_stats, container, false)

        statsTabLayout = view.findViewById(R.id.stats_tab_nav)
        statsViewPager = view.findViewById(R.id.stats_view_pager)
        val statsViewPagerAdapter = StatsViewPagerAdapter(childFragmentManager, lifecycle)
        statsViewPager.adapter = statsViewPagerAdapter

        TabLayoutMediator(statsTabLayout, statsViewPager) {tab, position ->
            tab.text = statsViewPagerAdapter.getPageTitle(position)
        }.attach()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}