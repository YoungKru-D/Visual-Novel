package com.tsu.visualnovel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tsu.visualnovel.databinding.Activity7Binding

class Activity7 : AppCompatActivity() {
    private lateinit var binding: Activity7Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val page = intent.getStringExtra(NamePage.page).toString()

        when (page) {
            "12" -> {
                binding.text7Edit.text = getString(R.string.p12_question)
                binding.btn7Choice1.text = getString(R.string.p9_btn1)
                //binding.btn6Choice2.text = getString(R.string.p9_btn2)
            }
            "13" -> {
                binding.text7Edit.text = getString(R.string.p13_question)
                binding.btn7Choice1.text = getString(R.string.p10_btn1)
                //binding.btn6Choice2.text = getString(R.string.p8_btn2)
            }
        }

        binding.btn7Choice1.setOnClickListener {
            val intent = Intent(this, Activity8::class.java)
            startActivity(intent)
            finish()
        }
    }
}