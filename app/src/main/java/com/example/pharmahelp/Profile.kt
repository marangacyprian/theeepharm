package com.example.pharmahelp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.profile_activity.*

class Profile: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {

            val email = user.email.toString()
            userMail.setText(email).toString()

        }

        newpass.setOnClickListener {
            var auth = FirebaseAuth.getInstance()

            val email = user!!.email.toString()
            auth.sendPasswordResetEmail(email).addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(this@Profile, "Password Send to Your Registered Email:\n"+"Please Login Again with the new password", Toast.LENGTH_LONG).show()
                     FirebaseAuth.getInstance().signOut()
                    finish()

                }
                else{
                    Toast.makeText(this@Profile,it.exception!!.message,Toast.LENGTH_LONG).show()

                }
            }


        }
        orders.setOnClickListener {
            Toast.makeText(this@Profile, "Nothing To Show in Orders", Toast.LENGTH_LONG).show()

        }
        signOut.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            Toast.makeText(applicationContext, "You have signed out succesfully", Toast.LENGTH_LONG).show()
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}






