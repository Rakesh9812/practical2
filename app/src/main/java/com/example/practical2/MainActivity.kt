package com.example.practical2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "oncreate function called.", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onstart function called.", Toast.LENGTH_SHORT).show()
        Log.i(TAG, "onStart function called")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onpause function called.", Toast.LENGTH_SHORT).show()
        Log.i(TAG, "onpause function called")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume function called.", Toast.LENGTH_SHORT).show()
        Log.i(TAG, "onresume function called")
     }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onstop function called.", Toast.LENGTH_SHORT).show()
        Log.i(TAG, "onstop function called")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onrestart function called.", Toast.LENGTH_SHORT).show()
        Log.i(TAG, "onrestart function called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "ondestroy function called.", Toast.LENGTH_SHORT).show()
        Log.i(TAG, "onDestroy function called")
    }
}