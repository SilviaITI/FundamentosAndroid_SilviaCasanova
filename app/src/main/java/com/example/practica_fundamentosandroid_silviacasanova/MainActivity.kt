package com.example.practica_fundamentosandroid_silviacasanova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
 val viewModel: MainActivityViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Esto es un toast", Toast.LENGTH_LONG).show()
    }
}