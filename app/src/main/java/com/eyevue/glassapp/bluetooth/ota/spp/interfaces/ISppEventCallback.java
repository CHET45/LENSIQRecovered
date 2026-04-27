package com.eyevue.glassapp.bluetooth.ota.spp.interfaces;

import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public interface ISppEventCallback {
    void onAdapterChange(boolean bEnabled);

    void onDiscoveryDevice(BluetoothDevice device, int rssi);

    void onDiscoveryDeviceChange(boolean bStart);

    void onReceiveSppData(BluetoothDevice device, UUID uuid, byte[] data);

    void onSppConnection(BluetoothDevice device, UUID uuid, int status);
}
