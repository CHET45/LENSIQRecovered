package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class xf3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final wf3 f97613a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final wf3 f97614b;

    /* JADX INFO: renamed from: c */
    public final double f97615c;

    public xf3() {
        this(null, null, 0.0d, 7, null);
    }

    public static /* synthetic */ xf3 copy$default(xf3 xf3Var, wf3 wf3Var, wf3 wf3Var2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            wf3Var = xf3Var.f97613a;
        }
        if ((i & 2) != 0) {
            wf3Var2 = xf3Var.f97614b;
        }
        if ((i & 4) != 0) {
            d = xf3Var.f97615c;
        }
        return xf3Var.copy(wf3Var, wf3Var2, d);
    }

    @yfb
    public final wf3 component1() {
        return this.f97613a;
    }

    @yfb
    public final wf3 component2() {
        return this.f97614b;
    }

    public final double component3() {
        return this.f97615c;
    }

    @yfb
    public final xf3 copy(@yfb wf3 wf3Var, @yfb wf3 wf3Var2, double d) {
        md8.checkNotNullParameter(wf3Var, "performance");
        md8.checkNotNullParameter(wf3Var2, "crashlytics");
        return new xf3(wf3Var, wf3Var2, d);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf3)) {
            return false;
        }
        xf3 xf3Var = (xf3) obj;
        return this.f97613a == xf3Var.f97613a && this.f97614b == xf3Var.f97614b && Double.compare(this.f97615c, xf3Var.f97615c) == 0;
    }

    @yfb
    public final wf3 getCrashlytics() {
        return this.f97614b;
    }

    @yfb
    public final wf3 getPerformance() {
        return this.f97613a;
    }

    public final double getSessionSamplingRate() {
        return this.f97615c;
    }

    public int hashCode() {
        return (((this.f97613a.hashCode() * 31) + this.f97614b.hashCode()) * 31) + Double.hashCode(this.f97615c);
    }

    @yfb
    public String toString() {
        return "DataCollectionStatus(performance=" + this.f97613a + ", crashlytics=" + this.f97614b + ", sessionSamplingRate=" + this.f97615c + ')';
    }

    public xf3(@yfb wf3 wf3Var, @yfb wf3 wf3Var2, double d) {
        md8.checkNotNullParameter(wf3Var, "performance");
        md8.checkNotNullParameter(wf3Var2, "crashlytics");
        this.f97613a = wf3Var;
        this.f97614b = wf3Var2;
        this.f97615c = d;
    }

    public /* synthetic */ xf3(wf3 wf3Var, wf3 wf3Var2, double d, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? wf3.f94068c : wf3Var, (i & 2) != 0 ? wf3.f94068c : wf3Var2, (i & 4) != 0 ? 1.0d : d);
    }
}
