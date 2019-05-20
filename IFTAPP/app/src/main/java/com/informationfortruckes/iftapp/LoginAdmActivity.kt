package com.informationfortruckes.iftapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginAdmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_adm)

        val btnentrar = findViewById<Button>(R.id.btnentraradm) as Button


        btnentrar.setOnClickListener {
            val intent1a = Intent(this@LoginAdmActivity,AdministradorActivity::class.java)
            startActivity(intent1a)
        }
    }
}
