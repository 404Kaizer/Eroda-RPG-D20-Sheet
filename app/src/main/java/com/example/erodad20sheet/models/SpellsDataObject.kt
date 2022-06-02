package com.example.erodad20sheet.models

object SpellsDataObject {
    var spellsListData = mutableListOf<SpellsDataClass>()

    fun setData(title: String, type: String, lvl: String, components: String, execution: String, range: String, duration: String,
                resistence: String, costs: String, description: String, buffs: String) {
        spellsListData.add(
            SpellsDataClass(title, type, lvl, components, execution, range, duration, resistence, costs, description, buffs))
    }

    fun getAllData() : List<SpellsDataClass> {
        return spellsListData
    }
}