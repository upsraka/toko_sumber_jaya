package com.example.tokosumberjaya

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tokosumberjaya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClick()
    }

    private fun onClick() {
        binding.ivAjukan.setOnClickListener {
            Toast.makeText(this, "Page Ajukan", Toast.LENGTH_SHORT).show()
        }

        binding.ivRiwayat.setOnClickListener {
            Toast.makeText(this, "Page Riwayat", Toast.LENGTH_SHORT).show()
        }

        binding.fab.setOnClickListener {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
        }

        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.dataSales -> {
                    Toast.makeText(this, "Data Sales", Toast.LENGTH_SHORT).show()
                    return@setOnItemSelectedListener true
                }
                R.id.akun -> {
                    Toast.makeText(this, "Akun", Toast.LENGTH_SHORT).show()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}