package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class pkf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f71181a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7178i8 f71182b;

    /* JADX INFO: renamed from: pkf$a */
    public static final class C10993a<T> implements inf<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f71183a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7178i8 f71184b;

        /* JADX INFO: renamed from: c */
        public mf4 f71185c;

        public C10993a(inf<? super T> infVar, InterfaceC7178i8 interfaceC7178i8) {
            this.f71183a = infVar;
            this.f71184b = interfaceC7178i8;
        }

        private void onAfterTerminate() {
            try {
                this.f71184b.run();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f71185c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f71185c.isDisposed();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f71183a.onError(th);
            onAfterTerminate();
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f71185c, mf4Var)) {
                this.f71185c = mf4Var;
                this.f71183a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f71183a.onSuccess(t);
            onAfterTerminate();
        }
    }

    public pkf(pof<T> pofVar, InterfaceC7178i8 interfaceC7178i8) {
        this.f71181a = pofVar;
        this.f71182b = interfaceC7178i8;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f71181a.subscribe(new C10993a(infVar, this.f71182b));
    }
}
