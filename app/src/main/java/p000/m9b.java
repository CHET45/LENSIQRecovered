package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* JADX INFO: loaded from: classes6.dex */
public class m9b {

    /* JADX INFO: renamed from: a */
    public BluetoothGattCallback f60290a;

    /* JADX INFO: renamed from: b */
    public wj7 f60291b;

    @b28
    public m9b() {
    }

    /* JADX INFO: renamed from: a */
    public void m17153a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattCallback bluetoothGattCallback = this.f60290a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m17154b(BluetoothGatt bluetoothGatt, int i, int i2) {
        BluetoothGattCallback bluetoothGattCallback = this.f60290a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onConnectionStateChange(bluetoothGatt, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m17155c(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f60290a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m17156d(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f60290a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    }

    @omg(21)
    /* JADX INFO: renamed from: e */
    public void m17157e(BluetoothGatt bluetoothGatt, int i, int i2) {
        BluetoothGattCallback bluetoothGattCallback = this.f60290a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onMtuChanged(bluetoothGatt, i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m17158f(BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
        wj7 wj7Var = this.f60291b;
        if (wj7Var != null) {
            wj7Var.onConnectionUpdated(bluetoothGatt, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m17159g(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f60290a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m17160h(BluetoothGatt bluetoothGatt, int i, int i2) {
        BluetoothGattCallback bluetoothGattCallback = this.f60290a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onReadRemoteRssi(bluetoothGatt, i, i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m17161i(BluetoothGatt bluetoothGatt, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f60290a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onReliableWriteCompleted(bluetoothGatt, i);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m17162j(BluetoothGatt bluetoothGatt, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f60290a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onServicesDiscovered(bluetoothGatt, i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m17163k(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f60290a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m17164l(BluetoothGattCallback bluetoothGattCallback) {
        this.f60290a = bluetoothGattCallback;
    }

    /* JADX INFO: renamed from: m */
    public void m17165m(wj7 wj7Var) {
        this.f60291b = wj7Var;
    }
}
