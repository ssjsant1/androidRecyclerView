package com.example.apppractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apppractice.adapter.PostAdapter
import com.example.apppractice.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var linearStories: LinearLayout
    private lateinit var imageStories: ImageView
    private lateinit var textPhotoId: TextView
    private lateinit var insta: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

        linearStories = binding.linearStories
        imageStories = binding.storiesImages
        textPhotoId = binding.textPhotoId
        insta = binding.insta

    }


    private fun showError(){
        return Toast.makeText(this, "Conexion Error", Toast.LENGTH_SHORT).show()

    }

    private fun initRecyclerView(){
        binding.postRec.layoutManager = LinearLayoutManager(this)
        binding.postRec.adapter = PostAdapter(PostProvider.posts) { onItemSelected(it) }
    }

    private fun onItemSelected(postModel: PostModel){
        Toast.makeText(this, postModel.person, Toast.LENGTH_SHORT).show()
    }
}

