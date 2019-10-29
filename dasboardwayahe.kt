package com.example.responsi_388

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dasboardwayahe.*
import kotlinx.android.synthetic.main.activity_formbiodata.*

class dasboardwayahe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasboardwayahe)
        val bundle = intent.extras
        val getEmail = bundle?.get("Email")
        val getName = bundle?.get("Nama")
        val getHobi = bundle?.get("Hobi")
        val getUmur = bundle?.get("Umur")
        val getJk = bundle?.get("Jk")
        val getUsername =bundle?.get("Username")
        val getPassword = bundle?.get("Password")

        Hobi1.text = getHobi.toString()
        Nama1.text = getName.toString()
        Umur1.text = getUmur.toString()
        Email1.text= getEmail.toString()
        Username1.text= getUsername.toString()
        Password1.text= getPassword.toString()
        Jk1.text= getJk.toString()
    }
}
