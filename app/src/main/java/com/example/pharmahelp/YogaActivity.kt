package com.example.pharmahelp

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.allopathic.*
import kotlinx.android.synthetic.main.yoga_activity.*

class YogaActivity: AppCompatActivity() {


    val language = arrayOf<String>(
        "Backpain",
        "Thyroid",
        "Diabetes",
        "Weight Loss",
        "Knee Pain",
        "Weight Gain",
        "Healthy Mind & Migraine",
        "Menstrual Pain")
    val yogas = arrayOf<String>(
        "Cat-Cow Pose,Plow Pose,Seated Forward Fold....",
        "Cobra Pose-BhajungaAsana,Bridge Pose-Setu BandhaAsana,Fish Pose....",
        "These are not Designed Yet!Please Try the Upper Two",
        "These are not Designed Yet!Please Try the Upper Two",
        "These are not Designed Yet!Please Try the Upper Two",
        "These are not Designed Yet!Please Try the Upper Two",
        "These are not Designed Yet!Please Try the Upper Two",
        "These are not Designed Yet!Please Try the Upper Two")
    val image = arrayOf<Int>(
        R.drawable.backpain,
        R.drawable.thyroid,
        R.drawable.yogaphoto,
        R.drawable.weightloss,
        R.drawable.kneepain,
        R.drawable.weightgain,
        R.drawable.meditate,
        R.drawable.yoga

        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.yoga_activity)
        val yogaListAdapter = YogaAdapter(this, language, image,yogas)
        yogaList.adapter = yogaListAdapter
        yogaList.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            /*
            Toast.makeText(this@SecondActivity, " Clicked Position: " + (position + 1),
                Toast.LENGTH_SHORT).show()*/
            if (position == 0) {
                intent = Intent(applicationContext, backpainActivity::class.java)
                startActivityForResult(intent, 0)
            }
            if (position == 1) {
                intent = Intent(applicationContext, thyroidActivity::class.java)
                startActivityForResult(intent, 0)
            }

    }
}
}