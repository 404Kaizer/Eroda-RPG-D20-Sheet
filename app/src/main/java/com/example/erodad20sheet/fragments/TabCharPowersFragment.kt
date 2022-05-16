package com.example.erodad20sheet.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.PowersAdapter
import com.example.erodad20sheet.models.PowersDataClass

class TabCharPowersFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab_char_powers, container, false)

        val power1  = PowersDataClass("Combatente com Duas Armas", "Você ganha um bônus de +1 em rolagens de ataque enquanto usar uma arma em cada mão.")
        val power2  = PowersDataClass("Ataque Devastador", "Quando faz um ataque, você pode gastar 2 PE para receber +4 no teste de ataque ou na rolagem de dano.")
        val power3  = PowersDataClass("Interromper", "Ao realizar um ataque corpo a corpo, você pode gastar 3 PE para, até o final do combate, quando " +
                "o alvo estiver adjacente a você e tentar caminhar ou correr, cancelar esse deslocamento realizando uma interrupção imediata com uma ação de movimento.")
        val power4  = PowersDataClass("Supersticioso", "Você odeia magia, o que faz com que seja mais resistente a ela. Você recebe resistência a magia +2.")
        val power5  = PowersDataClass("Golpe Baixo", "Quando faz um ataque desarmado, você pode gastar 2 PE. Se fizer isso e acertar o ataque, o oponente deve fazer um teste de Constituição (CD For). Se ele falhar, fica atordoado por uma rodada. " +
                "Você só pode usar este poder uma vez por cena contra uma mesma criatura.")
        val power6  = PowersDataClass("Confiante", "Sempre que faz um acerto crítico em combate ou reduz um inimigo a 0 PV, você recupera 1 PE.")
        val power7  = PowersDataClass("Crítico Aprimorado", "A partir do 3º nível, seus ataques com armas adquirem uma margem de acerto crítico de 19 a 20 nas jogadas de ataque.")
        val power8  = PowersDataClass("Característica de Origem: Patente Militar", "Você possui uma patente militar de quando você serviu. Soldados leais à sua antiga organização reconhecem sua autoridade e influência, e o prestam continência se forem de uma patente mais baixa.")
        val power9  = PowersDataClass("Fúria", "Sua fúria lhe garante +2 em testes de ataque e bônus de dano. Além disso, sua fúria lhe garante resistência contra dano físico e também vantagem em testes de força e constituição.")
        val power10 = PowersDataClass("Pelo Show", "Você sabe “bater sem machucar”. Pode escolher causar dano não letal sem sofrer a penalidade de -5.")
        val powersArrayList = arrayListOf(power1, power2, power3, power4, power5, power6, power7, power8, power9, power10)
        val powersRecyclerView = view.findViewById(R.id.powers_recycler) as RecyclerView
        powersRecyclerView.layoutManager = LinearLayoutManager(view.context)
        powersRecyclerView.adapter = PowersAdapter(powersArrayList)

        return view
    }

    companion object {
        fun newInstance() = TabCharPowersFragment()
    }
}