package com.example.erodad20sheet.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.SkillsAddActivity
import com.example.erodad20sheet.adapters.SkillsAdapter
import com.example.erodad20sheet.models.SkillsDataClass
import com.example.erodad20sheet.models.SkillsDataObject
import kotlinx.android.synthetic.main.fragment_tab_char_skills.view.*

class TabCharSkillsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab_char_skills, container, false)

        view.skills_recycler.adapter = SkillsAdapter(SkillsDataObject.getAllData() as ArrayList<SkillsDataClass>)
        view.skills_recycler.layoutManager = LinearLayoutManager(view.context)
        view.add_skill_fab.setOnClickListener {
            val intent = Intent(view.context, SkillsAddActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    companion object {
        fun newInstance() = TabCharSkillsFragment()
    }
}