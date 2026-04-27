package p000;

/* JADX INFO: loaded from: classes7.dex */
@fg5
public final class jkf<T, R> extends s4a<R> {

    /* JADX INFO: renamed from: a */
    public final ljf<T> f51038a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, kgb<R>> f51039b;

    /* JADX INFO: renamed from: jkf$a */
    public static final class C7961a<T, R> implements inf<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super R> f51040a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, kgb<R>> f51041b;

        /* JADX INFO: renamed from: c */
        public mf4 f51042c;

        public C7961a(l9a<? super R> l9aVar, py6<? super T, kgb<R>> py6Var) {
            this.f51040a = l9aVar;
            this.f51041b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f51042c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f51042c.isDisposed();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f51040a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f51042c, mf4Var)) {
                this.f51042c = mf4Var;
                this.f51040a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                kgb kgbVar = (kgb) xjb.requireNonNull(this.f51041b.apply(t), "The selector returned a null Notification");
                if (kgbVar.isOnNext()) {
                    this.f51040a.onSuccess((Object) kgbVar.getValue());
                } else if (kgbVar.isOnComplete()) {
                    this.f51040a.onComplete();
                } else {
                    this.f51040a.onError(kgbVar.getError());
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f51040a.onError(th);
            }
        }
    }

    public jkf(ljf<T> ljfVar, py6<? super T, kgb<R>> py6Var) {
        this.f51038a = ljfVar;
        this.f51039b = py6Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super R> l9aVar) {
        this.f51038a.subscribe(new C7961a(l9aVar, this.f51039b));
    }
}
