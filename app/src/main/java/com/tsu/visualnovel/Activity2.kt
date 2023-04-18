package com.tsu.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.visualnovel.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn2Accept.setOnClickListener {
            if(binding.textInputName.text != null) {
                val intent = Intent(this, Activity3::class.java)
                intent.putExtra(NamePage.name, binding.textInputName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}