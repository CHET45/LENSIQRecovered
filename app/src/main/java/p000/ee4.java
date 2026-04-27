package p000;

import android.bluetooth.BluetoothManager;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class ee4 implements jo5<de4> {

    /* JADX INFO: renamed from: a */
    public final hid<gfe> f32732a;

    /* JADX INFO: renamed from: b */
    public final hid<c91> f32733b;

    /* JADX INFO: renamed from: c */
    public final hid<String> f32734c;

    /* JADX INFO: renamed from: d */
    public final hid<BluetoothManager> f32735d;

    /* JADX INFO: renamed from: e */
    public final hid<woe> f32736e;

    /* JADX INFO: renamed from: f */
    public final hid<y1h> f32737f;

    /* JADX INFO: renamed from: g */
    public final hid<os2> f32738g;

    public ee4(hid<gfe> hidVar, hid<c91> hidVar2, hid<String> hidVar3, hid<BluetoothManager> hidVar4, hid<woe> hidVar5, hid<y1h> hidVar6, hid<os2> hidVar7) {
        this.f32732a = hidVar;
        this.f32733b = hidVar2;
        this.f32734c = hidVar3;
        this.f32735d = hidVar4;
        this.f32736e = hidVar5;
        this.f32737f = hidVar6;
        this.f32738g = hidVar7;
    }

    public static ee4 create(hid<gfe> hidVar, hid<c91> hidVar2, hid<String> hidVar3, hid<BluetoothManager> hidVar4, hid<woe> hidVar5, hid<y1h> hidVar6, hid<os2> hidVar7) {
        return new ee4(hidVar, hidVar2, hidVar3, hidVar4, hidVar5, hidVar6, hidVar7);
    }

    public static de4 newInstance(gfe gfeVar, c91 c91Var, String str, BluetoothManager bluetoothManager, woe woeVar, y1h y1hVar, os2 os2Var) {
        return new de4(gfeVar, c91Var, str, bluetoothManager, woeVar, y1hVar, os2Var);
    }

    @Override // p000.hid
    public de4 get() {
        return newInstance(this.f32732a.get(), this.f32733b.get(), this.f32734c.get(), this.f32735d.get(), this.f32736e.get(), this.f32737f.get(), this.f32738g.get());
    }
}
