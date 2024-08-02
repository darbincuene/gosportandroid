package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class perfil: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_perfil);

        val btnview:Button=findViewById(R.id.vertorneos)
        val botonvista:Button=findViewById(R.id.aggeqi)
        botonvista.setOnClickListener {
            val  intent=Intent(this, Planillero::class.java)
            startActivity(intent)
        }

        btnview.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }




    }
}