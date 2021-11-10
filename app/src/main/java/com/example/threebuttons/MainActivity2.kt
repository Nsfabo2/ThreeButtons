package com.example.threebuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var TV2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        TV2 = findViewById(R.id.TV2)
        val text = intent.getStringExtra("text")
        TV2.text = text

    }//end oncreate

}//end class