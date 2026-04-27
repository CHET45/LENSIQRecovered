package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class z1b implements jo5<y1b> {

    /* JADX INFO: renamed from: a */
    public final hid<gfe> f103664a;

    /* JADX INFO: renamed from: b */
    public final hid<BluetoothGatt> f103665b;

    /* JADX INFO: renamed from: c */
    public final hid<y1h> f103666c;

    /* JADX INFO: renamed from: d */
    public final hid<Integer> f103667d;

    public z1b(hid<gfe> hidVar, hid<BluetoothGatt> hidVar2, hid<y1h> hidVar3, hid<Integer> hidVar4) {
        this.f103664a = hidVar;
        this.f103665b = hidVar2;
        this.f103666c = hidVar3;
        this.f103667d = hidVar4;
    }

    public static z1b create(hid<gfe> hidVar, hid<BluetoothGatt> hidVar2, hid<y1h> hidVar3, hid<Integer> hidVar4) {
        return new z1b(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static y1b newInstance(gfe gfeVar, BluetoothGatt bluetoothGatt, y1h y1hVar, int i) {
        return new y1b(gfeVar, bluetoothGatt, y1hVar, i);
    }

    @Override // p000.hid
    public y1b get() {
        return newInstance(this.f103664a.get(), this.f103665b.get(), this.f103666c.get(), this.f103667d.get().intValue());
    }
}
