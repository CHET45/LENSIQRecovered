package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class kaa<T, U> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final z9a<U> f53447b;

    /* JADX INFO: renamed from: kaa$a */
    public static final class C8264a<T, U> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = -2187421758664251153L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f53448a;

        /* JADX INFO: renamed from: b */
        public final a<U> f53449b = new a<>(this);

        /* JADX INFO: renamed from: kaa$a$a */
        public static final class a<U> extends AtomicReference<lf4> implements k9a<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* JADX INFO: renamed from: a */
            public final C8264a<?, U> f53450a;

            public a(C8264a<?, U> parent) {
                this.f53450a = parent;
            }

            @Override // p000.k9a
            public void onComplete() {
                this.f53450a.m14630a();
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                this.f53450a.m14631b(e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.k9a
            public void onSuccess(Object value) {
                this.f53450a.m14630a();
            }
        }

        public C8264a(k9a<? super T> downstream) {
            this.f53448a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m14630a() {
            if (zf4.dispose(this)) {
                this.f53448a.onComplete();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14631b(Throwable e) {
            if (zf4.dispose(this)) {
                this.f53448a.onError(e);
            } else {
                ofe.onError(e);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            zf4.dispose(this.f53449b);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            zf4.dispose(this.f53449b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f53448a.onComplete();
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            zf4.dispose(this.f53449b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f53448a.onError(e);
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
            zf4.dispose(this.f53449b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f53448a.onSuccess(value);
            }
        }
    }

    public kaa(z9a<T> source, z9a<U> other) {
        super(source);
        this.f53447b = other;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        C8264a c8264a = new C8264a(observer);
        observer.onSubscribe(c8264a);
        this.f53447b.subscribe(c8264a.f53449b);
        this.f100099a.subscribe(c8264a);
    }
}
