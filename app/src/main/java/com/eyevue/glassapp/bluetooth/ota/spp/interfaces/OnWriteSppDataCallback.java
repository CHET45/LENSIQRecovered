package com.eyevue.glassapp.bluetooth.ota.spp.interfaces;

import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public interface OnWriteSppDataCallback {
    void onSppResult(BluetoothDevice device, UUID sppUUID, boolean result, byte[] data);
}
