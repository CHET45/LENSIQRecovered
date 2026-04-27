package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class kub<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final wub<? extends T> f55364a;

    /* JADX INFO: renamed from: b */
    public final T f55365b;

    /* JADX INFO: renamed from: kub$a */
    public static final class C8528a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f55366a;

        /* JADX INFO: renamed from: b */
        public final T f55367b;

        /* JADX INFO: renamed from: c */
        public lf4 f55368c;

        /* JADX INFO: renamed from: d */
        public T f55369d;

        /* JADX INFO: renamed from: e */
        public boolean f55370e;

        public C8528a(hnf<? super T> actual, T defaultValue) {
            this.f55366a = actual;
            this.f55367b = defaultValue;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f55368c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f55368c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f55370e) {
                return;
            }
            this.f55370e = true;
            T t = this.f55369d;
            this.f55369d = null;
            if (t == null) {
                t = this.f55367b;
            }
            if (t != null) {
                this.f55366a.onSuccess(t);
            } else {
                this.f55366a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f55370e) {
                ofe.onError(t);
            } else {
                this.f55370e = true;
                this.f55366a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f55370e) {
                return;
            }
            if (this.f55369d == null) {
                this.f55369d = t;
                return;
            }
            this.f55370e = true;
            this.f55368c.dispose();
            this.f55366a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f55368c, d)) {
                this.f55368c = d;
                this.f55366a.onSubscribe(this);
            }
        }
    }

    public kub(wub<? extends T> source, T defaultValue) {
        this.f55364a = source;
        this.f55365b = defaultValue;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> t) {
        this.f55364a.subscribe(new C8528a(t, this.f55365b));
    }
}
