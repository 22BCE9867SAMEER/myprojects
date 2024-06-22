package com.sameer.changecolor

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val bntd = findViewById<Button>(R.id.button)
        val bnty = findViewById<Button>(R.id.button2)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)
        bntd.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
        bnty.setOnClickListener {

             Toast.makeText(applicationContext, "yellolw color!", Toast.LENGTH_LONG).show()
            layout.setBackgroundResource(R.color.yellow)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.linearlayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}