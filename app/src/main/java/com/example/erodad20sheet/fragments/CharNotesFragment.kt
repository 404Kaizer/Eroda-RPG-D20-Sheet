package com.example.erodad20sheet.fragments

import android.content.Intent
import android.icu.text.CaseMap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.CharacterCreationActivity
import com.example.erodad20sheet.MainActivity
import com.example.erodad20sheet.NotesAddActivity
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.NotesAdapter
import com.example.erodad20sheet.models.NotesDataClass
import com.example.erodad20sheet.models.NotesDataObject
import com.example.erodad20sheet.models.PowersDataClass
import kotlinx.android.synthetic.main.activity_character_creation.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.adapter_notes.*
import kotlinx.android.synthetic.main.adapter_notes.view.*
import kotlinx.android.synthetic.main.fragment_char_notes.*
import kotlinx.android.synthetic.main.fragment_char_notes.view.*

class CharNotesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_char_notes, container, false)

        view.notes_recycler.adapter = NotesAdapter(NotesDataObject.getAllData() as ArrayList<NotesDataClass>)
        view.notes_recycler.layoutManager = LinearLayoutManager(view.context)

        view.add_note_fab.setOnClickListener {
            val intent = Intent(view.context, NotesAddActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



    companion object {
        fun newInstance() = CharNotesFragment()
    }
}