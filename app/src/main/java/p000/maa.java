package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class maa<T, U> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final zjd<U> f60351b;

    /* JADX INFO: renamed from: maa$a */
    public static final class C9238a<T, U> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = -2187421758664251153L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f60352a;

        /* JADX INFO: renamed from: b */
        public final a<U> f60353b = new a<>(this);

        /* JADX INFO: renamed from: maa$a$a */
        public static final class a<U> extends AtomicReference<fdg> implements kj6<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* JADX INFO: renamed from: a */
            public final C9238a<?, U> f60354a;

            public a(C9238a<?, U> parent) {
                this.f60354a = parent;
            }

            @Override // p000.ycg
            public void onComplete() {
                this.f60354a.m17189a();
            }

            @Override // p000.ycg
            public void onError(Throwable e) {
                this.f60354a.m17190b(e);
            }

            @Override // p000.ycg
            public void onNext(Object value) {
                ldg.cancel(this);
                this.f60354a.m17189a();
            }

            @Override // p000.kj6, p000.ycg
            public void onSubscribe(fdg s) {
                ldg.setOnce(this, s, Long.MAX_VALUE);
            }
        }

        public C9238a(k9a<? super T> downstream) {
            this.f60352a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m17189a() {
            if (zf4.dispose(this)) {
                this.f60352a.onComplete();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m17190b(Throwable e) {
            if (zf4.dispose(this)) {
                this.f60352a.onError(e);
            } else {
                ofe.onError(e);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            ldg.cancel(this.f60353b);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            ldg.cancel(this.f60353b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f60352a.onComplete();
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            ldg.cancel(this.f60353b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f60352a.onError(e);
            } else {
                ofe.onError(e);
            }
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            ldg.cancel(this.f60353b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f60352a.onSuccess(value);
            }
        }
    }

    public maa(z9a<T> source, zjd<U> other) {
        super(source);
        this.f60351b = other;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        C9238a c9238a = new C9238a(observer);
        observer.onSubscribe(c9238a);
        this.f60351b.subscribe(c9238a.f60353b);
        this.f100099a.subscribe(c9238a);
    }
}
