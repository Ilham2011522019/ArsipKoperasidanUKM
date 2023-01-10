package com.example.arsipkoperasidanukmsumbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class List_KabKota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_kab_kota)
        supportActionBar?.hide()
    }
    fun ke_listArsip(view: View) {
        intent = Intent(this, ListArsipActivity::class.java)
        startActivity(intent)
    }
}