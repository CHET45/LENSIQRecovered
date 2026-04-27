package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class osf<T> implements ct4<T> {

    /* JADX INFO: renamed from: b */
    public static final int f68582b = 0;

    /* JADX INFO: renamed from: a */
    public final int f68583a;

    public osf() {
        this(0, 1, null);
    }

    public boolean equals(@gib Object obj) {
        return (obj instanceof osf) && ((osf) obj).f68583a == this.f68583a;
    }

    public final int getDelay() {
        return this.f68583a;
    }

    public int hashCode() {
        return this.f68583a;
    }

    public osf(int i) {
        this.f68583a = i;
    }

    @Override // p000.fw5, p000.InterfaceC11178py
    @yfb
    public <V extends AbstractC16313zy> w3i<V> vectorize(@yfb alh<T, V> alhVar) {
        return new f4i(this.f68583a);
    }

    public /* synthetic */ osf(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
