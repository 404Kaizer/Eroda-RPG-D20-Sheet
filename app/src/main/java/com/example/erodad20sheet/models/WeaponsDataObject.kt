package com.example.erodad20sheet.models

object WeaponsDataObject {
    var weaponsListData = mutableListOf<WeaponsDataClass>()

    fun setData(quantity: String, title: String, type: String, value: String, ammunition: String, damage: String, execution: String,
                range: String, description: String, properties: String) {
        weaponsListData.add(WeaponsDataClass(quantity, title, type, value, ammunition, damage, execution,
                range, description, properties))
    }

    fun getAllData() : List<WeaponsDataClass> {
        return weaponsListData
    }
}