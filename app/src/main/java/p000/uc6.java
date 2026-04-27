package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class uc6<T> extends yd2 implements v07<T> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f87528a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends qh2> f87529b;

    /* JADX INFO: renamed from: c */
    public final int f87530c;

    /* JADX INFO: renamed from: d */
    public final boolean f87531d;

    /* JADX INFO: renamed from: uc6$a */
    public static final class C13487a<T> extends AtomicInteger implements lj6<T>, mf4 {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f87532C;

        /* JADX INFO: renamed from: a */
        public final dh2 f87533a;

        /* JADX INFO: renamed from: c */
        public final py6<? super T, ? extends qh2> f87535c;

        /* JADX INFO: renamed from: d */
        public final boolean f87536d;

        /* JADX INFO: renamed from: f */
        public final int f87538f;

        /* JADX INFO: renamed from: m */
        public fdg f87539m;

        /* JADX INFO: renamed from: b */
        public final cc0 f87534b = new cc0();

        /* JADX INFO: renamed from: e */
        public final nm2 f87537e = new nm2();

        /* JADX INFO: renamed from: uc6$a$a */
        public final class a extends AtomicReference<mf4> implements dh2, mf4 {
            private static final long serialVersionUID = 8606673141535671828L;

            public a() {
            }

            @Override // p000.mf4
            public void dispose() {
                ag4.dispose(this);
            }

            @Override // p000.mf4
            public boolean isDisposed() {
                return ag4.isDisposed(get());
            }

            @Override // p000.dh2
            public void onComplete() {
                C13487a.this.m23214a(this);
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                C13487a.this.m23215b(this, th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C13487a(dh2 dh2Var, py6<? super T, ? extends qh2> py6Var, boolean z, int i) {
            this.f87533a = dh2Var;
            this.f87535c = py6Var;
            this.f87536d = z;
            this.f87538f = i;
            lazySet(1);
        }

        /* JADX INFO: renamed from: a */
        public void m23214a(C13487a<T>.a aVar) {
            this.f87537e.delete(aVar);
            onComplete();
        }

        /* JADX INFO: renamed from: b */
        public void m23215b(C13487a<T>.a aVar, Throwable th) {
            this.f87537e.delete(aVar);
            onError(th);
        }

        @Override // p000.mf4
        public void dispose() {
            this.f87532C = true;
            this.f87539m.cancel();
            this.f87537e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f87537e.isDisposed();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (decrementAndGet() != 0) {
                if (this.f87538f != Integer.MAX_VALUE) {
                    this.f87539m.request(1L);
                }
            } else {
                Throwable thTerminate = this.f87534b.terminate();
                if (thTerminate != null) {
                    this.f87533a.onError(thTerminate);
                } else {
                    this.f87533a.onComplete();
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f87534b.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f87536d) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f87533a.onError(this.f87534b.terminate());
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                this.f87533a.onError(this.f87534b.terminate());
            } else if (this.f87538f != Integer.MAX_VALUE) {
                this.f87539m.request(1L);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            try {
                qh2 qh2Var = (qh2) xjb.requireNonNull(this.f87535c.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                a aVar = new a();
                if (this.f87532C || !this.f87537e.add(aVar)) {
                    return;
                }
                qh2Var.subscribe(aVar);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f87539m.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f87539m, fdgVar)) {
                this.f87539m = fdgVar;
                this.f87533a.onSubscribe(this);
                int i = this.f87538f;
                if (i == Integer.MAX_VALUE) {
                    fdgVar.request(Long.MAX_VALUE);
                } else {
                    fdgVar.request(i);
                }
            }
        }
    }

    public uc6(m86<T> m86Var, py6<? super T, ? extends qh2> py6Var, boolean z, int i) {
        this.f87528a = m86Var;
        this.f87529b = py6Var;
        this.f87531d = z;
        this.f87530c = i;
    }

    @Override // p000.v07
    public m86<T> fuseToFlowable() {
        return pfe.onAssembly(new sc6(this.f87528a, this.f87529b, this.f87531d, this.f87530c));
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f87528a.subscribe((lj6) new C13487a(dh2Var, this.f87529b, this.f87531d, this.f87530c));
    }
}
