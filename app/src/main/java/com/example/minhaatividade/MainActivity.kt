package com.example.minhaatividade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.minhaatividade.databinding.ActivityMainBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private  lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bt = binding.button
        val ed = binding.editTextTextPersonName
        val senha = binding.editTextTextPassword


        bt.setOnClickListener{
            //val database = Firebase.database
            //val myRef = database.getReference("message")

            //myRef.setValue("Hello, mundinho!")
            if (ed.text.toString().equals("joao") && senha.text.toString().equals("123")){
                val texto = ed.text.toString()
                val intent = Intent(this, LazerActivity::class.java)
                intent.putExtra("user", texto)
                startActivity(intent)
            }else{
                Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()
            }
        }

        //setContentView(R.layout.activity_main)
    }
}