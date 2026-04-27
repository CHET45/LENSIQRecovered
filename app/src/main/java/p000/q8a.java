package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class q8a<T> extends AbstractC15921z2<T, Boolean> {

    /* JADX INFO: renamed from: q8a$a */
    public static final class C11370a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super Boolean> f73580a;

        /* JADX INFO: renamed from: b */
        public mf4 f73581b;

        public C11370a(l9a<? super Boolean> l9aVar) {
            this.f73580a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f73581b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f73581b.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f73580a.onSuccess(Boolean.TRUE);
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f73580a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f73581b, mf4Var)) {
                this.f73581b = mf4Var;
                this.f73580a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f73580a.onSuccess(Boolean.FALSE);
        }
    }

    public q8a(aaa<T> aaaVar) {
        super(aaaVar);
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super Boolean> l9aVar) {
        this.f103681a.subscribe(new C11370a(l9aVar));
    }
}
