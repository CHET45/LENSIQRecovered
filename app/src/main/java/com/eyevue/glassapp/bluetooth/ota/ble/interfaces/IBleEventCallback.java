package com.eyevue.glassapp.bluetooth.ota.ble.interfaces;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;
import com.eyevue.glassapp.bluetooth.ota.ble.model.BleScanInfo;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public interface IBleEventCallback {
    void onAdapterChange(boolean bEnabled);

    void onBleConnection(BluetoothDevice device, int status);

    void onBleDataBlockChanged(BluetoothDevice device, int block, int status);

    void onBleDataNotification(BluetoothDevice device, UUID serviceUuid, UUID characteristicsUuid, byte[] data);

    void onBleNotificationStatus(BluetoothDevice device, UUID serviceUuid, UUID characteristicUuid, int status);

    void onBleServiceDiscovery(BluetoothDevice device, int status, List<BluetoothGattService> services);

    void onBleWriteStatus(BluetoothDevice device, UUID serviceUuid, UUID characteristicsUuid, byte[] data, int status);

    void onConnectionUpdated(BluetoothDevice device, int interval, int latency, int timeout, int status);

    void onDiscoveryBle(BluetoothDevice device, BleScanInfo bleScanInfo);

    void onDiscoveryBleChange(boolean bStart);
}
