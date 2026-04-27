package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class bpb<T, R> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends aaa<? extends R>> f14390b;

    /* JADX INFO: renamed from: c */
    public final boolean f14391c;

    /* JADX INFO: renamed from: bpb$a */
    public static final class C1981a<T, R> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: C */
        public mf4 f14392C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f14393F;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f14394a;

        /* JADX INFO: renamed from: b */
        public final boolean f14395b;

        /* JADX INFO: renamed from: f */
        public final py6<? super T, ? extends aaa<? extends R>> f14399f;

        /* JADX INFO: renamed from: c */
        public final nm2 f14396c = new nm2();

        /* JADX INFO: renamed from: e */
        public final cc0 f14398e = new cc0();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f14397d = new AtomicInteger(1);

        /* JADX INFO: renamed from: m */
        public final AtomicReference<rzf<R>> f14400m = new AtomicReference<>();

        /* JADX INFO: renamed from: bpb$a$a */
        public final class a extends AtomicReference<mf4> implements l9a<R>, mf4 {
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

            @Override // p000.l9a
            public void onComplete() {
                C1981a.this.m3310e(this);
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                C1981a.this.m3311f(this, th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(R r) {
                C1981a.this.m3312g(this, r);
            }
        }

        public C1981a(oxb<? super R> oxbVar, py6<? super T, ? extends aaa<? extends R>> py6Var, boolean z) {
            this.f14394a = oxbVar;
            this.f14399f = py6Var;
            this.f14395b = z;
        }

        /* JADX INFO: renamed from: a */
        public void m3306a() {
            rzf<R> rzfVar = this.f14400m.get();
            if (rzfVar != null) {
                rzfVar.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3307b() {
            if (getAndIncrement() == 0) {
                m3308c();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m3308c() {
            oxb<? super R> oxbVar = this.f14394a;
            AtomicInteger atomicInteger = this.f14397d;
            AtomicReference<rzf<R>> atomicReference = this.f14400m;
            int iAddAndGet = 1;
            while (!this.f14393F) {
                if (!this.f14395b && this.f14398e.get() != null) {
                    Throwable thTerminate = this.f14398e.terminate();
                    m3306a();
                    oxbVar.onError(thTerminate);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                rzf<R> rzfVar = atomicReference.get();
                InterfaceC0000a interfaceC0000aPoll = rzfVar != null ? rzfVar.poll() : null;
                boolean z2 = interfaceC0000aPoll == null;
                if (z && z2) {
                    Throwable thTerminate2 = this.f14398e.terminate();
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
            m3306a();
        }

        /* JADX INFO: renamed from: d */
        public rzf<R> m3309d() {
            rzf<R> rzfVar;
            do {
                rzf<R> rzfVar2 = this.f14400m.get();
                if (rzfVar2 != null) {
                    return rzfVar2;
                }
                rzfVar = new rzf<>(Observable.bufferSize());
            } while (!v7b.m23844a(this.f14400m, null, rzfVar));
            return rzfVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f14393F = true;
            this.f14392C.dispose();
            this.f14396c.dispose();
        }

        /* JADX INFO: renamed from: e */
        public void m3310e(C1981a<T, R>.a aVar) {
            this.f14396c.delete(aVar);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z = this.f14397d.decrementAndGet() == 0;
                    rzf<R> rzfVar = this.f14400m.get();
                    if (!z || (rzfVar != null && !rzfVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        m3308c();
                        return;
                    } else {
                        Throwable thTerminate = this.f14398e.terminate();
                        if (thTerminate != null) {
                            this.f14394a.onError(thTerminate);
                            return;
                        } else {
                            this.f14394a.onComplete();
                            return;
                        }
                    }
                }
            }
            this.f14397d.decrementAndGet();
            m3307b();
        }

        /* JADX INFO: renamed from: f */
        public void m3311f(C1981a<T, R>.a aVar, Throwable th) {
            this.f14396c.delete(aVar);
            if (!this.f14398e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f14395b) {
                this.f14392C.dispose();
                this.f14396c.dispose();
            }
            this.f14397d.decrementAndGet();
            m3307b();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
        /* JADX INFO: renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m3312g(p000.bpb.C1981a<T, R>.a r3, R r4) {
            /*
                r2 = this;
                nm2 r0 = r2.f14396c
                r0.delete(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L4e
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L4e
                oxb<? super R> r1 = r2.f14394a
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f14397d
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference<rzf<R>> r4 = r2.f14400m
                java.lang.Object r4 = r4.get()
                rzf r4 = (p000.rzf) r4
                if (r3 == 0) goto L47
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L47
            L33:
                cc0 r3 = r2.f14398e
                java.lang.Throwable r3 = r3.terminate()
                if (r3 == 0) goto L41
                oxb<? super R> r4 = r2.f14394a
                r4.onError(r3)
                goto L46
            L41:
                oxb<? super R> r3 = r2.f14394a
                r3.onComplete()
            L46:
                return
            L47:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L63
                return
            L4e:
                rzf r3 = r2.m3309d()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f14397d
                r3.decrementAndGet()
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L63
                return
            L63:
                r2.m3308c()
                return
            L67:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.bpb.C1981a.m3312g(bpb$a$a, java.lang.Object):void");
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f14393F;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f14397d.decrementAndGet();
            m3307b();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f14397d.decrementAndGet();
            if (!this.f14398e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f14395b) {
                this.f14396c.dispose();
            }
            m3307b();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            try {
                aaa aaaVar = (aaa) xjb.requireNonNull(this.f14399f.apply(t), "The mapper returned a null MaybeSource");
                this.f14397d.getAndIncrement();
                a aVar = new a();
                if (this.f14393F || !this.f14396c.add(aVar)) {
                    return;
                }
                aaaVar.subscribe(aVar);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f14392C.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f14392C, mf4Var)) {
                this.f14392C = mf4Var;
                this.f14394a.onSubscribe(this);
            }
        }
    }

    public bpb(xub<T> xubVar, py6<? super T, ? extends aaa<? extends R>> py6Var, boolean z) {
        super(xubVar);
        this.f14390b = py6Var;
        this.f14391c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        this.f66354a.subscribe(new C1981a(oxbVar, this.f14390b, this.f14391c));
    }
}
