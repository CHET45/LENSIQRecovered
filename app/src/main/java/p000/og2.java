package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class og2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends qh2> f67558a;

    /* JADX INFO: renamed from: b */
    public final int f67559b;

    /* JADX INFO: renamed from: c */
    public final boolean f67560c;

    /* JADX INFO: renamed from: og2$a */
    public static final class C10364a extends AtomicInteger implements lj6<qh2>, mf4 {
        private static final long serialVersionUID = -2108443387387077490L;

        /* JADX INFO: renamed from: a */
        public final dh2 f67561a;

        /* JADX INFO: renamed from: b */
        public final int f67562b;

        /* JADX INFO: renamed from: c */
        public final boolean f67563c;

        /* JADX INFO: renamed from: f */
        public fdg f67566f;

        /* JADX INFO: renamed from: e */
        public final nm2 f67565e = new nm2();

        /* JADX INFO: renamed from: d */
        public final cc0 f67564d = new cc0();

        /* JADX INFO: renamed from: og2$a$a */
        public final class a extends AtomicReference<mf4> implements dh2, mf4 {
            private static final long serialVersionUID = 251330541679988317L;

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
                C10364a.this.m18635a(this);
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                C10364a.this.m18636b(this, th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C10364a(dh2 dh2Var, int i, boolean z) {
            this.f67561a = dh2Var;
            this.f67562b = i;
            this.f67563c = z;
            lazySet(1);
        }

        /* JADX INFO: renamed from: a */
        public void m18635a(a aVar) {
            this.f67565e.delete(aVar);
            if (decrementAndGet() != 0) {
                if (this.f67562b != Integer.MAX_VALUE) {
                    this.f67566f.request(1L);
                }
            } else {
                Throwable th = this.f67564d.get();
                if (th != null) {
                    this.f67561a.onError(th);
                } else {
                    this.f67561a.onComplete();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m18636b(a aVar, Throwable th) {
            this.f67565e.delete(aVar);
            if (!this.f67563c) {
                this.f67566f.cancel();
                this.f67565e.dispose();
                if (!this.f67564d.addThrowable(th)) {
                    pfe.onError(th);
                    return;
                } else {
                    if (getAndSet(0) > 0) {
                        this.f67561a.onError(this.f67564d.terminate());
                        return;
                    }
                    return;
                }
            }
            if (!this.f67564d.addThrowable(th)) {
                pfe.onError(th);
            } else if (decrementAndGet() == 0) {
                this.f67561a.onError(this.f67564d.terminate());
            } else if (this.f67562b != Integer.MAX_VALUE) {
                this.f67566f.request(1L);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f67566f.cancel();
            this.f67565e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f67565e.isDisposed();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (decrementAndGet() == 0) {
                if (this.f67564d.get() != null) {
                    this.f67561a.onError(this.f67564d.terminate());
                } else {
                    this.f67561a.onComplete();
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f67563c) {
                if (!this.f67564d.addThrowable(th)) {
                    pfe.onError(th);
                    return;
                } else {
                    if (decrementAndGet() == 0) {
                        this.f67561a.onError(this.f67564d.terminate());
                        return;
                    }
                    return;
                }
            }
            this.f67565e.dispose();
            if (!this.f67564d.addThrowable(th)) {
                pfe.onError(th);
            } else if (getAndSet(0) > 0) {
                this.f67561a.onError(this.f67564d.terminate());
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f67566f, fdgVar)) {
                this.f67566f = fdgVar;
                this.f67561a.onSubscribe(this);
                int i = this.f67562b;
                if (i == Integer.MAX_VALUE) {
                    fdgVar.request(Long.MAX_VALUE);
                } else {
                    fdgVar.request(i);
                }
            }
        }

        @Override // p000.ycg
        public void onNext(qh2 qh2Var) {
            getAndIncrement();
            a aVar = new a();
            this.f67565e.add(aVar);
            qh2Var.subscribe(aVar);
        }
    }

    public og2(zjd<? extends qh2> zjdVar, int i, boolean z) {
        this.f67558a = zjdVar;
        this.f67559b = i;
        this.f67560c = z;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f67558a.subscribe(new C10364a(dh2Var, this.f67559b, this.f67560c));
    }
}
