package p000;

import android.bluetooth.BluetoothGattDescriptor;

/* JADX INFO: loaded from: classes6.dex */
@is2
public class r74 {

    /* JADX INFO: renamed from: a */
    public final bs2 f77251a;

    /* JADX INFO: renamed from: b */
    public final m6c f77252b;

    @b28
    public r74(bs2 bs2Var, m6c m6cVar) {
        this.f77251a = bs2Var;
        this.f77252b = m6cVar;
    }

    /* JADX INFO: renamed from: a */
    public xd2 m21079a(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return this.f77251a.queue(this.f77252b.provideWriteDescriptor(bluetoothGattDescriptor, bArr)).ignoreElements();
    }
}
