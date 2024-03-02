package com.example.cicassistance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goPrincipalPage = findViewById<Button>(R.id.button_principal_page)
        goPrincipalPage.setOnClickListener{
            goToPrincipal()
        }
    }

    private fun goToPrincipal() {
        val i = Intent(this, pantalla_principal::class.java)
        startActivity(i)
    }
}