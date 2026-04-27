package com.eyevue.glassapp.bluetooth.ota.ble.model;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.eyevue.glassapp.bluetooth.ota.ble.SendBleDataThread;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleOp;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.OnThreadStateListener;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.OnWriteDataCallback;
import com.eyevue.glassapp.utils.AppUtil;
import java.util.UUID;
import p000.dh8;
import p000.efb;
import p000.igg;
import p000.pk1;

/* JADX INFO: loaded from: classes4.dex */
public class BleDevice {
    private static final int MAX_RETRY_CONNECT_COUNT = 1;
    private long connectedTime;
    private int connection;

    @efb
    private final Context context;
    private final BluetoothDevice device;
    private BluetoothGatt gatt;
    private boolean isNeedReconnect;
    private int mtu;
    private int reconnectCount;
    private final int reconnectLimit;
    private SendBleDataThread sendDataThread;
    private final String tag;

    public BleDevice(@efb Context context, @efb BluetoothDevice device) {
        this(context, device, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"MissingPermission"})
    public boolean writeDataToDeviceByBle(BluetoothGatt gatt, UUID serviceUUID, UUID characteristicUUID, byte[] data) {
        boolean zWriteCharacteristic = false;
        if (gatt == null || serviceUUID == null || characteristicUUID == null || data == null || data.length == 0 || !AppUtil.checkHasConnectPermission(this.context)) {
            dh8.m9152d("BleManager", "writeDataByBle", "param is invalid.");
            return false;
        }
        BluetoothGattService service = gatt.getService(serviceUUID);
        if (service == null) {
            dh8.m9152d("BleManager", "writeDataByBle", "service is null.");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(characteristicUUID);
        if (characteristic == null) {
            dh8.m9152d("BleManager", "writeDataByBle", "characteristic is null");
            return false;
        }
        try {
            characteristic.setValue(data);
            zWriteCharacteristic = gatt.writeCharacteristic(characteristic);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dh8.m9152d("BleManager", "writeDataByBle", zWriteCharacteristic + ", data = " + pk1.byte2HexStr(data));
        return zWriteCharacteristic;
    }

    public boolean addSendTask(UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        SendBleDataThread sendBleDataThread = this.sendDataThread;
        if (sendBleDataThread == null || !sendBleDataThread.isRunning()) {
            return false;
        }
        return this.sendDataThread.addSendTask(this.gatt, serviceUUID, characteristicUUID, data, callback);
    }

    public long getConnectedTime() {
        return this.connectedTime;
    }

    public int getConnection() {
        return this.connection;
    }

    @efb
    public BluetoothDevice getDevice() {
        return this.device;
    }

    public BluetoothGatt getGatt() {
        return this.gatt;
    }

    public int getMtu() {
        int i = this.mtu;
        return i > 128 ? i - 6 : i;
    }

    public boolean isConnecting() {
        return this.connection == 1;
    }

    public boolean isNeedReconnect() {
        return this.isNeedReconnect;
    }

    public boolean isOverReconnectLimit() {
        int i = this.reconnectCount + 1;
        this.reconnectCount = i;
        return i > this.reconnectLimit;
    }

    public BleDevice setConnectedTime(long connectedTime) {
        this.connectedTime = connectedTime;
        return this;
    }

    public BleDevice setConnection(int connection) {
        this.connection = connection;
        return this;
    }

    public BleDevice setGatt(BluetoothGatt gatt) {
        this.gatt = gatt;
        return this;
    }

    public BleDevice setMtu(int mtu) {
        this.mtu = mtu;
        return this;
    }

    public BleDevice setNeedReconnect(boolean needReconnect) {
        this.isNeedReconnect = needReconnect;
        return this;
    }

    public void startSendDataThread() {
        SendBleDataThread sendBleDataThread = this.sendDataThread;
        if (sendBleDataThread == null || !sendBleDataThread.isRunning()) {
            SendBleDataThread sendBleDataThread2 = new SendBleDataThread(new IBleOp() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.model.BleDevice.1
                @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleOp
                public int getBleMtu() {
                    return BleDevice.this.getMtu();
                }

                @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleOp
                public boolean writeDataByBle(BluetoothGatt gatt, UUID serviceUUID, UUID characteristicUUID, byte[] data) {
                    return BleDevice.this.writeDataToDeviceByBle(gatt, serviceUUID, characteristicUUID, data);
                }
            }, new OnThreadStateListener() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.model.BleDevice.2
                @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.OnThreadStateListener
                public void onEnd(long id, String name) {
                    if (BleDevice.this.sendDataThread == null || BleDevice.this.sendDataThread.getId() != id) {
                        return;
                    }
                    BleDevice.this.sendDataThread = null;
                }

                @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.OnThreadStateListener
                public void onStart(long id, String name) {
                }
            });
            this.sendDataThread = sendBleDataThread2;
            sendBleDataThread2.start();
        }
    }

    public void stopSendDataThread() {
        SendBleDataThread sendBleDataThread = this.sendDataThread;
        if (sendBleDataThread != null) {
            sendBleDataThread.stopThread();
        }
    }

    public String toString() {
        return "BleDevice{device=" + this.device + ", reconnectLimit=" + this.reconnectLimit + ", connection=" + this.connection + ", gatt=" + this.gatt + ", mtu=" + this.mtu + ", connectedTime=" + this.connectedTime + ", sendDataThread=" + this.sendDataThread + ", reconnectCount=" + this.reconnectCount + ", isNeedReconnect=" + this.isNeedReconnect + '}';
    }

    public void wakeupSendThread(SendBleDataThread.BleSendTask task) {
        if (this.sendDataThread == null || task == null || !this.gatt.equals(task.getBleGatt())) {
            return;
        }
        this.sendDataThread.wakeupSendThread(task);
    }

    public BleDevice(@efb Context context, @efb BluetoothDevice device, int reconnectLimit) {
        this.tag = "BleManager";
        this.connection = 0;
        this.mtu = 20;
        this.reconnectCount = 0;
        this.context = context;
        this.device = device;
        this.reconnectLimit = reconnectLimit;
    }
}
