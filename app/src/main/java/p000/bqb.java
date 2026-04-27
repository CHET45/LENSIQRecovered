package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bqb<T, S> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<S> f14490a;

    /* JADX INFO: renamed from: b */
    public final i11<S, qy4<T>, S> f14491b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super S> f14492c;

    public bqb(nfg<S> stateSupplier, i11<S, qy4<T>, S> generator, uu2<? super S> disposeState) {
        this.f14490a = stateSupplier;
        this.f14491b = generator;
        this.f14492c = disposeState;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        try {
            C2002a c2002a = new C2002a(observer, this.f14491b, this.f14492c, this.f14490a.get());
            observer.onSubscribe(c2002a);
            c2002a.run();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }

    /* JADX INFO: renamed from: bqb$a */
    public static final class C2002a<T, S> implements qy4<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f14493a;

        /* JADX INFO: renamed from: b */
        public final i11<S, ? super qy4<T>, S> f14494b;

        /* JADX INFO: renamed from: c */
        public final uu2<? super S> f14495c;

        /* JADX INFO: renamed from: d */
        public S f14496d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f14497e;

        /* JADX INFO: renamed from: f */
        public boolean f14498f;

        /* JADX INFO: renamed from: m */
        public boolean f14499m;

        public C2002a(pxb<? super T> actual, i11<S, ? super qy4<T>, S> generator, uu2<? super S> disposeState, S initialState) {
            this.f14493a = actual;
            this.f14494b = generator;
            this.f14495c = disposeState;
            this.f14496d = initialState;
        }

        private void dispose(S s) {
            try {
                this.f14495c.accept(s);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f14497e;
        }

        @Override // p000.qy4
        public void onComplete() {
            if (this.f14498f) {
                return;
            }
            this.f14498f = true;
            this.f14493a.onComplete();
        }

        @Override // p000.qy4
        public void onError(Throwable t) {
            if (this.f14498f) {
                ofe.onError(t);
                return;
            }
            if (t == null) {
                t = k75.createNullPointerException("onError called with a null Throwable.");
            }
            this.f14498f = true;
            this.f14493a.onError(t);
        }

        @Override // p000.qy4
        public void onNext(T t) {
            if (this.f14498f) {
                return;
            }
            if (this.f14499m) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(k75.createNullPointerException("onNext called with a null value."));
            } else {
                this.f14499m = true;
                this.f14493a.onNext(t);
            }
        }

        public void run() {
            S sApply = this.f14496d;
            if (this.f14497e) {
                this.f14496d = null;
                dispose(sApply);
                return;
            }
            i11<S, ? super qy4<T>, S> i11Var = this.f14494b;
            while (!this.f14497e) {
                this.f14499m = false;
                try {
                    sApply = i11Var.apply(sApply, this);
                    if (this.f14498f) {
                        this.f14497e = true;
                        this.f14496d = null;
                        dispose(sApply);
                        return;
                    }
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f14496d = null;
                    this.f14497e = true;
                    onError(th);
                    dispose(sApply);
                    return;
                }
            }
            this.f14496d = null;
            dispose(sApply);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f14497e = true;
        }
    }
}
