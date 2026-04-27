package p000;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class lzb extends ozd {

    /* JADX INFO: renamed from: b */
    @gib
    public final ozd f59336b;

    /* JADX INFO: renamed from: c */
    public final long f59337c;

    public /* synthetic */ lzb(ozd ozdVar, long j, jt3 jt3Var) {
        this(ozdVar, j);
    }

    @Override // p000.ozd
    @c5e(31)
    @yfb
    /* JADX INFO: renamed from: a */
    public RenderEffect mo16479a() {
        return uzd.f89595a.m32675createOffsetEffectUv8p0NA(this.f59336b, this.f59337c);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzb)) {
            return false;
        }
        lzb lzbVar = (lzb) obj;
        return md8.areEqual(this.f59336b, lzbVar.f59336b) && izb.m30426equalsimpl0(this.f59337c, lzbVar.f59337c);
    }

    public int hashCode() {
        ozd ozdVar = this.f59336b;
        return ((ozdVar != null ? ozdVar.hashCode() : 0) * 31) + izb.m30431hashCodeimpl(this.f59337c);
    }

    @yfb
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.f59336b + ", offset=" + ((Object) izb.m30437toStringimpl(this.f59337c)) + ')';
    }

    private lzb(ozd ozdVar, long j) {
        super(null);
        this.f59336b = ozdVar;
        this.f59337c = j;
    }
}
