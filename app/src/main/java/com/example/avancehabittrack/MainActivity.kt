package com.example.avancehabittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.avancehabittrack.ui.theme.AvanceHabittrackTheme

import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 🔙 Botón cerrar sesión
        val btnVolver = findViewById<Button>(R.id.btnVolver)
        val btn1 = findViewById<Button>(R.id.btnCompletar1)
        val btn2 = findViewById<Button>(R.id.btnCompletar2)
        val btn3 = findViewById<Button>(R.id.btnCompletar3)
        btnVolver.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }



        btn1.setOnClickListener {
            if (btn1.text == "Completar") {
                btn1.text = "Completado ✅"
                btn1.setBackgroundColor(getColor(android.R.color.holo_green_dark))
            } else {
                btn1.text = "Completar"
                btn1.setBackgroundColor(getColor(android.R.color.holo_blue_light))
            }
        }

        btn2.setOnClickListener {
            if (btn2.text == "Completar") {
                btn2.text = "Completado ✅"
                btn2.setBackgroundColor(getColor(android.R.color.holo_green_dark))
            } else {
                btn2.text = "Completar"
                btn2.setBackgroundColor(getColor(android.R.color.holo_blue_light))
            }
        }

        btn3.setOnClickListener {
            if (btn3.text == "Completar") {
                btn3.text = "Completado ✅"
                btn3.setBackgroundColor(getColor(android.R.color.holo_green_dark))
            } else {
                btn3.text = "Completar"
                btn3.setBackgroundColor(getColor(android.R.color.holo_blue_light))
            }
        }

        // 🔽 Barra inferior
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.selectedItemId = R.id.nav_progreso

        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {

                R.id.nav_progreso -> {
                    true // ya estás en esta pantalla
                }

                R.id.nav_stats -> {
                    startActivity(Intent(this, StatsActivity::class.java))
                    finish()
                }

                R.id.nav_profile -> {
                    Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}
