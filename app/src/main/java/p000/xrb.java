package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xrb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final n8d<? super Throwable> f99055b;

    /* JADX INFO: renamed from: xrb$a */
    public static final class C15262a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f99056a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super Throwable> f99057b;

        /* JADX INFO: renamed from: c */
        public lf4 f99058c;

        public C15262a(pxb<? super T> actual, n8d<? super Throwable> predicate) {
            this.f99056a = actual;
            this.f99057b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f99058c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f99058c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f99056a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            try {
                if (this.f99057b.test(e)) {
                    this.f99056a.onComplete();
                } else {
                    this.f99056a.onError(e);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f99056a.onError(new qm2(e, th));
            }
        }

        @Override // p000.pxb
        public void onNext(T value) {
            this.f99056a.onNext(value);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f99058c, d)) {
                this.f99058c = d;
                this.f99056a.onSubscribe(this);
            }
        }
    }

    public xrb(wub<T> source, n8d<? super Throwable> predicate) {
        super(source);
        this.f99055b = predicate;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C15262a(observer, this.f99055b));
    }
}
