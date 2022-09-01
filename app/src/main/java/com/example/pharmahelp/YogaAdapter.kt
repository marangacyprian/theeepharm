package com.example.pharmahelp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class YogaAdapter(private val context: Activity, private val title: Array<String>,
                  private val imgid:Array<Int>, private val yogas: Array<String>)
    : ArrayAdapter<String>(context,R.layout.yoga_custom,title) {
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.yoga_custom, null, true)
        val titleText = rowView.findViewById<TextView>(R.id.asanaName)
        val poseText = rowView.findViewById<TextView>(R.id.differname)
        val imageView = rowView.findViewById<ImageView>(R.id.asana)

        titleText.text = title[position]
     poseText.text = yogas[position]
        imageView.setImageResource(imgid[position])
        return rowView
    }
}