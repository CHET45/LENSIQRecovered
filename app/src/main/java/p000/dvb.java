package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class dvb<T, R> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends xub<? extends R>> f31022b;

    /* JADX INFO: renamed from: c */
    public final int f31023c;

    /* JADX INFO: renamed from: d */
    public final boolean f31024d;

    /* JADX INFO: renamed from: dvb$a */
    public static final class C4973a<T, R> extends AtomicReference<mf4> implements oxb<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* JADX INFO: renamed from: a */
        public final C4974b<T, R> f31025a;

        /* JADX INFO: renamed from: b */
        public final long f31026b;

        /* JADX INFO: renamed from: c */
        public final int f31027c;

        /* JADX INFO: renamed from: d */
        public volatile ajf<R> f31028d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f31029e;

        public C4973a(C4974b<T, R> c4974b, long j, int i) {
            this.f31025a = c4974b;
            this.f31026b = j;
            this.f31027c = i;
        }

        public void cancel() {
            ag4.dispose(this);
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f31026b == this.f31025a.f31033H) {
                this.f31029e = true;
                this.f31025a.m9432b();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f31025a.m9433c(this, th);
        }

        @Override // p000.oxb
        public void onNext(R r) {
            if (this.f31026b == this.f31025a.f31033H) {
                if (r != null) {
                    this.f31028d.offer(r);
                }
                this.f31025a.m9432b();
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                if (mf4Var instanceof umd) {
                    umd umdVar = (umd) mf4Var;
                    int iRequestFusion = umdVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f31028d = umdVar;
                        this.f31029e = true;
                        this.f31025a.m9432b();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.f31028d = umdVar;
                        return;
                    }
                }
                this.f31028d = new rzf(this.f31027c);
            }
        }
    }

    /* JADX INFO: renamed from: dvb$b */
    public static final class C4974b<T, R> extends AtomicInteger implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: L */
        public static final C4973a<Object, Object> f31030L;
        private static final long serialVersionUID = -3491074160481096299L;

        /* JADX INFO: renamed from: C */
        public mf4 f31031C;

        /* JADX INFO: renamed from: H */
        public volatile long f31033H;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f31034a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<? extends R>> f31035b;

        /* JADX INFO: renamed from: c */
        public final int f31036c;

        /* JADX INFO: renamed from: d */
        public final boolean f31037d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f31039f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f31040m;

        /* JADX INFO: renamed from: F */
        public final AtomicReference<C4973a<T, R>> f31032F = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final cc0 f31038e = new cc0();

        static {
            C4973a<Object, Object> c4973a = new C4973a<>(null, -1L, 1);
            f31030L = c4973a;
            c4973a.cancel();
        }

        public C4974b(oxb<? super R> oxbVar, py6<? super T, ? extends xub<? extends R>> py6Var, int i, boolean z) {
            this.f31034a = oxbVar;
            this.f31035b = py6Var;
            this.f31036c = i;
            this.f31037d = z;
        }

        /* JADX INFO: renamed from: a */
        public void m9431a() {
            C4973a<T, R> andSet;
            C4973a<T, R> c4973a = this.f31032F.get();
            C4973a<Object, Object> c4973a2 = f31030L;
            if (c4973a == c4973a2 || (andSet = this.f31032F.getAndSet((C4973a<T, R>) c4973a2)) == c4973a2 || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x000f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x00e9 A[SYNTHETIC] */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m9432b() {
            /*
                Method dump skipped, instruction units count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dvb.C4974b.m9432b():void");
        }

        /* JADX INFO: renamed from: c */
        public void m9433c(C4973a<T, R> c4973a, Throwable th) {
            if (c4973a.f31026b != this.f31033H || !this.f31038e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f31037d) {
                this.f31031C.dispose();
                this.f31039f = true;
            }
            c4973a.f31029e = true;
            m9432b();
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f31040m) {
                return;
            }
            this.f31040m = true;
            this.f31031C.dispose();
            m9431a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f31040m;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f31039f) {
                return;
            }
            this.f31039f = true;
            m9432b();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f31039f || !this.f31038e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f31037d) {
                m9431a();
            }
            this.f31039f = true;
            m9432b();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            C4973a<T, R> c4973a;
            long j = this.f31033H + 1;
            this.f31033H = j;
            C4973a<T, R> c4973a2 = this.f31032F.get();
            if (c4973a2 != null) {
                c4973a2.cancel();
            }
            try {
                xub xubVar = (xub) xjb.requireNonNull(this.f31035b.apply(t), "The ObservableSource returned is null");
                C4973a c4973a3 = new C4973a(this, j, this.f31036c);
                do {
                    c4973a = this.f31032F.get();
                    if (c4973a == f31030L) {
                        return;
                    }
                } while (!v7b.m23844a(this.f31032F, c4973a, c4973a3));
                xubVar.subscribe(c4973a3);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f31031C.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f31031C, mf4Var)) {
                this.f31031C = mf4Var;
                this.f31034a.onSubscribe(this);
            }
        }
    }

    public dvb(xub<T> xubVar, py6<? super T, ? extends xub<? extends R>> py6Var, int i, boolean z) {
        super(xubVar);
        this.f31022b = py6Var;
        this.f31023c = i;
        this.f31024d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        if (utb.tryScalarXMapSubscribe(this.f66354a, oxbVar, this.f31022b)) {
            return;
        }
        this.f66354a.subscribe(new C4974b(oxbVar, this.f31022b, this.f31023c, this.f31024d));
    }
}
