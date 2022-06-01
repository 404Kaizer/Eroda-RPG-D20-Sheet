package com.example.erodad20sheet.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import com.example.erodad20sheet.R
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.jaredrummler.materialspinner.MaterialSpinner
import kotlinx.android.synthetic.main.dialog_progressbar_edit.view.*
import kotlinx.android.synthetic.main.fragment_tab_char_status.*

class TabCharStatusFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab_char_status, container, false)

        val lifeBar = view.findViewById(R.id.life_bar) as ProgressBar
        val sanityBar = view.findViewById(R.id.sanity_bar) as ProgressBar
        val manaBar = view.findViewById(R.id.mana_bar) as ProgressBar

        // Change Max and Actual Life in The Life ProgressBar
        lifeBar.setOnClickListener {
            val bottomSheet = layoutInflater.inflate(R.layout.dialog_progressbar_edit, null)
            val dialog = BottomSheetDialog(view.context)
            dialog.setContentView(bottomSheet)
            dialog.show()

            val actualLife = bottomSheet.actual_entry
            val maxLife = bottomSheet.max_entry

            bottomSheet.progressbar_actual_title.text = "Vida Atual"
            bottomSheet.progressbar_max_title.text = "Vida Máxima"

            bottomSheet.edit_btn.setOnClickListener {
                lifeBar.progress = actualLife.text.toString().toInt()

                if (maxLife.text.toString().toInt() < actualLife.text.toString().toInt()) {
                    Toast.makeText(it.context, "Vida Atual Maior Que Vida Máxima!", Toast.LENGTH_SHORT).show()
                } else {
                    lifeBar.max = maxLife.text.toString().toInt()
                    life_counter.text = "${lifeBar.progress} / ${lifeBar.max}"
                    dialog.dismiss()
                }
            }
        }

        // Change Max and Actual Sanity in The Sanity ProgressBar
        sanityBar.setOnClickListener {
            val bottomSheet = layoutInflater.inflate(R.layout.dialog_progressbar_edit, null)
            val dialog = BottomSheetDialog(view.context)
            dialog.setContentView(bottomSheet)
            dialog.show()

            val actualSanity = bottomSheet.actual_entry
            val maxSanity = bottomSheet.max_entry

            bottomSheet.progressbar_actual_title.text = "Sanidade Atual"
            bottomSheet.progressbar_max_title.text = "Sanidade Máxima"

            bottomSheet.edit_btn.setOnClickListener {
                sanityBar.progress = actualSanity.text.toString().toInt()

                if (maxSanity.text.toString().toInt() < actualSanity.text.toString().toInt()) {
                    Toast.makeText(it.context, "Sanidade Atual Maior Que Vida Máxima!", Toast.LENGTH_SHORT).show()
                } else {
                    sanityBar.max = maxSanity.text.toString().toInt()
                    sanity_counter.text = "${sanityBar.progress} / ${sanityBar.max}"
                    dialog.dismiss()
                }
            }
        }

        // Change Max and Actual Mana in The Mana ProgressBar
        manaBar.setOnClickListener {
            val bottomSheet = layoutInflater.inflate(R.layout.dialog_progressbar_edit, null)
            val dialog = BottomSheetDialog(view.context)
            dialog.setContentView(bottomSheet)
            dialog.show()

            val actualMana = bottomSheet.actual_entry
            val maxMana = bottomSheet.max_entry

            bottomSheet.progressbar_actual_title.text = "Energia Atual"
            bottomSheet.progressbar_max_title.text = "Energia Máxima"

            bottomSheet.edit_btn.setOnClickListener {
                manaBar.progress = actualMana.text.toString().toInt()

                if (maxMana.text.toString().toInt() < actualMana.text.toString().toInt()) {
                    Toast.makeText(it.context, "Vida Atual Maior Que Vida Máxima!", Toast.LENGTH_SHORT).show()
                } else {
                    manaBar.max = maxMana.text.toString().toInt()
                    mana_counter.text = "${manaBar.progress} / ${manaBar.max}"
                    dialog.dismiss()
                }
            }
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val protectionTypeSpinner = protection_type_spinner as MaterialSpinner
        protectionTypeSpinner.setItems("Nenhuma", "Leve", "Média", "Pesada")
    }
}