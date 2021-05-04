package com.imc.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)
        var email:String? = intent.getStringExtra("Email").toString()
        var textviewemail : TextView = findViewById(R.id.mostraremail)
        textviewemail.setText("$email")
    }
}
