package p000;

import android.bluetooth.BluetoothGatt;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.internal.connection.ConnectionScope")
public final class wee implements jo5<vee> {

    /* JADX INFO: renamed from: a */
    public final hid<bs2> f94047a;

    /* JADX INFO: renamed from: b */
    public final hid<gfe> f94048b;

    /* JADX INFO: renamed from: c */
    public final hid<BluetoothGatt> f94049c;

    /* JADX INFO: renamed from: d */
    public final hid<l4f> f94050d;

    /* JADX INFO: renamed from: e */
    public final hid<vgb> f94051e;

    /* JADX INFO: renamed from: f */
    public final hid<x1b> f94052f;

    /* JADX INFO: renamed from: g */
    public final hid<r74> f94053g;

    /* JADX INFO: renamed from: h */
    public final hid<m6c> f94054h;

    /* JADX INFO: renamed from: i */
    public final hid<uee.InterfaceC13519c> f94055i;

    /* JADX INFO: renamed from: j */
    public final hid<woe> f94056j;

    /* JADX INFO: renamed from: k */
    public final hid<gs7> f94057k;

    public wee(hid<bs2> hidVar, hid<gfe> hidVar2, hid<BluetoothGatt> hidVar3, hid<l4f> hidVar4, hid<vgb> hidVar5, hid<x1b> hidVar6, hid<r74> hidVar7, hid<m6c> hidVar8, hid<uee.InterfaceC13519c> hidVar9, hid<woe> hidVar10, hid<gs7> hidVar11) {
        this.f94047a = hidVar;
        this.f94048b = hidVar2;
        this.f94049c = hidVar3;
        this.f94050d = hidVar4;
        this.f94051e = hidVar5;
        this.f94052f = hidVar6;
        this.f94053g = hidVar7;
        this.f94054h = hidVar8;
        this.f94055i = hidVar9;
        this.f94056j = hidVar10;
        this.f94057k = hidVar11;
    }

    public static wee create(hid<bs2> hidVar, hid<gfe> hidVar2, hid<BluetoothGatt> hidVar3, hid<l4f> hidVar4, hid<vgb> hidVar5, hid<x1b> hidVar6, hid<r74> hidVar7, hid<m6c> hidVar8, hid<uee.InterfaceC13519c> hidVar9, hid<woe> hidVar10, hid<gs7> hidVar11) {
        return new wee(hidVar, hidVar2, hidVar3, hidVar4, hidVar5, hidVar6, hidVar7, hidVar8, hidVar9, hidVar10, hidVar11);
    }

    public static vee newInstance(bs2 bs2Var, gfe gfeVar, BluetoothGatt bluetoothGatt, Object obj, Object obj2, Object obj3, Object obj4, m6c m6cVar, hid<uee.InterfaceC13519c> hidVar, woe woeVar, gs7 gs7Var) {
        return new vee(bs2Var, gfeVar, bluetoothGatt, (l4f) obj, (vgb) obj2, (x1b) obj3, (r74) obj4, m6cVar, hidVar, woeVar, gs7Var);
    }

    @Override // p000.hid
    public vee get() {
        return newInstance(this.f94047a.get(), this.f94048b.get(), this.f94049c.get(), this.f94050d.get(), this.f94051e.get(), this.f94052f.get(), this.f94053g.get(), this.f94054h.get(), this.f94055i, this.f94056j.get(), this.f94057k.get());
    }
}
