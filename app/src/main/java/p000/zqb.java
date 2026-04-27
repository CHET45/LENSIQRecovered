package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class zqb<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f105746a;

    /* JADX INFO: renamed from: b */
    public final T f105747b;

    /* JADX INFO: renamed from: zqb$a */
    public static final class C16218a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f105748a;

        /* JADX INFO: renamed from: b */
        public final T f105749b;

        /* JADX INFO: renamed from: c */
        public lf4 f105750c;

        /* JADX INFO: renamed from: d */
        public T f105751d;

        public C16218a(hnf<? super T> actual, T defaultItem) {
            this.f105748a = actual;
            this.f105749b = defaultItem;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f105750c.dispose();
            this.f105750c = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f105750c == zf4.DISPOSED;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f105750c = zf4.DISPOSED;
            T t = this.f105751d;
            if (t != null) {
                this.f105751d = null;
                this.f105748a.onSuccess(t);
                return;
            }
            T t2 = this.f105749b;
            if (t2 != null) {
                this.f105748a.onSuccess(t2);
            } else {
                this.f105748a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f105750c = zf4.DISPOSED;
            this.f105751d = null;
            this.f105748a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f105751d = t;
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f105750c, d)) {
                this.f105750c = d;
                this.f105748a.onSubscribe(this);
            }
        }
    }

    public zqb(wub<T> source, T defaultItem) {
        this.f105746a = source;
        this.f105747b = defaultItem;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f105746a.subscribe(new C16218a(observer, this.f105747b));
    }
}
