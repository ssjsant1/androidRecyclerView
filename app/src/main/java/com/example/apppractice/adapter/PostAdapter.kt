package com.example.apppractice.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apppractice.PostModel
import com.example.apppractice.R

class PostAdapter(private val postList:List<PostModel>, private val onClickListener: (PostModel) -> Unit) : RecyclerView.Adapter<PostViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PostViewHolder(layoutInflater.inflate(R.layout.item_post, parent, false))
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val item = postList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = postList.size

}