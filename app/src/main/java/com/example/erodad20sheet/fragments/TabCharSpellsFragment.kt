package com.example.erodad20sheet.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.erodad20sheet.R
import com.example.erodad20sheet.adapters.SpellsAdapter
import com.example.erodad20sheet.models.SpellsDataClass

class TabCharSpellsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab_char_spells, container, false)

        val spell1 = SpellsDataClass("Proteção Contra Lâminas", "Magia de Abjuração", "Truque", "V S", "1 Ação",
            "Pessoal", "1 Rodada", "Nenhuma", "0/1d3 Pontos de Sanidade",
            "Você estende suas mãos e desenha um símbolo de proteção no ar. Até o final do seu próximo turno, " +
                    "você terá resistência contra dano causado por ataques com armas não mágicas.", "Nenhum")
        val spell2 = SpellsDataClass("Armadura Gélida", "Magia de Abjuração", "1° Ciclo", "V S M(um pouco de água ou gelo)", "1 Ação",
            "Pessoal", "1 Hora", "Nenhuma", "2 Pontos de Energia, 1/1d6 Pontos de Sanidade",
            "Uma força mágica protetora envolve-o, manifestando-se como um frio espectral que cobre você e o seu equipamento. Você ganha 5 pontos de vida " +
                    "temporários enquanto a magia durar. Se uma criatura atingi-lo com um ataque corpo a corpo enquanto você possuir " +
                    "esses pontos de vida temporários, a criatura sofre 5 pontos de dano gélido.",
            "+5 Pontos de Mana: Tanto os pontos de vida temporários quanto o dano da magia aumentam para 10.\n" +
                    "+7 Pontos de Mana: Tanto os pontos de vida temporários quanto o dano da magia aumentam para 15.\n" +
                    "+10 Pontos de Mana: Tanto os pontos de vida temporários quanto o dano da magia aumentam para 20.\n" +
                    "+12 Pontos de Mana: Tanto os pontos de vida temporários quanto o dano da magia aumentam para 25.")
        val spell3 = SpellsDataClass("Escudo de Luz", "Magia de Abjuração", "1° Ciclo", "V S M", "1 Ação Livre",
            "Curto", "Concentração, até 10 minutos", "Nenhuma", "2 Pontos de Energia, 0/1d3 Pontos de Sanidade",
            "Um campo luminoso surge ao redor de uma criatura à sua escolha e no alcance da magia. " +
                    "A criatura ganha um bônus de +2 à defesa enquanto esta magia durar.", "Nenhum")
        val spell4 = SpellsDataClass("Orientação", "Magia de Adivinhação", "Truque", "V S", "1 Ação",
            "Toque", "Concentração, até 1 minuto", "Nenhuma", "0/1d2 Pontos de Sanidade",
            "Você toca uma criatura voluntária. Uma vez, antes da magia acabar, o alvo pode rolar 1d4 e adicionar o número rolado a um teste de habilidade à escolha dele. " +
                    "Ele pode rolar o dado antes ou depois de realizar o teste de habilidade. Após isso, a magia termina.", "Nenhum")
        val spell5 = SpellsDataClass("Detectar Magia", "Magia de Adivinhação", "1° Ciclo", "V S", "1 Ação",
            "Pessoal", "Concentração, até 10 minutos", "Nenhuma", "2 Pontos de Energia, 0/1d4 Pontos de Sanidade",
            "Pela duração, você sente a presença de magias a até 9 metros de você. Se você sentir magia dessa forma, você pode usar sua ação para ver uma aura suave em volta de " +
                    "qualquer criatura ou objeto visível, na área que carrega magia, e você descobre o tipo de magia, se houver um.\n" +
                    "A magia pode penetrar a maioria das barreiras, mas é bloqueada por 30 centímetros de rocha, 2,5 centímetros de metal comum, uma fina camada de chumbo, " +
                    "ou 90 centímetros de madeira ou terra.", "Nenhum")
        val spell6 = SpellsDataClass("Criar Chamas", "Magia de Invocação", "Truque", "V S", "1 Ação",
            "Pessoal", "10 Minutos", "Nenhuma", "0/1d3 Pontos de Sanidade",
            "Uma chama tremulante aparece na sua mão. A chama permanece pela duração e não machuca nem você nem seu equipamento. A chama emite luz plena num raio de 3 metros e penumbra por 3 metros " +
                    "adicionais. A magia acaba se você dissipa-la usando uma ação ou se conjura-la novamente.\n" +
                    "Você pode, também, atacar com a chama, no entanto, fazer isso acaba com a magia. Quando você conjura essa magia, ou com uma ação em um turno posterior, você pode arremessar a chama numa criatura a " +
                    "até 9 metros de você. Faça um ataque à distância com magia. Se atingir, o alvo sofre 1d8 de dano de fogo.",
            "+7 Pontos de Mana: O dano aumenta para 2d8.\n" +
                    "+10 Pontos de Mana: O dano aumenta para 3d8.\n" +
                    "+12 Pontos de Mana: O dano aumenta para 4d8.")
        val spell7 = SpellsDataClass("Velocidade do Vento", "Magia de Transmutação", "1° Ciclo", "V", "1 Ação Livre",
            "Pessoal", "Concentração, até 1 minuto", "Nenhuma", "2 Pontos de Energia, 1/1d6 Pontos de Sanidade",
            "Você se move como o vento. Até o fim da magia, seu movimento não provoca ataques de oportunidade. Uma vez até o fim da magia, você pode se dar vantagem em uma " +
                    "rolagem de ataque com arma no seu turno. Esse ataque infringe 1d8 de dano de energia extra caso acerte. " +
                    "Não importa se acertar ou errar, sua velocidade de deslocamento aumenta em 9 metros até o final desse turno.", "Nenhum")
        val spellsArrayList = arrayListOf(spell1, spell2, spell3, spell4, spell5, spell6, spell7)
        val spellsRecyclerView = view.findViewById(R.id.spells_recycler) as RecyclerView
        spellsRecyclerView.layoutManager = LinearLayoutManager(view.context)
        spellsRecyclerView.adapter = SpellsAdapter(spellsArrayList)

        return view
    }

    companion object {
        fun newInstance() = TabCharSpellsFragment()
    }
}