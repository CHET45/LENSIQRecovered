package p000;

/* JADX INFO: loaded from: classes.dex */
@jg5
@vw7
public final class u40<T> implements ct4<T> {

    /* JADX INFO: renamed from: e */
    public static final int f86747e = 0;

    /* JADX INFO: renamed from: a */
    public final int f86748a;

    /* JADX INFO: renamed from: b */
    public final int f86749b;

    /* JADX INFO: renamed from: c */
    public final int f86750c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final hv4 f86751d;

    public /* synthetic */ u40(int i, int i2, int i3, hv4 hv4Var, jt3 jt3Var) {
        this(i, i2, i3, hv4Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        if (w40.m32870equalsimpl0(this.f86748a, u40Var.f86748a) && this.f86749b == u40Var.f86749b && this.f86750c == u40Var.f86750c) {
            return md8.areEqual(this.f86751d, u40Var.f86751d);
        }
        return false;
    }

    public final int getDelayMillis() {
        return this.f86750c;
    }

    public final int getDurationMillis() {
        return this.f86749b;
    }

    @yfb
    public final hv4 getEasing() {
        return this.f86751d;
    }

    /* JADX INFO: renamed from: getMode--9T-Mq4, reason: not valid java name */
    public final int m32538getMode9TMq4() {
        return this.f86748a;
    }

    public int hashCode() {
        return (((((w40.m32871hashCodeimpl(this.f86748a) * 31) + this.f86749b) * 31) + this.f86750c) * 31) + this.f86751d.hashCode();
    }

    private u40(int i, int i2, int i3, hv4 hv4Var) {
        this.f86748a = i;
        this.f86749b = i2;
        this.f86750c = i3;
        this.f86751d = hv4Var;
    }

    @Override // p000.fw5, p000.InterfaceC11178py
    @yfb
    public <V extends AbstractC16313zy> w3i<V> vectorize(@yfb alh<T, V> alhVar) {
        return new c4i(s68.intListOf(0, this.f86749b), z68.emptyIntObjectMap(), this.f86749b, this.f86750c, this.f86751d, this.f86748a, null);
    }

    public /* synthetic */ u40(int i, int i2, int i3, hv4 hv4Var, int i4, jt3 jt3Var) {
        this((i4 & 1) != 0 ? w40.f93186b.m32875getArcBelow9TMq4() : i, (i4 & 2) != 0 ? 300 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? qv4.getFastOutSlowInEasing() : hv4Var, null);
    }
}
