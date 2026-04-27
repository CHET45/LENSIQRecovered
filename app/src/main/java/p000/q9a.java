package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class q9a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final py6<? super Throwable, ? extends T> f73695b;

    /* JADX INFO: renamed from: q9a$a */
    public static final class C11393a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f73696a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Throwable, ? extends T> f73697b;

        /* JADX INFO: renamed from: c */
        public mf4 f73698c;

        public C11393a(l9a<? super T> l9aVar, py6<? super Throwable, ? extends T> py6Var) {
            this.f73696a = l9aVar;
            this.f73697b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f73698c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f73698c.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f73696a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            try {
                this.f73696a.onSuccess(xjb.requireNonNull(this.f73697b.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f73696a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f73698c, mf4Var)) {
                this.f73698c = mf4Var;
                this.f73696a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f73696a.onSuccess(t);
        }
    }

    public q9a(aaa<T> aaaVar, py6<? super Throwable, ? extends T> py6Var) {
        super(aaaVar);
        this.f73695b = py6Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C11393a(l9aVar, this.f73695b));
    }
}
