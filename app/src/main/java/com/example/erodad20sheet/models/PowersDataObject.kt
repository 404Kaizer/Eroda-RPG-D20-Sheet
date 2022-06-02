package com.example.erodad20sheet.models

object PowersDataObject {
    var powersListData = mutableListOf<PowersDataClass>()

    fun setData(title: String, type: String, execution: String, costs: String, description: String, buffs: String) {
        powersListData.add(PowersDataClass(title, type, execution, costs, description, buffs))
    }

    fun getAllData() : List<PowersDataClass> {
        return powersListData
    }
}