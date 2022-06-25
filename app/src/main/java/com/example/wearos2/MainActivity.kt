package com.example.wearos2

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.wearos2.databinding.ActivityMainBinding
//enlaza elementos con el codigo

class MainActivity : Activity() {

    //asigna un valor
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //modifica el valor del textview
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAcp.setOnClickListener {
            Toast.makeText(this, "Aceptar",Toast.LENGTH_SHORT).show()
        }

        binding.btnClr.setOnClickListener {
            Toast.makeText(this, "Bye",Toast.LENGTH_SHORT).show()
        }

    }
}