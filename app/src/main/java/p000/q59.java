package p000;

import android.graphics.ColorFilter;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class q59 extends b92 {

    /* JADX INFO: renamed from: c */
    public final long f73271c;

    /* JADX INFO: renamed from: d */
    public final long f73272d;

    public /* synthetic */ q59(long j, long j2, jt3 jt3Var) {
        this(j, j2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q59)) {
            return false;
        }
        q59 q59Var = (q59) obj;
        return w82.m32952equalsimpl0(this.f73271c, q59Var.f73271c) && w82.m32952equalsimpl0(this.f73272d, q59Var.f73272d);
    }

    /* JADX INFO: renamed from: getAdd-0d7_KjU, reason: not valid java name */
    public final long m31930getAdd0d7_KjU() {
        return this.f73272d;
    }

    /* JADX INFO: renamed from: getMultiply-0d7_KjU, reason: not valid java name */
    public final long m31931getMultiply0d7_KjU() {
        return this.f73271c;
    }

    public int hashCode() {
        return (w82.m32958hashCodeimpl(this.f73271c) * 31) + w82.m32958hashCodeimpl(this.f73272d);
    }

    @yfb
    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) w82.m32959toStringimpl(this.f73271c)) + ", add=" + ((Object) w82.m32959toStringimpl(this.f73272d)) + ')';
    }

    public /* synthetic */ q59(long j, long j2, ColorFilter colorFilter, jt3 jt3Var) {
        this(j, j2, colorFilter);
    }

    private q59(long j, long j2, ColorFilter colorFilter) {
        super(colorFilter);
        this.f73271c = j;
        this.f73272d = j2;
    }

    private q59(long j, long j2) {
        this(j, j2, C8936lq.m30885actualLightingColorFilterOWjLjI(j, j2), null);
    }
}
