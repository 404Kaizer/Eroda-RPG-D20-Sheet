package com.example.erodad20sheet

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.erodad20sheet.fragments.*
import kotlinx.android.synthetic.main.activity_character_sheet.*


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
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
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
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_frame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onBackPressed() {
        finish()
    }
}