package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class bd6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends oof<? extends R>> f13419c;

    /* JADX INFO: renamed from: d */
    public final boolean f13420d;

    /* JADX INFO: renamed from: e */
    public final int f13421e;

    /* JADX INFO: renamed from: bd6$a */
    public static final class C1841a<T, R> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: C */
        public final sy6<? super T, ? extends oof<? extends R>> f13422C;

        /* JADX INFO: renamed from: H */
        public fdg f13424H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f13425L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f13426a;

        /* JADX INFO: renamed from: b */
        public final boolean f13427b;

        /* JADX INFO: renamed from: c */
        public final int f13428c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f13429d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final mm2 f13430e = new mm2();

        /* JADX INFO: renamed from: m */
        public final bc0 f13432m = new bc0();

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f13431f = new AtomicInteger(1);

        /* JADX INFO: renamed from: F */
        public final AtomicReference<qzf<R>> f13423F = new AtomicReference<>();

        /* JADX INFO: renamed from: bd6$a$a */
        public final class a extends AtomicReference<lf4> implements hnf<R>, lf4 {
            private static final long serialVersionUID = -502562646270949838L;

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

            @Override // p000.hnf
            public void onError(Throwable e) {
                C1841a.this.m3053e(this, e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.hnf
            public void onSuccess(R value) {
                C1841a.this.m3054f(this, value);
            }
        }

        public C1841a(ycg<? super R> actual, sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayErrors, int maxConcurrency) {
            this.f13426a = actual;
            this.f13422C = mapper;
            this.f13427b = delayErrors;
            this.f13428c = maxConcurrency;
        }

        /* JADX INFO: renamed from: a */
        public void m3049a() {
            qzf<R> qzfVar = this.f13423F.get();
            if (qzfVar != null) {
                qzfVar.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3050b() {
            if (getAndIncrement() == 0) {
                m3051c();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m3051c() {
            ycg<? super R> ycgVar = this.f13426a;
            AtomicInteger atomicInteger = this.f13431f;
            AtomicReference<qzf<R>> atomicReference = this.f13423F;
            int iAddAndGet = 1;
            do {
                long j = this.f13429d.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.f13425L) {
                        m3049a();
                        return;
                    }
                    if (!this.f13427b && this.f13432m.get() != null) {
                        m3049a();
                        this.f13432m.tryTerminateConsumer(this.f13426a);
                        return;
                    }
                    boolean z = atomicInteger.get() == 0;
                    qzf<R> qzfVar = atomicReference.get();
                    InterfaceC0000a interfaceC0000aPoll = qzfVar != null ? qzfVar.poll() : null;
                    boolean z2 = interfaceC0000aPoll == null;
                    if (z && z2) {
                        this.f13432m.tryTerminateConsumer(ycgVar);
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        ycgVar.onNext(interfaceC0000aPoll);
                        j2++;
                    }
                }
                if (j2 == j) {
                    if (this.f13425L) {
                        m3049a();
                        return;
                    }
                    if (!this.f13427b && this.f13432m.get() != null) {
                        m3049a();
                        this.f13432m.tryTerminateConsumer(ycgVar);
                        return;
                    }
                    boolean z3 = atomicInteger.get() == 0;
                    qzf<R> qzfVar2 = atomicReference.get();
                    boolean z4 = qzfVar2 == null || qzfVar2.isEmpty();
                    if (z3 && z4) {
                        this.f13432m.tryTerminateConsumer(ycgVar);
                        return;
                    }
                }
                if (j2 != 0) {
                    ro0.produced(this.f13429d, j2);
                    if (this.f13428c != Integer.MAX_VALUE) {
                        this.f13424H.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f13425L = true;
            this.f13424H.cancel();
            this.f13430e.dispose();
            this.f13432m.tryTerminateAndReport();
        }

        /* JADX INFO: renamed from: d */
        public qzf<R> m3052d() {
            qzf<R> qzfVar = this.f13423F.get();
            if (qzfVar != null) {
                return qzfVar;
            }
            qzf<R> qzfVar2 = new qzf<>(l86.bufferSize());
            return v7b.m23844a(this.f13423F, null, qzfVar2) ? qzfVar2 : this.f13423F.get();
        }

        /* JADX INFO: renamed from: e */
        public void m3053e(C1841a<T, R>.a inner, Throwable e) {
            this.f13430e.delete(inner);
            if (this.f13432m.tryAddThrowableOrReport(e)) {
                if (!this.f13427b) {
                    this.f13424H.cancel();
                    this.f13430e.dispose();
                } else if (this.f13428c != Integer.MAX_VALUE) {
                    this.f13424H.request(1L);
                }
                this.f13431f.decrementAndGet();
                m3050b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
        /* JADX INFO: renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m3054f(p000.bd6.C1841a<T, R>.a r5, R r6) {
            /*
                r4 = this;
                mm2 r0 = r4.f13430e
                r0.delete(r5)
                int r5 = r4.get()
                if (r5 != 0) goto L6e
                r5 = 0
                r0 = 1
                boolean r1 = r4.compareAndSet(r5, r0)
                if (r1 == 0) goto L6e
                java.util.concurrent.atomic.AtomicInteger r1 = r4.f13431f
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L1c
                r5 = r0
            L1c:
                java.util.concurrent.atomic.AtomicLong r0 = r4.f13429d
                long r0 = r0.get()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L5b
                ycg<? super R> r0 = r4.f13426a
                r0.onNext(r6)
                java.util.concurrent.atomic.AtomicReference<qzf<R>> r6 = r4.f13423F
                java.lang.Object r6 = r6.get()
                qzf r6 = (p000.qzf) r6
                if (r5 == 0) goto L47
                if (r6 == 0) goto L3f
                boolean r5 = r6.isEmpty()
                if (r5 == 0) goto L47
            L3f:
                bc0 r5 = r4.f13432m
                ycg<? super R> r6 = r4.f13426a
                r5.tryTerminateConsumer(r6)
                return
            L47:
                java.util.concurrent.atomic.AtomicLong r5 = r4.f13429d
                r0 = 1
                p000.ro0.produced(r5, r0)
                int r5 = r4.f13428c
                r6 = 2147483647(0x7fffffff, float:NaN)
                if (r5 == r6) goto L64
                fdg r5 = r4.f13424H
                r5.request(r0)
                goto L64
            L5b:
                qzf r5 = r4.m3052d()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L6b
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            L64:
                int r5 = r4.decrementAndGet()
                if (r5 != 0) goto L83
                return
            L6b:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
                throw r6
            L6e:
                qzf r5 = r4.m3052d()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L87
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
                java.util.concurrent.atomic.AtomicInteger r5 = r4.f13431f
                r5.decrementAndGet()
                int r5 = r4.getAndIncrement()
                if (r5 == 0) goto L83
                return
            L83:
                r4.m3051c()
                return
            L87:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.bd6.C1841a.m3054f(bd6$a$a, java.lang.Object):void");
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f13431f.decrementAndGet();
            m3050b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f13431f.decrementAndGet();
            if (this.f13432m.tryAddThrowableOrReport(t)) {
                if (!this.f13427b) {
                    this.f13430e.dispose();
                }
                m3050b();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            try {
                oof<? extends R> oofVarApply = this.f13422C.apply(t);
                Objects.requireNonNull(oofVarApply, "The mapper returned a null SingleSource");
                oof<? extends R> oofVar = oofVarApply;
                this.f13431f.getAndIncrement();
                a aVar = new a();
                if (this.f13425L || !this.f13430e.add(aVar)) {
                    return;
                }
                oofVar.subscribe(aVar);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f13424H.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f13424H, s)) {
                this.f13424H = s;
                this.f13426a.onSubscribe(this);
                int i = this.f13428c;
                if (i == Integer.MAX_VALUE) {
                    s.request(Long.MAX_VALUE);
                } else {
                    s.request(i);
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f13429d, n);
                m3050b();
            }
        }
    }

    public bd6(l86<T> source, sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayError, int maxConcurrency) {
        super(source);
        this.f13419c = mapper;
        this.f13420d = delayError;
        this.f13421e = maxConcurrency;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f49321b.subscribe((kj6) new C1841a(s, this.f13419c, this.f13420d, this.f13421e));
    }
}
