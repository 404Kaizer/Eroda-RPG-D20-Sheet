package com.example.erodad20sheet.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.SkillsAdapter
import com.example.erodad20sheet.models.SkillsDataClass

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

        val skill1 = SkillsDataClass("Poder", "(?)", "+0")
        val skill2 = SkillsDataClass("Luta", "(For)", "+0")
        val skill3 = SkillsDataClass("Pontaria", "(For)", "+0")
        val skill4 = SkillsDataClass("Fortitude", "(For)", "+0")
        val skill5 = SkillsDataClass("Reflexos", "(For)", "+0")
        val skill6 = SkillsDataClass("Vontade", "(For)", "+0")
        val skill7 = SkillsDataClass("Atletismo", "(For)", "+0")
        val skill8 = SkillsDataClass("Acrobacia", "(For)", "+0")
        val skill9 = SkillsDataClass("Furtividade", "(For)", "+0")
        val skill10 = SkillsDataClass("Ladinagem", "(For)", "+0")
        val skill11 = SkillsDataClass("Investigação", "(For)", "+0")
        val skill12 = SkillsDataClass("Conhecimento", "(For)", "+0")
        val skill13 = SkillsDataClass("Ocultismo", "(For)", "+0")
        val skill14 = SkillsDataClass("Religião", "(For)", "+0")
        val skill15 = SkillsDataClass("Medicina", "(For)", "+0")
        val skill16 = SkillsDataClass("Percepção", "(For)", "+0")
        val skill17 = SkillsDataClass("Intuição", "(For)", "+0")
        val skill18 = SkillsDataClass("P. Socorros", "(For)", "+0")
        val skill19 = SkillsDataClass("Sobrevivência", "(For)", "+0")
        val skill20 = SkillsDataClass("Atuação", "(For)", "+0")
        val skill21 = SkillsDataClass("Lábia", "(For)", "+0")
        val skill22 = SkillsDataClass("Enganação", "(For)", "+0")
        val skill23 = SkillsDataClass("Intimidação", "(For)", "+0")
        val skillsArrayList = arrayListOf(skill1, skill2, skill3, skill4, skill5, skill6, skill7, skill8, skill9, skill10, skill11,
            skill12, skill13, skill14, skill15, skill16, skill17, skill18, skill19, skill20, skill21, skill22, skill23)
        val skillsRecyclerView = view.findViewById(R.id.skills_recycler) as RecyclerView
        skillsRecyclerView.layoutManager = LinearLayoutManager(view.context)
        skillsRecyclerView.adapter = SkillsAdapter(skillsArrayList)

        return view
    }

    companion object {
        fun newInstance() = TabCharSkillsFragment()
    }
}