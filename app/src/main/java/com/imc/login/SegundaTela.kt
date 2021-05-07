package com.imc.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_segunda_tela.*


class SegundaTela : AppCompatActivity() {
    private lateinit var mockView: RecyclerView
    private lateinit var mockAdapter: Adapter
    private lateinit var mockLayoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)
        mockView = findViewById(R.id.mocklist)
        mockLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        mockView.layoutManager = mockLayoutManager

        getMock()



    }
    private fun getMock(){
        MockRetrofit.mockturn(::onMock,::onError)

    }
    private fun onMock(mocklist:List<Model>){
        mockAdapter = Adapter(mocklist)
        mockView.adapter = mockAdapter

    }
    private fun onError(){
        Toast.makeText(this,"DEU RUIM", Toast.LENGTH_SHORT).show()

    }

}
