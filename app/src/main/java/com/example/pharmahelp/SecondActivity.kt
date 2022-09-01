package com.example.pharmahelp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ImageButton
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.profile_activity.*

class SecondActivity: AppCompatActivity() {
    lateinit var imageButton: ImageButton

    val language = arrayOf<String>("Homeopathic", "Natural", "Allopathic", "Yoga")
    val image = arrayOf<Int>(
        R.drawable.homeopath, R.drawable.natural, R.drawable.allopathic,R.drawable.yoga)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        imageButton=findViewById(R.id.imagebtn1)
        imageButton.setOnClickListener{
            val intent=Intent(this,CartActivity::class.java)
            startActivity(intent)
        }


        val myListAdapter = MyListAdapter(this, language, image)
        list.adapter = myListAdapter
        list.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->


            if (position == 0) {
                intent = Intent(applicationContext, HomeopathicActivity::class.java)
                startActivityForResult(intent, 0)
            }
            if (position == 1) {
                intent = Intent(applicationContext, NaturalActivity::class.java)
                startActivityForResult(intent, 0)
            }
            if (position == 3) {
                intent = Intent(applicationContext, YogaActivity::class.java)
                startActivityForResult(intent, 0)
            }
            if (position == 2) {
                intent = Intent(applicationContext, AllopathicActivity::class.java)
                startActivityForResult(intent, 0)
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
            menuInflater.inflate(R.menu.nemu_main,menu)
            return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
        menu?.getItem(2)?.setEnabled(false)}
        else{
            menu?.getItem(2)?.setEnabled(true)
            menu?.getItem(1)?.setEnabled(false)}
       return super.onPrepareOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when(item.itemId){
           R.id.profile->{
               val user = FirebaseAuth.getInstance().currentUser
               if (user != null) {
               intent= Intent(applicationContext,Profile::class.java)
               startActivity(intent)
                return true}
           else{
                   Toast.makeText(this@SecondActivity,"You are Not Signed In Currently",Toast.LENGTH_SHORT).show()
               }}

           R.id.SignOut->{
                   FirebaseAuth.getInstance().signOut()
                   Toast.makeText(applicationContext,"You have signed out succesfully",Toast.LENGTH_LONG).show()
                     return true}
           R.id.SignIn->{
                        intent= Intent(applicationContext,MainActivity::class.java)
                        startActivity(intent)
                        finish()
               return true
               }
       }
        return super.onOptionsItemSelected(item)
    }

}