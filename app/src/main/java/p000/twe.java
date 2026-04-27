package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class twe {

    /* JADX INFO: renamed from: e */
    public static final int f86200e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final zd7 f86201a;

    /* JADX INFO: renamed from: b */
    public final long f86202b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final swe f86203c;

    /* JADX INFO: renamed from: d */
    public final boolean f86204d;

    public /* synthetic */ twe(zd7 zd7Var, long j, swe sweVar, boolean z, jt3 jt3Var) {
        this(zd7Var, j, sweVar, z);
    }

    /* JADX INFO: renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ twe m32442copyubNVwUQ$default(twe tweVar, zd7 zd7Var, long j, swe sweVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            zd7Var = tweVar.f86201a;
        }
        if ((i & 2) != 0) {
            j = tweVar.f86202b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            sweVar = tweVar.f86203c;
        }
        swe sweVar2 = sweVar;
        if ((i & 8) != 0) {
            z = tweVar.f86204d;
        }
        return tweVar.m32444copyubNVwUQ(zd7Var, j2, sweVar2, z);
    }

    @yfb
    public final zd7 component1() {
        return this.f86201a;
    }

    /* JADX INFO: renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m32443component2F1C5BW0() {
        return this.f86202b;
    }

    @yfb
    public final swe component3() {
        return this.f86203c;
    }

    public final boolean component4() {
        return this.f86204d;
    }

    @yfb
    /* JADX INFO: renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final twe m32444copyubNVwUQ(@yfb zd7 zd7Var, long j, @yfb swe sweVar, boolean z) {
        return new twe(zd7Var, j, sweVar, z, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twe)) {
            return false;
        }
        twe tweVar = (twe) obj;
        return this.f86201a == tweVar.f86201a && izb.m30426equalsimpl0(this.f86202b, tweVar.f86202b) && this.f86203c == tweVar.f86203c && this.f86204d == tweVar.f86204d;
    }

    @yfb
    public final swe getAnchor() {
        return this.f86203c;
    }

    @yfb
    public final zd7 getHandle() {
        return this.f86201a;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m32445getPositionF1C5BW0() {
        return this.f86202b;
    }

    public final boolean getVisible() {
        return this.f86204d;
    }

    public int hashCode() {
        return (((((this.f86201a.hashCode() * 31) + izb.m30431hashCodeimpl(this.f86202b)) * 31) + this.f86203c.hashCode()) * 31) + Boolean.hashCode(this.f86204d);
    }

    @yfb
    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f86201a + ", position=" + ((Object) izb.m30437toStringimpl(this.f86202b)) + ", anchor=" + this.f86203c + ", visible=" + this.f86204d + ')';
    }

    private twe(zd7 zd7Var, long j, swe sweVar, boolean z) {
        this.f86201a = zd7Var;
        this.f86202b = j;
        this.f86203c = sweVar;
        this.f86204d = z;
    }
}
