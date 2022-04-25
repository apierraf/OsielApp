package com.example.myapplication

import android.app.Application
import com.teavaro.funnelConnect.core.initializer.FunnelConnectSDK


class AppOsiel : Application() {
    override fun onCreate() {
        super.onCreate()
        FunnelConnectSDK.initialize(this, R.raw.config)
    }

}