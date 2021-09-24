package com.example.mitcalcintweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.email
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.sendSMS
import org.jetbrains.anko.share

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        btn_sms.setOnClickListener {
            sendSMS("0746261225","Hello There")
        }
        Btn_email.setOnClickListener {
            email("shobbyduncan@gmail.com", "yo")

        }
        btn_call.setOnClickListener {
            makeCall( "0746261225")

        }
        btn_share.setOnClickListener {
            share("hello subscribe", "Youtube")

        }
        btn_stk.setOnClickListener {
            val simToolKitLaunchIntent  = this@IntentActivity.getPackageManager().getLaunchIntentForPackage( "com.android.stk");
            if (simToolKitLaunchIntent !=null){
                startActivity(simToolKitLaunchIntent)
            }

        }
    }
}