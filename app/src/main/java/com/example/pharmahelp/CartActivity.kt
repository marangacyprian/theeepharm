package com.example.pharmahelp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.allopathic.*

class CartActivity : AppCompatActivity() {

    val language = arrayOf<String>("Sanofi", "pharmax")
    val image = arrayOf<Int>(
        R.drawable.index, R.drawable.index2)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val myListAdapter = MyListAdapter(this, language, image)
        list.adapter = myListAdapter

        list.onItemClickListener = AdapterView.OnItemClickListener { _, _, _, _ ->
            Toast.makeText(this@CartActivity, "Sorry!! Its a Virtual App. Shopping not possible ",
                Toast.LENGTH_LONG).show()
        }
    }
}