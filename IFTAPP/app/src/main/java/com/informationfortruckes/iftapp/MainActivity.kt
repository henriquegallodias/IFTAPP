package com.informationfortruckes.iftapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnloga = findViewById<Button>(R.id.btnadm) as Button
        val btnlogc = findViewById<Button>(R.id.btncam) as Button

        btnloga.setOnClickListener {
            val intent1 = Intent(this@MainActivity,LoginAdmActivity::class.java)
            startActivity(intent1)
        }

        btnlogc.setOnClickListener {
            val intent2 = Intent(this@MainActivity,LoginFuncActivity::class.java)
            startActivity(intent2)
        }
    }
}
