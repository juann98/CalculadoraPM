package com.example.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.primeraapp.databinding.ActivityVistaImcBinding
import com.example.primeraapp.databinding.ActivityVistaVehiculosBinding

class vista_imc : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_imc)

        val altura = findViewById<EditText>(R.id.inp_imc_altura)
        val peso = findViewById<EditText>(R.id.inp_imc_peso)

        val respuesta = findViewById<TextView>(R.id.resultado_imc)
        val btn_imc = findViewById<Button>(R.id.btn_imc)

        btn_imc.setOnClickListener {

                respuesta.setText(
                        "El IMC es nananana"
                    )
                }
        }
    }



