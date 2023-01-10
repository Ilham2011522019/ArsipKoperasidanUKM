package com.example.arsipkoperasidanukmsumbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arsipkoperasidanukmsumbar.adapter.ListFilePADAdapter
import com.example.arsipkoperasidanukmsumbar.adapter.ListKabKotaAdapter
import com.example.arsipkoperasidanukmsumbar.databinding.ActivityListArsipBinding
import com.example.arsipkoperasidanukmsumbar.model.ListKabKota
import com.example.arsipkoperasidanukmsumbar.model.ListPAD
import java.util.ArrayList

class ListArsipActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityListArsipBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var listpad: ArrayList<ListPAD>
    private lateinit var adapter: ListFilePADAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListArsipBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle : Bundle? = intent.extras
        val namakabkota = bundle!!.getString("namakabkota")

        binding.textView8.text = namakabkota

        recyclerView = findViewById(R.id.recycler_view5)
        recyclerView.layoutManager = LinearLayoutManager(this)
        supportActionBar?.hide()

//        setContentView(R.layout.activity_list_arsip)

        listpad = ArrayList()
        listpad.add(ListPAD("PAD_KoperasiA_2019"))
        listpad.add(ListPAD("PAD_KoperasiA_2020"))
        listpad.add(ListPAD("PAD_KoperasiA_2022"))

        adapter = ListFilePADAdapter(listpad)
        recyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : ListFilePADAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
            }
        })
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}