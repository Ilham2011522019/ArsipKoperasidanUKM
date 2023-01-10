package com.example.arsipkoperasidanukmsumbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arsipkoperasidanukmsumbar.adapter.ListKabKotaAdapter
import com.example.arsipkoperasidanukmsumbar.databinding.ActivityListArsipBinding
import com.example.arsipkoperasidanukmsumbar.databinding.ActivityListKabKotaBinding
import com.example.arsipkoperasidanukmsumbar.model.ListKabKota
import java.util.ArrayList

class List_KabKota : AppCompatActivity() {

    private lateinit var binding: ActivityListKabKotaBinding
    private lateinit var recyclerView: RecyclerView
    lateinit var listkabkota: ArrayList<ListKabKota>
    lateinit var adapter: ListKabKotaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListKabKotaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = findViewById(R.id.recycler_view6)
        recyclerView.layoutManager = LinearLayoutManager(this)
//        setContentView(R.layout.activity_list_kab_kota)
        supportActionBar?.hide()

        listkabkota = ArrayList()
        listkabkota.add(ListKabKota(R.drawable.kab_agam,"Agam"))
        listkabkota.add(ListKabKota(R.drawable.logo_padang_pariaman,"Padang Pariaman"))
        listkabkota.add(ListKabKota(R.drawable.logo_padang,"Padang"))
        listkabkota.add(ListKabKota(R.drawable.logo_pariaman,"Pariaman"))
        listkabkota.add(ListKabKota(R.drawable.logo_padang_panjang,"Padang Panjang"))
        listkabkota.add(ListKabKota(R.drawable.logo_pessel,"Pesisir Selatan"))
        listkabkota.add(ListKabKota(R.drawable.logo_dharmasraya,"Dhamasraya"))
        listkabkota.add(ListKabKota(R.drawable.logo_mentawai,"Kepulauan Mentawai"))
        listkabkota.add(ListKabKota(R.drawable.logo_kab_50_kota,"Kabupaten 50 Kota"))
        listkabkota.add(ListKabKota(R.drawable.logo_pasaman,"Pasaman"))
        listkabkota.add(ListKabKota(R.drawable.logo_pasaman_barat,"Pasaman Barat"))
        listkabkota.add(ListKabKota(R.drawable.logo_sijunjung,"Sijunjung"))
        listkabkota.add(ListKabKota(R.drawable.logo_kota_solok,"Kota Solok"))
        listkabkota.add(ListKabKota(R.drawable.logo_solok,"Kabupaten Solok"))
        listkabkota.add(ListKabKota(R.drawable.logo_solok_selatan,"Kabupaten Solok Selatan"))
        listkabkota.add(ListKabKota(R.drawable.logo_tanah_datar,"Tanah Datar"))
        listkabkota.add(ListKabKota(R.drawable.logo_bukittinggi,"Bukittingi"))
        listkabkota.add(ListKabKota(R.drawable.logo_payakumbuh,"Payakumbuh"))
        listkabkota.add(ListKabKota(R.drawable.logo_sawahlunto,"Sawahlunto"))

        adapter = ListKabKotaAdapter(listkabkota)
        recyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : ListKabKotaAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(this@List_KabKota, ListArsipActivity::class.java)
                intent.putExtra("namakabkota", listkabkota[position].namakabkota)
                startActivity(intent)
            }
        })
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
//    fun ke_listArsip(view: View) {
//        intent = Intent(this, ListArsipActivity::class.java)
//        startActivity(intent)
//    }
}