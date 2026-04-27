package p000;

import android.content.Context;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class o32 implements jo5<Boolean> {

    /* JADX INFO: renamed from: a */
    public final hid<Context> f66357a;

    /* JADX INFO: renamed from: b */
    public final hid<Integer> f66358b;

    public o32(hid<Context> hidVar, hid<Integer> hidVar2) {
        this.f66357a = hidVar;
        this.f66358b = hidVar2;
    }

    public static o32 create(hid<Context> hidVar, hid<Integer> hidVar2) {
        return new o32(hidVar, hidVar2);
    }

    public static boolean provideIsAndroidWear(Context context, int i) {
        return a32.AbstractC0031d.m107s(context, i);
    }

    @Override // p000.hid
    public Boolean get() {
        return Boolean.valueOf(provideIsAndroidWear(this.f66357a.get(), this.f66358b.get().intValue()));
    }
}
