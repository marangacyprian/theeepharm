package com.example.pharmahelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.backpain.*

class MainActivity3 : AppCompatActivity() {

    private lateinit var handler: Handler
    val language= arrayOf<String>("Pharmacy Help","Pharmacy help production")
    val description=arrayOf<String>(
        "Are you looking for the best mobile pharmaceutical app.No need to worry any more The Pharmacy App Mobile has got your covered\n" +
                "\n" +
                "The app links more than a thousand kenyans in need of medicine daily.",
    "The pharmacy help app was programmed by Prof.Cyprian during his finally project in emobilis mobile training instute")
    val image = arrayOf<Int>(
        R.drawable.img_3,R.drawable.doctor)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val myListAdapter = PoseListAdapter(this,language,description,image)
        poselist.adapter = myListAdapter

        handler= Handler()
        handler.postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3500)
    }
}