package com.example.erodad20sheet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.model.NotesDataClass
import kotlin.collections.ArrayList

class NotesAdapter(private val notesList: ArrayList<NotesDataClass>) : RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {

    class NotesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val titleTextView : TextView = itemView.findViewById(R.id.note_title)
        private val descriptionTextView : TextView = itemView.findViewById(R.id.note_description)

        fun populateAdapter(notes: NotesDataClass) {
            titleTextView.text = notes.title
            descriptionTextView.text = notes.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_notes, parent, false)
        return NotesViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        holder.populateAdapter(notesList[position])
    }

    override fun getItemCount(): Int {
        return notesList.size
    }
}