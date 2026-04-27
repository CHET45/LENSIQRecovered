package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class q1g<T> implements InterfaceC11178py<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC11178py<T> f72933a;

    /* JADX INFO: renamed from: b */
    public final long f72934b;

    public q1g(@yfb InterfaceC11178py<T> interfaceC11178py, long j) {
        this.f72933a = interfaceC11178py;
        this.f72934b = j;
    }

    public boolean equals(@gib Object obj) {
        if (!(obj instanceof q1g)) {
            return false;
        }
        q1g q1gVar = (q1g) obj;
        return q1gVar.f72934b == this.f72934b && md8.areEqual(q1gVar.f72933a, this.f72933a);
    }

    @yfb
    public final InterfaceC11178py<T> getAnimationSpec() {
        return this.f72933a;
    }

    public final long getStartDelayNanos() {
        return this.f72934b;
    }

    public int hashCode() {
        return (this.f72933a.hashCode() * 31) + Long.hashCode(this.f72934b);
    }

    @Override // p000.InterfaceC11178py
    @yfb
    public <V extends AbstractC16313zy> t3i<V> vectorize(@yfb alh<T, V> alhVar) {
        return new r1g(this.f72933a.vectorize(alhVar), this.f72934b);
    }
}
