package p000;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class kr2 implements jo5<jr2> {

    /* JADX INFO: renamed from: a */
    public final hid<BluetoothDevice> f55086a;

    /* JADX INFO: renamed from: b */
    public final hid<w41> f55087b;

    /* JADX INFO: renamed from: c */
    public final hid<gfe> f55088c;

    /* JADX INFO: renamed from: d */
    public final hid<c91> f55089d;

    /* JADX INFO: renamed from: e */
    public final hid<y1h> f55090e;

    /* JADX INFO: renamed from: f */
    public final hid<Boolean> f55091f;

    /* JADX INFO: renamed from: g */
    public final hid<os2> f55092g;

    public kr2(hid<BluetoothDevice> hidVar, hid<w41> hidVar2, hid<gfe> hidVar3, hid<c91> hidVar4, hid<y1h> hidVar5, hid<Boolean> hidVar6, hid<os2> hidVar7) {
        this.f55086a = hidVar;
        this.f55087b = hidVar2;
        this.f55088c = hidVar3;
        this.f55089d = hidVar4;
        this.f55090e = hidVar5;
        this.f55091f = hidVar6;
        this.f55092g = hidVar7;
    }

    public static kr2 create(hid<BluetoothDevice> hidVar, hid<w41> hidVar2, hid<gfe> hidVar3, hid<c91> hidVar4, hid<y1h> hidVar5, hid<Boolean> hidVar6, hid<os2> hidVar7) {
        return new kr2(hidVar, hidVar2, hidVar3, hidVar4, hidVar5, hidVar6, hidVar7);
    }

    public static jr2 newInstance(BluetoothDevice bluetoothDevice, w41 w41Var, gfe gfeVar, c91 c91Var, y1h y1hVar, boolean z, os2 os2Var) {
        return new jr2(bluetoothDevice, w41Var, gfeVar, c91Var, y1hVar, z, os2Var);
    }

    @Override // p000.hid
    public jr2 get() {
        return newInstance(this.f55086a.get(), this.f55087b.get(), this.f55088c.get(), this.f55089d.get(), this.f55090e.get(), this.f55091f.get().booleanValue(), this.f55092g.get());
    }
}
