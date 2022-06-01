package com.example.erodad20sheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.erodad20sheet.fragments.CharInventoryFragment
import com.example.erodad20sheet.models.CharactersDataObject
import com.example.erodad20sheet.models.ItemsDataObject
import kotlinx.android.synthetic.main.activity_character_creation.*
import kotlinx.android.synthetic.main.activity_items_add.*

class ItemsAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_add)

        save_item_float_btn.setOnClickListener {
            if(list_item_quantity_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_item_title_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_item_value_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_item_desc_entry.text.toString().trim{it <= ' '}.isNotEmpty()) {

                var setItemQuantity = list_item_quantity_entry.text.toString()
                var setItemTitle = list_item_title_entry.text.toString()
                var setItemValue = list_item_value_entry.text.toString()
                var setItemDescription = list_item_desc_entry.text.toString()

                ItemsDataObject.setData(setItemQuantity, setItemTitle, setItemValue, setItemDescription)
                val intent = Intent(this, CharacterSheetActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                finish()
            } else {
                Toast.makeText(this, "Preencha os Campos Antes de Continuar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}