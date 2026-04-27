package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class dlf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f29983a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super T> f29984b;

    /* JADX INFO: renamed from: dlf$a */
    public final class C4853a implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f29985a;

        public C4853a(hnf<? super T> observer) {
            this.f29985a = observer;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f29985a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f29985a.onSubscribe(d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            try {
                dlf.this.f29984b.accept(value);
                this.f29985a.onSuccess(value);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f29985a.onError(th);
            }
        }
    }

    public dlf(oof<T> source, uu2<? super T> onSuccess) {
        this.f29983a = source;
        this.f29984b = onSuccess;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f29983a.subscribe(new C4853a(observer));
    }
}
