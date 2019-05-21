package com.informationfortruckes.iftapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class ConsultarFuncActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultar_func)

        val btn = findViewById<Button>(R.id.readFunc) as Button

        btn.setOnClickListener {
            //readDataFunction()
          val toast = Toast.makeText(this@ConsultarFuncActivity,"Aplicativo em desenvolvimento",Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()
        }
    }
}
