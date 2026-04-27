package p000;

import android.bluetooth.BluetoothGatt;
import p000.a32;
import p000.rr2;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
@wxa
public abstract class ur2 {

    /* JADX INFO: renamed from: a */
    public static final String f88832a = "operation-timeout";

    @pid
    @w8b(rr2.C12213c.f79064a)
    /* JADX INFO: renamed from: k */
    public static int m23512k() {
        return 3;
    }

    @pid
    @w8b(rr2.C12213c.f79065b)
    /* JADX INFO: renamed from: l */
    public static int m23513l() {
        return 23;
    }

    @pid
    /* JADX INFO: renamed from: m */
    public static BluetoothGatt m23514m(c91 c91Var) {
        return c91Var.getBluetoothGatt();
    }

    @pid
    /* JADX INFO: renamed from: n */
    public static ow1 m23515n() {
        return new ow1(1, 2, 4, 8, 16, 32, 64);
    }

    @pid
    /* JADX INFO: renamed from: o */
    public static is7 m23516o(@w8b(rr2.C12212b.f79063b) boolean z, hid<vj9> hidVar, hid<ezg> hidVar2) {
        return z ? hidVar.get() : hidVar2.get();
    }

    @pid
    @w8b("operation-timeout")
    /* JADX INFO: renamed from: p */
    public static y1h m23517p(@w8b(a32.C0034g.f248b) woe woeVar, w1h w1hVar) {
        return new y1h(w1hVar.f93121b, w1hVar.f93120a, woeVar);
    }

    @a31
    /* JADX INFO: renamed from: a */
    public abstract bs2 m23518a(cs2 cs2Var);

    @bd8
    @a31
    /* JADX INFO: renamed from: b */
    public abstract qs2 m23519b(cs2 cs2Var);

    @a31
    /* JADX INFO: renamed from: c */
    public abstract x1b m23520c(a2b a2bVar);

    @bd8
    @a31
    /* JADX INFO: renamed from: d */
    public abstract qs2 m23521d(zd4 zd4Var);

    @a31
    /* JADX INFO: renamed from: e */
    public abstract ge4 m23522e(fe4 fe4Var);

    @a31
    /* JADX INFO: renamed from: f */
    public abstract he4 m23523f(fe4 fe4Var);

    @a31
    /* JADX INFO: renamed from: g */
    public abstract uee.InterfaceC13519c m23524g(gm9 gm9Var);

    @bd8
    @a31
    /* JADX INFO: renamed from: h */
    public abstract qs2 m23525h(a2b a2bVar);

    @a31
    /* JADX INFO: renamed from: i */
    public abstract m6c m23526i(n6c n6cVar);

    @a31
    /* JADX INFO: renamed from: j */
    public abstract uee m23527j(vee veeVar);
}
