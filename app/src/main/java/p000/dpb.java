package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class dpb<T, R> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends pof<? extends R>> f30333b;

    /* JADX INFO: renamed from: c */
    public final boolean f30334c;

    /* JADX INFO: renamed from: dpb$a */
    public static final class C4902a<T, R> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: C */
        public mf4 f30335C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f30336F;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f30337a;

        /* JADX INFO: renamed from: b */
        public final boolean f30338b;

        /* JADX INFO: renamed from: f */
        public final py6<? super T, ? extends pof<? extends R>> f30342f;

        /* JADX INFO: renamed from: c */
        public final nm2 f30339c = new nm2();

        /* JADX INFO: renamed from: e */
        public final cc0 f30341e = new cc0();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f30340d = new AtomicInteger(1);

        /* JADX INFO: renamed from: m */
        public final AtomicReference<rzf<R>> f30343m = new AtomicReference<>();

        /* JADX INFO: renamed from: dpb$a$a */
        public final class a extends AtomicReference<mf4> implements inf<R>, mf4 {
            private static final long serialVersionUID = -502562646270949838L;

            public a() {
            }

            @Override // p000.mf4
            public void dispose() {
                ag4.dispose(this);
            }

            @Override // p000.mf4
            public boolean isDisposed() {
                return ag4.isDisposed(get());
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                C4902a.this.m9291e(this, th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(R r) {
                C4902a.this.m9292f(this, r);
            }
        }

        public C4902a(oxb<? super R> oxbVar, py6<? super T, ? extends pof<? extends R>> py6Var, boolean z) {
            this.f30337a = oxbVar;
            this.f30342f = py6Var;
            this.f30338b = z;
        }

        /* JADX INFO: renamed from: a */
        public void m9287a() {
            rzf<R> rzfVar = this.f30343m.get();
            if (rzfVar != null) {
                rzfVar.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m9288b() {
            if (getAndIncrement() == 0) {
                m9289c();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m9289c() {
            oxb<? super R> oxbVar = this.f30337a;
            AtomicInteger atomicInteger = this.f30340d;
            AtomicReference<rzf<R>> atomicReference = this.f30343m;
            int iAddAndGet = 1;
            while (!this.f30336F) {
                if (!this.f30338b && this.f30341e.get() != null) {
                    Throwable thTerminate = this.f30341e.terminate();
                    m9287a();
                    oxbVar.onError(thTerminate);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                rzf<R> rzfVar = atomicReference.get();
                InterfaceC0000a interfaceC0000aPoll = rzfVar != null ? rzfVar.poll() : null;
                boolean z2 = interfaceC0000aPoll == null;
                if (z && z2) {
                    Throwable thTerminate2 = this.f30341e.terminate();
                    if (thTerminate2 != null) {
                        oxbVar.onError(thTerminate2);
                        return;
                    } else {
                        oxbVar.onComplete();
                        return;
                    }
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    oxbVar.onNext(interfaceC0000aPoll);
                }
            }
            m9287a();
        }

        /* JADX INFO: renamed from: d */
        public rzf<R> m9290d() {
            rzf<R> rzfVar;
            do {
                rzf<R> rzfVar2 = this.f30343m.get();
                if (rzfVar2 != null) {
                    return rzfVar2;
                }
                rzfVar = new rzf<>(Observable.bufferSize());
            } while (!v7b.m23844a(this.f30343m, null, rzfVar));
            return rzfVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f30336F = true;
            this.f30335C.dispose();
            this.f30339c.dispose();
        }

        /* JADX INFO: renamed from: e */
        public void m9291e(C4902a<T, R>.a aVar, Throwable th) {
            this.f30339c.delete(aVar);
            if (!this.f30341e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f30338b) {
                this.f30335C.dispose();
                this.f30339c.dispose();
            }
            this.f30340d.decrementAndGet();
            m9288b();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
        /* JADX INFO: renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m9292f(p000.dpb.C4902a<T, R>.a r3, R r4) {
            /*
                r2 = this;
                nm2 r0 = r2.f30339c
                r0.delete(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L4e
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L4e
                oxb<? super R> r1 = r2.f30337a
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f30340d
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference<rzf<R>> r4 = r2.f30343m
                java.lang.Object r4 = r4.get()
                rzf r4 = (p000.rzf) r4
                if (r3 == 0) goto L47
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L47
            L33:
                cc0 r3 = r2.f30341e
                java.lang.Throwable r3 = r3.terminate()
                if (r3 == 0) goto L41
                oxb<? super R> r4 = r2.f30337a
                r4.onError(r3)
                goto L46
            L41:
                oxb<? super R> r3 = r2.f30337a
                r3.onComplete()
            L46:
                return
            L47:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L63
                return
            L4e:
                rzf r3 = r2.m9290d()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f30340d
                r3.decrementAndGet()
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L63
                return
            L63:
                r2.m9289c()
                return
            L67:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dpb.C4902a.m9292f(dpb$a$a, java.lang.Object):void");
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f30336F;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f30340d.decrementAndGet();
            m9288b();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f30340d.decrementAndGet();
            if (!this.f30341e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f30338b) {
                this.f30339c.dispose();
            }
            m9288b();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            try {
                pof pofVar = (pof) xjb.requireNonNull(this.f30342f.apply(t), "The mapper returned a null SingleSource");
                this.f30340d.getAndIncrement();
                a aVar = new a();
                if (this.f30336F || !this.f30339c.add(aVar)) {
                    return;
                }
                pofVar.subscribe(aVar);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f30335C.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f30335C, mf4Var)) {
                this.f30335C = mf4Var;
                this.f30337a.onSubscribe(this);
            }
        }
    }

    public dpb(xub<T> xubVar, py6<? super T, ? extends pof<? extends R>> py6Var, boolean z) {
        super(xubVar);
        this.f30333b = py6Var;
        this.f30334c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        this.f66354a.subscribe(new C4902a(oxbVar, this.f30333b, this.f30334c));
    }
}
