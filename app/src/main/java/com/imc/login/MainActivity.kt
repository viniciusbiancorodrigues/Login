package com.imc.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var email: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button: Button = findViewById(R.id.entrarbotao)
        email = findViewById(R.id.inputemail)

        button.setOnClickListener { chamarsegundatela() }


    }
    fun chamarsegundatela () {
        val segundatelaemail = email.text.toString()
        val intent = Intent ( this,SegundaTela::class.java)
        intent.putExtra("Email","$segundatelaemail")

        startActivity(intent)
    }
}
