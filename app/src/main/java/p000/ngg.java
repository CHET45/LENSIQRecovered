package p000;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ngg {

    /* JADX INFO: renamed from: a */
    public final Surface f64479a;

    /* JADX INFO: renamed from: b */
    public final int f64480b;

    /* JADX INFO: renamed from: c */
    public final int f64481c;

    /* JADX INFO: renamed from: d */
    public final int f64482d;

    /* JADX INFO: renamed from: e */
    public final boolean f64483e;

    public ngg(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngg)) {
            return false;
        }
        ngg nggVar = (ngg) obj;
        return this.f64480b == nggVar.f64480b && this.f64481c == nggVar.f64481c && this.f64482d == nggVar.f64482d && this.f64483e == nggVar.f64483e && this.f64479a.equals(nggVar.f64479a);
    }

    public int hashCode() {
        return (((((((this.f64479a.hashCode() * 31) + this.f64480b) * 31) + this.f64481c) * 31) + this.f64482d) * 31) + (this.f64483e ? 1 : 0);
    }

    public ngg(Surface surface, int i, int i2, int i3) {
        this(surface, i, i2, i3, false);
    }

    public ngg(Surface surface, int i, int i2, int i3, boolean z) {
        v80.checkArgument(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f64479a = surface;
        this.f64480b = i;
        this.f64481c = i2;
        this.f64482d = i3;
        this.f64483e = z;
    }
}
