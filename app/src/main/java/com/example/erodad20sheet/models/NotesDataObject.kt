package com.example.erodad20sheet.models

object NotesDataObject {
    var notesListData = mutableListOf<NotesDataClass>()

    fun setData(title: String, priority: String, description: String) {
        notesListData.add(NotesDataClass(title, priority, description))
    }

    fun getAllData() : List<NotesDataClass> {
        return notesListData
    }
}