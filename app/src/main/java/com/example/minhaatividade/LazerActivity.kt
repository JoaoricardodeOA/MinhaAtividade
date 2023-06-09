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

        val btAdd = binding.button3
        val btLugares = binding.button4
        val bt = binding.button2
        val usuarioNome = binding.textView2
        val nome = " "+intent.getStringExtra("user")+"! "
        usuarioNome.text = getString(R.string.intro) + nome + getString(R.string.intro2)
        bt.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        btAdd.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
        btLugares.setOnClickListener {
            val intent = Intent(this, LugaresActivity::class.java)
            startActivity(intent)
        }

        //setContentView(R.layout.activity_lazer)
    }
}