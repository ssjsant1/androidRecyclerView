package com.example.apppractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apppractice.databinding.ActivityDettailsProfilesBinding

class dettails_profiles : AppCompatActivity() {

    private lateinit var binding: ActivityDettailsProfilesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDettailsProfilesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            onBackPressed()
        }
    }
}