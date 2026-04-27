package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class tj6<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final m86<T> f85027b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends aaa<? extends R>> f85028c;

    /* JADX INFO: renamed from: d */
    public final boolean f85029d;

    /* JADX INFO: renamed from: tj6$a */
    public static final class C13073a<T, R> extends AtomicInteger implements lj6<T>, fdg {

        /* JADX INFO: renamed from: L */
        public static final a<Object> f85030L = new a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f85031C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f85032F;

        /* JADX INFO: renamed from: H */
        public long f85033H;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f85034a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends aaa<? extends R>> f85035b;

        /* JADX INFO: renamed from: c */
        public final boolean f85036c;

        /* JADX INFO: renamed from: d */
        public final cc0 f85037d = new cc0();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f85038e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<a<R>> f85039f = new AtomicReference<>();

        /* JADX INFO: renamed from: m */
        public fdg f85040m;

        /* JADX INFO: renamed from: tj6$a$a */
        public static final class a<R> extends AtomicReference<mf4> implements l9a<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: a */
            public final C13073a<?, R> f85041a;

            /* JADX INFO: renamed from: b */
            public volatile R f85042b;

            public a(C13073a<?, R> c13073a) {
                this.f85041a = c13073a;
            }

            /* JADX INFO: renamed from: a */
            public void m22687a() {
                ag4.dispose(this);
            }

            @Override // p000.l9a
            public void onComplete() {
                this.f85041a.m22685c(this);
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                this.f85041a.m22686d(this, th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(R r) {
                this.f85042b = r;
                this.f85041a.m22684b();
            }
        }

        public C13073a(ycg<? super R> ycgVar, py6<? super T, ? extends aaa<? extends R>> py6Var, boolean z) {
            this.f85034a = ycgVar;
            this.f85035b = py6Var;
            this.f85036c = z;
        }

        /* JADX INFO: renamed from: a */
        public void m22683a() {
            AtomicReference<a<R>> atomicReference = this.f85039f;
            a<Object> aVar = f85030L;
            a<R> andSet = atomicReference.getAndSet((a<R>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m22687a();
        }

        /* JADX INFO: renamed from: b */
        public void m22684b() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f85034a;
            cc0 cc0Var = this.f85037d;
            AtomicReference<a<R>> atomicReference = this.f85039f;
            AtomicLong atomicLong = this.f85038e;
            long j = this.f85033H;
            int iAddAndGet = 1;
            while (!this.f85032F) {
                if (cc0Var.get() != null && !this.f85036c) {
                    ycgVar.onError(cc0Var.terminate());
                    return;
                }
                boolean z = this.f85031C;
                a<R> aVar = atomicReference.get();
                boolean z2 = aVar == null;
                if (z && z2) {
                    Throwable thTerminate = cc0Var.terminate();
                    if (thTerminate != null) {
                        ycgVar.onError(thTerminate);
                        return;
                    } else {
                        ycgVar.onComplete();
                        return;
                    }
                }
                if (z2 || aVar.f85042b == null || j == atomicLong.get()) {
                    this.f85033H = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    v7b.m23844a(atomicReference, aVar, null);
                    ycgVar.onNext(aVar.f85042b);
                    j++;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m22685c(a<R> aVar) {
            if (v7b.m23844a(this.f85039f, aVar, null)) {
                m22684b();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f85032F = true;
            this.f85040m.cancel();
            m22683a();
        }

        /* JADX INFO: renamed from: d */
        public void m22686d(a<R> aVar, Throwable th) {
            if (!v7b.m23844a(this.f85039f, aVar, null) || !this.f85037d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f85036c) {
                this.f85040m.cancel();
                m22683a();
            }
            m22684b();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f85031C = true;
            m22684b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f85037d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f85036c) {
                m22683a();
            }
            this.f85031C = true;
            m22684b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            a<R> aVar;
            a<R> aVar2 = this.f85039f.get();
            if (aVar2 != null) {
                aVar2.m22687a();
            }
            try {
                aaa aaaVar = (aaa) xjb.requireNonNull(this.f85035b.apply(t), "The mapper returned a null MaybeSource");
                a aVar3 = new a(this);
                do {
                    aVar = this.f85039f.get();
                    if (aVar == f85030L) {
                        return;
                    }
                } while (!v7b.m23844a(this.f85039f, aVar, aVar3));
                aaaVar.subscribe(aVar3);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f85040m.cancel();
                this.f85039f.getAndSet((a<R>) f85030L);
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f85040m, fdgVar)) {
                this.f85040m = fdgVar;
                this.f85034a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            so0.add(this.f85038e, j);
            m22684b();
        }
    }

    public tj6(m86<T> m86Var, py6<? super T, ? extends aaa<? extends R>> py6Var, boolean z) {
        this.f85027b = m86Var;
        this.f85028c = py6Var;
        this.f85029d = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f85027b.subscribe((lj6) new C13073a(ycgVar, this.f85028c, this.f85029d));
    }
}
