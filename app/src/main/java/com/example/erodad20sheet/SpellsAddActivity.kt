package com.example.erodad20sheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.erodad20sheet.models.SpellsDataObject
import kotlinx.android.synthetic.main.activity_spells_add.*

class SpellsAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spells_add)

        spells_return_home_btn.setOnClickListener {
            finish()
        }

        save_spell_float_btn.setOnClickListener {
            if(list_spell_title_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_spell_type_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_spell_lvl_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_spell_components_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_spell_execution_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_spell_range_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_spell_duration_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_spell_resistence_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_spell_costs_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_spell_desc_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_spell_buffs_entry.text.toString().trim{it <= ' '}.isNotEmpty()) {

                var setSpellTitle = list_spell_title_entry.text.toString()
                var setSpellType = list_spell_type_entry.text.toString()
                var setSpellLvl = list_spell_lvl_entry.text.toString()
                var setSpellComponents = list_spell_components_entry.text.toString()
                var setSpellExecution = list_spell_execution_entry.text.toString()
                var setSpellRange = list_spell_range_entry.text.toString()
                var setSpellDuration = list_spell_duration_entry.text.toString()
                var setSpellResistence = list_spell_resistence_entry.text.toString()
                var setSpellCosts = list_spell_costs_entry.text.toString()
                var setSpellDescription = list_spell_desc_entry.text.toString()
                var setSpellBuffs = list_spell_buffs_entry.text.toString()

                SpellsDataObject.setData(setSpellTitle, setSpellType, setSpellLvl, setSpellComponents, setSpellExecution, setSpellRange,
                setSpellDuration, setSpellResistence, setSpellCosts, setSpellDescription, setSpellBuffs)
                val intent = Intent(this, CharacterSheetActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                finish()

            } else {
                Toast.makeText(this, "Preencha os Campos Antes de Continuar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}