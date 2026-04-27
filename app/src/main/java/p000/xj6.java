package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class xj6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final l86<T> f98193b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends oof<? extends R>> f98194c;

    /* JADX INFO: renamed from: d */
    public final boolean f98195d;

    /* JADX INFO: renamed from: xj6$a */
    public static final class C15152a<T, R> extends AtomicInteger implements kj6<T>, fdg {

        /* JADX INFO: renamed from: L */
        public static final a<Object> f98196L = new a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f98197C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f98198F;

        /* JADX INFO: renamed from: H */
        public long f98199H;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f98200a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends oof<? extends R>> f98201b;

        /* JADX INFO: renamed from: c */
        public final boolean f98202c;

        /* JADX INFO: renamed from: d */
        public final bc0 f98203d = new bc0();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f98204e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<a<R>> f98205f = new AtomicReference<>();

        /* JADX INFO: renamed from: m */
        public fdg f98206m;

        /* JADX INFO: renamed from: xj6$a$a */
        public static final class a<R> extends AtomicReference<lf4> implements hnf<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: a */
            public final C15152a<?, R> f98207a;

            /* JADX INFO: renamed from: b */
            public volatile R f98208b;

            public a(C15152a<?, R> parent) {
                this.f98207a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m25232a() {
                zf4.dispose(this);
            }

            @Override // p000.hnf
            public void onError(Throwable e) {
                this.f98207a.m25231c(this, e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.hnf
            public void onSuccess(R t) {
                this.f98208b = t;
                this.f98207a.m25230b();
            }
        }

        public C15152a(ycg<? super R> downstream, sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayErrors) {
            this.f98200a = downstream;
            this.f98201b = mapper;
            this.f98202c = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m25229a() {
            AtomicReference<a<R>> atomicReference = this.f98205f;
            a<Object> aVar = f98196L;
            a<R> andSet = atomicReference.getAndSet((a<R>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m25232a();
        }

        /* JADX INFO: renamed from: b */
        public void m25230b() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f98200a;
            bc0 bc0Var = this.f98203d;
            AtomicReference<a<R>> atomicReference = this.f98205f;
            AtomicLong atomicLong = this.f98204e;
            long j = this.f98199H;
            int iAddAndGet = 1;
            while (!this.f98198F) {
                if (bc0Var.get() != null && !this.f98202c) {
                    bc0Var.tryTerminateConsumer(ycgVar);
                    return;
                }
                boolean z = this.f98197C;
                a<R> aVar = atomicReference.get();
                boolean z2 = aVar == null;
                if (z && z2) {
                    bc0Var.tryTerminateConsumer(ycgVar);
                    return;
                }
                if (z2 || aVar.f98208b == null || j == atomicLong.get()) {
                    this.f98199H = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    v7b.m23844a(atomicReference, aVar, null);
                    ycgVar.onNext(aVar.f98208b);
                    j++;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m25231c(a<R> sender, Throwable ex) {
            if (!v7b.m23844a(this.f98205f, sender, null)) {
                ofe.onError(ex);
            } else if (this.f98203d.tryAddThrowableOrReport(ex)) {
                if (!this.f98202c) {
                    this.f98206m.cancel();
                    m25229a();
                }
                m25230b();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f98198F = true;
            this.f98206m.cancel();
            m25229a();
            this.f98203d.tryTerminateAndReport();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f98197C = true;
            m25230b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f98203d.tryAddThrowableOrReport(t)) {
                if (!this.f98202c) {
                    m25229a();
                }
                this.f98197C = true;
                m25230b();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            a<R> aVar;
            a<R> aVar2 = this.f98205f.get();
            if (aVar2 != null) {
                aVar2.m25232a();
            }
            try {
                oof<? extends R> oofVarApply = this.f98201b.apply(t);
                Objects.requireNonNull(oofVarApply, "The mapper returned a null SingleSource");
                oof<? extends R> oofVar = oofVarApply;
                a aVar3 = new a(this);
                do {
                    aVar = this.f98205f.get();
                    if (aVar == f98196L) {
                        return;
                    }
                } while (!v7b.m23844a(this.f98205f, aVar, aVar3));
                oofVar.subscribe(aVar3);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f98206m.cancel();
                this.f98205f.getAndSet((a<R>) f98196L);
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f98206m, s)) {
                this.f98206m = s;
                this.f98200a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            ro0.add(this.f98204e, n);
            m25230b();
        }
    }

    public xj6(l86<T> source, sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayErrors) {
        this.f98193b = source;
        this.f98194c = mapper;
        this.f98195d = delayErrors;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f98193b.subscribe((kj6) new C15152a(s, this.f98194c, this.f98195d));
    }
}
