package com.informationfortruckes.iftapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AdministradorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrador)

        val btncadc = findViewById<Button>(R.id.btncadcarga) as Button
        val btncadf = findViewById<Button>(R.id.btncadfunc) as Button
        val btnvisuf = findViewById<Button>(R.id.btnconsufunc) as Button
        val btnvisuv = findViewById<Button>(R.id.btnconsuviagem) as Button
        val btnsair = findViewById<Button>(R.id.btnsaira) as Button

        btncadc.setOnClickListener {
            Toast.makeText(this@AdministradorActivity,"Atualizando",Toast.LENGTH_LONG).show()
            val intent1cadc = Intent(this@AdministradorActivity,IncluirCarga::class.java)
            startActivity(intent1cadc)
        }

        btncadf.setOnClickListener {
            Toast.makeText(this@AdministradorActivity,"Atualizando",Toast.LENGTH_LONG).show()
            val intent2cadf = Intent(this@AdministradorActivity,IncluirFuncActivity::class.java)
            startActivity(intent2cadf)
        }

        btnvisuf.setOnClickListener {
            Toast.makeText(this@AdministradorActivity,"Atualizando",Toast.LENGTH_LONG).show()
            val intent1visuf = Intent(this@AdministradorActivity,ConsultarFuncActivity::class.java)
            startActivity(intent1visuf)
        }

        btnvisuv.setOnClickListener {
            Toast.makeText(this@AdministradorActivity,"Atualizando",Toast.LENGTH_LONG).show()
            val intent2visuv = Intent(this@AdministradorActivity,ViagensActivity::class.java)
            startActivity(intent2visuv)
        }

        btnsair.setOnClickListener {
            val intentsair = Intent(Intent.ACTION_MAIN)
            intentsair.addCategory(Intent.CATEGORY_HOME)
            intentsair.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

            Toast.makeText(this@AdministradorActivity,"Encerrado",Toast.LENGTH_LONG).show()
            startActivity(intentsair)
        }
    }
}
