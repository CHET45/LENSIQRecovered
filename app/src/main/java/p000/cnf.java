package p000;

/* JADX INFO: loaded from: classes7.dex */
@fg5
public final class cnf<T> extends ljf<kgb<T>> {

    /* JADX INFO: renamed from: a */
    public final ljf<T> f17092a;

    public cnf(ljf<T> ljfVar) {
        this.f17092a = ljfVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super kgb<T>> infVar) {
        this.f17092a.subscribe(new l3a(infVar));
    }
}
