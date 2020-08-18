package com.jvillad1.motionlayoutplayground

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    // Navigation
    private val navController: NavController by lazy { findNavController(R.id.nav_host_fragment) }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setupWithNavController(navController)
    }
}
