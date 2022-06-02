package com.example.erodad20sheet.models

object SkillsDataObject {
    var skillsListData = mutableListOf<SkillsDataClass>()

    fun setData(checkbox: Boolean, title: String, atribute: String, value: String) {
        skillsListData.add(SkillsDataClass(checkbox, title, atribute, value))
    }

    fun getAllData() : List<SkillsDataClass> {
        return skillsListData
    }
}