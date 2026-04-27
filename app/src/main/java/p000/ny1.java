package p000;

import android.content.ContentResolver;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class ny1 implements jo5<my1> {

    /* JADX INFO: renamed from: a */
    public final hid<ContentResolver> f65996a;

    /* JADX INFO: renamed from: b */
    public final hid<LocationManager> f65997b;

    public ny1(hid<ContentResolver> hidVar, hid<LocationManager> hidVar2) {
        this.f65996a = hidVar;
        this.f65997b = hidVar2;
    }

    public static ny1 create(hid<ContentResolver> hidVar, hid<LocationManager> hidVar2) {
        return new ny1(hidVar, hidVar2);
    }

    public static my1 newInstance(ContentResolver contentResolver, LocationManager locationManager) {
        return new my1(contentResolver, locationManager);
    }

    @Override // p000.hid
    public my1 get() {
        return newInstance(this.f65996a.get(), this.f65997b.get());
    }
}
