package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class epb<T, R> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends oof<? extends R>> f33802b;

    /* JADX INFO: renamed from: c */
    public final boolean f33803c;

    /* JADX INFO: renamed from: epb$a */
    public static final class C5433a<T, R> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: C */
        public lf4 f33804C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f33805F;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f33806a;

        /* JADX INFO: renamed from: b */
        public final boolean f33807b;

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, ? extends oof<? extends R>> f33811f;

        /* JADX INFO: renamed from: c */
        public final mm2 f33808c = new mm2();

        /* JADX INFO: renamed from: e */
        public final bc0 f33810e = new bc0();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f33809d = new AtomicInteger(1);

        /* JADX INFO: renamed from: m */
        public final AtomicReference<qzf<R>> f33812m = new AtomicReference<>();

        /* JADX INFO: renamed from: epb$a$a */
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
                C5433a.this.m10183e(this, e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.hnf
            public void onSuccess(R value) {
                C5433a.this.m10184f(this, value);
            }
        }

        public C5433a(pxb<? super R> actual, sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayErrors) {
            this.f33806a = actual;
            this.f33811f = mapper;
            this.f33807b = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m10179a() {
            qzf<R> qzfVar = this.f33812m.get();
            if (qzfVar != null) {
                qzfVar.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m10180b() {
            if (getAndIncrement() == 0) {
                m10181c();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m10181c() {
            pxb<? super R> pxbVar = this.f33806a;
            AtomicInteger atomicInteger = this.f33809d;
            AtomicReference<qzf<R>> atomicReference = this.f33812m;
            int iAddAndGet = 1;
            while (!this.f33805F) {
                if (!this.f33807b && this.f33810e.get() != null) {
                    m10179a();
                    this.f33810e.tryTerminateConsumer(pxbVar);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                qzf<R> qzfVar = atomicReference.get();
                InterfaceC0000a interfaceC0000aPoll = qzfVar != null ? qzfVar.poll() : null;
                boolean z2 = interfaceC0000aPoll == null;
                if (z && z2) {
                    this.f33810e.tryTerminateConsumer(this.f33806a);
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
            m10179a();
        }

        /* JADX INFO: renamed from: d */
        public qzf<R> m10182d() {
            qzf<R> qzfVar = this.f33812m.get();
            if (qzfVar != null) {
                return qzfVar;
            }
            qzf<R> qzfVar2 = new qzf<>(vkb.bufferSize());
            return v7b.m23844a(this.f33812m, null, qzfVar2) ? qzfVar2 : this.f33812m.get();
        }

        @Override // p000.lf4
        public void dispose() {
            this.f33805F = true;
            this.f33804C.dispose();
            this.f33808c.dispose();
            this.f33810e.tryTerminateAndReport();
        }

        /* JADX INFO: renamed from: e */
        public void m10183e(C5433a<T, R>.a inner, Throwable e) {
            this.f33808c.delete(inner);
            if (this.f33810e.tryAddThrowableOrReport(e)) {
                if (!this.f33807b) {
                    this.f33804C.dispose();
                    this.f33808c.dispose();
                }
                this.f33809d.decrementAndGet();
                m10180b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
        /* JADX INFO: renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m10184f(p000.epb.C5433a<T, R>.a r3, R r4) {
            /*
                r2 = this;
                mm2 r0 = r2.f33808c
                r0.delete(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L42
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L42
                pxb<? super R> r1 = r2.f33806a
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f33809d
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference<qzf<R>> r4 = r2.f33812m
                java.lang.Object r4 = r4.get()
                qzf r4 = (p000.qzf) r4
                if (r3 == 0) goto L3b
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L3b
            L33:
                bc0 r3 = r2.f33810e
                pxb<? super R> r4 = r2.f33806a
                r3.tryTerminateConsumer(r4)
                return
            L3b:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L57
                return
            L42:
                qzf r3 = r2.m10182d()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L5b
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f33809d
                r3.decrementAndGet()
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L57
                return
            L57:
                r2.m10181c()
                return
            L5b:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.epb.C5433a.m10184f(epb$a$a, java.lang.Object):void");
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f33805F;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f33809d.decrementAndGet();
            m10180b();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f33809d.decrementAndGet();
            if (this.f33810e.tryAddThrowableOrReport(t)) {
                if (!this.f33807b) {
                    this.f33808c.dispose();
                }
                m10180b();
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            try {
                oof<? extends R> oofVarApply = this.f33811f.apply(t);
                Objects.requireNonNull(oofVarApply, "The mapper returned a null SingleSource");
                oof<? extends R> oofVar = oofVarApply;
                this.f33809d.getAndIncrement();
                a aVar = new a();
                if (this.f33805F || !this.f33808c.add(aVar)) {
                    return;
                }
                oofVar.subscribe(aVar);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f33804C.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f33804C, d)) {
                this.f33804C = d;
                this.f33806a.onSubscribe(this);
            }
        }
    }

    public epb(wub<T> source, sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayError) {
        super(source);
        this.f33802b = mapper;
        this.f33803c = delayError;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        this.f63101a.subscribe(new C5433a(observer, this.f33802b, this.f33803c));
    }
}
