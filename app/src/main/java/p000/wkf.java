package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wkf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f94550a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super Throwable> f94551b;

    /* JADX INFO: renamed from: wkf$a */
    public final class C14662a implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f94552a;

        public C14662a(hnf<? super T> observer) {
            this.f94552a = observer;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            try {
                wkf.this.f94551b.accept(e);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                e = new qm2(e, th);
            }
            this.f94552a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f94552a.onSubscribe(d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f94552a.onSuccess(value);
        }
    }

    public wkf(oof<T> source, uu2<? super Throwable> onError) {
        this.f94550a = source;
        this.f94551b = onError;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f94550a.subscribe(new C14662a(observer));
    }
}
