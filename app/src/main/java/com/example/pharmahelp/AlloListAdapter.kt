package com.example.pharmahelp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.allo_custom.*


class AlloListAdapter(private val context: Activity, private val title: Array<String>,
                      private val imgid:Array<Int>, private val price:Array<String>)
    : ArrayAdapter<String>(context,R.layout.allo_custom,title){
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.allo_custom,null, true)
        val titleText = rowView.findViewById<TextView>(R.id.alloName)
        val imageView = rowView.findViewById<ImageView>(R.id.allo)
        val priceText = rowView.findViewById<TextView>(R.id.alloprice)
        titleText.text = title[position]
        imageView.setImageResource(imgid[position])
        priceText.text=price[position]

        return rowView }
}
