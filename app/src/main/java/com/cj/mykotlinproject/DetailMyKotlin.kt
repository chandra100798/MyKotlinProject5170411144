package com.cj.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail_my_kotlin.*

class DetailMyKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_my_kotlin)

        val bundle = intent.extras
        val nim = bundle?.get("id_nim")
        val nama = bundle?.get("id_nama")
        val nilai = bundle?.get("id_nilai")
        val keterangan = bundle?.get("id_keterangan")
        tv_Nim.text=nim.toString()
        tv_Nama.text=nama.toString()
        tv_Nilai.text=nilai.toString()
        tv_Keterangan.text=keterangan.toString()
    }
}
