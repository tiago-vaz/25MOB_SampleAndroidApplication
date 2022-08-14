package com.example.a25mob_sampleandroidapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.login)

        btnLogin.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val btnCadatro = findViewById<Button>(R.id.cadastro)

        btnCadatro.setOnClickListener{
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        val btnUserInfo = findViewById<Button>(R.id.userinfo)

        btnUserInfo.setOnClickListener {
            val intent = Intent(this, UserInfoActivity::class.java)
            startActivity(intent)
        }

    }
}