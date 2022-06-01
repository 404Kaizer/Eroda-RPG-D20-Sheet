package com.example.erodad20sheet.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.erodad20sheet.CharacterCreationActivity
import com.example.erodad20sheet.R
import kotlinx.android.synthetic.main.fragment_char_perfil.*


class CharPerfilFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_char_perfil, container, false)

        val editCharBtn = view.findViewById(R.id.edit_char_info_btn) as ImageView
        editCharBtn.setOnClickListener {
            startActivity(Intent(view.context, CharacterCreationActivity::class.java))
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
