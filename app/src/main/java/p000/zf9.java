package p000;

import android.location.LocationManager;
import java.util.concurrent.Callable;
import p000.ag9;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf9 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocationManager f105004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ag9.C0228j f105005b;

    public /* synthetic */ zf9(LocationManager locationManager, ag9.C0228j c0228j) {
        this.f105004a = locationManager;
        this.f105005b = c0228j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return ag9.lambda$registerGnssStatusCallback$1(this.f105004a, this.f105005b);
    }
}
