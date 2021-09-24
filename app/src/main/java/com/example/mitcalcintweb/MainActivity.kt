package com.example.mitcalcintweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Btn_Calc.setOnClickListener {
            val hesabu=Intent(this,CalculatorActivity::class.java)
            startActivity(hesabu)

        }
        Btn_Intent.setOnClickListener {
            val sababu=Intent(this,IntentActivity::class.java)
            startActivity(sababu)
        }
        Btn_Web.setOnClickListener {

            val mtandao=Intent(this,WebActivity::class.java)
            startActivity(mtandao)
        }











    }
}