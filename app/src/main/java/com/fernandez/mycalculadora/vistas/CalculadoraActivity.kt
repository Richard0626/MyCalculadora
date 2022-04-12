package com.fernandez.mycalculadora.vistas

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.fernandez.mycalculadora.R

class CalculadoraActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        title="Calculadora Del Trica"

        //buscar el spinner
        val spinner = findViewById<Spinner>(R.id.porcentaje)
        //creaqr la llista de elementos
        val lista = listOf("A:30% T + 70% L","A:40% T + 60% L","A:30% T + 70% L",)
        //crear un adaptador
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,lista)
        //asignar el adaptador al spinner
        spinner.adapter = adaptador
        spinner.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ){
                Toast.makeText(this@CalculadoraActivity,lista[position], Toast.LENGTH_LONG).show()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }



}