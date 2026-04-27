package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class o6c implements jo5<n6c> {

    /* JADX INFO: renamed from: a */
    public final hid<gfe> f66552a;

    /* JADX INFO: renamed from: b */
    public final hid<BluetoothGatt> f66553b;

    /* JADX INFO: renamed from: c */
    public final hid<qj9> f66554c;

    /* JADX INFO: renamed from: d */
    public final hid<y1h> f66555d;

    /* JADX INFO: renamed from: e */
    public final hid<woe> f66556e;

    /* JADX INFO: renamed from: f */
    public final hid<woe> f66557f;

    /* JADX INFO: renamed from: g */
    public final hid<zqd> f66558g;

    public o6c(hid<gfe> hidVar, hid<BluetoothGatt> hidVar2, hid<qj9> hidVar3, hid<y1h> hidVar4, hid<woe> hidVar5, hid<woe> hidVar6, hid<zqd> hidVar7) {
        this.f66552a = hidVar;
        this.f66553b = hidVar2;
        this.f66554c = hidVar3;
        this.f66555d = hidVar4;
        this.f66556e = hidVar5;
        this.f66557f = hidVar6;
        this.f66558g = hidVar7;
    }

    public static o6c create(hid<gfe> hidVar, hid<BluetoothGatt> hidVar2, hid<qj9> hidVar3, hid<y1h> hidVar4, hid<woe> hidVar5, hid<woe> hidVar6, hid<zqd> hidVar7) {
        return new o6c(hidVar, hidVar2, hidVar3, hidVar4, hidVar5, hidVar6, hidVar7);
    }

    public static n6c newInstance(gfe gfeVar, BluetoothGatt bluetoothGatt, qj9 qj9Var, y1h y1hVar, woe woeVar, woe woeVar2, hid<zqd> hidVar) {
        return new n6c(gfeVar, bluetoothGatt, qj9Var, y1hVar, woeVar, woeVar2, hidVar);
    }

    @Override // p000.hid
    public n6c get() {
        return newInstance(this.f66552a.get(), this.f66553b.get(), this.f66554c.get(), this.f66555d.get(), this.f66556e.get(), this.f66557f.get(), this.f66558g);
    }
}
