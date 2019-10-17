package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

// : = extends
class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        //super class
        super.onCreate(savedInstanceState)

        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO : Continue work here
        //val = value, var = variable(changeable)
        //Java int x; vs Kotlin val x : Int
        //findViewById = link program to UI
        val buttonClickMe : Button = findViewById(R.id.buttonClickMe)
        buttonClickMe.setOnClickListener { showMessage() }
    }

    private fun showMessage() {
        val testViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.hello))
    }
}
