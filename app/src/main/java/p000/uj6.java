package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class uj6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final l86<T> f88094b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends z9a<? extends R>> f88095c;

    /* JADX INFO: renamed from: d */
    public final boolean f88096d;

    /* JADX INFO: renamed from: uj6$a */
    public static final class C13551a<T, R> extends AtomicInteger implements kj6<T>, fdg {

        /* JADX INFO: renamed from: L */
        public static final a<Object> f88097L = new a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f88098C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f88099F;

        /* JADX INFO: renamed from: H */
        public long f88100H;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f88101a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends z9a<? extends R>> f88102b;

        /* JADX INFO: renamed from: c */
        public final boolean f88103c;

        /* JADX INFO: renamed from: d */
        public final bc0 f88104d = new bc0();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f88105e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<a<R>> f88106f = new AtomicReference<>();

        /* JADX INFO: renamed from: m */
        public fdg f88107m;

        /* JADX INFO: renamed from: uj6$a$a */
        public static final class a<R> extends AtomicReference<lf4> implements k9a<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: a */
            public final C13551a<?, R> f88108a;

            /* JADX INFO: renamed from: b */
            public volatile R f88109b;

            public a(C13551a<?, R> parent) {
                this.f88108a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m23382a() {
                zf4.dispose(this);
            }

            @Override // p000.k9a
            public void onComplete() {
                this.f88108a.m23380c(this);
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                this.f88108a.m23381d(this, e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.k9a
            public void onSuccess(R t) {
                this.f88109b = t;
                this.f88108a.m23379b();
            }
        }

        public C13551a(ycg<? super R> downstream, sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayErrors) {
            this.f88101a = downstream;
            this.f88102b = mapper;
            this.f88103c = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m23378a() {
            AtomicReference<a<R>> atomicReference = this.f88106f;
            a<Object> aVar = f88097L;
            a<R> andSet = atomicReference.getAndSet((a<R>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m23382a();
        }

        /* JADX INFO: renamed from: b */
        public void m23379b() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f88101a;
            bc0 bc0Var = this.f88104d;
            AtomicReference<a<R>> atomicReference = this.f88106f;
            AtomicLong atomicLong = this.f88105e;
            long j = this.f88100H;
            int iAddAndGet = 1;
            while (!this.f88099F) {
                if (bc0Var.get() != null && !this.f88103c) {
                    bc0Var.tryTerminateConsumer(ycgVar);
                    return;
                }
                boolean z = this.f88098C;
                a<R> aVar = atomicReference.get();
                boolean z2 = aVar == null;
                if (z && z2) {
                    bc0Var.tryTerminateConsumer(ycgVar);
                    return;
                }
                if (z2 || aVar.f88109b == null || j == atomicLong.get()) {
                    this.f88100H = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    v7b.m23844a(atomicReference, aVar, null);
                    ycgVar.onNext(aVar.f88109b);
                    j++;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m23380c(a<R> sender) {
            if (v7b.m23844a(this.f88106f, sender, null)) {
                m23379b();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f88099F = true;
            this.f88107m.cancel();
            m23378a();
            this.f88104d.tryTerminateAndReport();
        }

        /* JADX INFO: renamed from: d */
        public void m23381d(a<R> sender, Throwable ex) {
            if (!v7b.m23844a(this.f88106f, sender, null)) {
                ofe.onError(ex);
            } else if (this.f88104d.tryAddThrowableOrReport(ex)) {
                if (!this.f88103c) {
                    this.f88107m.cancel();
                    m23378a();
                }
                m23379b();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f88098C = true;
            m23379b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f88104d.tryAddThrowableOrReport(t)) {
                if (!this.f88103c) {
                    m23378a();
                }
                this.f88098C = true;
                m23379b();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            a<R> aVar;
            a<R> aVar2 = this.f88106f.get();
            if (aVar2 != null) {
                aVar2.m23382a();
            }
            try {
                z9a<? extends R> z9aVarApply = this.f88102b.apply(t);
                Objects.requireNonNull(z9aVarApply, "The mapper returned a null MaybeSource");
                z9a<? extends R> z9aVar = z9aVarApply;
                a aVar3 = new a(this);
                do {
                    aVar = this.f88106f.get();
                    if (aVar == f88097L) {
                        return;
                    }
                } while (!v7b.m23844a(this.f88106f, aVar, aVar3));
                z9aVar.subscribe(aVar3);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f88107m.cancel();
                this.f88106f.getAndSet((a<R>) f88097L);
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f88107m, s)) {
                this.f88107m = s;
                this.f88101a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            ro0.add(this.f88105e, n);
            m23379b();
        }
    }

    public uj6(l86<T> source, sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayErrors) {
        this.f88094b = source;
        this.f88095c = mapper;
        this.f88096d = delayErrors;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f88094b.subscribe((kj6) new C13551a(s, this.f88095c, this.f88096d));
    }
}
