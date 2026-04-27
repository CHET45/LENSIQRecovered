package p000;

import android.content.Context;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class y32 implements jo5<Integer> {

    /* JADX INFO: renamed from: a */
    public final hid<Context> f100205a;

    public y32(hid<Context> hidVar) {
        this.f100205a = hidVar;
    }

    public static y32 create(hid<Context> hidVar) {
        return new y32(hidVar);
    }

    public static int provideTargetSdk(Context context) {
        return a32.AbstractC0031d.m93D(context);
    }

    @Override // p000.hid
    public Integer get() {
        return Integer.valueOf(provideTargetSdk(this.f100205a.get()));
    }
}
