package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class jl6<T, D> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final Callable<? extends D> f51106b;

    /* JADX INFO: renamed from: c */
    public final py6<? super D, ? extends zjd<? extends T>> f51107c;

    /* JADX INFO: renamed from: d */
    public final tu2<? super D> f51108d;

    /* JADX INFO: renamed from: e */
    public final boolean f51109e;

    /* JADX INFO: renamed from: jl6$a */
    public static final class C7971a<T, D> extends AtomicBoolean implements lj6<T>, fdg {
        private static final long serialVersionUID = 5904473792286235046L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f51110a;

        /* JADX INFO: renamed from: b */
        public final D f51111b;

        /* JADX INFO: renamed from: c */
        public final tu2<? super D> f51112c;

        /* JADX INFO: renamed from: d */
        public final boolean f51113d;

        /* JADX INFO: renamed from: e */
        public fdg f51114e;

        public C7971a(ycg<? super T> ycgVar, D d, tu2<? super D> tu2Var, boolean z) {
            this.f51110a = ycgVar;
            this.f51111b = d;
            this.f51112c = tu2Var;
            this.f51113d = z;
        }

        /* JADX INFO: renamed from: a */
        public void m14169a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f51112c.accept(this.f51111b);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            m14169a();
            this.f51114e.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (!this.f51113d) {
                this.f51110a.onComplete();
                this.f51114e.cancel();
                m14169a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f51112c.accept(this.f51111b);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f51110a.onError(th);
                    return;
                }
            }
            this.f51114e.cancel();
            this.f51110a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f51113d) {
                this.f51110a.onError(th);
                this.f51114e.cancel();
                m14169a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f51112c.accept(this.f51111b);
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    n75.throwIfFatal(th);
                }
            } else {
                th = null;
            }
            this.f51114e.cancel();
            if (th != null) {
                this.f51110a.onError(new pm2(th, th));
            } else {
                this.f51110a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f51110a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f51114e, fdgVar)) {
                this.f51114e = fdgVar;
                this.f51110a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f51114e.request(j);
        }
    }

    public jl6(Callable<? extends D> callable, py6<? super D, ? extends zjd<? extends T>> py6Var, tu2<? super D> tu2Var, boolean z) {
        this.f51106b = callable;
        this.f51107c = py6Var;
        this.f51108d = tu2Var;
        this.f51109e = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        try {
            D dCall = this.f51106b.call();
            try {
                ((zjd) xjb.requireNonNull(this.f51107c.apply(dCall), "The sourceSupplier returned a null Publisher")).subscribe(new C7971a(ycgVar, dCall, this.f51108d, this.f51109e));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                try {
                    this.f51108d.accept(dCall);
                    x05.error(th, ycgVar);
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    x05.error(new pm2(th, th2), ycgVar);
                }
            }
        } catch (Throwable th3) {
            n75.throwIfFatal(th3);
            x05.error(th3, ycgVar);
        }
    }
}
