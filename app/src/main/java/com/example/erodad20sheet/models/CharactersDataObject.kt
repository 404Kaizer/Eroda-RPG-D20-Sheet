package com.example.erodad20sheet.models

import android.graphics.drawable.Drawable

object CharactersDataObject {
    var charactersListData = mutableListOf<CharactersDataClass>()

    fun setData(portrait: Drawable, name: String, race: String, origin: String, exp: String) {
        charactersListData.add(CharactersDataClass(portrait, name, race, origin, exp))
    }

    fun getAllData() : List<CharactersDataClass> {
        return charactersListData
    }
}