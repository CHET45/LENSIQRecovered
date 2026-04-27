package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class bvf extends he1 {

    /* JADX INFO: renamed from: c */
    public final long f14960c;

    public /* synthetic */ bvf(long j, jt3 jt3Var) {
        this(j);
    }

    @Override // p000.he1
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public void mo27217applyToPq9zytI(long j, @yfb icc iccVar, float f) {
        long jM32950copywmQWz5c$default;
        iccVar.setAlpha(1.0f);
        if (f == 1.0f) {
            jM32950copywmQWz5c$default = this.f14960c;
        } else {
            long j2 = this.f14960c;
            jM32950copywmQWz5c$default = w82.m32950copywmQWz5c$default(j2, w82.m32953getAlphaimpl(j2) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        iccVar.mo30199setColor8_81llA(jM32950copywmQWz5c$default);
        if (iccVar.getShader() != null) {
            iccVar.setShader(null);
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvf) && w82.m32952equalsimpl0(this.f14960c, ((bvf) obj).f14960c);
    }

    /* JADX INFO: renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m28160getValue0d7_KjU() {
        return this.f14960c;
    }

    public int hashCode() {
        return w82.m32958hashCodeimpl(this.f14960c);
    }

    @yfb
    public String toString() {
        return "SolidColor(value=" + ((Object) w82.m32959toStringimpl(this.f14960c)) + ')';
    }

    private bvf(long j) {
        super(null);
        this.f14960c = j;
    }
}
