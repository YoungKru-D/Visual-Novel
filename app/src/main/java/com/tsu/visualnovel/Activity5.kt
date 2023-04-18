package com.tsu.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.visualnovel.databinding.Activity4Binding
import com.tsu.visualnovel.databinding.Activity5Binding

class Activity5 : AppCompatActivity() {
    private lateinit var binding: Activity5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val page = intent.getStringExtra(NamePage.page).toString()

        if (page != null) {
            when (page) {
                "7" -> {
                    binding.img5View.setImageResource(R.drawable.watching)
                    binding.text5Edit.text = getString(R.string.p7_question)
                    binding.btn5Choice1.text = getString(R.string.p7_btn1)
                    binding.btn5Choice2.text = getString(R.string.p7_btn2)
                }
                "8" -> {
                    binding.img5View.setImageResource(R.drawable.helloween)
                    binding.text5Edit.text = getString(R.string.p8_question)
                    binding.btn5Choice1.text = getString(R.string.p8_btn1)
                    binding.btn5Choice2.text = getString(R.string.p8_btn2)
                }
            }
        }

        binding.btn5Choice1.setOnClickListener {
            when (page) {
                "7" -> {
                    val intent = Intent(this, Activity6::class.java)
                    intent.putExtra(NamePage.page, "9")
                    startActivity(intent)
                    finish()
                }
                "8" -> {
                    val intent = Intent(this, Activity5::class.java)
                    intent.putExtra(NamePage.page, "7")
                    startActivity(intent)
                    finish()
                }
            }
        }
        binding.btn5Choice2.setOnClickListener {
            when (page) {
                "7" -> {
                    val intent = Intent(this, Activity6::class.java)
                    intent.putExtra(NamePage.page, "10")
                    startActivity(intent)
                    finish()
                }
                "8" -> {
                    val intent = Intent(this, Activity6::class.java)
                    intent.putExtra(NamePage.page, "11")
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}