package p000;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class paa<T, U> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final z9a<U> f70156b;

    /* JADX INFO: renamed from: c */
    public final z9a<? extends T> f70157c;

    /* JADX INFO: renamed from: paa$a */
    public static final class C10869a<T> extends AtomicReference<lf4> implements k9a<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f70158a;

        public C10869a(k9a<? super T> downstream) {
            this.f70158a = downstream;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f70158a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f70158a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f70158a.onSuccess(value);
        }
    }

    /* JADX INFO: renamed from: paa$b */
    public static final class C10870b<T, U> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = -5955289211445418871L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f70159a;

        /* JADX INFO: renamed from: b */
        public final C10871c<T, U> f70160b = new C10871c<>(this);

        /* JADX INFO: renamed from: c */
        public final z9a<? extends T> f70161c;

        /* JADX INFO: renamed from: d */
        public final C10869a<T> f70162d;

        public C10870b(k9a<? super T> actual, z9a<? extends T> fallback) {
            this.f70159a = actual;
            this.f70161c = fallback;
            this.f70162d = fallback != null ? new C10869a<>(actual) : null;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            zf4.dispose(this.f70160b);
            C10869a<T> c10869a = this.f70162d;
            if (c10869a != null) {
                zf4.dispose(c10869a);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            zf4.dispose(this.f70160b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f70159a.onComplete();
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            zf4.dispose(this.f70160b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f70159a.onError(e);
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
            zf4.dispose(this.f70160b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f70159a.onSuccess(value);
            }
        }

        public void otherComplete() {
            if (zf4.dispose(this)) {
                z9a<? extends T> z9aVar = this.f70161c;
                if (z9aVar == null) {
                    this.f70159a.onError(new TimeoutException());
                } else {
                    z9aVar.subscribe(this.f70162d);
                }
            }
        }

        public void otherError(Throwable e) {
            if (zf4.dispose(this)) {
                this.f70159a.onError(e);
            } else {
                ofe.onError(e);
            }
        }
    }

    /* JADX INFO: renamed from: paa$c */
    public static final class C10871c<T, U> extends AtomicReference<lf4> implements k9a<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a */
        public final C10870b<T, U> f70163a;

        public C10871c(C10870b<T, U> parent) {
            this.f70163a = parent;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f70163a.otherComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f70163a.otherError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.k9a
        public void onSuccess(Object value) {
            this.f70163a.otherComplete();
        }
    }

    public paa(z9a<T> source, z9a<U> other, z9a<? extends T> fallback) {
        super(source);
        this.f70156b = other;
        this.f70157c = fallback;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        C10870b c10870b = new C10870b(observer, this.f70157c);
        observer.onSubscribe(c10870b);
        this.f70156b.subscribe(c10870b.f70160b);
        this.f100099a.subscribe(c10870b);
    }
}
