package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class flf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f37056a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7776j8 f37057b;

    /* JADX INFO: renamed from: flf$a */
    public final class C5879a implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f37058a;

        public C5879a(hnf<? super T> observer) {
            this.f37058a = observer;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            try {
                flf.this.f37057b.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                e = new qm2(e, th);
            }
            this.f37058a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f37058a.onSubscribe(d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            try {
                flf.this.f37057b.run();
                this.f37058a.onSuccess(value);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f37058a.onError(th);
            }
        }
    }

    public flf(oof<T> source, InterfaceC7776j8 onTerminate) {
        this.f37056a = source;
        this.f37057b = onTerminate;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f37056a.subscribe(new C5879a(observer));
    }
}
