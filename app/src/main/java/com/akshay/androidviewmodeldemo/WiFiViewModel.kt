package com.akshay.androidviewmodeldemo

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.content.Context
import android.net.wifi.WifiManager

class WiFiViewModel(application: Application) : AndroidViewModel(application) {

    private var wifiManager: WifiManager = application.getSystemService(Context.WIFI_SERVICE) as WifiManager

    fun getConfiguredNetworks() = wifiManager.configuredNetworks

}