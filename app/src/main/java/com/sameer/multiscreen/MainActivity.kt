package com.sameer.multiscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object{
        const val KEY = "com.sameer.multiscreen.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val bnt = findViewById<Button>(R.id.button3)

        val edit1 = findViewById<EditText>(R.id.editTextText3)
        val edit2 = findViewById<EditText>(R.id.editTextText4)
        val edit3 = findViewById<EditText>(R.id.editTextText5)
        val edit4 = findViewById<EditText>(R.id.editTextText6)

        bnt.setOnClickListener {
            val oderslist = edit1.text.toString() + " "+edit2.text.toString()+" "+edit3.text.toString() + " "+edit4.text.toString()
            intent = Intent(this ,ordersactivity::class.java)
            intent.putExtra(KEY ,oderslist)
            startActivity(intent)

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}