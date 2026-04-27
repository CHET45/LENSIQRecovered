package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gaa<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final z9a<? extends T> f39129b;

    /* JADX INFO: renamed from: gaa$a */
    public static final class C6184a<T> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = -2223459372976438024L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f39130a;

        /* JADX INFO: renamed from: b */
        public final z9a<? extends T> f39131b;

        /* JADX INFO: renamed from: gaa$a$a */
        public static final class a<T> implements k9a<T> {

            /* JADX INFO: renamed from: a */
            public final k9a<? super T> f39132a;

            /* JADX INFO: renamed from: b */
            public final AtomicReference<lf4> f39133b;

            public a(k9a<? super T> actual, AtomicReference<lf4> parent) {
                this.f39132a = actual;
                this.f39133b = parent;
            }

            @Override // p000.k9a
            public void onComplete() {
                this.f39132a.onComplete();
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                this.f39132a.onError(e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this.f39133b, d);
            }

            @Override // p000.k9a
            public void onSuccess(T value) {
                this.f39132a.onSuccess(value);
            }
        }

        public C6184a(k9a<? super T> actual, z9a<? extends T> other) {
            this.f39130a = actual;
            this.f39131b = other;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            lf4 lf4Var = get();
            if (lf4Var == zf4.DISPOSED || !compareAndSet(lf4Var, null)) {
                return;
            }
            this.f39131b.subscribe(new a(this.f39130a, this));
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f39130a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f39130a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f39130a.onSuccess(value);
        }
    }

    public gaa(z9a<T> source, z9a<? extends T> other) {
        super(source);
        this.f39129b = other;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C6184a(observer, this.f39129b));
    }
}
