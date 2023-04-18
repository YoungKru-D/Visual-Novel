package com.tsu.visualnovel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tsu.visualnovel.databinding.Activity4Binding

class Activity4 : AppCompatActivity() {
    private lateinit var binding: Activity4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val page = intent.getStringExtra(NamePage.page).toString()

        if (page != null) {
            when (page) {
                "4" -> {
                    //binding.layout.background = getDrawable(R.drawable.walking)
                    binding.img4View.setImageResource(R.drawable.walking)
                    //imageView.setImageResource(R.drawable.walking)
                    binding.text4Edit.text = getString(R.string.p4_question)
                    binding.btn4GoHome.text = getString(R.string.p4_btn1)
                    binding.btn4Halloween.text = getString(R.string.p4_btn2)
                }
                "5" -> {
                    //binding.layout.background = getDrawable(R.drawable.hiking)
                    binding.img4View.setImageResource(R.drawable.hiking)
                    //imageView.setImageResource(R.drawable.hiking)
                    binding.text4Edit.text = getString(R.string.p5_question)
                    binding.btn4GoHome.text = getString(R.string.p5_btn1)
                    binding.btn4Halloween.text = getString(R.string.p5_btn2)
                }
                "6" -> {
                    //binding.layout.background = getDrawable(R.drawable.field)
                    binding.img4View.setImageResource(R.drawable.field)
                    //imageView.setImageResource(R.drawable.field)
                    binding.text4Edit.text= getString(R.string.p6_question)
                    binding.btn4GoHome.text = getString(R.string.p6_btn1)
                    binding.btn4Halloween.text = getString(R.string.p6_btn2)
                }
            }
        }else { }

        binding.btn4GoHome.setOnClickListener {
            val intent = Intent(this, Activity5::class.java)
            intent.putExtra(NamePage.page, "7")
            startActivity(intent)
            finish()
        }

        binding.btn4Halloween.setOnClickListener {
            val intent = Intent(this, Activity5::class.java)
            intent.putExtra(NamePage.page, "8")
            startActivity(intent)
            finish()
        }
    }
}