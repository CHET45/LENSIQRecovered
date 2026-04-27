package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class kob<T> extends kjf<T> implements y07<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f54842a;

    /* JADX INFO: renamed from: b */
    public final long f54843b;

    /* JADX INFO: renamed from: c */
    public final T f54844c;

    /* JADX INFO: renamed from: kob$a */
    public static final class C8477a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f54845a;

        /* JADX INFO: renamed from: b */
        public final long f54846b;

        /* JADX INFO: renamed from: c */
        public final T f54847c;

        /* JADX INFO: renamed from: d */
        public lf4 f54848d;

        /* JADX INFO: renamed from: e */
        public long f54849e;

        /* JADX INFO: renamed from: f */
        public boolean f54850f;

        public C8477a(hnf<? super T> actual, long index, T defaultValue) {
            this.f54845a = actual;
            this.f54846b = index;
            this.f54847c = defaultValue;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f54848d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f54848d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f54850f) {
                return;
            }
            this.f54850f = true;
            T t = this.f54847c;
            if (t != null) {
                this.f54845a.onSuccess(t);
            } else {
                this.f54845a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f54850f) {
                ofe.onError(t);
            } else {
                this.f54850f = true;
                this.f54845a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f54850f) {
                return;
            }
            long j = this.f54849e;
            if (j != this.f54846b) {
                this.f54849e = j + 1;
                return;
            }
            this.f54850f = true;
            this.f54848d.dispose();
            this.f54845a.onSuccess(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f54848d, d)) {
                this.f54848d = d;
                this.f54845a.onSubscribe(this);
            }
        }
    }

    public kob(wub<T> source, long index, T defaultValue) {
        this.f54842a = source;
        this.f54843b = index;
        this.f54844c = defaultValue;
    }

    @Override // p000.y07
    public vkb<T> fuseToObservable() {
        return ofe.onAssembly(new gob(this.f54842a, this.f54843b, this.f54844c, true));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> t) {
        this.f54842a.subscribe(new C8477a(t, this.f54843b, this.f54844c));
    }
}
