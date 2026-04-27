package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vof<T, U> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f91884a;

    /* JADX INFO: renamed from: b */
    public final zjd<U> f91885b;

    /* JADX INFO: renamed from: vof$a */
    public static final class C14186a<T> extends AtomicReference<lf4> implements hnf<T>, lf4 {
        private static final long serialVersionUID = -622603812305745221L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f91886a;

        /* JADX INFO: renamed from: b */
        public final C14187b f91887b = new C14187b(this);

        public C14186a(hnf<? super T> downstream) {
            this.f91886a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m24093a(Throwable e) {
            lf4 andSet;
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var || (andSet = getAndSet(zf4Var)) == zf4Var) {
                ofe.onError(e);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.f91886a.onError(e);
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            this.f91887b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f91887b.dispose();
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var || getAndSet(zf4Var) == zf4Var) {
                ofe.onError(e);
            } else {
                this.f91886a.onError(e);
            }
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f91887b.dispose();
            zf4 zf4Var = zf4.DISPOSED;
            if (getAndSet(zf4Var) != zf4Var) {
                this.f91886a.onSuccess(value);
            }
        }
    }

    /* JADX INFO: renamed from: vof$b */
    public static final class C14187b extends AtomicReference<fdg> implements kj6<Object> {
        private static final long serialVersionUID = 5170026210238877381L;

        /* JADX INFO: renamed from: a */
        public final C14186a<?> f91888a;

        public C14187b(C14186a<?> parent) {
            this.f91888a = parent;
        }

        public void dispose() {
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            fdg fdgVar = get();
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar != ldgVar) {
                lazySet(ldgVar);
                this.f91888a.m24093a(new CancellationException());
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f91888a.m24093a(t);
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            if (ldg.cancel(this)) {
                this.f91888a.m24093a(new CancellationException());
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, Long.MAX_VALUE);
        }
    }

    public vof(oof<T> source, zjd<U> other) {
        this.f91884a = source;
        this.f91885b = other;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        C14186a c14186a = new C14186a(observer);
        observer.onSubscribe(c14186a);
        this.f91885b.subscribe(c14186a.f91887b);
        this.f91884a.subscribe(c14186a);
    }
}
