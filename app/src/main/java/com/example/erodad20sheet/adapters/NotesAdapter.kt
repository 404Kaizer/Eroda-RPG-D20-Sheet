package com.example.erodad20sheet.adapters

import  android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.models.NotesDataClass

class NotesAdapter(private val notesList: ArrayList<NotesDataClass>)
    : RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {

    class NotesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val titleTextView : TextView = itemView.findViewById(R.id.note_title)
        private val priotiryTextView : TextView = itemView.findViewById(R.id.note_priority)
        private val descriptionTextView : TextView = itemView.findViewById(R.id.note_description)

        fun populateAdapter(notes: NotesDataClass) {
            titleTextView.text = notes.title
            priotiryTextView.text = notes.priority
            descriptionTextView.text = notes.description
        }

        init {
            itemView.setOnClickListener { v : View ->
                val position : Int = adapterPosition
                Toast.makeText(itemView.context, "You Clicked on Item #${position + 1}", Toast.LENGTH_SHORT).show()
            }
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