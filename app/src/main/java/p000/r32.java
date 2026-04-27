package p000;

import android.content.Context;
import android.location.LocationManager;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class r32 implements jo5<LocationManager> {

    /* JADX INFO: renamed from: a */
    public final hid<Context> f76918a;

    public r32(hid<Context> hidVar) {
        this.f76918a = hidVar;
    }

    public static r32 create(hid<Context> hidVar) {
        return new r32(hidVar);
    }

    public static LocationManager provideLocationManager(Context context) {
        return (LocationManager) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m110v(context));
    }

    @Override // p000.hid
    public LocationManager get() {
        return provideLocationManager(this.f76918a.get());
    }
}
