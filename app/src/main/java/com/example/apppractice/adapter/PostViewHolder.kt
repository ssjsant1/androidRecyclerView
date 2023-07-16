package com.example.apppractice.adapter

import android.content.DialogInterface.OnClickListener
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apppractice.PostModel
import com.example.apppractice.R
import com.example.apppractice.databinding.ItemPostBinding
import com.example.apppractice.dettails_profiles

class PostViewHolder (val view:View): RecyclerView.ViewHolder(view) {

    val binding = ItemPostBinding.bind(view)



    fun render(postModel: PostModel, onClickListener: (PostModel) -> Unit ){
         binding.nameAvatar.text = postModel.person
         Glide.with(binding.postPhoto.context).load(postModel.photo).into(binding.postPhoto)
         Glide.with(binding.avatarImage.context).load(postModel.photo).into(binding.avatarImage)
        itemView.setOnClickListener{
            onClickListener(postModel)
        }
        binding.postPhoto.setOnClickListener {
            val intent = Intent(view.context, dettails_profiles::class.java)
            view.context.startActivity(intent)
        }
//        itemView.setOnClickListener{
//            Toast.makeText(binding.postPhoto.context,postModel.person,Toast.LENGTH_SHORT).show()
//
//        }
    }
}