package com.lensiq.recovered.ui.device

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.lensiq.recovered.base.BaseBluetoothFragment
import com.lensiq.recovered.device.DeviceController

class HomeFragment : BaseBluetoothFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL; gravity = Gravity.CENTER; setPadding(32, 32, 32, 32)
            addView(TextView(context).apply { text = "LENSIQ / Glasses Home"; textSize = 22f })
            addView(TextView(context).apply { text = DeviceController.currentStatusText() })
            addView(Button(context).apply { text = "Connect glasses"; setOnClickListener { openBluetoothSettings() } })
            addView(Button(context).apply { text = "Take photo"; setOnClickListener { DeviceController.requestPhoto() } })
            addView(Button(context).apply { text = "Record video"; setOnClickListener { DeviceController.requestVideo() } })
            addView(Button(context).apply { text = "Record audio"; setOnClickListener { DeviceController.requestAudio() } })
        }
    }
}
