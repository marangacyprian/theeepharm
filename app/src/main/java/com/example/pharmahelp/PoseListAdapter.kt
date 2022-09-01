package com.example.pharmahelp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class PoseListAdapter(private val context: Activity, private val title: Array<String>, private val description: Array<String>,
                      private val imgid:Array<Int>)
    : ArrayAdapter<String>(context,R.layout.custom_yoga,title){
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_yoga, null, true)
        val titleText = rowView.findViewById<TextView>(R.id.title)
        val imageView = rowView.findViewById<ImageView>(R.id.imageview)
        val subtitleText = rowView.findViewById<TextView>(R.id.description)
        titleText.text = title[position]
        imageView.setImageResource(imgid[position])
        subtitleText.text = description[position]
        return rowView
    }

    }