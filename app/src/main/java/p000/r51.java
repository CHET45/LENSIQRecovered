package p000;

import android.graphics.ColorFilter;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class r51 extends b92 {

    /* JADX INFO: renamed from: c */
    public final long f77065c;

    /* JADX INFO: renamed from: d */
    public final int f77066d;

    public /* synthetic */ r51(long j, int i, jt3 jt3Var) {
        this(j, i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r51)) {
            return false;
        }
        r51 r51Var = (r51) obj;
        return w82.m32952equalsimpl0(this.f77065c, r51Var.f77065c) && q51.m31897equalsimpl0(this.f77066d, r51Var.f77066d);
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m32077getBlendMode0nO6VwU() {
        return this.f77066d;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m32078getColor0d7_KjU() {
        return this.f77065c;
    }

    public int hashCode() {
        return (w82.m32958hashCodeimpl(this.f77065c) * 31) + q51.m31898hashCodeimpl(this.f77066d);
    }

    @yfb
    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) w82.m32959toStringimpl(this.f77065c)) + ", blendMode=" + ((Object) q51.m31899toStringimpl(this.f77066d)) + ')';
    }

    public /* synthetic */ r51(long j, int i, ColorFilter colorFilter, jt3 jt3Var) {
        this(j, i, colorFilter);
    }

    private r51(long j, int i, ColorFilter colorFilter) {
        super(colorFilter);
        this.f77065c = j;
        this.f77066d = i;
    }

    private r51(long j, int i) {
        this(j, i, C8936lq.m30886actualTintColorFilterxETnrds(j, i), null);
    }
}
