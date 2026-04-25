package com.lensiq.recovered

import android.app.Application
import com.lensiq.recovered.device.DeviceController
import com.lensiq.recovered.service.ServiceRegistry

class LensIqApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ServiceRegistry.initialize(this)
        DeviceController.initialize(this)
        // Restored role from EyevueApplication: composition root for BLE, HTTP, logs, language, audio and statistics.
    }
}
