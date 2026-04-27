package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
public class gs2 extends ynf<Long> {

    /* JADX INFO: renamed from: e */
    public final int f40882e;

    /* JADX INFO: renamed from: f */
    public final y1h f40883f;

    @b28
    public gs2(gfe gfeVar, BluetoothGatt bluetoothGatt, y1h y1hVar, int i, y1h y1hVar2) {
        super(bluetoothGatt, gfeVar, i51.f45770m, y1hVar);
        this.f40882e = i;
        this.f40883f = y1hVar2;
    }

    private static String connectionPriorityToString(int i) {
        return i != 0 ? i != 2 ? "CONNECTION_PRIORITY_HIGH" : "CONNECTION_PRIORITY_LOW_POWER" : "CONNECTION_PRIORITY_BALANCED";
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: c */
    public kjf<Long> mo11830c(gfe gfeVar) {
        y1h y1hVar = this.f40883f;
        return kjf.timer(y1hVar.f100095a, y1hVar.f100096b, y1hVar.f100097c);
    }

    @Override // p000.ynf
    @c5e(21)
    /* JADX INFO: renamed from: d */
    public boolean mo11831d(BluetoothGatt bluetoothGatt) throws e51, IllegalArgumentException {
        return bluetoothGatt.requestConnectionPriority(this.f40882e);
    }

    @Override // p000.ynf
    public String toString() {
        return "ConnectionPriorityChangeOperation{" + super.toString() + ", connectionPriority=" + connectionPriorityToString(this.f40882e) + ", successTimeout=" + this.f40883f + '}';
    }
}
