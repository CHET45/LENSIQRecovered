package p000;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vob<T, U> extends AbstractC10162o3<T, U> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends xub<? extends U>> f91841b;

    /* JADX INFO: renamed from: c */
    public final boolean f91842c;

    /* JADX INFO: renamed from: d */
    public final int f91843d;

    /* JADX INFO: renamed from: e */
    public final int f91844e;

    /* JADX INFO: renamed from: vob$a */
    public static final class C14181a<T, U> extends AtomicReference<mf4> implements oxb<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: a */
        public final long f91845a;

        /* JADX INFO: renamed from: b */
        public final C14182b<T, U> f91846b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f91847c;

        /* JADX INFO: renamed from: d */
        public volatile ajf<U> f91848d;

        /* JADX INFO: renamed from: e */
        public int f91849e;

        public C14181a(C14182b<T, U> c14182b, long j) {
            this.f91845a = j;
            this.f91846b = c14182b;
        }

        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f91847c = true;
            this.f91846b.m24085d();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f91846b.f91852C.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            C14182b<T, U> c14182b = this.f91846b;
            if (!c14182b.f91863c) {
                c14182b.m24084c();
            }
            this.f91847c = true;
            this.f91846b.m24085d();
        }

        @Override // p000.oxb
        public void onNext(U u) {
            if (this.f91849e == 0) {
                this.f91846b.m24090i(u, this);
            } else {
                this.f91846b.m24085d();
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var) && (mf4Var instanceof umd)) {
                umd umdVar = (umd) mf4Var;
                int iRequestFusion = umdVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f91849e = iRequestFusion;
                    this.f91848d = umdVar;
                    this.f91847c = true;
                    this.f91846b.m24085d();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f91849e = iRequestFusion;
                    this.f91848d = umdVar;
                }
            }
        }
    }

    /* JADX INFO: renamed from: vob$b */
    public static final class C14182b<T, U> extends AtomicInteger implements mf4, oxb<T> {
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: C */
        public final cc0 f91852C = new cc0();

        /* JADX INFO: renamed from: F */
        public volatile boolean f91853F;

        /* JADX INFO: renamed from: H */
        public final AtomicReference<C14181a<?, ?>[]> f91854H;

        /* JADX INFO: renamed from: L */
        public mf4 f91855L;

        /* JADX INFO: renamed from: M */
        public long f91856M;

        /* JADX INFO: renamed from: N */
        public long f91857N;

        /* JADX INFO: renamed from: Q */
        public int f91858Q;

        /* JADX INFO: renamed from: X */
        public Queue<xub<? extends U>> f91859X;

        /* JADX INFO: renamed from: Y */
        public int f91860Y;

        /* JADX INFO: renamed from: a */
        public final oxb<? super U> f91861a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<? extends U>> f91862b;

        /* JADX INFO: renamed from: c */
        public final boolean f91863c;

        /* JADX INFO: renamed from: d */
        public final int f91864d;

        /* JADX INFO: renamed from: e */
        public final int f91865e;

        /* JADX INFO: renamed from: f */
        public volatile uif<U> f91866f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f91867m;

        /* JADX INFO: renamed from: Z */
        public static final C14181a<?, ?>[] f91851Z = new C14181a[0];

        /* JADX INFO: renamed from: M1 */
        public static final C14181a<?, ?>[] f91850M1 = new C14181a[0];

        public C14182b(oxb<? super U> oxbVar, py6<? super T, ? extends xub<? extends U>> py6Var, boolean z, int i, int i2) {
            this.f91861a = oxbVar;
            this.f91862b = py6Var;
            this.f91863c = z;
            this.f91864d = i;
            this.f91865e = i2;
            if (i != Integer.MAX_VALUE) {
                this.f91859X = new ArrayDeque(i);
            }
            this.f91854H = new AtomicReference<>(f91851Z);
        }

        /* JADX INFO: renamed from: a */
        public boolean m24082a(C14181a<T, U> c14181a) {
            C14181a<?, ?>[] c14181aArr;
            C14181a[] c14181aArr2;
            do {
                c14181aArr = this.f91854H.get();
                if (c14181aArr == f91850M1) {
                    c14181a.dispose();
                    return false;
                }
                int length = c14181aArr.length;
                c14181aArr2 = new C14181a[length + 1];
                System.arraycopy(c14181aArr, 0, c14181aArr2, 0, length);
                c14181aArr2[length] = c14181a;
            } while (!v7b.m23844a(this.f91854H, c14181aArr, c14181aArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m24083b() {
            if (this.f91853F) {
                return true;
            }
            Throwable th = this.f91852C.get();
            if (this.f91863c || th == null) {
                return false;
            }
            m24084c();
            Throwable thTerminate = this.f91852C.terminate();
            if (thTerminate != j75.f49698a) {
                this.f91861a.onError(thTerminate);
            }
            return true;
        }

        /* JADX INFO: renamed from: c */
        public boolean m24084c() {
            C14181a<?, ?>[] andSet;
            this.f91855L.dispose();
            C14181a<?, ?>[] c14181aArr = this.f91854H.get();
            C14181a<?, ?>[] c14181aArr2 = f91850M1;
            if (c14181aArr == c14181aArr2 || (andSet = this.f91854H.getAndSet(c14181aArr2)) == c14181aArr2) {
                return false;
            }
            for (C14181a<?, ?> c14181a : andSet) {
                c14181a.dispose();
            }
            return true;
        }

        /* JADX INFO: renamed from: d */
        public void m24085d() {
            if (getAndIncrement() == 0) {
                m24086e();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            Throwable thTerminate;
            if (this.f91853F) {
                return;
            }
            this.f91853F = true;
            if (!m24084c() || (thTerminate = this.f91852C.terminate()) == null || thTerminate == j75.f49698a) {
                return;
            }
            pfe.onError(thTerminate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:113:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:128:0x00fd A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00fc A[PHI: r4
  0x00fc: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:77:0x00db, B:89:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m24086e() {
            /*
                Method dump skipped, instruction units count: 283
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vob.C14182b.m24086e():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public void m24087f(C14181a<T, U> c14181a) {
            C14181a<?, ?>[] c14181aArr;
            C14181a<?, ?>[] c14181aArr2;
            do {
                c14181aArr = this.f91854H.get();
                int length = c14181aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c14181aArr[i] == c14181a) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c14181aArr2 = f91851Z;
                } else {
                    C14181a<?, ?>[] c14181aArr3 = new C14181a[length - 1];
                    System.arraycopy(c14181aArr, 0, c14181aArr3, 0, i);
                    System.arraycopy(c14181aArr, i + 1, c14181aArr3, i, (length - i) - 1);
                    c14181aArr2 = c14181aArr3;
                }
            } while (!v7b.m23844a(this.f91854H, c14181aArr, c14181aArr2));
        }

        /* JADX INFO: renamed from: g */
        public void m24088g(xub<? extends U> xubVar) {
            boolean z;
            while (xubVar instanceof Callable) {
                if (!m24091j((Callable) xubVar) || this.f91864d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        xubVar = this.f91859X.poll();
                        if (xubVar == null) {
                            z = true;
                            this.f91860Y--;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    m24085d();
                    return;
                }
            }
            long j = this.f91856M;
            this.f91856M = 1 + j;
            C14181a<T, U> c14181a = new C14181a<>(this, j);
            if (m24082a(c14181a)) {
                xubVar.subscribe(c14181a);
            }
        }

        /* JADX INFO: renamed from: h */
        public void m24089h(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        xub<? extends U> xubVarPoll = this.f91859X.poll();
                        if (xubVarPoll == null) {
                            this.f91860Y--;
                        } else {
                            m24088g(xubVarPoll);
                        }
                    } finally {
                    }
                }
                i = i2;
            }
        }

        /* JADX INFO: renamed from: i */
        public void m24090i(U u, C14181a<T, U> c14181a) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f91861a.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                ajf rzfVar = c14181a.f91848d;
                if (rzfVar == null) {
                    rzfVar = new rzf(this.f91865e);
                    c14181a.f91848d = rzfVar;
                }
                rzfVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m24086e();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f91853F;
        }

        /* JADX INFO: renamed from: j */
        public boolean m24091j(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f91861a.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    uif<U> rzfVar = this.f91866f;
                    if (rzfVar == null) {
                        rzfVar = this.f91864d == Integer.MAX_VALUE ? new rzf<>(this.f91865e) : new pzf<>(this.f91864d);
                        this.f91866f = rzfVar;
                    }
                    if (!rzfVar.offer(uCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                m24086e();
                return true;
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f91852C.addThrowable(th);
                m24085d();
                return true;
            }
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f91867m) {
                return;
            }
            this.f91867m = true;
            m24085d();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f91867m) {
                pfe.onError(th);
            } else if (!this.f91852C.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f91867m = true;
                m24085d();
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f91867m) {
                return;
            }
            try {
                xub<? extends U> xubVar = (xub) xjb.requireNonNull(this.f91862b.apply(t), "The mapper returned a null ObservableSource");
                if (this.f91864d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.f91860Y;
                            if (i == this.f91864d) {
                                this.f91859X.offer(xubVar);
                                return;
                            }
                            this.f91860Y = i + 1;
                        } finally {
                        }
                    }
                }
                m24088g(xubVar);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f91855L.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f91855L, mf4Var)) {
                this.f91855L = mf4Var;
                this.f91861a.onSubscribe(this);
            }
        }
    }

    public vob(xub<T> xubVar, py6<? super T, ? extends xub<? extends U>> py6Var, boolean z, int i, int i2) {
        super(xubVar);
        this.f91841b = py6Var;
        this.f91842c = z;
        this.f91843d = i;
        this.f91844e = i2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super U> oxbVar) {
        if (utb.tryScalarXMapSubscribe(this.f66354a, oxbVar, this.f91841b)) {
            return;
        }
        this.f66354a.subscribe(new C14182b(oxbVar, this.f91841b, this.f91842c, this.f91843d, this.f91844e));
    }
}
