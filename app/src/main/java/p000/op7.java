package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
public interface op7 {
    void connectBluetoothDevice(BluetoothDevice bluetoothDevice);

    void disconnectBluetoothDevice(BluetoothDevice bluetoothDevice);

    void errorEventCallback(cr0 cr0Var);

    BluetoothGatt getConnectedBluetoothGatt();

    BluetoothDevice getConnectedDevice();

    void onBtDeviceConnection(BluetoothDevice bluetoothDevice, int i);

    void onError(cr0 cr0Var);

    void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2);

    void onReceiveDeviceData(BluetoothDevice bluetoothDevice, byte[] bArr);

    void queryMandatoryUpdate(lp7<cng> lp7Var);

    void receiveDataFromDevice(BluetoothDevice bluetoothDevice, byte[] bArr);

    boolean sendDataToDevice(BluetoothDevice bluetoothDevice, byte[] bArr);
}
