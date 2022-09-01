package com.example.pharmahelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.view.WindowManager
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            login.setOnClickListener {
                val email = userid.text.toString()
                val password = password.text.toString()
                FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener {
                        if (!it.isSuccessful) return@addOnCompleteListener

                        Log.d("login", "successful")
                        intent = Intent(this, SecondActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
                        startActivity(intent)
                    }
                    .addOnFailureListener {
                        Toast.makeText(this, "login failure", Toast.LENGTH_SHORT).show()
                    }

            }

             sign.setOnClickListener {
                intent = Intent(this, SignUpActivity::class.java)
                startActivity(intent)
            }
        }



            }
    }




