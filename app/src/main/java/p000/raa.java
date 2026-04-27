package p000;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class raa<T, U> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final zjd<U> f77591b;

    /* JADX INFO: renamed from: c */
    public final z9a<? extends T> f77592c;

    /* JADX INFO: renamed from: raa$a */
    public static final class C11967a<T> extends AtomicReference<lf4> implements k9a<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f77593a;

        public C11967a(k9a<? super T> downstream) {
            this.f77593a = downstream;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f77593a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f77593a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f77593a.onSuccess(value);
        }
    }

    /* JADX INFO: renamed from: raa$b */
    public static final class C11968b<T, U> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = -5955289211445418871L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f77594a;

        /* JADX INFO: renamed from: b */
        public final C11969c<T, U> f77595b = new C11969c<>(this);

        /* JADX INFO: renamed from: c */
        public final z9a<? extends T> f77596c;

        /* JADX INFO: renamed from: d */
        public final C11967a<T> f77597d;

        public C11968b(k9a<? super T> actual, z9a<? extends T> fallback) {
            this.f77594a = actual;
            this.f77596c = fallback;
            this.f77597d = fallback != null ? new C11967a<>(actual) : null;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            ldg.cancel(this.f77595b);
            C11967a<T> c11967a = this.f77597d;
            if (c11967a != null) {
                zf4.dispose(c11967a);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            ldg.cancel(this.f77595b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f77594a.onComplete();
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            ldg.cancel(this.f77595b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f77594a.onError(e);
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
            ldg.cancel(this.f77595b);
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f77594a.onSuccess(value);
            }
        }

        public void otherComplete() {
            if (zf4.dispose(this)) {
                z9a<? extends T> z9aVar = this.f77596c;
                if (z9aVar == null) {
                    this.f77594a.onError(new TimeoutException());
                } else {
                    z9aVar.subscribe(this.f77597d);
                }
            }
        }

        public void otherError(Throwable e) {
            if (zf4.dispose(this)) {
                this.f77594a.onError(e);
            } else {
                ofe.onError(e);
            }
        }
    }

    /* JADX INFO: renamed from: raa$c */
    public static final class C11969c<T, U> extends AtomicReference<fdg> implements kj6<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a */
        public final C11968b<T, U> f77598a;

        public C11969c(C11968b<T, U> parent) {
            this.f77598a = parent;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f77598a.otherComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            this.f77598a.otherError(e);
        }

        @Override // p000.ycg
        public void onNext(Object value) {
            get().cancel();
            this.f77598a.otherComplete();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, Long.MAX_VALUE);
        }
    }

    public raa(z9a<T> source, zjd<U> other, z9a<? extends T> fallback) {
        super(source);
        this.f77591b = other;
        this.f77592c = fallback;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        C11968b c11968b = new C11968b(observer, this.f77592c);
        observer.onSubscribe(c11968b);
        this.f77591b.subscribe(c11968b.f77595b);
        this.f100099a.subscribe(c11968b);
    }
}
