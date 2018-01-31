package com.akshay.androidviewmodeldemo

import android.net.wifi.WifiConfiguration
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_wifi_networks.view.*
import java.util.*

class WiFiAdapter : RecyclerView.Adapter<WiFiAdapter.WiFiViewHolder>() {

    private var data: List<WifiConfiguration> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WiFiViewHolder {
        return WiFiViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.row_wifi_networks, parent, false)
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: WiFiViewHolder, position: Int) {
        holder.bind(data[position])
    }

    /**
     * Swaps the existing data with fresh data and notifies
     * the data change to adapter
     */
    fun swapData(data: List<WifiConfiguration>) {
        this.data = data
        notifyDataSetChanged()
    }

    class WiFiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(wifiConfiguration: WifiConfiguration) = with(itemView) {
            wifi_name.text = wifiConfiguration.SSID
        }
    }
}