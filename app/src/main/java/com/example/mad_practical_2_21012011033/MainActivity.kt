package com.example.mad_practical_2_21012011033

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMessage("oncreate method is called.")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onstart method is called.")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onresume method is called")
    }
    
    fun showMessage(message: String){
        Log.i(TAG,message)
        Toast.makeText(this, message ,Toast.LENGTH_SHORT).show()
    }
}