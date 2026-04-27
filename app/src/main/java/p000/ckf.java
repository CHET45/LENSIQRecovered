package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ckf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f16831a;

    /* JADX INFO: renamed from: b */
    public final ph2 f16832b;

    /* JADX INFO: renamed from: ckf$a */
    public static final class C2367a<T> extends AtomicReference<lf4> implements ch2, lf4 {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f16833a;

        /* JADX INFO: renamed from: b */
        public final oof<T> f16834b;

        public C2367a(hnf<? super T> actual, oof<T> source) {
            this.f16833a = actual;
            this.f16834b = source;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f16834b.subscribe(new f8e(this, this.f16833a));
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f16833a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f16833a.onSubscribe(this);
            }
        }
    }

    public ckf(oof<T> source, ph2 other) {
        this.f16831a = source;
        this.f16832b = other;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f16832b.subscribe(new C2367a(observer, this.f16831a));
    }
}
