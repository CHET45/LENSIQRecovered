package p000;

/* JADX INFO: renamed from: us */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C13671us implements pxc {

    /* JADX INFO: renamed from: c */
    public static final int f88887c = 0;

    /* JADX INFO: renamed from: b */
    public final int f88888b;

    public C13671us(int i) {
        this.f88888b = i;
    }

    private final int component1() {
        return this.f88888b;
    }

    public static /* synthetic */ C13671us copy$default(C13671us c13671us, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c13671us.f88888b;
        }
        return c13671us.copy(i);
    }

    @yfb
    public final C13671us copy(int i) {
        return new C13671us(i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13671us) && this.f88888b == ((C13671us) obj).f88888b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f88888b);
    }

    @Override // p000.pxc
    @yfb
    public jp6 interceptFontWeight(@yfb jp6 jp6Var) {
        int i = this.f88888b;
        return (i == 0 || i == Integer.MAX_VALUE) ? jp6Var : new jp6(kpd.coerceIn(jp6Var.getWeight() + this.f88888b, 1, 1000));
    }

    @yfb
    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f88888b + ')';
    }
}
