package com.example.quizapptutoiral

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        val NavController = findNavController(R.id.fragmentContainerView)
//        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        bottomNav.setupWithNavController(NavController)
    }
}