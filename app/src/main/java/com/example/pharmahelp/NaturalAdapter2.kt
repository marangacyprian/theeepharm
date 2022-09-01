package com.example.pharmahelp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class NaturalAdapter2(private val context: Activity, private val title: Array<String>,
                      private val imgid:Array<Int>, private val price:Array<String>)
    : ArrayAdapter<String>(context,R.layout.custom_natural1,title){
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_natural1,null, true)
        val titleText = rowView.findViewById<TextView>(R.id.natName)
        val imageView = rowView.findViewById<ImageView>(R.id.nat)
        val priceText = rowView.findViewById<TextView>(R.id.natoprice)

        titleText.text = title[position]
        imageView.setImageResource(imgid[position])
        priceText.text=price[position]

        return rowView

    }

}