package com.example.erodad20sheet.adapters

import android.content.Intent
import  android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.NotesAddActivity
import com.example.erodad20sheet.R
import com.example.erodad20sheet.models.CharactersDataObject
import com.example.erodad20sheet.models.NotesDataClass
import com.example.erodad20sheet.models.NotesDataObject
import kotlinx.android.synthetic.main.adapter_characters.view.*
import kotlinx.android.synthetic.main.adapter_notes.view.*

class NotesAdapter(private val notesList: ArrayList<NotesDataClass>)
    : RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {

    class NotesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var deleteNoteBtn: ImageView = itemView.delete_note
        var noteTitle: TextView = itemView.findViewById(R.id.note_title)
        var notePriority: TextView = itemView.findViewById(R.id.note_priority)
        var noteDescription: TextView = itemView.findViewById(R.id.note_description)
        var listNoteLayout: ConstraintLayout = itemView.notes_container
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_notes, parent, false)
        return NotesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        holder.noteTitle.text = notesList[position].title
        holder.notePriority.text = notesList[position].priority
        holder.noteDescription.text = notesList[position].description
        holder.listNoteLayout.setOnClickListener {
            val intent = Intent(holder.itemView.context, NotesAddActivity::class.java)
            intent.putExtra("Note_ID", position)
            holder.itemView.context.startActivity(intent)
        }
        holder.deleteNoteBtn.setOnClickListener {
            val items = NotesDataObject.notesListData
            items.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, items.size)
        }
    }

    override fun getItemCount(): Int {
        return notesList.size
    }
}