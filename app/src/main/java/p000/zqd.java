package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
public class zqd extends ynf<Integer> {
    @b28
    public zqd(gfe gfeVar, BluetoothGatt bluetoothGatt, @w8b("operation-timeout") y1h y1hVar) {
        super(bluetoothGatt, gfeVar, i51.f45768k, y1hVar);
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: c */
    public kjf<Integer> mo11830c(gfe gfeVar) {
        return gfeVar.getOnRssiRead().firstOrError();
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: d */
    public boolean mo11831d(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readRemoteRssi();
    }

    @Override // p000.ynf
    public String toString() {
        return "ReadRssiOperation{" + super.toString() + '}';
    }
}
