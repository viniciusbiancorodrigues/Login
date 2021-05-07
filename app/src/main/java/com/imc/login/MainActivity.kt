package com.imc.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.utils.widget.MockView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button = findViewById(R.id.entrarbotao)


        button.setOnClickListener { chamarsegundatela() }
        entrarbotao.setOnClickListener{
            checkLogin()
        }

    }

    fun chamarsegundatela() {

        val intent = Intent(this, MockActivity::class.java)


        startActivity(intent)


    }

    private fun checkLogin() {
        val email: String = inputemail.text.toString()
        val senha: String = inputsenha.text.toString()
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, senha).addOnCompleteListener {
            if (it.isSuccessful) {
                val intent = Intent(this, SegundaTela::class.java)
                startActivity(intent)
            }
        }.addOnFailureListener {


        }
    }
}
