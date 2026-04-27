package p000;

import android.content.Context;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class q32 implements jo5<Boolean> {

    /* JADX INFO: renamed from: a */
    public final hid<Context> f73085a;

    public q32(hid<Context> hidVar) {
        this.f73085a = hidVar;
    }

    public static q32 create(hid<Context> hidVar) {
        return new q32(hidVar);
    }

    public static boolean provideIsNearbyPermissionNeverForLocation(Context context) {
        return a32.AbstractC0031d.m109u(context);
    }

    @Override // p000.hid
    public Boolean get() {
        return Boolean.valueOf(provideIsNearbyPermissionNeverForLocation(this.f73085a.get()));
    }
}
