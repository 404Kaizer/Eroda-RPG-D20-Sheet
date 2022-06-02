package com.example.erodad20sheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.erodad20sheet.models.WeaponsDataObject
import kotlinx.android.synthetic.main.activity_weapons_add.*

class WeaponsAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weapons_add)

        weapons_return_home_btn.setOnClickListener {
            finish()
        }

        save_weapon_float_btn.setOnClickListener {
            if(list_weapon_quantity_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_weapon_title_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_weapon_type_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_weapon_value_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_weapon_ammunition_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_weapon_damage_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_weapon_execution_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_weapon_range_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_weapon_desc_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_weapon_properties_entry.text.toString().trim{it <= ' '}.isNotEmpty()) {

               var setWeaponQuantity = list_weapon_quantity_entry.text.toString()
               var setWeaponTitle = list_weapon_title_entry.text.toString()
               var setWeaponType = list_weapon_type_entry.text.toString()
               var setWeaponValue = list_weapon_value_entry.text.toString()
               var setWeaponAmmunition = list_weapon_ammunition_entry.text.toString()
               var setWeaponDamage = list_weapon_damage_entry.text.toString()
               var setWeaponExecution = list_weapon_execution_entry.text.toString()
               var setWeaponRange = list_weapon_range_entry.text.toString()
               var setWeaponDescription = list_weapon_desc_entry.text.toString()
               var setWeaponProperties = list_weapon_properties_entry.text.toString()

                WeaponsDataObject.setData(setWeaponQuantity, setWeaponTitle, setWeaponType, setWeaponValue,
                setWeaponAmmunition, setWeaponDamage, setWeaponExecution, setWeaponRange, setWeaponDescription, setWeaponProperties)
                val intent = Intent(this, CharacterSheetActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                finish()
            } else {
                Toast.makeText(this, "Preencha os Campos Antes de Continuar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}