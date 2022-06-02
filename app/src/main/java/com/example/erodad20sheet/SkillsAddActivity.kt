package com.example.erodad20sheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.erodad20sheet.models.SkillsDataObject
import kotlinx.android.synthetic.main.activity_skills_add.*

class SkillsAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills_add)

        skills_return_home_btn.setOnClickListener {
            finish()
        }

        save_skill_float_btn.setOnClickListener {
            if(list_skill_title_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_skill_atribute_entry.text.toString().trim{it <= ' '}.isNotEmpty()
                && list_skill_value_entry.text.toString().trim{it <= ' '}.isNotEmpty()) {

                var setSkillCheckbox = skill_check.isChecked
                var setSkillTitle = list_skill_title_entry.text.toString()
                var setSkillAtribute = list_skill_atribute_entry.text.toString()
                var setSkillValue = list_skill_value_entry.text.toString()

                SkillsDataObject.setData(setSkillCheckbox, setSkillTitle, setSkillAtribute, setSkillValue)
                val intent = Intent(this, CharacterSheetActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                finish()
            } else {
                Toast.makeText(this, "Preencha os Campos Antes de Continuar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}