package p000;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class g96<T, U extends Collection<? super T>, B> extends AbstractC8162k1<T, U> {

    /* JADX INFO: renamed from: c */
    public final zjd<B> f39043c;

    /* JADX INFO: renamed from: d */
    public final Callable<U> f39044d;

    /* JADX INFO: renamed from: g96$a */
    public static final class C6173a<T, U extends Collection<? super T>, B> extends mg4<B> {

        /* JADX INFO: renamed from: b */
        public final C6174b<T, U, B> f39045b;

        public C6173a(C6174b<T, U, B> c6174b) {
            this.f39045b = c6174b;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f39045b.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f39045b.onError(th);
        }

        @Override // p000.ycg
        public void onNext(B b) {
            this.f39045b.m11443c();
        }
    }

    /* JADX INFO: renamed from: g96$b */
    public static final class C6174b<T, U extends Collection<? super T>, B> extends cnd<T, U, U> implements lj6<T>, fdg, mf4 {

        /* JADX INFO: renamed from: G2 */
        public final Callable<U> f39046G2;

        /* JADX INFO: renamed from: H2 */
        public final zjd<B> f39047H2;

        /* JADX INFO: renamed from: I2 */
        public fdg f39048I2;

        /* JADX INFO: renamed from: J2 */
        public mf4 f39049J2;

        /* JADX INFO: renamed from: K2 */
        public U f39050K2;

        public C6174b(ycg<? super U> ycgVar, Callable<U> callable, zjd<B> zjdVar) {
            super(ycgVar, new s1b());
            this.f39046G2 = callable;
            this.f39047H2 = zjdVar;
        }

        @Override // p000.cnd, p000.wmd
        public /* bridge */ /* synthetic */ boolean accept(ycg ycgVar, Object obj) {
            return accept((ycg<? super Collection>) ycgVar, (Collection) obj);
        }

        /* JADX INFO: renamed from: c */
        public void m11443c() {
            try {
                U u = (U) xjb.requireNonNull(this.f39046G2.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        U u2 = this.f39050K2;
                        if (u2 == null) {
                            return;
                        }
                        this.f39050K2 = u;
                        m4090a(u2, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                cancel();
                this.f17083B2.onError(th2);
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f17085D2) {
                return;
            }
            this.f17085D2 = true;
            this.f39049J2.dispose();
            this.f39048I2.cancel();
            if (enter()) {
                this.f17084C2.clear();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            cancel();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f17085D2;
        }

        @Override // p000.ycg
        public void onComplete() {
            synchronized (this) {
                try {
                    U u = this.f39050K2;
                    if (u == null) {
                        return;
                    }
                    this.f39050K2 = null;
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
                    U u = this.f39050K2;
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
            if (mdg.validate(this.f39048I2, fdgVar)) {
                this.f39048I2 = fdgVar;
                try {
                    this.f39050K2 = (U) xjb.requireNonNull(this.f39046G2.call(), "The buffer supplied is null");
                    C6173a c6173a = new C6173a(this);
                    this.f39049J2 = c6173a;
                    this.f17083B2.onSubscribe(this);
                    if (this.f17085D2) {
                        return;
                    }
                    fdgVar.request(Long.MAX_VALUE);
                    this.f39047H2.subscribe(c6173a);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f17085D2 = true;
                    fdgVar.cancel();
                    x05.error(th, this.f17083B2);
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

    public g96(m86<T> m86Var, zjd<B> zjdVar, Callable<U> callable) {
        super(m86Var);
        this.f39043c = zjdVar;
        this.f39044d = callable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super U> ycgVar) {
        this.f52360b.subscribe((lj6) new C6174b(new t1f(ycgVar), this.f39044d, this.f39043c));
    }
}
