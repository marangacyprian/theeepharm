package com.example.pharmahelp

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.allo_custom.*
import kotlinx.android.synthetic.main.allopathic.*

class AllopathicActivity:AppCompatActivity() {


    val language = arrayOf<String>(
        "Benedryl",
        "Mucinex-DM",
        "Starlix",
        "Advil",
        "Sudafed",
        "Mucinex",
        "Sulfonyluria",
        "Tyleno",
        "benedryl"
    )
    val price =
        arrayOf<String>("ksh.300", "Ksh.400", "Ksh.350", "Ksh.200", "Ksh.200", "ksh.200", "Ksh.200", "Ksh.200", "Ksh.200")
    val image = arrayOf<Int>(
        R.drawable.benedryl,
        R.drawable.mucinex,
        R.drawable.starlix,
        R.drawable.advil,
        R.drawable.sudafed,
        R.drawable.mucinex,
        R.drawable.sulfonyluria,
        R.drawable.tylenol,
        R.drawable.benedryl
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.allopathic)
        val alloListAdapter = AlloListAdapter(this, language, image, price)
        alloList.adapter = alloListAdapter
        alloList.onItemClickListener = AdapterView.OnItemClickListener { _, _, _, _ ->

            Toast.makeText(this@AllopathicActivity, "Sorry!! Its a Virtual App. Shopping not possible ",
                Toast.LENGTH_LONG).show()
        }
    }

    }



