package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class py1 implements jo5<oy1> {

    /* JADX INFO: renamed from: a */
    public final hid<Context> f72479a;

    public py1(hid<Context> hidVar) {
        this.f72479a = hidVar;
    }

    public static py1 create(hid<Context> hidVar) {
        return new py1(hidVar);
    }

    public static oy1 newInstance(Context context) {
        return new oy1(context);
    }

    @Override // p000.hid
    public oy1 get() {
        return newInstance(this.f72479a.get());
    }
}
