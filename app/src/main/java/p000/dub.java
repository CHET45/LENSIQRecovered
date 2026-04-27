package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class dub<T> extends ljf<Boolean> implements z07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final xub<? extends T> f30896a;

    /* JADX INFO: renamed from: b */
    public final xub<? extends T> f30897b;

    /* JADX INFO: renamed from: c */
    public final m11<? super T, ? super T> f30898c;

    /* JADX INFO: renamed from: d */
    public final int f30899d;

    /* JADX INFO: renamed from: dub$a */
    public static final class C4955a<T> extends AtomicInteger implements mf4 {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: C */
        public T f30900C;

        /* JADX INFO: renamed from: F */
        public T f30901F;

        /* JADX INFO: renamed from: a */
        public final inf<? super Boolean> f30902a;

        /* JADX INFO: renamed from: b */
        public final m11<? super T, ? super T> f30903b;

        /* JADX INFO: renamed from: c */
        public final x50 f30904c = new x50(2);

        /* JADX INFO: renamed from: d */
        public final xub<? extends T> f30905d;

        /* JADX INFO: renamed from: e */
        public final xub<? extends T> f30906e;

        /* JADX INFO: renamed from: f */
        public final C4956b<T>[] f30907f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f30908m;

        public C4955a(inf<? super Boolean> infVar, int i, xub<? extends T> xubVar, xub<? extends T> xubVar2, m11<? super T, ? super T> m11Var) {
            this.f30902a = infVar;
            this.f30905d = xubVar;
            this.f30906e = xubVar2;
            this.f30903b = m11Var;
            this.f30907f = new C4956b[]{new C4956b<>(this, 0, i), new C4956b<>(this, 1, i)};
        }

        /* JADX INFO: renamed from: a */
        public void m9379a(rzf<T> rzfVar, rzf<T> rzfVar2) {
            this.f30908m = true;
            rzfVar.clear();
            rzfVar2.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m9380b() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            C4956b<T>[] c4956bArr = this.f30907f;
            C4956b<T> c4956b = c4956bArr[0];
            rzf<T> rzfVar = c4956b.f30910b;
            C4956b<T> c4956b2 = c4956bArr[1];
            rzf<T> rzfVar2 = c4956b2.f30910b;
            int iAddAndGet = 1;
            while (!this.f30908m) {
                boolean z = c4956b.f30912d;
                if (z && (th2 = c4956b.f30913e) != null) {
                    m9379a(rzfVar, rzfVar2);
                    this.f30902a.onError(th2);
                    return;
                }
                boolean z2 = c4956b2.f30912d;
                if (z2 && (th = c4956b2.f30913e) != null) {
                    m9379a(rzfVar, rzfVar2);
                    this.f30902a.onError(th);
                    return;
                }
                if (this.f30900C == null) {
                    this.f30900C = rzfVar.poll();
                }
                boolean z3 = this.f30900C == null;
                if (this.f30901F == null) {
                    this.f30901F = rzfVar2.poll();
                }
                T t = this.f30901F;
                boolean z4 = t == null;
                if (z && z2 && z3 && z4) {
                    this.f30902a.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z && z2 && z3 != z4) {
                    m9379a(rzfVar, rzfVar2);
                    this.f30902a.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z3 && !z4) {
                    try {
                        if (!this.f30903b.test(this.f30900C, t)) {
                            m9379a(rzfVar, rzfVar2);
                            this.f30902a.onSuccess(Boolean.FALSE);
                            return;
                        } else {
                            this.f30900C = null;
                            this.f30901F = null;
                        }
                    } catch (Throwable th3) {
                        n75.throwIfFatal(th3);
                        m9379a(rzfVar, rzfVar2);
                        this.f30902a.onError(th3);
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
        public boolean m9381c(mf4 mf4Var, int i) {
            return this.f30904c.setResource(i, mf4Var);
        }

        /* JADX INFO: renamed from: d */
        public void m9382d() {
            C4956b<T>[] c4956bArr = this.f30907f;
            this.f30905d.subscribe(c4956bArr[0]);
            this.f30906e.subscribe(c4956bArr[1]);
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f30908m) {
                return;
            }
            this.f30908m = true;
            this.f30904c.dispose();
            if (getAndIncrement() == 0) {
                C4956b<T>[] c4956bArr = this.f30907f;
                c4956bArr[0].f30910b.clear();
                c4956bArr[1].f30910b.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f30908m;
        }
    }

    /* JADX INFO: renamed from: dub$b */
    public static final class C4956b<T> implements oxb<T> {

        /* JADX INFO: renamed from: a */
        public final C4955a<T> f30909a;

        /* JADX INFO: renamed from: b */
        public final rzf<T> f30910b;

        /* JADX INFO: renamed from: c */
        public final int f30911c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f30912d;

        /* JADX INFO: renamed from: e */
        public Throwable f30913e;

        public C4956b(C4955a<T> c4955a, int i, int i2) {
            this.f30909a = c4955a;
            this.f30911c = i;
            this.f30910b = new rzf<>(i2);
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f30912d = true;
            this.f30909a.m9380b();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f30913e = th;
            this.f30912d = true;
            this.f30909a.m9380b();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f30910b.offer(t);
            this.f30909a.m9380b();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f30909a.m9381c(mf4Var, this.f30911c);
        }
    }

    public dub(xub<? extends T> xubVar, xub<? extends T> xubVar2, m11<? super T, ? super T> m11Var, int i) {
        this.f30896a = xubVar;
        this.f30897b = xubVar2;
        this.f30898c = m11Var;
        this.f30899d = i;
    }

    @Override // p000.z07
    public Observable<Boolean> fuseToObservable() {
        return pfe.onAssembly(new bub(this.f30896a, this.f30897b, this.f30898c, this.f30899d));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        C4955a c4955a = new C4955a(infVar, this.f30899d, this.f30896a, this.f30897b, this.f30898c);
        infVar.onSubscribe(c4955a);
        c4955a.m9382d();
    }
}
