package com.example.pharmahelp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter (private val context: Activity, private val title: Array<String>,
                     private val imgid:Array<Int>)
    : ArrayAdapter<String>(context,R.layout.customview,title){
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.customview,null, true)
        val titleText = rowView.findViewById<TextView>(R.id.title)
        val imageView = rowView.findViewById<ImageView>(R.id.type)

        titleText.text = title[position]
        imageView.setImageResource(imgid[position])

        return rowView

    }

}
