package com.example.arsipkoperasidanukmsumbar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.arsipkoperasidanukmsumbar.R
import com.example.arsipkoperasidanukmsumbar.model.ListPAD

class ListFilePADAdapter(private val listPAD:ArrayList<ListPAD>): RecyclerView.Adapter<ListFilePADAdapter.padViewHolder>(){
    private lateinit var myListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        myListener = listener
    }

    class padViewHolder(itemView: View, listener: onItemClickListener):RecyclerView.ViewHolder(itemView){
        val nama: TextView = itemView.findViewById(R.id.namaArsipPAD)
        init {
            itemView.setOnClickListener{
                listener.onItemClick(absoluteAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): padViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_arsip_pad, parent, false)
        return padViewHolder(view, myListener)
    }

    override fun onBindViewHolder(holder: padViewHolder, position: Int) {
        val posisi = listPAD[position]
        holder.nama.text = posisi.namafilepad
    }

    override fun getItemCount(): Int {
        return listPAD.size
    }
}