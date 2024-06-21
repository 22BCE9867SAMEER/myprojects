package com.sameer.signup2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val bnt = findViewById<Button>(R.id.button)
        val uid = findViewById<TextInputEditText>(   R.id.id)
        val ename = findViewById<TextInputEditText>(R.id.name)
        val password = findViewById<TextInputEditText>(R.id.password)
        val email = findViewById<TextInputEditText>(R.id.mail)

        bnt.setOnClickListener {
            val id = uid.text.toString()
            val name = ename.text.toString()
            val pass = password.text.toString()
            val mail = email.text.toString()
            val user = User(name , id,pass,mail)
            database =FirebaseDatabase.getInstance().getReference("User")
database.child(id).setValue(user).addOnSuccessListener {
    ename.text?.clear()
    email.text?.clear()
    password.text?.clear()
    uid.text?.clear()
    Toast.makeText(this,"user registered",Toast.LENGTH_SHORT).show()
}.addOnSuccessListener {
    Toast.makeText(this,"Failed ",Toast.LENGTH_SHORT).show()

}

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}