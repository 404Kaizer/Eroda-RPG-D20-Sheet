package com.example.erodad20sheet.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapter.NotesAdapter
import com.example.erodad20sheet.model.NotesDataClass
import kotlinx.android.synthetic.main.adapter_notes.*

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

        val note1 = NotesDataClass("Primeira Nota", "Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum " +
                "Lorem Ipsum Lorem Ipsum")
        val note2 = NotesDataClass("Segunda Nota", "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum " +
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Ipsum Lorem Ipsum Ipsum")
        val note3 = NotesDataClass("Terceira Nota", "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum " +
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum " +
                "Lorem Ipsum Lorem Ipsum")
        val notesArrayList = arrayListOf(note1, note2, note3, note1, note2, note3, note1, note2, note3, note1, note2, note3,
            note1, note2, note3, note1, note2, note3, note1, note2, note3, note1, note2, note3, note1, note2, note3, note1, note2, note3,
            note1, note2, note3, note1, note2, note3, note1, note2, note3, note1, note2, note3, note1, note2, note3, note1, note2, note3)

        val notesRecyclerView = view.findViewById<RecyclerView>(R.id.notes_recycler)
        notesRecyclerView.layoutManager = LinearLayoutManager(view.context)
        notesRecyclerView.adapter = NotesAdapter(notesArrayList)
    }

    companion object {
        fun newInstance() = CharNotesFragment()
    }
}