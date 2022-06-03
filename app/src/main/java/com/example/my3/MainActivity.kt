package com.example.my3

import android.app.Activity
import android.os.Bundle
import com.example.my3.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text="Una aplicación móvil (en ocasiones, " +
                "también aplicación telefónica) es una aplicación " +
                "informática diseñada para ser ejecutada en teléfonos " +
                "inteligentes, tabletas y otros dispositivos móviles"



    }
}