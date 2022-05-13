package com.example.erodad20sheet.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.erodad20sheet.R
import kotlin.math.floor

class TabCharAtributesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab_char_atributes, container, false)

        val increaseStr = view.findViewById(R.id.increase_str_value) as ImageView
        val increaseDes = view.findViewById(R.id.increase_des_value) as ImageView
        val increaseCon = view.findViewById(R.id.increase_con_value) as ImageView
        val increaseInt = view.findViewById(R.id.increase_int_value) as ImageView
        val increaseSab = view.findViewById(R.id.increase_sab_value) as ImageView
        val increaseCar = view.findViewById(R.id.increase_car_value) as ImageView
        val decreaseStr = view.findViewById(R.id.decrease_str_value) as ImageView
        val decreaseDes = view.findViewById(R.id.decrease_des_value) as ImageView
        val decreaseCon = view.findViewById(R.id.decrease_con_value) as ImageView
        val decreaseInt = view.findViewById(R.id.decrease_int_value) as ImageView
        val decreaseSab = view.findViewById(R.id.decrease_sab_value) as ImageView
        val decreaseCar = view.findViewById(R.id.decrease_car_value) as ImageView
        val valueStr = view.findViewById(R.id.str_value)as EditText
        val valueDes = view.findViewById(R.id.des_value) as EditText
        val valueCon = view.findViewById(R.id.con_value) as EditText
        val valueInt = view.findViewById(R.id.int_value) as EditText
        val valueSab = view.findViewById(R.id.sab_value) as EditText
        val valueCar = view.findViewById(R.id .car_value) as EditText
        val valueModStr = view.findViewById(R.id.str_mod_value) as TextView
        val valueModDes = view.findViewById(R.id.des_mod_value) as TextView
        val valueModCon = view.findViewById(R.id.con_mod_value) as TextView
        val valueModInt = view.findViewById(R.id.int_mod_value) as TextView
        val valueModSab = view.findViewById(R.id.sab_mod_value) as TextView
        val valueModCar = view.findViewById(R.id .car_mod_value) as TextView

        fun increaseAtt() {

            increaseStr.setOnClickListener {
                var attValue = valueStr.text.toString().toInt()
                attValue++
                valueStr.setText(attValue.toString())

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModStr.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModStr.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModStr.text = "-1"
                }
            }

            increaseDes.setOnClickListener {
                var attValue = valueDes.text.toString().toInt()
                attValue++
                valueDes.setText(attValue.toString())

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModDes.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModDes.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModDes.text = "-1"
                }
            }

            increaseCon.setOnClickListener {
                var attValue = valueCon.text.toString().toInt()
                attValue++
                valueCon.setText(attValue.toString())

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModCon.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModCon.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModCon.text = "-1"
                }
            }

            increaseInt.setOnClickListener {
                var attValue = valueInt.text.toString().toInt()
                attValue++
                valueInt.setText(attValue.toString())

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModInt.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModInt.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModInt.text = "-1"
                }
            }

            increaseSab.setOnClickListener {
                var attValue = valueSab.text.toString().toInt()
                attValue++
                valueSab.setText(attValue.toString())

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModSab.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModSab.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModSab.text = "-1"
                }
            }

            increaseCar.setOnClickListener {
                var attValue = valueCar.text.toString().toInt()
                attValue++
                valueCar.setText(attValue.toString())

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModCar.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModCar.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModCar.text = "-1"
                }
            }
        }
        increaseAtt()

        fun decreaseAtt() {

            decreaseStr.setOnClickListener {
                var attValue = valueStr.text.toString().toInt()
                attValue--
                valueStr.setText(attValue.toString())

                if(attValue < 8) {
                    attValue = 8
                    valueStr.setText(attValue.toString())
                }

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModStr.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModStr.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModStr.text = "-1"
                }
            }

            decreaseDes.setOnClickListener {
                var attValue = valueDes.text.toString().toInt()
                attValue--
                valueDes.setText(attValue.toString())

                if(attValue < 8) {
                    attValue = 8
                    valueDes.setText(attValue.toString())
                }

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModDes.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModDes.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModDes.text = "-1"
                }
            }

            decreaseCon.setOnClickListener {
                var attValue = valueCon.text.toString().toInt()
                attValue--
                valueCon.setText(attValue.toString())

                if(attValue < 8) {
                    attValue = 8
                    valueCon.setText(attValue.toString())
                }

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModCon.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModCon.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModCon.text = "-1"
                }
            }

            decreaseInt.setOnClickListener {
                var attValue = valueInt.text.toString().toInt()
                attValue--
                valueInt.setText(attValue.toString())

                if(attValue < 8) {
                    attValue = 8
                    valueInt.setText(attValue.toString())
                }

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModInt.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModInt.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModInt.text = "-1"
                }
            }

            decreaseSab.setOnClickListener {
                var attValue = valueSab.text.toString().toInt()
                attValue--
                valueSab.setText(attValue.toString())

                if(attValue < 8) {
                    attValue = 8
                    valueSab.setText(attValue.toString())
                }

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModSab.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModSab.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModSab.text = "-1"
                }
            }

            decreaseCar.setOnClickListener {
                var attValue = valueCar.text.toString().toInt()
                attValue--
                valueCar.setText(attValue.toString())

                if(attValue < 8) {
                    attValue = 8
                    valueCar.setText(attValue.toString())
                }

                val floorValue = floor(((attValue.toString().toInt() - 10) / 2).toDouble()).toInt()
                valueModCar.text = floorValue.toString()

                if(attValue >= 10) {
                    valueModCar.text = StringBuilder("+").append(floorValue).toString()
                } else if(attValue == 9) {
                    valueModCar.text = "-1"
                }
            }
        }
        decreaseAtt()

        return view
    }

    companion object {
        fun newInstance() = TabCharAtributesFragment()
    }
}
