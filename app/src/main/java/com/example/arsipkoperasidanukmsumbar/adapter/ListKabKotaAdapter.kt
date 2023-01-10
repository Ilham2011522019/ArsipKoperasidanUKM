package com.example.arsipkoperasidanukmsumbar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.arsipkoperasidanukmsumbar.R
import com.example.arsipkoperasidanukmsumbar.model.ListKabKota
import com.google.android.material.imageview.ShapeableImageView

class ListKabKotaAdapter(private val listkabkota:ArrayList<ListKabKota>): RecyclerView.Adapter<ListKabKotaAdapter.kabkotaViewHolder>()  {
    private lateinit var myListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        myListener = listener
    }

    class kabkotaViewHolder(itemView: View, listener: onItemClickListener):RecyclerView.ViewHolder(itemView){
        val logo: ShapeableImageView = itemView.findViewById(R.id.logokabkota)
        val nama: TextView = itemView.findViewById(R.id.namaKabkota)
        init {
            itemView.setOnClickListener{
                listener.onItemClick(absoluteAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): kabkotaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_kabkota, parent, false)
        return kabkotaViewHolder(view, myListener)
    }

    override fun onBindViewHolder(holder: kabkotaViewHolder, position: Int) {
        val posisi = listkabkota[position]
        holder.logo.setImageResource(posisi.logokabkota)
        holder.nama.text = posisi.namakabkota
    }

    override fun getItemCount(): Int {
        return listkabkota.size
    }
}