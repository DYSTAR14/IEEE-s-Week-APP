package com.dystar.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i=0
        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "button was clicked")
            //Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()

            val text = "COUNT = "+i
            val duration = Toast.LENGTH_LONG
            var toast = Toast.makeText(this, text , duration)
            toast.show()
            i+=1
        }


    }
}