package com.example.erodad20sheet.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.NotesAddActivity
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.NotesAdapter
import com.example.erodad20sheet.models.NotesDataClass
import kotlinx.android.synthetic.main.adapter_notes.*
import kotlinx.android.synthetic.main.fragment_char_notes.*

class CharNotesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_char_notes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val note = NotesDataClass("Titulo", "Lorem ipsum dolor enet manituo")
        val notesArrayList = arrayListOf(note, note, note, note, note, note, note, note, note, note, note, note, note, note,
            note, note, note, note, note, note, note, note, note, note, note, note, note, note, note, note, note, note)
        val notesRecyclerView = view.findViewById(R.id.notes_recycler) as RecyclerView
        notesRecyclerView.layoutManager = LinearLayoutManager(view.context)
        notesRecyclerView.adapter = NotesAdapter(notesArrayList)

        add_note_fab.setOnClickListener {
            val intent = Intent(view.context, NotesAddActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        fun newInstance() = CharNotesFragment()
    }
}