package com.eyevue.glassapp.bluetooth.ota;

import android.bluetooth.BluetoothDevice;
import com.eyevue.glassapp.bluetooth.ota.ble.model.BleScanInfo;
import java.util.UUID;
import p000.e0g;
import p000.gib;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 1)
public class OnBTEventCallback {
    public static final int $stable = 0;

    public void onAdapterChange(boolean z) {
    }

    public void onBleMtuChange(@gib BluetoothDevice bluetoothDevice, int i, int i2) {
    }

    public void onDeviceConnection(@gib BluetoothDevice bluetoothDevice, int i, int i2) {
    }

    public void onDiscovery(@gib BluetoothDevice bluetoothDevice, @gib BleScanInfo bleScanInfo) {
    }

    public void onDiscoveryChange(boolean z, int i) {
    }

    public void onReceiveData(@gib BluetoothDevice bluetoothDevice, int i, @gib UUID uuid, @gib byte[] bArr) {
    }
}
