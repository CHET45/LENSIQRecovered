package p000;

import p000.ip6;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class i6e implements xn6 {

    /* JADX INFO: renamed from: h */
    public static final int f45857h = 0;

    /* JADX INFO: renamed from: c */
    public final int f45858c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final jp6 f45859d;

    /* JADX INFO: renamed from: e */
    public final int f45860e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final ip6.C7556e f45861f;

    /* JADX INFO: renamed from: g */
    public final int f45862g;

    public /* synthetic */ i6e(int i, jp6 jp6Var, int i2, @th5 ip6.C7556e c7556e, int i3, jt3 jt3Var) {
        this(i, jp6Var, i2, c7556e, i3);
    }

    /* JADX INFO: renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ i6e m30169copyF3nL8kk$default(i6e i6eVar, int i, jp6 jp6Var, int i2, int i3, ip6.C7556e c7556e, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = i6eVar.f45858c;
        }
        if ((i4 & 2) != 0) {
            jp6Var = i6eVar.getWeight();
        }
        jp6 jp6Var2 = jp6Var;
        if ((i4 & 4) != 0) {
            i2 = i6eVar.mo30175getStyle_LCdwA();
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = i6eVar.mo30174getLoadingStrategyPKNRLFQ();
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            c7556e = i6eVar.f45861f;
        }
        return i6eVar.m30172copyF3nL8kk(i, jp6Var2, i5, i6, c7556e);
    }

    /* JADX INFO: renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ i6e m30170copyRetOiIg$default(i6e i6eVar, int i, jp6 jp6Var, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = i6eVar.f45858c;
        }
        if ((i3 & 2) != 0) {
            jp6Var = i6eVar.getWeight();
        }
        if ((i3 & 4) != 0) {
            i2 = i6eVar.mo30175getStyle_LCdwA();
        }
        return i6eVar.m30173copyRetOiIg(i, jp6Var, i2);
    }

    @th5
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m30171getLoadingStrategyPKNRLFQ$annotations() {
    }

    @yfb
    @th5
    /* JADX INFO: renamed from: copy-F3nL8kk, reason: not valid java name */
    public final i6e m30172copyF3nL8kk(int i, @yfb jp6 jp6Var, int i2, int i3, @yfb ip6.C7556e c7556e) {
        return new i6e(i, jp6Var, i2, c7556e, i3, null);
    }

    @yfb
    /* JADX INFO: renamed from: copy-RetOiIg, reason: not valid java name */
    public final i6e m30173copyRetOiIg(int i, @yfb jp6 jp6Var, int i2) {
        return m30169copyF3nL8kk$default(this, i, jp6Var, i2, mo30174getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6e)) {
            return false;
        }
        i6e i6eVar = (i6e) obj;
        return this.f45858c == i6eVar.f45858c && md8.areEqual(getWeight(), i6eVar.getWeight()) && fp6.m29575equalsimpl0(mo30175getStyle_LCdwA(), i6eVar.mo30175getStyle_LCdwA()) && md8.areEqual(this.f45861f, i6eVar.f45861f) && oo6.m31519equalsimpl0(mo30174getLoadingStrategyPKNRLFQ(), i6eVar.mo30174getLoadingStrategyPKNRLFQ());
    }

    @Override // p000.xn6
    @th5
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public int mo30174getLoadingStrategyPKNRLFQ() {
        return this.f45862g;
    }

    public final int getResId() {
        return this.f45858c;
    }

    @Override // p000.xn6
    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public int mo30175getStyle_LCdwA() {
        return this.f45860e;
    }

    @yfb
    @th5
    public final ip6.C7556e getVariationSettings() {
        return this.f45861f;
    }

    @Override // p000.xn6
    @yfb
    public jp6 getWeight() {
        return this.f45859d;
    }

    public int hashCode() {
        return (((((((this.f45858c * 31) + getWeight().hashCode()) * 31) + fp6.m29576hashCodeimpl(mo30175getStyle_LCdwA())) * 31) + oo6.m31520hashCodeimpl(mo30174getLoadingStrategyPKNRLFQ())) * 31) + this.f45861f.hashCode();
    }

    @yfb
    public String toString() {
        return "ResourceFont(resId=" + this.f45858c + ", weight=" + getWeight() + ", style=" + ((Object) fp6.m29577toStringimpl(mo30175getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) oo6.m31521toStringimpl(mo30174getLoadingStrategyPKNRLFQ())) + ')';
    }

    private i6e(int i, jp6 jp6Var, int i2, ip6.C7556e c7556e, int i3) {
        this.f45858c = i;
        this.f45859d = jp6Var;
        this.f45860e = i2;
        this.f45861f = c7556e;
        this.f45862g = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i6e(int i, jp6 jp6Var, int i2, ip6.C7556e c7556e, int i3, int i4, jt3 jt3Var) {
        jp6 normal = (i4 & 2) != 0 ? jp6.f51403b.getNormal() : jp6Var;
        int iM29582getNormal_LCdwA = (i4 & 4) != 0 ? fp6.f37355b.m29582getNormal_LCdwA() : i2;
        this(i, normal, iM29582getNormal_LCdwA, (i4 & 8) != 0 ? ip6.f47830a.m30313Settings6EWAqTQ(normal, iM29582getNormal_LCdwA, new ip6.InterfaceC7552a[0]) : c7556e, (i4 & 16) != 0 ? oo6.f68233b.m31523getAsyncPKNRLFQ() : i3, null);
    }
}
