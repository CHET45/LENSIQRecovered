package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class a7a<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f549a;

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f550b;

    /* JADX INFO: renamed from: a7a$a */
    public static final class C0079a<T> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f551a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f552b;

        /* JADX INFO: renamed from: c */
        public lf4 f553c;

        public C0079a(k9a<? super T> actual, n8d<? super T> predicate) {
            this.f551a = actual;
            this.f552b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            lf4 lf4Var = this.f553c;
            this.f553c = zf4.DISPOSED;
            lf4Var.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f553c.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f551a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f553c, d)) {
                this.f553c = d;
                this.f551a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            try {
                if (this.f552b.test(value)) {
                    this.f551a.onSuccess(value);
                } else {
                    this.f551a.onComplete();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f551a.onError(th);
            }
        }
    }

    public a7a(oof<T> source, n8d<? super T> predicate) {
        this.f549a = source;
        this.f550b = predicate;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f549a.subscribe(new C0079a(observer, this.f550b));
    }
}
