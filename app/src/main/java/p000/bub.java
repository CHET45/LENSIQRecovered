package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class bub<T> extends Observable<Boolean> {

    /* JADX INFO: renamed from: a */
    public final xub<? extends T> f14798a;

    /* JADX INFO: renamed from: b */
    public final xub<? extends T> f14799b;

    /* JADX INFO: renamed from: c */
    public final m11<? super T, ? super T> f14800c;

    /* JADX INFO: renamed from: d */
    public final int f14801d;

    /* JADX INFO: renamed from: bub$a */
    public static final class C2057a<T> extends AtomicInteger implements mf4 {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: C */
        public T f14802C;

        /* JADX INFO: renamed from: F */
        public T f14803F;

        /* JADX INFO: renamed from: a */
        public final oxb<? super Boolean> f14804a;

        /* JADX INFO: renamed from: b */
        public final m11<? super T, ? super T> f14805b;

        /* JADX INFO: renamed from: c */
        public final x50 f14806c = new x50(2);

        /* JADX INFO: renamed from: d */
        public final xub<? extends T> f14807d;

        /* JADX INFO: renamed from: e */
        public final xub<? extends T> f14808e;

        /* JADX INFO: renamed from: f */
        public final C2058b<T>[] f14809f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f14810m;

        public C2057a(oxb<? super Boolean> oxbVar, int i, xub<? extends T> xubVar, xub<? extends T> xubVar2, m11<? super T, ? super T> m11Var) {
            this.f14804a = oxbVar;
            this.f14807d = xubVar;
            this.f14808e = xubVar2;
            this.f14805b = m11Var;
            this.f14809f = new C2058b[]{new C2058b<>(this, 0, i), new C2058b<>(this, 1, i)};
        }

        /* JADX INFO: renamed from: a */
        public void m3425a(rzf<T> rzfVar, rzf<T> rzfVar2) {
            this.f14810m = true;
            rzfVar.clear();
            rzfVar2.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m3426b() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            C2058b<T>[] c2058bArr = this.f14809f;
            C2058b<T> c2058b = c2058bArr[0];
            rzf<T> rzfVar = c2058b.f14812b;
            C2058b<T> c2058b2 = c2058bArr[1];
            rzf<T> rzfVar2 = c2058b2.f14812b;
            int iAddAndGet = 1;
            while (!this.f14810m) {
                boolean z = c2058b.f14814d;
                if (z && (th2 = c2058b.f14815e) != null) {
                    m3425a(rzfVar, rzfVar2);
                    this.f14804a.onError(th2);
                    return;
                }
                boolean z2 = c2058b2.f14814d;
                if (z2 && (th = c2058b2.f14815e) != null) {
                    m3425a(rzfVar, rzfVar2);
                    this.f14804a.onError(th);
                    return;
                }
                if (this.f14802C == null) {
                    this.f14802C = rzfVar.poll();
                }
                boolean z3 = this.f14802C == null;
                if (this.f14803F == null) {
                    this.f14803F = rzfVar2.poll();
                }
                T t = this.f14803F;
                boolean z4 = t == null;
                if (z && z2 && z3 && z4) {
                    this.f14804a.onNext(Boolean.TRUE);
                    this.f14804a.onComplete();
                    return;
                }
                if (z && z2 && z3 != z4) {
                    m3425a(rzfVar, rzfVar2);
                    this.f14804a.onNext(Boolean.FALSE);
                    this.f14804a.onComplete();
                    return;
                }
                if (!z3 && !z4) {
                    try {
                        if (!this.f14805b.test(this.f14802C, t)) {
                            m3425a(rzfVar, rzfVar2);
                            this.f14804a.onNext(Boolean.FALSE);
                            this.f14804a.onComplete();
                            return;
                        }
                        this.f14802C = null;
                        this.f14803F = null;
                    } catch (Throwable th3) {
                        n75.throwIfFatal(th3);
                        m3425a(rzfVar, rzfVar2);
                        this.f14804a.onError(th3);
                        return;
                    }
                }
                if (z3 || z4) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            rzfVar.clear();
            rzfVar2.clear();
        }

        /* JADX INFO: renamed from: c */
        public boolean m3427c(mf4 mf4Var, int i) {
            return this.f14806c.setResource(i, mf4Var);
        }

        /* JADX INFO: renamed from: d */
        public void m3428d() {
            C2058b<T>[] c2058bArr = this.f14809f;
            this.f14807d.subscribe(c2058bArr[0]);
            this.f14808e.subscribe(c2058bArr[1]);
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f14810m) {
                return;
            }
            this.f14810m = true;
            this.f14806c.dispose();
            if (getAndIncrement() == 0) {
                C2058b<T>[] c2058bArr = this.f14809f;
                c2058bArr[0].f14812b.clear();
                c2058bArr[1].f14812b.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f14810m;
        }
    }

    /* JADX INFO: renamed from: bub$b */
    public static final class C2058b<T> implements oxb<T> {

        /* JADX INFO: renamed from: a */
        public final C2057a<T> f14811a;

        /* JADX INFO: renamed from: b */
        public final rzf<T> f14812b;

        /* JADX INFO: renamed from: c */
        public final int f14813c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f14814d;

        /* JADX INFO: renamed from: e */
        public Throwable f14815e;

        public C2058b(C2057a<T> c2057a, int i, int i2) {
            this.f14811a = c2057a;
            this.f14813c = i;
            this.f14812b = new rzf<>(i2);
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f14814d = true;
            this.f14811a.m3426b();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f14815e = th;
            this.f14814d = true;
            this.f14811a.m3426b();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f14812b.offer(t);
            this.f14811a.m3426b();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f14811a.m3427c(mf4Var, this.f14813c);
        }
    }

    public bub(xub<? extends T> xubVar, xub<? extends T> xubVar2, m11<? super T, ? super T> m11Var, int i) {
        this.f14798a = xubVar;
        this.f14799b = xubVar2;
        this.f14800c = m11Var;
        this.f14801d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Boolean> oxbVar) {
        C2057a c2057a = new C2057a(oxbVar, this.f14801d, this.f14798a, this.f14799b, this.f14800c);
        oxbVar.onSubscribe(c2057a);
        c2057a.m3428d();
    }
}
