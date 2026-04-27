package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class x41 implements jo5<w41> {

    /* JADX INFO: renamed from: a */
    public final hid<Context> f96261a;

    public x41(hid<Context> hidVar) {
        this.f96261a = hidVar;
    }

    public static x41 create(hid<Context> hidVar) {
        return new x41(hidVar);
    }

    public static w41 newInstance(Context context) {
        return new w41(context);
    }

    @Override // p000.hid
    public w41 get() {
        return newInstance(this.f96261a.get());
    }
}
