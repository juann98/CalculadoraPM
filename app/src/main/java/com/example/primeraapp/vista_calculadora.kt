package com.example.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class vista_calculadora : AppCompatActivity(){

    var oper: Int = 0 // 1 suma, 2 resta, 3 multiplicacion, 4 division
    var numero1: Double = 0.0
    lateinit var ope : TextView
    lateinit var resul : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_calculadora)

        ope = findViewById(R.id.txt_operacion)
        resul = findViewById(R.id.txt_resultado)

        val btn_borrar : Button = findViewById(R.id.btnBorrar)
        val btn_igual : Button = findViewById(R.id.btnigual)

        btn_igual.setOnClickListener {
            var numero2 : Double = ope.text.toString().toDouble()
            var resp : Double = 0.0

            when(oper){
                1 -> resp = numero1 + numero2
                2 -> resp = numero1 - numero2
                3 -> resp = numero1 * numero2
                4 -> resp = numero1 / numero2
            }

            ope.setText(resp.toString())
            resul.setText("")
        }

        btn_borrar.setOnClickListener {
            ope.setText("")
            resul.setText("")

            numero1 = 0.0
            oper = 0
        }
    }

    fun presionarDigito(view: View){

        val ope : TextView = findViewById(R.id.txt_operacion)
        var ope_str : String = ope.text.toString()

        when(view.id){

            R.id.btn0 -> ope.setText(ope_str + "0")
            R.id.btn1 -> ope.setText(ope_str + "1")
            R.id.btn2 -> ope.setText(ope_str + "2")
            R.id.btn3 -> ope.setText(ope_str + "3")
            R.id.btn4 -> ope.setText(ope_str + "4")
            R.id.btn5 -> ope.setText(ope_str + "5")
            R.id.btn6 -> ope.setText(ope_str + "6")
            R.id.btn7 -> ope.setText(ope_str + "7")
            R.id.btn8 -> ope.setText(ope_str + "8")
            R.id.btn9 -> ope.setText(ope_str + "9")

            R.id.btn_punto -> ope.setText(ope_str + ".")

        }
    }

   fun presionarOperacion(view: View){

       numero1 = ope.text.toString().toDouble()
       var num2_text : String = ope.text.toString()
       ope.setText("")

       when(view.id){

           R.id.btnsuma -> {
               resul.setText(num2_text + "+")
               oper = 1
           }

           R.id.btnresta -> {
               resul.setText(num2_text + "-")
               oper = 2
           }

           R.id.btnmulti -> {
               resul.setText(num2_text + "*")
               oper = 3
           }

           R.id.btndivi -> {
               resul.setText(num2_text + "/")
               oper = 4
           }
       }

   }

}

