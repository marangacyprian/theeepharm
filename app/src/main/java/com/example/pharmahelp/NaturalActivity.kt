package com.example.pharmahelp

import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.homeopathic.*
import kotlinx.android.synthetic.main.natural.*

class NaturalActivity: AppCompatActivity() {
    val language = arrayOf<String>(
        "AdelPekana 20ml",
        "Berberis Pentarkan 20g",
        "Chestal Honey Multisymptom Formula",
        "Similasan Pink eye Relief",
        "Tussistin 200ml",
        "Trimohilis weight Management 900 Tablets",
        "calculus repl Dr.advice"
    )
    val price =
        arrayOf<String>( "ksh.350", "Ksh.152", "ksh.500", "ksh.200", "ksh.356", "ksh.290", "Ksh.1100")
    val image = arrayOf<Int>(
        R.drawable.adel,
        R.drawable.berberis,
        R.drawable.chestalhoney,
        R.drawable.similasan,
        R.drawable.tussistin,
        R.drawable.trimohilis,
        R.drawable.calculus
    )
    val language1 = arrayOf<String>("Marich:Organic 100gm","Tulsi:Strong Essence packet Leaves","Ginger(adrak)","Tulsi Planting Seeds 100 gm")
    val price1 =
        arrayOf<String>("ksh.300", "ksh.400", "ksh.350", "ksh.152")
    val image1 = arrayOf<Int>(
        R.drawable.marich,
        R.drawable.tulsi,
        R.drawable.adrak,
        R.drawable.fruit)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.natural)
        val natListAdapter = NaturalAdapter(this, language, image, price)
        naturalList.adapter = natListAdapter
        val nat1ListAdapter = NaturalAdapter(this, language1, image1, price1)
        naturalList2.adapter = nat1ListAdapter
        naturalList.onItemClickListener = AdapterView.OnItemClickListener { _, _, _, _ ->

                Toast.makeText(this@NaturalActivity, "Sorry!! Its a Virtual App. Shopping not possible ",
                    Toast.LENGTH_LONG).show()
            }
        naturalList2.onItemClickListener = AdapterView.OnItemClickListener { _, _, _, _ ->

            Toast.makeText(this@NaturalActivity, "Sorry!! Its a Virtual App. Shopping not possible ",
                Toast.LENGTH_LONG).show()
        }
        }
    }
