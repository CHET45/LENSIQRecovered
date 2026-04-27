package com.eyevue.glassapp.bluetooth.manager;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BluetoothCore {
    protected ConnectionCallback connectionCallback;
    protected DataCallback dataCallback;

    public interface ConnectionCallback {
        void onConnected(BluetoothDevice device);

        void onDisconnected();

        void onError(String error);
    }

    public interface DataCallback {
        void onDataReceived(BluetoothDevice device, byte[] data);

        void onDataReceived(byte[] data);
    }

    public interface ScanDeviceCallback {
        void onDeviceFound(BluetoothDevice device, ScanRecord scanRecord);

        void onScanTimeout();
    }

    public abstract void connect(String deviceAddress);

    public abstract boolean createBond(BluetoothDevice device);

    public abstract void disconnect();

    public abstract List<BluetoothDevice> getSystemConnectedDeviceList();

    public abstract boolean isConnected();

    public abstract boolean removeBond(BluetoothDevice device);

    public abstract void sendData(byte[] data);

    public void setConnectionCallback(ConnectionCallback callback) {
        this.connectionCallback = callback;
    }

    public void setDataCallback(DataCallback callback) {
        this.dataCallback = callback;
    }

    public abstract void startScan(ScanDeviceCallback callback, long timeout);

    public abstract void stopScan();
}
