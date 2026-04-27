package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vkf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f91531a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super Throwable> f91532b;

    /* JADX INFO: renamed from: vkf$a */
    public final class C14145a implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f91533a;

        public C14145a(inf<? super T> infVar) {
            this.f91533a = infVar;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            try {
                vkf.this.f91532b.accept(th);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                th = new pm2(th, th2);
            }
            this.f91533a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f91533a.onSubscribe(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f91533a.onSuccess(t);
        }
    }

    public vkf(pof<T> pofVar, tu2<? super Throwable> tu2Var) {
        this.f91531a = pofVar;
        this.f91532b = tu2Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f91531a.subscribe(new C14145a(infVar));
    }
}
