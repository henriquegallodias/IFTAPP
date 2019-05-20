package com.informationfortruckes.iftapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_caminhoneiro.*

class CaminhoneiroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caminhoneiro)

        val btnconsucargas = findViewById<Button>(R.id.btnconsucargas) as Button
        val btnsair = findViewById<Button>(R.id.btnsair) as Button

        btnconsucargas.setOnClickListener {
            val toast = Toast.makeText(this@CaminhoneiroActivity,"Aplicativo em desenvolvimento",Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()
        }

        btnsair.setOnClickListener {
            val intentsair = Intent(Intent.ACTION_MAIN)
            intentsair.addCategory(Intent.CATEGORY_HOME)
            intentsair.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intentsair)
        }
    }
}
