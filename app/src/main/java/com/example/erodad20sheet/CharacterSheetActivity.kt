package com.example.erodad20sheet

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.erodad20sheet.fragments.*
import kotlinx.android.synthetic.main.activity_character_sheet.*
import kotlinx.android.synthetic.main.fragment_tab_char_perfil.*


class CharacterSheetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_sheet)

        val charInfoFragment = CharInfoFragment()
        val charStatsFragment = CharStatsFragment()
        val charCombatFragment = CharCombatFragment()
        val charInventoryFragment = CharInventoryFragment()
        val charNotesFragment = CharNotesFragment()

        setCurrentFragment(charInfoFragment)
        toolbar_title.text = "Personagem"

        return_home_btn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        bottom_menu.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.char_info -> {
                    setCurrentFragment(charInfoFragment)
                    toolbar_title.text = "Personagem"
                }
                R.id.char_stats -> {
                    setCurrentFragment(charStatsFragment)
                    toolbar_title.text = "Atributos"
                }
                R.id.char_combat -> {
                    setCurrentFragment(charCombatFragment)
                    toolbar_title.text = "Combate"
                }
                R.id.char_inventory -> {
                    setCurrentFragment(charInventoryFragment)
                    toolbar_title.text = "Inventário"
                }
                R.id.char_notes -> {
                    setCurrentFragment(charNotesFragment)
                    toolbar_title.text = "Anotações"
                }
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_frame, fragment)
            addToBackStack(null)
            commit()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}