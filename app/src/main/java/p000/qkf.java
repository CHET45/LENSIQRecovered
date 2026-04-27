package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class qkf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f74765a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7776j8 f74766b;

    /* JADX INFO: renamed from: qkf$a */
    public static final class C11524a<T> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f74767a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7776j8 f74768b;

        /* JADX INFO: renamed from: c */
        public lf4 f74769c;

        public C11524a(hnf<? super T> actual, InterfaceC7776j8 onAfterTerminate) {
            this.f74767a = actual;
            this.f74768b = onAfterTerminate;
        }

        private void onAfterTerminate() {
            try {
                this.f74768b.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f74769c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f74769c.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f74767a.onError(e);
            onAfterTerminate();
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f74769c, d)) {
                this.f74769c = d;
                this.f74767a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            this.f74767a.onSuccess(t);
            onAfterTerminate();
        }
    }

    public qkf(oof<T> source, InterfaceC7776j8 onAfterTerminate) {
        this.f74765a = source;
        this.f74766b = onAfterTerminate;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f74765a.subscribe(new C11524a(observer, this.f74766b));
    }
}
