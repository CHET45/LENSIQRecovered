package com.eyevue.glassapp.bluetooth.ota.ble.interfaces;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;
import com.eyevue.glassapp.bluetooth.ota.ble.model.BleScanInfo;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BleEventCallback implements IBleEventCallback {
    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onAdapterChange(boolean bEnabled) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleConnection(BluetoothDevice device, int status) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleDataBlockChanged(BluetoothDevice device, int block, int status) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleDataNotification(BluetoothDevice device, UUID serviceUuid, UUID characteristicsUuid, byte[] data) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleNotificationStatus(BluetoothDevice device, UUID serviceUuid, UUID characteristicUuid, int status) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleServiceDiscovery(BluetoothDevice device, int status, List<BluetoothGattService> services) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleWriteStatus(BluetoothDevice device, UUID serviceUuid, UUID characteristicsUuid, byte[] data, int status) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onConnectionUpdated(BluetoothDevice device, int interval, int latency, int timeout, int status) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onDiscoveryBle(BluetoothDevice device, BleScanInfo bleScanMessage) {
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onDiscoveryBleChange(boolean bStart) {
    }
}
