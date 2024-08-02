package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val  bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener{ item ->
            when(item.itemId){
                R.id.navigation_home ->{
                    val intent =Intent(this,MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_dashboard ->{
                    val intent=Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true

                }
                R.id.navigation_notifications ->{
                    val  intent = Intent(this, perfil::class.java)
                    startActivity(intent)
                    true
                }
                R.id.planillero_noti ->{
                    val intent=Intent(this, Planillero::class.java)
                    startActivity(intent)
                    true
                }

                else -> false
            }
        }


    }
}