package p000;

/* JADX INFO: loaded from: classes7.dex */
@fg5
public final class ng2<T> extends ljf<kgb<T>> {

    /* JADX INFO: renamed from: a */
    public final yd2 f64460a;

    public ng2(yd2 yd2Var) {
        this.f64460a = yd2Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super kgb<T>> infVar) {
        this.f64460a.subscribe(new l3a(infVar));
    }
}
