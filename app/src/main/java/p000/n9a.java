package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class n9a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final n8d<? super Throwable> f63752b;

    /* JADX INFO: renamed from: n9a$a */
    public static final class C9755a<T> implements k9a<T>, hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f63753a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super Throwable> f63754b;

        /* JADX INFO: renamed from: c */
        public lf4 f63755c;

        public C9755a(k9a<? super T> actual, n8d<? super Throwable> predicate) {
            this.f63753a = actual;
            this.f63754b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f63755c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f63755c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f63753a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            try {
                if (this.f63754b.test(e)) {
                    this.f63753a.onComplete();
                } else {
                    this.f63753a.onError(e);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f63753a.onError(new qm2(e, th));
            }
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f63755c, d)) {
                this.f63755c = d;
                this.f63753a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f63753a.onSuccess(value);
        }
    }

    public n9a(z9a<T> source, n8d<? super Throwable> predicate) {
        super(source);
        this.f63752b = predicate;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C9755a(observer, this.f63752b));
    }
}
