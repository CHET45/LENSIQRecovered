package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class uof<T, U> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f88685a;

    /* JADX INFO: renamed from: b */
    public final zjd<U> f88686b;

    /* JADX INFO: renamed from: uof$a */
    public static final class C13632a<T> extends AtomicReference<mf4> implements inf<T>, mf4 {
        private static final long serialVersionUID = -622603812305745221L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f88687a;

        /* JADX INFO: renamed from: b */
        public final C13633b f88688b = new C13633b(this);

        public C13632a(inf<? super T> infVar) {
            this.f88687a = infVar;
        }

        /* JADX INFO: renamed from: a */
        public void m23492a(Throwable th) {
            mf4 andSet;
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var || (andSet = getAndSet(ag4Var)) == ag4Var) {
                pfe.onError(th);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.f88687a.onError(th);
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            this.f88688b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f88688b.dispose();
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var || getAndSet(ag4Var) == ag4Var) {
                pfe.onError(th);
            } else {
                this.f88687a.onError(th);
            }
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f88688b.dispose();
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f88687a.onSuccess(t);
            }
        }
    }

    /* JADX INFO: renamed from: uof$b */
    public static final class C13633b extends AtomicReference<fdg> implements lj6<Object> {
        private static final long serialVersionUID = 5170026210238877381L;

        /* JADX INFO: renamed from: a */
        public final C13632a<?> f88689a;

        public C13633b(C13632a<?> c13632a) {
            this.f88689a = c13632a;
        }

        public void dispose() {
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            fdg fdgVar = get();
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar != mdgVar) {
                lazySet(mdgVar);
                this.f88689a.m23492a(new CancellationException());
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f88689a.m23492a(th);
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            if (mdg.cancel(this)) {
                this.f88689a.m23492a(new CancellationException());
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
        }
    }

    public uof(pof<T> pofVar, zjd<U> zjdVar) {
        this.f88685a = pofVar;
        this.f88686b = zjdVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        C13632a c13632a = new C13632a(infVar);
        infVar.onSubscribe(c13632a);
        this.f88686b.subscribe(c13632a.f88688b);
        this.f88685a.subscribe(c13632a);
    }
}
