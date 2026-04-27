package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mvb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f62383b;

    /* JADX INFO: renamed from: mvb$a */
    public static final class C9551a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f62384a;

        /* JADX INFO: renamed from: b */
        public boolean f62385b;

        /* JADX INFO: renamed from: c */
        public lf4 f62386c;

        /* JADX INFO: renamed from: d */
        public long f62387d;

        public C9551a(pxb<? super T> actual, long limit) {
            this.f62384a = actual;
            this.f62387d = limit;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f62386c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f62386c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f62385b) {
                return;
            }
            this.f62385b = true;
            this.f62386c.dispose();
            this.f62384a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f62385b) {
                ofe.onError(t);
                return;
            }
            this.f62385b = true;
            this.f62386c.dispose();
            this.f62384a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f62385b) {
                return;
            }
            long j = this.f62387d;
            long j2 = j - 1;
            this.f62387d = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.f62384a.onNext(t);
                if (z) {
                    onComplete();
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f62386c, d)) {
                this.f62386c = d;
                if (this.f62387d != 0) {
                    this.f62384a.onSubscribe(this);
                    return;
                }
                this.f62385b = true;
                d.dispose();
                b05.complete(this.f62384a);
            }
        }
    }

    public mvb(wub<T> source, long limit) {
        super(source);
        this.f62383b = limit;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C9551a(observer, this.f62383b));
    }
}
