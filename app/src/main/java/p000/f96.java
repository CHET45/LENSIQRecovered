package p000;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class f96<T, U extends Collection<? super T>, B> extends AbstractC8162k1<T, U> {

    /* JADX INFO: renamed from: c */
    public final Callable<? extends zjd<B>> f35762c;

    /* JADX INFO: renamed from: d */
    public final Callable<U> f35763d;

    /* JADX INFO: renamed from: f96$a */
    public static final class C5684a<T, U extends Collection<? super T>, B> extends mg4<B> {

        /* JADX INFO: renamed from: b */
        public final C5685b<T, U, B> f35764b;

        /* JADX INFO: renamed from: c */
        public boolean f35765c;

        public C5684a(C5685b<T, U, B> c5685b) {
            this.f35764b = c5685b;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f35765c) {
                return;
            }
            this.f35765c = true;
            this.f35764b.m10726d();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f35765c) {
                pfe.onError(th);
            } else {
                this.f35765c = true;
                this.f35764b.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(B b) {
            if (this.f35765c) {
                return;
            }
            this.f35765c = true;
            m17290a();
            this.f35764b.m10726d();
        }
    }

    /* JADX INFO: renamed from: f96$b */
    public static final class C5685b<T, U extends Collection<? super T>, B> extends cnd<T, U, U> implements lj6<T>, fdg, mf4 {

        /* JADX INFO: renamed from: G2 */
        public final Callable<U> f35766G2;

        /* JADX INFO: renamed from: H2 */
        public final Callable<? extends zjd<B>> f35767H2;

        /* JADX INFO: renamed from: I2 */
        public fdg f35768I2;

        /* JADX INFO: renamed from: J2 */
        public final AtomicReference<mf4> f35769J2;

        /* JADX INFO: renamed from: K2 */
        public U f35770K2;

        public C5685b(ycg<? super U> ycgVar, Callable<U> callable, Callable<? extends zjd<B>> callable2) {
            super(ycgVar, new s1b());
            this.f35769J2 = new AtomicReference<>();
            this.f35766G2 = callable;
            this.f35767H2 = callable2;
        }

        @Override // p000.cnd, p000.wmd
        public /* bridge */ /* synthetic */ boolean accept(ycg ycgVar, Object obj) {
            return accept((ycg<? super Collection>) ycgVar, (Collection) obj);
        }

        /* JADX INFO: renamed from: c */
        public void m10725c() {
            ag4.dispose(this.f35769J2);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f17085D2) {
                return;
            }
            this.f17085D2 = true;
            this.f35768I2.cancel();
            m10725c();
            if (enter()) {
                this.f17084C2.clear();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m10726d() {
            try {
                U u = (U) xjb.requireNonNull(this.f35766G2.call(), "The buffer supplied is null");
                try {
                    zjd zjdVar = (zjd) xjb.requireNonNull(this.f35767H2.call(), "The boundary publisher supplied is null");
                    C5684a c5684a = new C5684a(this);
                    if (ag4.replace(this.f35769J2, c5684a)) {
                        synchronized (this) {
                            try {
                                U u2 = this.f35770K2;
                                if (u2 == null) {
                                    return;
                                }
                                this.f35770K2 = u;
                                zjdVar.subscribe(c5684a);
                                m4090a(u2, false, this);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    this.f17085D2 = true;
                    this.f35768I2.cancel();
                    this.f17083B2.onError(th2);
                }
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                cancel();
                this.f17083B2.onError(th3);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f35768I2.cancel();
            m10725c();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f35769J2.get() == ag4.DISPOSED;
        }

        @Override // p000.ycg
        public void onComplete() {
            synchronized (this) {
                try {
                    U u = this.f35770K2;
                    if (u == null) {
                        return;
                    }
                    this.f35770K2 = null;
                    this.f17084C2.offer(u);
                    this.f17086E2 = true;
                    if (enter()) {
                        ymd.drainMaxLoop(this.f17084C2, this.f17083B2, false, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            cancel();
            this.f17083B2.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f35770K2;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f35768I2, fdgVar)) {
                this.f35768I2 = fdgVar;
                ycg<? super V> ycgVar = this.f17083B2;
                try {
                    this.f35770K2 = (U) xjb.requireNonNull(this.f35766G2.call(), "The buffer supplied is null");
                    try {
                        zjd zjdVar = (zjd) xjb.requireNonNull(this.f35767H2.call(), "The boundary publisher supplied is null");
                        C5684a c5684a = new C5684a(this);
                        this.f35769J2.set(c5684a);
                        ycgVar.onSubscribe(this);
                        if (this.f17085D2) {
                            return;
                        }
                        fdgVar.request(Long.MAX_VALUE);
                        zjdVar.subscribe(c5684a);
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f17085D2 = true;
                        fdgVar.cancel();
                        x05.error(th, ycgVar);
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    this.f17085D2 = true;
                    fdgVar.cancel();
                    x05.error(th2, ycgVar);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            requested(j);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public boolean accept(ycg<? super U> ycgVar, U u) {
            this.f17083B2.onNext((Object) u);
            return true;
        }
    }

    public f96(m86<T> m86Var, Callable<? extends zjd<B>> callable, Callable<U> callable2) {
        super(m86Var);
        this.f35762c = callable;
        this.f35763d = callable2;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super U> ycgVar) {
        this.f52360b.subscribe((lj6) new C5685b(new t1f(ycgVar), this.f35763d, this.f35762c));
    }
}
