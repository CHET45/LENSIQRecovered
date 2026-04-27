package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class wkh<T> implements ct4<T> {

    /* JADX INFO: renamed from: d */
    public static final int f94558d = 0;

    /* JADX INFO: renamed from: a */
    public final int f94559a;

    /* JADX INFO: renamed from: b */
    public final int f94560b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final hv4 f94561c;

    public wkh() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(@gib Object obj) {
        if (!(obj instanceof wkh)) {
            return false;
        }
        wkh wkhVar = (wkh) obj;
        return wkhVar.f94559a == this.f94559a && wkhVar.f94560b == this.f94560b && md8.areEqual(wkhVar.f94561c, this.f94561c);
    }

    public final int getDelay() {
        return this.f94560b;
    }

    public final int getDurationMillis() {
        return this.f94559a;
    }

    @yfb
    public final hv4 getEasing() {
        return this.f94561c;
    }

    public int hashCode() {
        return (((this.f94559a * 31) + this.f94561c.hashCode()) * 31) + this.f94560b;
    }

    public wkh(int i, int i2, @yfb hv4 hv4Var) {
        this.f94559a = i;
        this.f94560b = i2;
        this.f94561c = hv4Var;
    }

    @Override // p000.fw5, p000.InterfaceC11178py
    @yfb
    public <V extends AbstractC16313zy> h4i<V> vectorize(@yfb alh<T, V> alhVar) {
        return new h4i<>(this.f94559a, this.f94560b, this.f94561c);
    }

    public /* synthetic */ wkh(int i, int i2, hv4 hv4Var, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? qv4.getFastOutSlowInEasing() : hv4Var);
    }
}
