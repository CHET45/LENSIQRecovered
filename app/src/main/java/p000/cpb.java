package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class cpb<T, R> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends z9a<? extends R>> f26720b;

    /* JADX INFO: renamed from: c */
    public final boolean f26721c;

    /* JADX INFO: renamed from: cpb$a */
    public static final class C4448a<T, R> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: C */
        public lf4 f26722C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f26723F;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f26724a;

        /* JADX INFO: renamed from: b */
        public final boolean f26725b;

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, ? extends z9a<? extends R>> f26729f;

        /* JADX INFO: renamed from: c */
        public final mm2 f26726c = new mm2();

        /* JADX INFO: renamed from: e */
        public final bc0 f26728e = new bc0();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f26727d = new AtomicInteger(1);

        /* JADX INFO: renamed from: m */
        public final AtomicReference<qzf<R>> f26730m = new AtomicReference<>();

        /* JADX INFO: renamed from: cpb$a$a */
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
                C4448a.this.m8637e(this);
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                C4448a.this.m8638f(this, e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.k9a
            public void onSuccess(R value) {
                C4448a.this.m8639g(this, value);
            }
        }

        public C4448a(pxb<? super R> actual, sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayErrors) {
            this.f26724a = actual;
            this.f26729f = mapper;
            this.f26725b = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m8633a() {
            qzf<R> qzfVar = this.f26730m.get();
            if (qzfVar != null) {
                qzfVar.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m8634b() {
            if (getAndIncrement() == 0) {
                m8635c();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m8635c() {
            pxb<? super R> pxbVar = this.f26724a;
            AtomicInteger atomicInteger = this.f26727d;
            AtomicReference<qzf<R>> atomicReference = this.f26730m;
            int iAddAndGet = 1;
            while (!this.f26723F) {
                if (!this.f26725b && this.f26728e.get() != null) {
                    m8633a();
                    this.f26728e.tryTerminateConsumer(pxbVar);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                qzf<R> qzfVar = atomicReference.get();
                InterfaceC0000a interfaceC0000aPoll = qzfVar != null ? qzfVar.poll() : null;
                boolean z2 = interfaceC0000aPoll == null;
                if (z && z2) {
                    this.f26728e.tryTerminateConsumer(pxbVar);
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    pxbVar.onNext(interfaceC0000aPoll);
                }
            }
            m8633a();
        }

        /* JADX INFO: renamed from: d */
        public qzf<R> m8636d() {
            qzf<R> qzfVar = this.f26730m.get();
            if (qzfVar != null) {
                return qzfVar;
            }
            qzf<R> qzfVar2 = new qzf<>(vkb.bufferSize());
            return v7b.m23844a(this.f26730m, null, qzfVar2) ? qzfVar2 : this.f26730m.get();
        }

        @Override // p000.lf4
        public void dispose() {
            this.f26723F = true;
            this.f26722C.dispose();
            this.f26726c.dispose();
            this.f26728e.tryTerminateAndReport();
        }

        /* JADX INFO: renamed from: e */
        public void m8637e(C4448a<T, R>.a inner) {
            this.f26726c.delete(inner);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z = this.f26727d.decrementAndGet() == 0;
                    qzf<R> qzfVar = this.f26730m.get();
                    if (z && (qzfVar == null || qzfVar.isEmpty())) {
                        this.f26728e.tryTerminateConsumer(this.f26724a);
                        return;
                    } else {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        m8635c();
                        return;
                    }
                }
            }
            this.f26727d.decrementAndGet();
            m8634b();
        }

        /* JADX INFO: renamed from: f */
        public void m8638f(C4448a<T, R>.a inner, Throwable e) {
            this.f26726c.delete(inner);
            if (this.f26728e.tryAddThrowableOrReport(e)) {
                if (!this.f26725b) {
                    this.f26722C.dispose();
                    this.f26726c.dispose();
                }
                this.f26727d.decrementAndGet();
                m8634b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
        /* JADX INFO: renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m8639g(p000.cpb.C4448a<T, R>.a r3, R r4) {
            /*
                r2 = this;
                mm2 r0 = r2.f26726c
                r0.delete(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L42
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L42
                pxb<? super R> r1 = r2.f26724a
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f26727d
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference<qzf<R>> r4 = r2.f26730m
                java.lang.Object r4 = r4.get()
                qzf r4 = (p000.qzf) r4
                if (r3 == 0) goto L3b
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L3b
            L33:
                bc0 r3 = r2.f26728e
                pxb<? super R> r4 = r2.f26724a
                r3.tryTerminateConsumer(r4)
                return
            L3b:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L57
                return
            L42:
                qzf r3 = r2.m8636d()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L5b
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f26727d
                r3.decrementAndGet()
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L57
                return
            L57:
                r2.m8635c()
                return
            L5b:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.cpb.C4448a.m8639g(cpb$a$a, java.lang.Object):void");
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f26723F;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f26727d.decrementAndGet();
            m8634b();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f26727d.decrementAndGet();
            if (this.f26728e.tryAddThrowableOrReport(t)) {
                if (!this.f26725b) {
                    this.f26726c.dispose();
                }
                m8634b();
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            try {
                z9a<? extends R> z9aVarApply = this.f26729f.apply(t);
                Objects.requireNonNull(z9aVarApply, "The mapper returned a null MaybeSource");
                z9a<? extends R> z9aVar = z9aVarApply;
                this.f26727d.getAndIncrement();
                a aVar = new a();
                if (this.f26723F || !this.f26726c.add(aVar)) {
                    return;
                }
                z9aVar.subscribe(aVar);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f26722C.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f26722C, d)) {
                this.f26722C = d;
                this.f26724a.onSubscribe(this);
            }
        }
    }

    public cpb(wub<T> source, sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayError) {
        super(source);
        this.f26720b = mapper;
        this.f26721c = delayError;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        this.f63101a.subscribe(new C4448a(observer, this.f26720b, this.f26721c));
    }
}
