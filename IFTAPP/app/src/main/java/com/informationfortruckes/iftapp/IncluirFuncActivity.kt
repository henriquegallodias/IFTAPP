package com.informationfortruckes.iftapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class IncluirFuncActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_incluir_func)

        val btninserirf = findViewById<Button>(R.id.btninserirfunc) as Button

        btninserirf.setOnClickListener {
            Toast.makeText(this@IncluirFuncActivity,"",Toast.LENGTH_SHORT).show()
        }
    }
}
