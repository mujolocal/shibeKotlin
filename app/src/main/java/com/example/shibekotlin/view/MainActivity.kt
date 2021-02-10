package com.example.shibekotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.shibekotlin.R
import com.example.shibekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.txt.setText("run run run")
        setupButton()
    }
    private fun setupButton(){
        binding.request.setOnClickListener{
            Log.d(TAG, "setupButton: pressed")
            binding.outputText.text = "button pressed"
        }
    }
}