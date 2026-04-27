package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class b6a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final tu2<? super T> f12797b;

    /* JADX INFO: renamed from: b6a$a */
    public static final class C1758a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f12798a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super T> f12799b;

        /* JADX INFO: renamed from: c */
        public mf4 f12800c;

        public C1758a(l9a<? super T> l9aVar, tu2<? super T> tu2Var) {
            this.f12798a = l9aVar;
            this.f12799b = tu2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f12800c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f12800c.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f12798a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f12798a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f12800c, mf4Var)) {
                this.f12800c = mf4Var;
                this.f12798a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f12798a.onSuccess(t);
            try {
                this.f12799b.accept(t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
        }
    }

    public b6a(aaa<T> aaaVar, tu2<? super T> tu2Var) {
        super(aaaVar);
        this.f12797b = tu2Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C1758a(l9aVar, this.f12797b));
    }
}
