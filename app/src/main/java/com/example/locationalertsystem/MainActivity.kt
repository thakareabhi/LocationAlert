package com.example.locationalertsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton = findViewById<Button>(R.id.button)



        // finding the edit text
        val editText = findViewById<EditText> (R.id.editText)

        val rootRef: DatabaseReference = FirebaseDatabase.getInstance().reference
        val demoRef: DatabaseReference = rootRef.child("Vibrate").child("LocationVar")
        val demoRef1: DatabaseReference = rootRef.child("Trial").child("B")

        showButton.setOnClickListener() {
            var str=editText.text.toString();
            if(str.equals(""))
            { }
            else
            {
                demoRef.setValue(str)
                Toast.makeText(applicationContext,"Location Updated",Toast.LENGTH_SHORT).show()
            }
        }


    }
}