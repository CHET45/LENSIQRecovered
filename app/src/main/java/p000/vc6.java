package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vc6<T> extends xd2 implements u07<T> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f90601a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends ph2> f90602b;

    /* JADX INFO: renamed from: c */
    public final int f90603c;

    /* JADX INFO: renamed from: d */
    public final boolean f90604d;

    /* JADX INFO: renamed from: vc6$a */
    public static final class C13992a<T> extends AtomicInteger implements kj6<T>, lf4 {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f90605C;

        /* JADX INFO: renamed from: a */
        public final ch2 f90606a;

        /* JADX INFO: renamed from: c */
        public final sy6<? super T, ? extends ph2> f90608c;

        /* JADX INFO: renamed from: d */
        public final boolean f90609d;

        /* JADX INFO: renamed from: f */
        public final int f90611f;

        /* JADX INFO: renamed from: m */
        public fdg f90612m;

        /* JADX INFO: renamed from: b */
        public final bc0 f90607b = new bc0();

        /* JADX INFO: renamed from: e */
        public final mm2 f90610e = new mm2();

        /* JADX INFO: renamed from: vc6$a$a */
        public final class a extends AtomicReference<lf4> implements ch2, lf4 {
            private static final long serialVersionUID = 8606673141535671828L;

            public a() {
            }

            @Override // p000.lf4
            public void dispose() {
                zf4.dispose(this);
            }

            @Override // p000.lf4
            public boolean isDisposed() {
                return zf4.isDisposed(get());
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                C13992a.this.m23910a(this);
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                C13992a.this.m23911b(this, e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C13992a(ch2 observer, sy6<? super T, ? extends ph2> mapper, boolean delayErrors, int maxConcurrency) {
            this.f90606a = observer;
            this.f90608c = mapper;
            this.f90609d = delayErrors;
            this.f90611f = maxConcurrency;
            lazySet(1);
        }

        /* JADX INFO: renamed from: a */
        public void m23910a(C13992a<T>.a inner) {
            this.f90610e.delete(inner);
            onComplete();
        }

        /* JADX INFO: renamed from: b */
        public void m23911b(C13992a<T>.a inner, Throwable e) {
            this.f90610e.delete(inner);
            onError(e);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f90605C = true;
            this.f90612m.cancel();
            this.f90610e.dispose();
            this.f90607b.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f90610e.isDisposed();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.f90607b.tryTerminateConsumer(this.f90606a);
            } else if (this.f90611f != Integer.MAX_VALUE) {
                this.f90612m.request(1L);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            if (this.f90607b.tryAddThrowableOrReport(e)) {
                if (!this.f90609d) {
                    this.f90605C = true;
                    this.f90612m.cancel();
                    this.f90610e.dispose();
                    this.f90607b.tryTerminateConsumer(this.f90606a);
                    return;
                }
                if (decrementAndGet() == 0) {
                    this.f90607b.tryTerminateConsumer(this.f90606a);
                } else if (this.f90611f != Integer.MAX_VALUE) {
                    this.f90612m.request(1L);
                }
            }
        }

        @Override // p000.ycg
        public void onNext(T value) {
            try {
                ph2 ph2VarApply = this.f90608c.apply(value);
                Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                ph2 ph2Var = ph2VarApply;
                getAndIncrement();
                a aVar = new a();
                if (this.f90605C || !this.f90610e.add(aVar)) {
                    return;
                }
                ph2Var.subscribe(aVar);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f90612m.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f90612m, s)) {
                this.f90612m = s;
                this.f90606a.onSubscribe(this);
                int i = this.f90611f;
                if (i == Integer.MAX_VALUE) {
                    s.request(Long.MAX_VALUE);
                } else {
                    s.request(i);
                }
            }
        }
    }

    public vc6(l86<T> source, sy6<? super T, ? extends ph2> mapper, boolean delayErrors, int maxConcurrency) {
        this.f90601a = source;
        this.f90602b = mapper;
        this.f90604d = delayErrors;
        this.f90603c = maxConcurrency;
    }

    @Override // p000.u07
    public l86<T> fuseToFlowable() {
        return ofe.onAssembly(new tc6(this.f90601a, this.f90602b, this.f90604d, this.f90603c));
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f90601a.subscribe((kj6) new C13992a(observer, this.f90602b, this.f90604d, this.f90603c));
    }
}
