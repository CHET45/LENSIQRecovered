package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class m8a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: m8a$a */
    public static final class C9218a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f60187a;

        /* JADX INFO: renamed from: b */
        public mf4 f60188b;

        public C9218a(l9a<? super T> l9aVar) {
            this.f60187a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f60188b.dispose();
            this.f60188b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f60188b.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f60188b = ag4.DISPOSED;
            this.f60187a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f60188b = ag4.DISPOSED;
            this.f60187a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f60188b, mf4Var)) {
                this.f60188b = mf4Var;
                this.f60187a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f60188b = ag4.DISPOSED;
            this.f60187a.onComplete();
        }
    }

    public m8a(aaa<T> aaaVar) {
        super(aaaVar);
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C9218a(l9aVar));
    }
}
