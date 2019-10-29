package com.example.responsi_388

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formbiodata.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val Hobi = Edit_Hobi.text
        val Nama = Edit_Nama.text
        val Umur = Edit_Umur.text
        val Email = Edit_Email.text
        val Username = Edit_Username.text
        val pass = Edit_Password.text
        val Jk= Edit_Jk.text

        prosses.setOnClickListener {
            intent = Intent(this,formbiodata::class.java)
            intent.putExtra("Hobi", Hobi)
            intent.putExtra("Nama", Nama)
            intent.putExtra("Umur",Umur)
            intent.putExtra("Email", Email)
            intent.putExtra("Username", Username)
            intent.putExtra("Jk",Jk)
            intent.putExtra("Password", pass)
            startActivity(intent)

        }
    }
}
