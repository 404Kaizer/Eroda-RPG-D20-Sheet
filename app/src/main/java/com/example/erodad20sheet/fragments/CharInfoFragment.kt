package com.example.erodad20sheet.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.InfoViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.jaredrummler.materialspinner.MaterialSpinner
import kotlinx.android.synthetic.main.fragment_char_info.*


class CharInfoFragment : Fragment() {

    private lateinit var infoViewPager: ViewPager2
    private lateinit var infoTabLayout: TabLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_char_info, container, false)

        infoTabLayout = view.findViewById(R.id.info_tab_nav)
        infoViewPager = view.findViewById(R.id.info_view_pager)
        val infoViewPagerAdapter = InfoViewPagerAdapter(childFragmentManager, lifecycle)
        infoViewPager.adapter = infoViewPagerAdapter

        TabLayoutMediator(infoTabLayout, infoViewPager) {tab, position ->
            tab.text = infoViewPagerAdapter.getPageTitle(position)
        }.attach()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
