package com.example.responsi_388

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_formbiodata.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.Password1
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val Username1 = Username1.text.toString()
            val Password1 = Password1.text.toString()
            if (Username1.isEmpty()|| Password1.isEmpty()){
            Toast.makeText(this, " Please Insert Username and password",Toast.LENGTH_SHORT).show()
        }
            else if (Username1=="Deva01"|| Password1=="Deva011"){
                val progressDialog= ProgressDialog(this,R.style.Theme_AppCompat_Light_Dialog)
                progressDialog.setMessage("authenticating")
                progressDialog.show()
                val intent = Intent(this,dasboardwayahe::class.java)
                intent.putExtra("Email","hkptvrecord@gmail.com")
                intent.putExtra("Nama","Deva Tuswidya")
                intent.putExtra("Jk","Laki laki")
                intent.putExtra("Username","Deva01")
                intent.putExtra("Password","Deva001")
                intent.putExtra("Hobi","Sepak Bola")
                startActivity(intent)
                finish()
            }
        }
        btn1.setOnClickListener {
            val intent = Intent(this,register::class.java)
            startActivity(intent)
            finish()
        }

    }
}
