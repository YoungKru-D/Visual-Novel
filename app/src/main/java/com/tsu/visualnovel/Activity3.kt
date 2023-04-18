package com.tsu.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.visualnovel.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    private lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(NamePage.name).toString()
        binding.text3Great.text = getString(R.string.p3_great, name)

        binding.btn3Walking.setOnClickListener {
            val intent = Intent (this, Activity4::class.java)
            intent.putExtra(NamePage.page, "4")
            startActivity(intent)
            finish()
        }

        binding.btn3Hiking.setOnClickListener {
            val intent = Intent (this, Activity4::class.java)
            intent.putExtra(NamePage.page, "5")
            startActivity(intent)
            finish()
        }

        binding.btn3Field.setOnClickListener {
            val intent = Intent (this, Activity4::class.java)
            intent.putExtra(NamePage.page, "6")
            startActivity(intent)
            finish()
        }
    }
}