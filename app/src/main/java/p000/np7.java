package p000;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes6.dex */
public interface np7 {
    void onA2dpStatus(BluetoothDevice bluetoothDevice, int i);

    void onAdapterStatus(boolean z, boolean z2);

    void onBleDataBlockChanged(BluetoothDevice bluetoothDevice, int i, int i2);

    void onBtDeviceConnection(BluetoothDevice bluetoothDevice, int i);

    void onConnection(BluetoothDevice bluetoothDevice, int i);

    void onDiscovery(BluetoothDevice bluetoothDevice, n51 n51Var);

    void onDiscoveryStatus(boolean z, boolean z2);

    void onError(cr0 cr0Var);

    void onHfpStatus(BluetoothDevice bluetoothDevice, int i);

    void onMandatoryUpgrade(BluetoothDevice bluetoothDevice);

    void onReceiveCommand(BluetoothDevice bluetoothDevice, ob2 ob2Var);
}
