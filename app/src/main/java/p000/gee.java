package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class gee implements jo5<fee> {

    /* JADX INFO: renamed from: a */
    public final hid<Context> f39626a;

    public gee(hid<Context> hidVar) {
        this.f39626a = hidVar;
    }

    public static gee create(hid<Context> hidVar) {
        return new gee(hidVar);
    }

    public static fee newInstance(Context context) {
        return new fee(context);
    }

    @Override // p000.hid
    public fee get() {
        return newInstance(this.f39626a.get());
    }
}
