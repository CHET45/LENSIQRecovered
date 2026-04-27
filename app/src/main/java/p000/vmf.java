package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vmf<T, R> extends ljf<R> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f91751a;

    /* JADX INFO: renamed from: b */
    public final pnf<? extends R, ? super T> f91752b;

    public vmf(pof<T> pofVar, pnf<? extends R, ? super T> pnfVar) {
        this.f91751a = pofVar;
        this.f91752b = pnfVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super R> infVar) {
        try {
            this.f91751a.subscribe((inf) xjb.requireNonNull(this.f91752b.apply(infVar), "The onLift returned a null SingleObserver"));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, infVar);
        }
    }
}
