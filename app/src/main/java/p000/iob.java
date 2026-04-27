package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class iob<T> extends r4a<T> implements y07<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f47785a;

    /* JADX INFO: renamed from: b */
    public final long f47786b;

    /* JADX INFO: renamed from: iob$a */
    public static final class C7543a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f47787a;

        /* JADX INFO: renamed from: b */
        public final long f47788b;

        /* JADX INFO: renamed from: c */
        public lf4 f47789c;

        /* JADX INFO: renamed from: d */
        public long f47790d;

        /* JADX INFO: renamed from: e */
        public boolean f47791e;

        public C7543a(k9a<? super T> actual, long index) {
            this.f47787a = actual;
            this.f47788b = index;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f47789c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f47789c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f47791e) {
                return;
            }
            this.f47791e = true;
            this.f47787a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f47791e) {
                ofe.onError(t);
            } else {
                this.f47791e = true;
                this.f47787a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f47791e) {
                return;
            }
            long j = this.f47790d;
            if (j != this.f47788b) {
                this.f47790d = j + 1;
                return;
            }
            this.f47791e = true;
            this.f47789c.dispose();
            this.f47787a.onSuccess(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f47789c, d)) {
                this.f47789c = d;
                this.f47787a.onSubscribe(this);
            }
        }
    }

    public iob(wub<T> source, long index) {
        this.f47785a = source;
        this.f47786b = index;
    }

    @Override // p000.y07
    public vkb<T> fuseToObservable() {
        return ofe.onAssembly(new gob(this.f47785a, this.f47786b, null, false));
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> t) {
        this.f47785a.subscribe(new C7543a(t, this.f47786b));
    }
}
