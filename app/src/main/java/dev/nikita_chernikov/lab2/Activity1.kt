package dev.nikita_chernikov.lab2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dev.nikita_chernikov.lab2.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {
    private lateinit var binding: Activity1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.button1.setOnClickListener {
            val startActivity2Intent = Intent(this, Activity2::class.java)
            startActivity(startActivity2Intent)
        }
        binding.button2.setOnClickListener {
            val startActivity3Intent = Intent(this, Activity3::class.java)
            startActivity(startActivity3Intent)
        }
        binding.button3.setOnClickListener {
            val startActivity4Intent = Intent(this, Activity4::class.java)
            startActivity(startActivity4Intent)
        }
        binding.button4.setOnClickListener {
            finish()
        }
    }
}
