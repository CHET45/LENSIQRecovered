package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class wsb<T, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f95323a;

    /* JADX INFO: renamed from: b */
    public final R f95324b;

    /* JADX INFO: renamed from: c */
    public final i11<R, ? super T, R> f95325c;

    /* JADX INFO: renamed from: wsb$a */
    public static final class C14772a<T, R> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super R> f95326a;

        /* JADX INFO: renamed from: b */
        public final i11<R, ? super T, R> f95327b;

        /* JADX INFO: renamed from: c */
        public R f95328c;

        /* JADX INFO: renamed from: d */
        public lf4 f95329d;

        public C14772a(hnf<? super R> actual, i11<R, ? super T, R> reducer, R value) {
            this.f95326a = actual;
            this.f95328c = value;
            this.f95327b = reducer;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f95329d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f95329d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            R r = this.f95328c;
            if (r != null) {
                this.f95328c = null;
                this.f95326a.onSuccess(r);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            if (this.f95328c == null) {
                ofe.onError(e);
            } else {
                this.f95328c = null;
                this.f95326a.onError(e);
            }
        }

        @Override // p000.pxb
        public void onNext(T value) {
            R r = this.f95328c;
            if (r != null) {
                try {
                    R rApply = this.f95327b.apply(r, value);
                    Objects.requireNonNull(rApply, "The reducer returned a null value");
                    this.f95328c = rApply;
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f95329d.dispose();
                    onError(th);
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f95329d, d)) {
                this.f95329d = d;
                this.f95326a.onSubscribe(this);
            }
        }
    }

    public wsb(wub<T> source, R seed, i11<R, ? super T, R> reducer) {
        this.f95323a = source;
        this.f95324b = seed;
        this.f95325c = reducer;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super R> observer) {
        this.f95323a.subscribe(new C14772a(observer, this.f95325c, this.f95324b));
    }
}
