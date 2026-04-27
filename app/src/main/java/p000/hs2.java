package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class hs2 implements jo5<gs2> {

    /* JADX INFO: renamed from: a */
    public final hid<gfe> f44681a;

    /* JADX INFO: renamed from: b */
    public final hid<BluetoothGatt> f44682b;

    /* JADX INFO: renamed from: c */
    public final hid<y1h> f44683c;

    /* JADX INFO: renamed from: d */
    public final hid<Integer> f44684d;

    /* JADX INFO: renamed from: e */
    public final hid<y1h> f44685e;

    public hs2(hid<gfe> hidVar, hid<BluetoothGatt> hidVar2, hid<y1h> hidVar3, hid<Integer> hidVar4, hid<y1h> hidVar5) {
        this.f44681a = hidVar;
        this.f44682b = hidVar2;
        this.f44683c = hidVar3;
        this.f44684d = hidVar4;
        this.f44685e = hidVar5;
    }

    public static hs2 create(hid<gfe> hidVar, hid<BluetoothGatt> hidVar2, hid<y1h> hidVar3, hid<Integer> hidVar4, hid<y1h> hidVar5) {
        return new hs2(hidVar, hidVar2, hidVar3, hidVar4, hidVar5);
    }

    public static gs2 newInstance(gfe gfeVar, BluetoothGatt bluetoothGatt, y1h y1hVar, int i, y1h y1hVar2) {
        return new gs2(gfeVar, bluetoothGatt, y1hVar, i, y1hVar2);
    }

    @Override // p000.hid
    public gs2 get() {
        return newInstance(this.f44681a.get(), this.f44682b.get(), this.f44683c.get(), this.f44684d.get().intValue(), this.f44685e.get());
    }
}
