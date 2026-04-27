package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class x5a<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f96825a;

    /* JADX INFO: renamed from: b */
    public final ph2 f96826b;

    /* JADX INFO: renamed from: x5a$a */
    public static final class C14925a<T> implements k9a<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<lf4> f96827a;

        /* JADX INFO: renamed from: b */
        public final k9a<? super T> f96828b;

        public C14925a(AtomicReference<lf4> parent, k9a<? super T> downstream) {
            this.f96827a = parent;
            this.f96828b = downstream;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f96828b.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f96828b.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.replace(this.f96827a, d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f96828b.onSuccess(value);
        }
    }

    /* JADX INFO: renamed from: x5a$b */
    public static final class C14926b<T> extends AtomicReference<lf4> implements ch2, lf4 {
        private static final long serialVersionUID = 703409937383992161L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f96829a;

        /* JADX INFO: renamed from: b */
        public final z9a<T> f96830b;

        public C14926b(k9a<? super T> actual, z9a<T> source) {
            this.f96829a = actual;
            this.f96830b = source;
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
            this.f96830b.subscribe(new C14925a(this, this.f96829a));
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f96829a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f96829a.onSubscribe(this);
            }
        }
    }

    public x5a(z9a<T> source, ph2 other) {
        this.f96825a = source;
        this.f96826b = other;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f96826b.subscribe(new C14926b(observer, this.f96825a));
    }
}
