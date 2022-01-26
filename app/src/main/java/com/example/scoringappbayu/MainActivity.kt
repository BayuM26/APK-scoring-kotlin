package com.example.scoringappbayu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var hasil1 = 0
    var hasil2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hasiltim1:TextView = findViewById(R.id.tv_t1)
        val hasiltim2:TextView = findViewById(R.id.tv_t2)

        val btn_tim1:Button = findViewById(R.id.btn_t1)



        btn_tim1.setOnClickListener {
            hasil1++

            hasiltim1.setText("" + hasil1)
        }

        val btn_tim2:Button = findViewById(R.id.btn_t2)
        btn_tim2.setOnClickListener {
            hasil2++

            hasiltim2.setText("" + hasil2)
        }

        val btn_toats:Button = findViewById(R.id.btn_toats)
        btn_toats.setOnClickListener {
            if (hasil1 == hasil2){
                Toast.makeText(this, "Hasil Seimbang", Toast.LENGTH_SHORT).show()
            }
            else if(hasil1 > hasil2){
                Toast.makeText(this, "tim 1 menang", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "tim 2 menang", Toast.LENGTH_SHORT).show()
            }


        }

    }

}