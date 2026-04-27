package p000;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes6.dex */
public class jfe {

    /* JADX INFO: renamed from: a */
    public final BluetoothDevice f50456a;

    /* JADX INFO: renamed from: b */
    public final int f50457b;

    /* JADX INFO: renamed from: c */
    public final byte[] f50458c;

    public jfe(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.f50456a = bluetoothDevice;
        this.f50457b = i;
        this.f50458c = bArr;
    }

    public BluetoothDevice getBluetoothDevice() {
        return this.f50456a;
    }

    public int getRssi() {
        return this.f50457b;
    }

    public byte[] getScanRecord() {
        return this.f50458c;
    }
}
