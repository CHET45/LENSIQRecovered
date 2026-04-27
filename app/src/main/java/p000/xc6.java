package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class xc6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends z9a<? extends R>> f97505c;

    /* JADX INFO: renamed from: d */
    public final boolean f97506d;

    /* JADX INFO: renamed from: e */
    public final int f97507e;

    /* JADX INFO: renamed from: xc6$a */
    public static final class C15030a<T, R> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: C */
        public final sy6<? super T, ? extends z9a<? extends R>> f97508C;

        /* JADX INFO: renamed from: H */
        public fdg f97510H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f97511L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f97512a;

        /* JADX INFO: renamed from: b */
        public final boolean f97513b;

        /* JADX INFO: renamed from: c */
        public final int f97514c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f97515d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final mm2 f97516e = new mm2();

        /* JADX INFO: renamed from: m */
        public final bc0 f97518m = new bc0();

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f97517f = new AtomicInteger(1);

        /* JADX INFO: renamed from: F */
        public final AtomicReference<qzf<R>> f97509F = new AtomicReference<>();

        /* JADX INFO: renamed from: xc6$a$a */
        public final class a extends AtomicReference<lf4> implements k9a<R>, lf4 {
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

            @Override // p000.k9a
            public void onComplete() {
                C15030a.this.m25093f(this);
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                C15030a.this.m25094g(this, e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.k9a
            public void onSuccess(R value) {
                C15030a.this.m25095h(this, value);
            }
        }

        public C15030a(ycg<? super R> actual, sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayErrors, int maxConcurrency) {
            this.f97512a = actual;
            this.f97508C = mapper;
            this.f97513b = delayErrors;
            this.f97514c = maxConcurrency;
        }

        /* JADX INFO: renamed from: a */
        public static boolean m25088a(boolean d, qzf<?> q) {
            return d && (q == null || q.isEmpty());
        }

        /* JADX INFO: renamed from: b */
        public void m25089b() {
            qzf<R> qzfVar = this.f97509F.get();
            if (qzfVar != null) {
                qzfVar.clear();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m25090c() {
            if (getAndIncrement() == 0) {
                m25091d();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f97511L = true;
            this.f97510H.cancel();
            this.f97516e.dispose();
            this.f97518m.tryTerminateAndReport();
        }

        /* JADX INFO: renamed from: d */
        public void m25091d() {
            ycg<? super R> ycgVar = this.f97512a;
            AtomicInteger atomicInteger = this.f97517f;
            AtomicReference<qzf<R>> atomicReference = this.f97509F;
            int iAddAndGet = 1;
            do {
                long j = this.f97515d.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.f97511L) {
                        m25089b();
                        return;
                    }
                    if (!this.f97513b && this.f97518m.get() != null) {
                        m25089b();
                        this.f97518m.tryTerminateConsumer(ycgVar);
                        return;
                    }
                    boolean z = atomicInteger.get() == 0;
                    qzf<R> qzfVar = atomicReference.get();
                    InterfaceC0000a interfaceC0000aPoll = qzfVar != null ? qzfVar.poll() : null;
                    boolean z2 = interfaceC0000aPoll == null;
                    if (z && z2) {
                        this.f97518m.tryTerminateConsumer(ycgVar);
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
                    if (this.f97511L) {
                        m25089b();
                        return;
                    }
                    if (!this.f97513b && this.f97518m.get() != null) {
                        m25089b();
                        this.f97518m.tryTerminateConsumer(ycgVar);
                        return;
                    }
                    boolean z3 = atomicInteger.get() == 0;
                    qzf<R> qzfVar2 = atomicReference.get();
                    boolean z4 = qzfVar2 == null || qzfVar2.isEmpty();
                    if (z3 && z4) {
                        this.f97518m.tryTerminateConsumer(ycgVar);
                        return;
                    }
                }
                if (j2 != 0) {
                    ro0.produced(this.f97515d, j2);
                    if (this.f97514c != Integer.MAX_VALUE) {
                        this.f97510H.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: e */
        public qzf<R> m25092e() {
            qzf<R> qzfVar = this.f97509F.get();
            if (qzfVar != null) {
                return qzfVar;
            }
            qzf<R> qzfVar2 = new qzf<>(l86.bufferSize());
            return v7b.m23844a(this.f97509F, null, qzfVar2) ? qzfVar2 : this.f97509F.get();
        }

        /* JADX INFO: renamed from: f */
        public void m25093f(C15030a<T, R>.a inner) {
            this.f97516e.delete(inner);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    if (m25088a(this.f97517f.decrementAndGet() == 0, this.f97509F.get())) {
                        this.f97518m.tryTerminateConsumer(this.f97512a);
                        return;
                    }
                    if (this.f97514c != Integer.MAX_VALUE) {
                        this.f97510H.request(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m25091d();
                    return;
                }
            }
            this.f97517f.decrementAndGet();
            if (this.f97514c != Integer.MAX_VALUE) {
                this.f97510H.request(1L);
            }
            m25090c();
        }

        /* JADX INFO: renamed from: g */
        public void m25094g(C15030a<T, R>.a inner, Throwable e) {
            this.f97516e.delete(inner);
            if (this.f97518m.tryAddThrowableOrReport(e)) {
                if (!this.f97513b) {
                    this.f97510H.cancel();
                    this.f97516e.dispose();
                } else if (this.f97514c != Integer.MAX_VALUE) {
                    this.f97510H.request(1L);
                }
                this.f97517f.decrementAndGet();
                m25090c();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
        /* JADX INFO: renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m25095h(p000.xc6.C15030a<T, R>.a r5, R r6) {
            /*
                r4 = this;
                mm2 r0 = r4.f97516e
                r0.delete(r5)
                int r5 = r4.get()
                if (r5 != 0) goto L6a
                r5 = 0
                r0 = 1
                boolean r1 = r4.compareAndSet(r5, r0)
                if (r1 == 0) goto L6a
                java.util.concurrent.atomic.AtomicInteger r1 = r4.f97517f
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L1c
                r5 = r0
            L1c:
                java.util.concurrent.atomic.AtomicLong r0 = r4.f97515d
                long r0 = r0.get()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L57
                ycg<? super R> r0 = r4.f97512a
                r0.onNext(r6)
                java.util.concurrent.atomic.AtomicReference<qzf<R>> r6 = r4.f97509F
                java.lang.Object r6 = r6.get()
                qzf r6 = (p000.qzf) r6
                boolean r5 = m25088a(r5, r6)
                if (r5 == 0) goto L43
                bc0 r5 = r4.f97518m
                ycg<? super R> r6 = r4.f97512a
                r5.tryTerminateConsumer(r6)
                return
            L43:
                java.util.concurrent.atomic.AtomicLong r5 = r4.f97515d
                r0 = 1
                p000.ro0.produced(r5, r0)
                int r5 = r4.f97514c
                r6 = 2147483647(0x7fffffff, float:NaN)
                if (r5 == r6) goto L60
                fdg r5 = r4.f97510H
                r5.request(r0)
                goto L60
            L57:
                qzf r5 = r4.m25092e()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            L60:
                int r5 = r4.decrementAndGet()
                if (r5 != 0) goto L7f
                return
            L67:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
                throw r6
            L6a:
                qzf r5 = r4.m25092e()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L83
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
                java.util.concurrent.atomic.AtomicInteger r5 = r4.f97517f
                r5.decrementAndGet()
                int r5 = r4.getAndIncrement()
                if (r5 == 0) goto L7f
                return
            L7f:
                r4.m25091d()
                return
            L83:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.xc6.C15030a.m25095h(xc6$a$a, java.lang.Object):void");
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f97517f.decrementAndGet();
            m25090c();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f97517f.decrementAndGet();
            if (this.f97518m.tryAddThrowableOrReport(t)) {
                if (!this.f97513b) {
                    this.f97516e.dispose();
                }
                m25090c();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            try {
                z9a<? extends R> z9aVarApply = this.f97508C.apply(t);
                Objects.requireNonNull(z9aVarApply, "The mapper returned a null MaybeSource");
                z9a<? extends R> z9aVar = z9aVarApply;
                this.f97517f.getAndIncrement();
                a aVar = new a();
                if (this.f97511L || !this.f97516e.add(aVar)) {
                    return;
                }
                z9aVar.subscribe(aVar);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f97510H.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f97510H, s)) {
                this.f97510H = s;
                this.f97512a.onSubscribe(this);
                int i = this.f97514c;
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
                ro0.add(this.f97515d, n);
                m25090c();
            }
        }
    }

    public xc6(l86<T> source, sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayError, int maxConcurrency) {
        super(source);
        this.f97505c = mapper;
        this.f97506d = delayError;
        this.f97507e = maxConcurrency;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f49321b.subscribe((kj6) new C15030a(s, this.f97505c, this.f97506d, this.f97507e));
    }
}
