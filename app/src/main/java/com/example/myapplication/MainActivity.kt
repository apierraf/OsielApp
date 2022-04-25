package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.teavaro.funnelConnect.core.initializer.FunnelConnectSDK


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button  = findViewById<Button>(R.id.btn_connect)

        button.setOnClickListener {
            print(FunnelConnectSDK.cdp().getUserId())
        }
    }
}