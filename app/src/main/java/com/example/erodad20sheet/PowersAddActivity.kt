package com.example.erodad20sheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.erodad20sheet.models.PowersDataObject
import kotlinx.android.synthetic.main.activity_power_add.*

class PowersAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_power_add)

       powers_return_home_btn.setOnClickListener {
            finish()
        }

        save_power_float_btn.setOnClickListener {
            if(list_power_title_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_power_type_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_power_execution_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_power_costs_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_power_desc_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_power_buffs_entry.text.toString().trim{it <= ' '}.isNotEmpty()) {

                var setPowerTitle = list_power_title_entry.text.toString()
                var setPowerType = list_power_type_entry.text.toString()
                var setPowerExecution = list_power_execution_entry.text.toString()
                var setPowerCosts = list_power_costs_entry.text.toString()
                var setPowerDescription = list_power_desc_entry.text.toString()
                var setPowerBuffs = list_power_buffs_entry.text.toString()

                PowersDataObject.setData(setPowerTitle, setPowerType, setPowerExecution, setPowerCosts, setPowerDescription, setPowerBuffs)
                val intent = Intent(this, CharacterSheetActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                finish()
            } else {
                Toast.makeText(this, "Preencha os Campos Antes de Continuar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}