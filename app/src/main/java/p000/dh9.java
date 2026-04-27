package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
public class dh9 implements ah9 {

    /* JADX INFO: renamed from: a */
    public final my1 f29673a;

    /* JADX INFO: renamed from: b */
    public final qy1 f29674b;

    /* JADX INFO: renamed from: c */
    public final boolean f29675c;

    /* JADX INFO: renamed from: d */
    public final int f29676d;

    /* JADX INFO: renamed from: e */
    public final int f29677e;

    @b28
    public dh9(my1 my1Var, qy1 qy1Var, @w8b(a32.C0035h.f251a) int i, @w8b(a32.C0035h.f252b) int i2, @w8b(a32.C0035h.f253c) boolean z) {
        this.f29673a = my1Var;
        this.f29674b = qy1Var;
        this.f29676d = i;
        this.f29677e = i2;
        this.f29675c = z;
    }

    private boolean isLocationProviderEnabledRequired() {
        return !this.f29675c && (this.f29677e >= 29 || this.f29676d >= 23);
    }

    @Override // p000.ah9
    public boolean isLocationPermissionOk() {
        return this.f29674b.isScanRuntimePermissionGranted();
    }

    @Override // p000.ah9
    public boolean isLocationProviderOk() {
        return !isLocationProviderEnabledRequired() || this.f29673a.isLocationProviderEnabled();
    }
}
