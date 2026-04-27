package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
@c5e(21)
public class y1b extends ynf<Integer> {

    /* JADX INFO: renamed from: e */
    public final int f100087e;

    @b28
    public y1b(gfe gfeVar, BluetoothGatt bluetoothGatt, y1h y1hVar, int i) {
        super(bluetoothGatt, gfeVar, i51.f45769l, y1hVar);
        this.f100087e = i;
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: c */
    public kjf<Integer> mo11830c(gfe gfeVar) {
        return gfeVar.getOnMtuChanged().firstOrError();
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: d */
    public boolean mo11831d(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.requestMtu(this.f100087e);
    }

    @Override // p000.ynf
    public String toString() {
        return "MtuRequestOperation{" + super.toString() + ", mtu=" + this.f100087e + '}';
    }
}
