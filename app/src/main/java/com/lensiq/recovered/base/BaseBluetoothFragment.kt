package com.lensiq.recovered.base

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.provider.Settings
import androidx.fragment.app.Fragment

abstract class BaseBluetoothFragment : Fragment() {
    protected val requiredBluetoothPermissions = arrayOf(
        Manifest.permission.BLUETOOTH_SCAN,
        Manifest.permission.BLUETOOTH_CONNECT,
        Manifest.permission.ACCESS_FINE_LOCATION
    )
    protected fun openBluetoothSettings() { startActivity(Intent(Settings.ACTION_BLUETOOTH_SETTINGS)) }
    protected fun isBluetoothEnabled(): Boolean = BluetoothAdapter.getDefaultAdapter()?.isEnabled == true
    protected open fun onGlassesDisconnected() {}
    protected open fun onGlassesConnected(deviceName: String, batteryPercent: Int?) {}
}
