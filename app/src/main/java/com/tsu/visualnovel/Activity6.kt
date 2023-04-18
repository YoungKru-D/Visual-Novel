package com.tsu.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.tsu.visualnovel.databinding.Activity5Binding
import com.tsu.visualnovel.databinding.Activity6Binding

class Activity6 : AppCompatActivity() {
    private lateinit var binding: Activity6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val page = intent.getStringExtra(NamePage.page).toString()
        val btnHide = findViewById<Button>(R.id.btn6Choice2)

        when (page){
            "9","10" ->{
                btnHide.visibility = View.GONE
            }
        }

        if (page != null) {
            when (page) {
                "9" -> {
                    binding.img6View.setImageResource(R.drawable.watching)
                    binding.text6Edit.text = getString(R.string.p9_question)
                    binding.btn6Choice1.text = getString(R.string.p9_btn1)
                    //binding.btn6Choice2.text = getString(R.string.p9_btn2)
                }
                "10" -> {
                    binding.img6View.setImageResource(R.drawable.watching)
                    binding.text6Edit.text = getString(R.string.p10_question)
                    binding.btn6Choice1.text = getString(R.string.p10_btn1)
                    //binding.btn6Choice2.text = getString(R.string.p8_btn2)
                }
                "11" -> {
                    binding.img6View.setImageResource(R.drawable.costume)
                    binding.text6Edit.text = getString(R.string.p11_question)
                    binding.btn6Choice1.text = getString(R.string.p11_btn1)
                    binding.btn6Choice2.text = getString(R.string.p11_btn2)
                }
            }
        }

        binding.btn6Choice1.setOnClickListener {
            when (page) {
                "9","10" -> {
                    val intent = Intent(this, Activity8::class.java)
                    intent.putExtra(NamePage.page, "9")
                    startActivity(intent)
                    finish()
                }
                "11" -> {
                    val intent = Intent(this, Activity7::class.java)
                    intent.putExtra(NamePage.page, "12")
                    startActivity(intent)
                    finish()
                }
            }
        }
        binding.btn6Choice2.setOnClickListener {
            when (page) {
                "11" -> {
                    val intent = Intent(this, Activity7::class.java)
                    intent.putExtra(NamePage.page, "13")
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}