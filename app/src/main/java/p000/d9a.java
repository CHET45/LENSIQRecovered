package p000;

/* JADX INFO: loaded from: classes7.dex */
@fg5
public final class d9a<T> extends ljf<kgb<T>> {

    /* JADX INFO: renamed from: a */
    public final s4a<T> f28836a;

    public d9a(s4a<T> s4aVar) {
        this.f28836a = s4aVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super kgb<T>> infVar) {
        this.f28836a.subscribe(new l3a(infVar));
    }
}
