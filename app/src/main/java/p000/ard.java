package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class ard implements jo5<zqd> {

    /* JADX INFO: renamed from: a */
    public final hid<gfe> f11685a;

    /* JADX INFO: renamed from: b */
    public final hid<BluetoothGatt> f11686b;

    /* JADX INFO: renamed from: c */
    public final hid<y1h> f11687c;

    public ard(hid<gfe> hidVar, hid<BluetoothGatt> hidVar2, hid<y1h> hidVar3) {
        this.f11685a = hidVar;
        this.f11686b = hidVar2;
        this.f11687c = hidVar3;
    }

    public static ard create(hid<gfe> hidVar, hid<BluetoothGatt> hidVar2, hid<y1h> hidVar3) {
        return new ard(hidVar, hidVar2, hidVar3);
    }

    public static zqd newInstance(gfe gfeVar, BluetoothGatt bluetoothGatt, y1h y1hVar) {
        return new zqd(gfeVar, bluetoothGatt, y1hVar);
    }

    @Override // p000.hid
    public zqd get() {
        return newInstance(this.f11685a.get(), this.f11686b.get(), this.f11687c.get());
    }
}
