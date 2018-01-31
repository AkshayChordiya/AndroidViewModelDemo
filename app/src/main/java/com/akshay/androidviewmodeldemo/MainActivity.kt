package com.akshay.androidviewmodeldemo

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting up the RecyclerView
        val wiFiAdapter = WiFiAdapter()
        wifi_list.layoutManager = LinearLayoutManager(this)
        wifi_list.adapter = wiFiAdapter

        val wiFiViewModel = ViewModelProviders.of(this).get(WiFiViewModel::class.java)
        wiFiAdapter.swapData(wiFiViewModel.getConfiguredNetworks())
    }
}
