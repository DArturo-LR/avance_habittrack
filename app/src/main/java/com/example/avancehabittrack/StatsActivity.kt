package com.example.avancehabittrack

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class StatsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        // 👉 Marcar esta pantalla como seleccionada
        bottomNav.selectedItemId = R.id.nav_stats

        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {

                R.id.nav_progreso -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }

                R.id.nav_stats -> {
                    // Ya estás aquí
                    true
                }

                R.id.nav_profile -> {
                    Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}