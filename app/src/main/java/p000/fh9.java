package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@omg(31)
public class fh9 implements ah9 {

    /* JADX INFO: renamed from: a */
    public final my1 f36589a;

    /* JADX INFO: renamed from: b */
    public final qy1 f36590b;

    /* JADX INFO: renamed from: c */
    public final boolean f36591c;

    /* JADX INFO: renamed from: d */
    public final boolean f36592d;

    @b28
    public fh9(my1 my1Var, qy1 qy1Var, @w8b(a32.C0035h.f253c) boolean z, @w8b(a32.C0035h.f254d) boolean z2) {
        this.f36589a = my1Var;
        this.f36590b = qy1Var;
        this.f36591c = z;
        this.f36592d = z2;
    }

    private boolean isLocationProviderEnabledRequired() {
        if (this.f36591c) {
            return false;
        }
        return !this.f36592d;
    }

    @Override // p000.ah9
    public boolean isLocationPermissionOk() {
        return this.f36590b.isScanRuntimePermissionGranted();
    }

    @Override // p000.ah9
    public boolean isLocationProviderOk() {
        return !isLocationProviderEnabledRequired() || this.f36589a.isLocationProviderEnabled();
    }
}
