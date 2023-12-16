package com.victorbarrozo.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.victorbarrozo.fragmenttest.fragmente.CamadasFragment
import com.victorbarrozo.fragmenttest.fragmente.ConversasFragment

class MainActivity : AppCompatActivity() {
    private lateinit var btnConversas : Button
    private lateinit var btnChamadas : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas = findViewById(R.id.btn_chamadas)

        btnConversas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo,ConversasFragment())
                .commit()
        }
        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo,CamadasFragment())
                .commit()
        }


    }

}