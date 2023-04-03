package com.example.minhaatividade

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.minhaatividade.databinding.ActivityLazerBinding

class LazerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLazerBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLazerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bt = binding.button2
        val usuarioNome = binding.textView2
        val nome = intent.getStringExtra("user")
        usuarioNome.text = "Olá meu amig@ "+nome + " seja bem vindo ao app de exercício mais recifense em linha reta"

        bt.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        //setContentView(R.layout.activity_lazer)
    }
}