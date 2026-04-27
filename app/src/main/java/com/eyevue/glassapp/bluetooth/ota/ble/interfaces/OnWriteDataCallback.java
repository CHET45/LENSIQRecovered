package com.eyevue.glassapp.bluetooth.ota.ble.interfaces;

import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public interface OnWriteDataCallback {
    void onBleResult(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, boolean result, byte[] data);
}
