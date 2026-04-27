package com.eyevue.glassapp.bluetooth.ota.spp.interfaces;

import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SppEventCallback implements ISppEventCallback {
    @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
    public void onAdapterChange(boolean bEnabled) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
    public void onDiscoveryDevice(BluetoothDevice device, int rssi) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
    public void onDiscoveryDeviceChange(boolean bStart) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
    public void onReceiveSppData(BluetoothDevice device, UUID uuid, byte[] data) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
    public void onSppConnection(BluetoothDevice device, UUID uuid, int status) {
    }
}
