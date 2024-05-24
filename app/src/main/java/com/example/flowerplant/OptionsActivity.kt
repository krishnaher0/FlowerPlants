package com.example.flowerplant

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.flowerplant.databinding.ActivityOptionsBinding

class OptionsActivity : AppCompatActivity() {
    lateinit var optionsActivityBinding: ActivityOptionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        optionsActivityBinding=ActivityOptionsBinding.inflate(layoutInflater)
        setContentView(optionsActivityBinding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        optionsActivityBinding.button3.setOnClickListener {
            val  intent= Intent(this@OptionsActivity,Login_Activity::class.java)
            startActivity(intent)
        }
        optionsActivityBinding.button3.setOnClickListener {
            val  intent= Intent(this@OptionsActivity,Login_Activity::class.java)
            startActivity(intent)
        }
    }
}