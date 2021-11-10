package com.example.threebuttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var ConsLO: ConstraintLayout
    lateinit var ET1: EditText
    lateinit var ET2: EditText
    lateinit var ET3: EditText
    lateinit var TostBtn: Button
    lateinit var TVBtn: Button
    lateinit var ActivityBtn: Button
    lateinit var TV1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConsLO = findViewById(R.id.ConsLO)
        ET1 = findViewById(R.id.ET1)
        ET2 = findViewById(R.id.ET2)
        ET3 = findViewById(R.id.ET3)
        TostBtn = findViewById(R.id.TostBtn)
        TVBtn = findViewById(R.id.TVBtn)
        ActivityBtn = findViewById(R.id.ActivityBtn)
        TV1 = findViewById(R.id.TV1)

        TVBtn.setOnClickListener {
            TV1.text = ET2.text
        }

        TostBtn.setOnClickListener {
            Toast.makeText(this, "${ET1.text}", Toast.LENGTH_LONG).show()
        }

        ActivityBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("text", "${ET3.text}")
            startActivity(intent)
        }

    }//end oncreate

}//end class