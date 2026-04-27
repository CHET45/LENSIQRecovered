package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ekf<T, U> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f33278a;

    /* JADX INFO: renamed from: b */
    public final wub<U> f33279b;

    /* JADX INFO: renamed from: ekf$a */
    public static final class C5359a<T, U> extends AtomicReference<lf4> implements pxb<U>, lf4 {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f33280a;

        /* JADX INFO: renamed from: b */
        public final oof<T> f33281b;

        /* JADX INFO: renamed from: c */
        public boolean f33282c;

        public C5359a(hnf<? super T> actual, oof<T> source) {
            this.f33280a = actual;
            this.f33281b = source;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f33282c) {
                return;
            }
            this.f33282c = true;
            this.f33281b.subscribe(new f8e(this, this.f33280a));
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            if (this.f33282c) {
                ofe.onError(e);
            } else {
                this.f33282c = true;
                this.f33280a.onError(e);
            }
        }

        @Override // p000.pxb
        public void onNext(U value) {
            get().dispose();
            onComplete();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f33280a.onSubscribe(this);
            }
        }
    }

    public ekf(oof<T> source, wub<U> other) {
        this.f33278a = source;
        this.f33279b = other;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f33279b.subscribe(new C5359a(observer, this.f33278a));
    }
}
