package p000;

import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class q69 extends a8f {

    /* JADX INFO: renamed from: e */
    @yfb
    public final List<w82> f73326e;

    /* JADX INFO: renamed from: f */
    @gib
    public final List<Float> f73327f;

    /* JADX INFO: renamed from: g */
    public final long f73328g;

    /* JADX INFO: renamed from: h */
    public final long f73329h;

    /* JADX INFO: renamed from: i */
    public final int f73330i;

    public /* synthetic */ q69(List list, List list2, long j, long j2, int i, jt3 jt3Var) {
        this(list, list2, j, j2, i);
    }

    @Override // p000.a8f
    @yfb
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo27218createShaderuvyYCjk(long j) {
        return d8f.m28628LinearGradientShaderVjE6UOU(mzb.Offset(izb.m30429getXimpl(this.f73328g) == Float.POSITIVE_INFINITY ? wpf.m33069getWidthimpl(j) : izb.m30429getXimpl(this.f73328g), izb.m30430getYimpl(this.f73328g) == Float.POSITIVE_INFINITY ? wpf.m33066getHeightimpl(j) : izb.m30430getYimpl(this.f73328g)), mzb.Offset(izb.m30429getXimpl(this.f73329h) == Float.POSITIVE_INFINITY ? wpf.m33069getWidthimpl(j) : izb.m30429getXimpl(this.f73329h), izb.m30430getYimpl(this.f73329h) == Float.POSITIVE_INFINITY ? wpf.m33066getHeightimpl(j) : izb.m30430getYimpl(this.f73329h)), this.f73326e, this.f73327f, this.f73330i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q69)) {
            return false;
        }
        q69 q69Var = (q69) obj;
        return md8.areEqual(this.f73326e, q69Var.f73326e) && md8.areEqual(this.f73327f, q69Var.f73327f) && izb.m30426equalsimpl0(this.f73328g, q69Var.f73328g) && izb.m30426equalsimpl0(this.f73329h, q69Var.f73329h) && tzg.m32472equalsimpl0(this.f73330i, q69Var.f73330i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    @Override // p000.he1
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo29991getIntrinsicSizeNHjbRc() {
        /*
            r5 = this;
            long r0 = r5.f73328g
            float r0 = p000.izb.m30429getXimpl(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 != 0) goto L38
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L38
            long r0 = r5.f73329h
            float r0 = p000.izb.m30429getXimpl(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L38
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L38
            long r0 = r5.f73328g
            float r0 = p000.izb.m30429getXimpl(r0)
            long r3 = r5.f73329h
            float r1 = p000.izb.m30429getXimpl(r3)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            goto L39
        L38:
            r0 = r2
        L39:
            long r3 = r5.f73328g
            float r1 = p000.izb.m30430getYimpl(r3)
            boolean r3 = java.lang.Float.isInfinite(r1)
            if (r3 != 0) goto L6e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L6e
            long r3 = r5.f73329h
            float r1 = p000.izb.m30430getYimpl(r3)
            boolean r3 = java.lang.Float.isInfinite(r1)
            if (r3 != 0) goto L6e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L6e
            long r1 = r5.f73328g
            float r1 = p000.izb.m30430getYimpl(r1)
            long r2 = r5.f73329h
            float r2 = p000.izb.m30430getYimpl(r2)
            float r1 = r1 - r2
            float r2 = java.lang.Math.abs(r1)
        L6e:
            long r0 = p000.eqf.Size(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q69.mo29991getIntrinsicSizeNHjbRc():long");
    }

    public int hashCode() {
        int iHashCode = this.f73326e.hashCode() * 31;
        List<Float> list = this.f73327f;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + izb.m30431hashCodeimpl(this.f73328g)) * 31) + izb.m30431hashCodeimpl(this.f73329h)) * 31) + tzg.m32473hashCodeimpl(this.f73330i);
    }

    @yfb
    public String toString() {
        String str;
        String str2 = "";
        if (mzb.m31098isFinitek4lQ0M(this.f73328g)) {
            str = "start=" + ((Object) izb.m30437toStringimpl(this.f73328g)) + ", ";
        } else {
            str = "";
        }
        if (mzb.m31098isFinitek4lQ0M(this.f73329h)) {
            str2 = "end=" + ((Object) izb.m30437toStringimpl(this.f73329h)) + ", ";
        }
        return "LinearGradient(colors=" + this.f73326e + ", stops=" + this.f73327f + ", " + str + str2 + "tileMode=" + ((Object) tzg.m32474toStringimpl(this.f73330i)) + ')';
    }

    public /* synthetic */ q69(List list, List list2, long j, long j2, int i, int i2, jt3 jt3Var) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? tzg.f86446b.m32476getClamp3opZhB0() : i, null);
    }

    private q69(List<w82> list, List<Float> list2, long j, long j2, int i) {
        this.f73326e = list;
        this.f73327f = list2;
        this.f73328g = j;
        this.f73329h = j2;
        this.f73330i = i;
    }
}
