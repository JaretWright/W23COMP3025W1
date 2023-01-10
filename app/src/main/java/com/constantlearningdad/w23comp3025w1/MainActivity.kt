package com.constantlearningdad.w23comp3025w1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.constantlearningdad.w23comp3025w1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //define a variable to associate the elements
    //in the view to be accessible in this controller class
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //initialize the binding variable to the objects in the
        //ActivityMainBinding class
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //create a click listener for the button that will read from
        //EditText and update the name below in the textView
        binding.submitButton.setOnClickListener {
            var name = binding.nameEditText.text
            binding.textView.text="Hello " + name
        }
    }
}