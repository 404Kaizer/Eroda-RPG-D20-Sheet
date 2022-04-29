package com.example.erodad20sheet.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.erodad20sheet.CharacterSheetActivity
import com.example.erodad20sheet.NotesAddActivity
import com.example.erodad20sheet.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_notes_add.*
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

        add_note_fab.setOnClickListener {
            val intent = Intent(view.context, NotesAddActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        fun newInstance() = CharNotesFragment()
    }
}