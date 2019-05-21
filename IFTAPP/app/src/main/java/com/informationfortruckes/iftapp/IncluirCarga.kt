package com.informationfortruckes.iftapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class IncluirCarga : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_incluir_carga)

        val btninsert = findViewById<Button>(R.id.btninserir) as Button

        btninsert.setOnClickListener {
            Toast.makeText(this@IncluirCarga,"Atualizando...",Toast.LENGTH_LONG).show()
        }
    }
}
