package com.example.tugasmodule

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JodohAdapter(private val jodohList: ArrayList<Jodoh>)
    :RecyclerView.Adapter<JodohAdapter.JodohViewHolder>(){
    class JodohViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgJodoh = view.findViewById<ImageView>(R.id.foto)
        val nameJodoh = view.findViewById<TextView>(R.id.nama)
        val descJodoh = view.findViewById<TextView>(R.id.description)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JodohViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_jodoh, parent, false)
        return JodohViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: JodohViewHolder, position: Int) {
        val currentItem = jodohList[position]
        holder.imgJodoh.setImageResource(currentItem.imgJodoh)
        holder.nameJodoh.text = (currentItem.nameJodoh)
        holder.descJodoh.text = (currentItem.descJodoh)
    }

    override fun getItemCount(): Int = jodohList.size
}