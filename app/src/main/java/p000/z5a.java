package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class z5a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: z5a$a */
    public static final class C16012a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public l9a<? super T> f104239a;

        /* JADX INFO: renamed from: b */
        public mf4 f104240b;

        public C16012a(l9a<? super T> l9aVar) {
            this.f104239a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f104239a = null;
            this.f104240b.dispose();
            this.f104240b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f104240b.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f104240b = ag4.DISPOSED;
            l9a<? super T> l9aVar = this.f104239a;
            if (l9aVar != null) {
                this.f104239a = null;
                l9aVar.onComplete();
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f104240b = ag4.DISPOSED;
            l9a<? super T> l9aVar = this.f104239a;
            if (l9aVar != null) {
                this.f104239a = null;
                l9aVar.onError(th);
            }
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f104240b, mf4Var)) {
                this.f104240b = mf4Var;
                this.f104239a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f104240b = ag4.DISPOSED;
            l9a<? super T> l9aVar = this.f104239a;
            if (l9aVar != null) {
                this.f104239a = null;
                l9aVar.onSuccess(t);
            }
        }
    }

    public z5a(aaa<T> aaaVar) {
        super(aaaVar);
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C16012a(l9aVar));
    }
}
