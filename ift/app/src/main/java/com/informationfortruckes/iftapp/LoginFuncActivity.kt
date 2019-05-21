package com.informationfortruckes.iftapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginFuncActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_func)

        val btnentrar = findViewById<Button>(R.id.btnentrarcam) as Button

        btnentrar.setOnClickListener {
            val intent1c = Intent(this@LoginFuncActivity,CaminhoneiroActivity::class.java)
            startActivity(intent1c)
        }
    }
}
