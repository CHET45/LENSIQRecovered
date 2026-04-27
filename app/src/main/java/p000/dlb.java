package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class dlb<T> extends AbstractC9666n3<T, Boolean> {

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f29946b;

    /* JADX INFO: renamed from: dlb$a */
    public static final class C4846a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super Boolean> f29947a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f29948b;

        /* JADX INFO: renamed from: c */
        public lf4 f29949c;

        /* JADX INFO: renamed from: d */
        public boolean f29950d;

        public C4846a(pxb<? super Boolean> actual, n8d<? super T> predicate) {
            this.f29947a = actual;
            this.f29948b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f29949c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f29949c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f29950d) {
                return;
            }
            this.f29950d = true;
            this.f29947a.onNext(Boolean.FALSE);
            this.f29947a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f29950d) {
                ofe.onError(t);
            } else {
                this.f29950d = true;
                this.f29947a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f29950d) {
                return;
            }
            try {
                if (this.f29948b.test(t)) {
                    this.f29950d = true;
                    this.f29949c.dispose();
                    this.f29947a.onNext(Boolean.TRUE);
                    this.f29947a.onComplete();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f29949c.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f29949c, d)) {
                this.f29949c = d;
                this.f29947a.onSubscribe(this);
            }
        }
    }

    public dlb(wub<T> source, n8d<? super T> predicate) {
        super(source);
        this.f29946b = predicate;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super Boolean> t) {
        this.f63101a.subscribe(new C4846a(t, this.f29946b));
    }
}
