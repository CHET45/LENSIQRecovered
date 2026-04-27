package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class k8a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: k8a$a */
    public static final class C8232a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f52775a;

        /* JADX INFO: renamed from: b */
        public mf4 f52776b;

        public C8232a(l9a<? super T> l9aVar) {
            this.f52775a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f52776b.dispose();
            this.f52776b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f52776b.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f52775a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f52775a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f52776b, mf4Var)) {
                this.f52776b = mf4Var;
                this.f52775a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f52775a.onSuccess(t);
        }
    }

    public k8a(aaa<T> aaaVar) {
        super(aaaVar);
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C8232a(l9aVar));
    }
}
