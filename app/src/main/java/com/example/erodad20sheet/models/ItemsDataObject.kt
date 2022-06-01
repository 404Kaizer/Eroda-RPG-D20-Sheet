package com.example.erodad20sheet.models

import com.example.erodad20sheet.adapters.ItemsAdapter

object ItemsDataObject {
    var itemsListData = mutableListOf<ItemsDataClass>()

    fun setData(quantity: String, title: String, value: String, description: String) {
        itemsListData.add(ItemsDataClass(quantity, title, value, description))
    }

    fun getAllData() : List<ItemsDataClass> {
        return itemsListData
    }
}