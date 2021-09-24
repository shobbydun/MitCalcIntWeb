package com.example.mitcalcintweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)



        Btn_add.setOnClickListener {
            //Receive entered data from the user as a variable
            var firstnum = EdtFirst.text.toString()
            var secondnum = Editsecond.text.toString()

            if (firstnum.isEmpty() or secondnum.isEmpty()) {
                Ans_here.text = "Weka namba hapa"
            } else {
                var jibu = firstnum.toDouble() + secondnum.toDouble()
                Ans_here.text = jibu.toString()
            }
        }
        BtnSubtract.setOnClickListener {
            var firstnum = EdtFirst.text.toString()
            var secondnum = Editsecond.text.toString()

            if (firstnum.isEmpty() or secondnum.isEmpty()) {
                Ans_here.text = "Weka namba hapa"
            } else {
                var jibu = firstnum.toDouble() - secondnum.toDouble()
                Ans_here.text = jibu.toString()
            }
        }
        Btn_Division.setOnClickListener {
            var firstnum = EdtFirst.text.toString()
            var secondnum = Editsecond.text.toString()

            if (firstnum.isEmpty() or secondnum.isEmpty()) {
                Ans_here.text = "Weka namba hapa"
            } else {
                var jibu = firstnum.toDouble() / secondnum.toDouble()
                Ans_here.text = jibu.toString()
            }
        }
        Btn_mult.setOnClickListener {
            var firstnum = EdtFirst.text.toString()
            var secondnum = Editsecond.text.toString()

            if (firstnum.isEmpty() or secondnum.isEmpty()) {
                Ans_here.text = "Weka namba hapa"
            } else {
                var jibu = firstnum.toDouble() * secondnum.toDouble()
                Ans_here.text = jibu.toString()
            }
        }
    }
}
