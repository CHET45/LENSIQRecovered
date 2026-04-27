package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ab6<T, U> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends zjd<U>> f927c;

    /* JADX INFO: renamed from: ab6$a */
    public static final class C0142a<T, U> extends AtomicLong implements lj6<T>, fdg {
        private static final long serialVersionUID = 6725975399620862591L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f928a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends zjd<U>> f929b;

        /* JADX INFO: renamed from: c */
        public fdg f930c;

        /* JADX INFO: renamed from: d */
        public final AtomicReference<mf4> f931d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public volatile long f932e;

        /* JADX INFO: renamed from: f */
        public boolean f933f;

        /* JADX INFO: renamed from: ab6$a$a */
        public static final class a<T, U> extends mg4<U> {

            /* JADX INFO: renamed from: b */
            public final C0142a<T, U> f934b;

            /* JADX INFO: renamed from: c */
            public final long f935c;

            /* JADX INFO: renamed from: d */
            public final T f936d;

            /* JADX INFO: renamed from: e */
            public boolean f937e;

            /* JADX INFO: renamed from: f */
            public final AtomicBoolean f938f = new AtomicBoolean();

            public a(C0142a<T, U> c0142a, long j, T t) {
                this.f934b = c0142a;
                this.f935c = j;
                this.f936d = t;
            }

            /* JADX INFO: renamed from: d */
            public void m287d() {
                if (this.f938f.compareAndSet(false, true)) {
                    this.f934b.m286a(this.f935c, this.f936d);
                }
            }

            @Override // p000.ycg
            public void onComplete() {
                if (this.f937e) {
                    return;
                }
                this.f937e = true;
                m287d();
            }

            @Override // p000.ycg
            public void onError(Throwable th) {
                if (this.f937e) {
                    pfe.onError(th);
                } else {
                    this.f937e = true;
                    this.f934b.onError(th);
                }
            }

            @Override // p000.ycg
            public void onNext(U u) {
                if (this.f937e) {
                    return;
                }
                this.f937e = true;
                m17290a();
                m287d();
            }
        }

        public C0142a(ycg<? super T> ycgVar, py6<? super T, ? extends zjd<U>> py6Var) {
            this.f928a = ycgVar;
            this.f929b = py6Var;
        }

        /* JADX INFO: renamed from: a */
        public void m286a(long j, T t) {
            if (j == this.f932e) {
                if (get() != 0) {
                    this.f928a.onNext(t);
                    so0.produced(this, 1L);
                } else {
                    cancel();
                    this.f928a.onError(new cwa("Could not deliver value due to lack of requests"));
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f930c.cancel();
            ag4.dispose(this.f931d);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f933f) {
                return;
            }
            this.f933f = true;
            mf4 mf4Var = this.f931d.get();
            if (ag4.isDisposed(mf4Var)) {
                return;
            }
            a aVar = (a) mf4Var;
            if (aVar != null) {
                aVar.m287d();
            }
            ag4.dispose(this.f931d);
            this.f928a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            ag4.dispose(this.f931d);
            this.f928a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f933f) {
                return;
            }
            long j = this.f932e + 1;
            this.f932e = j;
            mf4 mf4Var = this.f931d.get();
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            try {
                zjd zjdVar = (zjd) xjb.requireNonNull(this.f929b.apply(t), "The publisher supplied is null");
                a aVar = new a(this, j, t);
                if (v7b.m23844a(this.f931d, mf4Var, aVar)) {
                    zjdVar.subscribe(aVar);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                cancel();
                this.f928a.onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f930c, fdgVar)) {
                this.f930c = fdgVar;
                this.f928a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this, j);
            }
        }
    }

    public ab6(m86<T> m86Var, py6<? super T, ? extends zjd<U>> py6Var) {
        super(m86Var);
        this.f927c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C0142a(new t1f(ycgVar), this.f927c));
    }
}
