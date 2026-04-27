package p000;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes6.dex */
public class ife implements qne {

    /* JADX INFO: renamed from: a */
    public final BluetoothDevice f46736a;

    /* JADX INFO: renamed from: b */
    public final int f46737b;

    /* JADX INFO: renamed from: c */
    public final long f46738c;

    /* JADX INFO: renamed from: d */
    public final jne f46739d;

    /* JADX INFO: renamed from: e */
    public final zme f46740e;

    /* JADX INFO: renamed from: f */
    public final gf8 f46741f;

    public ife(BluetoothDevice bluetoothDevice, int i, long j, jne jneVar, zme zmeVar, gf8 gf8Var) {
        this.f46736a = bluetoothDevice;
        this.f46737b = i;
        this.f46738c = j;
        this.f46739d = jneVar;
        this.f46740e = zmeVar;
        this.f46741f = gf8Var;
    }

    @Override // p000.qne
    public String getAddress() {
        return this.f46736a.getAddress();
    }

    public BluetoothDevice getBluetoothDevice() {
        return this.f46736a;
    }

    @Override // p000.qne
    public String getDeviceName() {
        BluetoothDevice bluetoothDevice = getBluetoothDevice();
        if (bluetoothDevice == null) {
            return null;
        }
        return bluetoothDevice.getName();
    }

    @Override // p000.qne
    public int getRssi() {
        return this.f46737b;
    }

    @Override // p000.qne
    public zme getScanCallbackType() {
        return this.f46740e;
    }

    @Override // p000.qne
    public jne getScanRecord() {
        return this.f46739d;
    }

    @Override // p000.qne
    public long getTimestampNanos() {
        return this.f46738c;
    }

    public gf8 isConnectable() {
        return this.f46741f;
    }
}
