package com.example.arsipkoperasidanukmsumbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ListArsipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_arsip)

        supportActionBar?.hide()
    }
}