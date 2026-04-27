package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wj6<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final m86<T> f94409b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends pof<? extends R>> f94410c;

    /* JADX INFO: renamed from: d */
    public final boolean f94411d;

    /* JADX INFO: renamed from: wj6$a */
    public static final class C14646a<T, R> extends AtomicInteger implements lj6<T>, fdg {

        /* JADX INFO: renamed from: L */
        public static final a<Object> f94412L = new a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f94413C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f94414F;

        /* JADX INFO: renamed from: H */
        public long f94415H;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f94416a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends pof<? extends R>> f94417b;

        /* JADX INFO: renamed from: c */
        public final boolean f94418c;

        /* JADX INFO: renamed from: d */
        public final cc0 f94419d = new cc0();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f94420e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<a<R>> f94421f = new AtomicReference<>();

        /* JADX INFO: renamed from: m */
        public fdg f94422m;

        /* JADX INFO: renamed from: wj6$a$a */
        public static final class a<R> extends AtomicReference<mf4> implements inf<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: a */
            public final C14646a<?, R> f94423a;

            /* JADX INFO: renamed from: b */
            public volatile R f94424b;

            public a(C14646a<?, R> c14646a) {
                this.f94423a = c14646a;
            }

            /* JADX INFO: renamed from: a */
            public void m24611a() {
                ag4.dispose(this);
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                this.f94423a.m24610c(this, th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(R r) {
                this.f94424b = r;
                this.f94423a.m24609b();
            }
        }

        public C14646a(ycg<? super R> ycgVar, py6<? super T, ? extends pof<? extends R>> py6Var, boolean z) {
            this.f94416a = ycgVar;
            this.f94417b = py6Var;
            this.f94418c = z;
        }

        /* JADX INFO: renamed from: a */
        public void m24608a() {
            AtomicReference<a<R>> atomicReference = this.f94421f;
            a<Object> aVar = f94412L;
            a<R> andSet = atomicReference.getAndSet((a<R>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m24611a();
        }

        /* JADX INFO: renamed from: b */
        public void m24609b() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f94416a;
            cc0 cc0Var = this.f94419d;
            AtomicReference<a<R>> atomicReference = this.f94421f;
            AtomicLong atomicLong = this.f94420e;
            long j = this.f94415H;
            int iAddAndGet = 1;
            while (!this.f94414F) {
                if (cc0Var.get() != null && !this.f94418c) {
                    ycgVar.onError(cc0Var.terminate());
                    return;
                }
                boolean z = this.f94413C;
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
                if (z2 || aVar.f94424b == null || j == atomicLong.get()) {
                    this.f94415H = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    v7b.m23844a(atomicReference, aVar, null);
                    ycgVar.onNext(aVar.f94424b);
                    j++;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m24610c(a<R> aVar, Throwable th) {
            if (!v7b.m23844a(this.f94421f, aVar, null) || !this.f94419d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f94418c) {
                this.f94422m.cancel();
                m24608a();
            }
            m24609b();
        }

        @Override // p000.fdg
        public void cancel() {
            this.f94414F = true;
            this.f94422m.cancel();
            m24608a();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f94413C = true;
            m24609b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f94419d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f94418c) {
                m24608a();
            }
            this.f94413C = true;
            m24609b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            a<R> aVar;
            a<R> aVar2 = this.f94421f.get();
            if (aVar2 != null) {
                aVar2.m24611a();
            }
            try {
                pof pofVar = (pof) xjb.requireNonNull(this.f94417b.apply(t), "The mapper returned a null SingleSource");
                a aVar3 = new a(this);
                do {
                    aVar = this.f94421f.get();
                    if (aVar == f94412L) {
                        return;
                    }
                } while (!v7b.m23844a(this.f94421f, aVar, aVar3));
                pofVar.subscribe(aVar3);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f94422m.cancel();
                this.f94421f.getAndSet((a<R>) f94412L);
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f94422m, fdgVar)) {
                this.f94422m = fdgVar;
                this.f94416a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            so0.add(this.f94420e, j);
            m24609b();
        }
    }

    public wj6(m86<T> m86Var, py6<? super T, ? extends pof<? extends R>> py6Var, boolean z) {
        this.f94409b = m86Var;
        this.f94410c = py6Var;
        this.f94411d = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f94409b.subscribe((lj6) new C14646a(ycgVar, this.f94410c, this.f94411d));
    }
}
