package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class yg9 implements jo5<xg9> {

    /* JADX INFO: renamed from: a */
    public final hid<Context> f101438a;

    /* JADX INFO: renamed from: b */
    public final hid<ah9> f101439b;

    public yg9(hid<Context> hidVar, hid<ah9> hidVar2) {
        this.f101438a = hidVar;
        this.f101439b = hidVar2;
    }

    public static yg9 create(hid<Context> hidVar, hid<ah9> hidVar2) {
        return new yg9(hidVar, hidVar2);
    }

    public static xg9 newInstance(Context context, ah9 ah9Var) {
        return new xg9(context, ah9Var);
    }

    @Override // p000.hid
    public xg9 get() {
        return newInstance(this.f101438a.get(), this.f101439b.get());
    }
}
