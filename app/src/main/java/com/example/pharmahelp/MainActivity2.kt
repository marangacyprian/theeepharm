package com.example.pharmahelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity2 : AppCompatActivity() {

    private lateinit var handler:Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        handler=Handler()
        handler.postDelayed({
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        },1500)
    }
}