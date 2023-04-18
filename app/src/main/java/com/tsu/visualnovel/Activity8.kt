package com.tsu.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.visualnovel.databinding.Activity6Binding
import com.tsu.visualnovel.databinding.Activity8Binding

class Activity8 : AppCompatActivity() {
    private lateinit var binding: Activity8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn8Reset.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}