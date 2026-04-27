package com.eyevue.glassapp.bluetooth.ota.ble.interfaces;

import android.bluetooth.BluetoothGatt;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public interface IBleOp {
    int getBleMtu();

    boolean writeDataByBle(BluetoothGatt gatt, UUID serviceUUID, UUID characteristicUUID, byte[] data);
}
