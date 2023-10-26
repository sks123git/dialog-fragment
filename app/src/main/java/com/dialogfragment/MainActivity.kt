package com.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var textView1: TextView
    lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.showDialog)
        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)

        button.setOnClickListener {
            val fragmentManager: FragmentManager = supportFragmentManager
            val myDialogFragment = MyDialogFragment()
            myDialogFragment.show(fragmentManager,"MyDialogFragment")
        }
    }

    fun getUserData(name: String, age: Int) {
        textView1.text = name
        textView2.text = age.toString()
    }
}