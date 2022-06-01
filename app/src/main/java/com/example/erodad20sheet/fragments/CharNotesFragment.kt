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
import com.example.erodad20sheet.NotesAddActivity
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.NotesAdapter
import com.example.erodad20sheet.models.NotesDataClass
import com.example.erodad20sheet.models.PowersDataClass
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
        val view = inflater.inflate(R.layout.fragment_char_notes, container, false)

        val note1  = NotesDataClass("Ellena", "Principal", "Encontrar Ellena Hart.")
        val note2  = NotesDataClass("Pérola Negra", "Secundária", "Encontrar navio perdido.")
        val note3  = NotesDataClass("Esmeralda", "Secundária", "Recuperar esmeralda roubada.")
        val note4  = NotesDataClass("Taverna Bode Resfriado", "Principal", "Encontrar Perry Lenin na taverna Bode Resfriado.")
        val note5  = NotesDataClass("Jerry Klint", "Secundária", "Encontrar e matar Jerry Klint na cidade de Pallet.")
        val note6  = NotesDataClass("Chave da Casa Abandonada", "Principal", "A chave se encontra enterrada no cemitério de Pallet.")
        val note7  = NotesDataClass("Guarda Corrupta", "Secundária", "O chefe da guarda é corrupto e ajuda a mafia da cidade.")
        val note8  = NotesDataClass("Vaso Quebrado", "Lembrete", "Deixamos cair um vaso enquanto invadiamos a casa de Lillian. Vai dar merda.")
        val note9  = NotesDataClass("Invasão a Cidadela", "Lembrete", "Temos que invadir a cidadela para resgatar Ronny, nosso aliado.")
        val note10 = NotesDataClass("Arrombar Portão", "Lembrete Importante", "O portão está trancado e não se sabe onde está a chave. Provavelmente vamos arrombar.")
        val notesArrayList = arrayListOf(note1, note2, note3, note4, note5, note6, note7, note8, note9, note10)
        val notesRecyclerView = view.findViewById(R.id.notes_recycler) as RecyclerView
        notesRecyclerView.layoutManager = LinearLayoutManager(view.context)
        notesRecyclerView.adapter = NotesAdapter(notesArrayList)

        return view
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