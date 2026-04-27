package p000;

import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class h96<T, U extends Collection<? super T>, B> extends AbstractC7714j1<T, U> {

    /* JADX INFO: renamed from: c */
    public final zjd<B> f42951c;

    /* JADX INFO: renamed from: d */
    public final nfg<U> f42952d;

    /* JADX INFO: renamed from: h96$a */
    public static final class C6758a<T, U extends Collection<? super T>, B> extends ng4<B> {

        /* JADX INFO: renamed from: b */
        public final C6759b<T, U, B> f42953b;

        public C6758a(C6759b<T, U, B> parent) {
            this.f42953b = parent;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f42953b.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f42953b.onError(t);
        }

        @Override // p000.ycg
        public void onNext(B t) {
            this.f42953b.m12280c();
        }
    }

    /* JADX INFO: renamed from: h96$b */
    public static final class C6759b<T, U extends Collection<? super T>, B> extends bnd<T, U, U> implements kj6<T>, fdg, lf4 {

        /* JADX INFO: renamed from: G2 */
        public final nfg<U> f42954G2;

        /* JADX INFO: renamed from: H2 */
        public final zjd<B> f42955H2;

        /* JADX INFO: renamed from: I2 */
        public fdg f42956I2;

        /* JADX INFO: renamed from: J2 */
        public lf4 f42957J2;

        /* JADX INFO: renamed from: K2 */
        public U f42958K2;

        public C6759b(ycg<? super U> actual, nfg<U> bufferSupplier, zjd<B> boundary) {
            super(actual, new t1b());
            this.f42954G2 = bufferSupplier;
            this.f42955H2 = boundary;
        }

        @Override // p000.bnd, p000.vmd
        public /* bridge */ /* synthetic */ boolean accept(ycg a, Object v) {
            return accept((ycg<? super Collection>) a, (Collection) v);
        }

        /* JADX INFO: renamed from: c */
        public void m12280c() {
            try {
                U u = this.f42954G2.get();
                Objects.requireNonNull(u, "The buffer supplied is null");
                U u2 = u;
                synchronized (this) {
                    try {
                        U u3 = this.f42958K2;
                        if (u3 == null) {
                            return;
                        }
                        this.f42958K2 = u2;
                        m3258a(u3, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                cancel();
                this.f14218B2.onError(th2);
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f14220D2) {
                return;
            }
            this.f14220D2 = true;
            this.f42957J2.dispose();
            this.f42956I2.cancel();
            if (enter()) {
                this.f14219C2.clear();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            cancel();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f14220D2;
        }

        @Override // p000.ycg
        public void onComplete() {
            synchronized (this) {
                try {
                    U u = this.f42958K2;
                    if (u == null) {
                        return;
                    }
                    this.f42958K2 = null;
                    this.f14219C2.offer(u);
                    this.f14221E2 = true;
                    if (enter()) {
                        xmd.drainMaxLoop(this.f14219C2, this.f14218B2, false, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            cancel();
            this.f14218B2.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f42958K2;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f42956I2, s)) {
                this.f42956I2 = s;
                try {
                    U u = this.f42954G2.get();
                    Objects.requireNonNull(u, "The buffer supplied is null");
                    this.f42958K2 = u;
                    C6758a c6758a = new C6758a(this);
                    this.f42957J2 = c6758a;
                    this.f14218B2.onSubscribe(this);
                    if (this.f14220D2) {
                        return;
                    }
                    s.request(Long.MAX_VALUE);
                    this.f42955H2.subscribe(c6758a);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f14220D2 = true;
                    s.cancel();
                    w05.error(th, this.f14218B2);
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            requested(n);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public boolean accept(ycg<? super U> ycgVar, U u) {
            this.f14218B2.onNext((Object) u);
            return true;
        }
    }

    public h96(l86<T> source, zjd<B> boundary, nfg<U> bufferSupplier) {
        super(source);
        this.f42951c = boundary;
        this.f42952d = bufferSupplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super U> s) {
        this.f49321b.subscribe((kj6) new C6759b(new u1f(s), this.f42952d, this.f42951c));
    }
}
