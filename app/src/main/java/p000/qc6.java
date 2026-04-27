package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qc6<T, U> extends AbstractC8162k1<T, U> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends zjd<? extends U>> f73917c;

    /* JADX INFO: renamed from: d */
    public final boolean f73918d;

    /* JADX INFO: renamed from: e */
    public final int f73919e;

    /* JADX INFO: renamed from: f */
    public final int f73920f;

    /* JADX INFO: renamed from: qc6$a */
    public static final class C11423a<T, U> extends AtomicReference<fdg> implements lj6<U>, mf4 {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: C */
        public int f73921C;

        /* JADX INFO: renamed from: a */
        public final long f73922a;

        /* JADX INFO: renamed from: b */
        public final C11424b<T, U> f73923b;

        /* JADX INFO: renamed from: c */
        public final int f73924c;

        /* JADX INFO: renamed from: d */
        public final int f73925d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f73926e;

        /* JADX INFO: renamed from: f */
        public volatile ajf<U> f73927f;

        /* JADX INFO: renamed from: m */
        public long f73928m;

        public C11423a(C11424b<T, U> c11424b, long j) {
            this.f73922a = j;
            this.f73923b = c11424b;
            int i = c11424b.f73945e;
            this.f73925d = i;
            this.f73924c = i >> 2;
        }

        /* JADX INFO: renamed from: a */
        public void m20237a(long j) {
            if (this.f73921C != 1) {
                long j2 = this.f73928m + j;
                if (j2 < this.f73924c) {
                    this.f73928m = j2;
                } else {
                    this.f73928m = 0L;
                    get().request(j2);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            mdg.cancel(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f73926e = true;
            this.f73923b.m20242e();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            lazySet(mdg.CANCELLED);
            this.f73923b.m20246i(this, th);
        }

        @Override // p000.ycg
        public void onNext(U u) {
            if (this.f73921C != 2) {
                this.f73923b.m20248k(u, this);
            } else {
                this.f73923b.m20242e();
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this, fdgVar)) {
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f73921C = iRequestFusion;
                        this.f73927f = codVar;
                        this.f73926e = true;
                        this.f73923b.m20242e();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f73921C = iRequestFusion;
                        this.f73927f = codVar;
                    }
                }
                fdgVar.request(this.f73925d);
            }
        }
    }

    /* JADX INFO: renamed from: qc6$b */
    public static final class C11424b<T, U> extends AtomicInteger implements lj6<T>, fdg {

        /* JADX INFO: renamed from: M1 */
        public static final C11423a<?, ?>[] f73929M1 = new C11423a[0];

        /* JADX INFO: renamed from: V1 */
        public static final C11423a<?, ?>[] f73930V1 = new C11423a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: C */
        public final cc0 f73931C = new cc0();

        /* JADX INFO: renamed from: F */
        public volatile boolean f73932F;

        /* JADX INFO: renamed from: H */
        public final AtomicReference<C11423a<?, ?>[]> f73933H;

        /* JADX INFO: renamed from: L */
        public final AtomicLong f73934L;

        /* JADX INFO: renamed from: M */
        public fdg f73935M;

        /* JADX INFO: renamed from: N */
        public long f73936N;

        /* JADX INFO: renamed from: Q */
        public long f73937Q;

        /* JADX INFO: renamed from: X */
        public int f73938X;

        /* JADX INFO: renamed from: Y */
        public int f73939Y;

        /* JADX INFO: renamed from: Z */
        public final int f73940Z;

        /* JADX INFO: renamed from: a */
        public final ycg<? super U> f73941a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends zjd<? extends U>> f73942b;

        /* JADX INFO: renamed from: c */
        public final boolean f73943c;

        /* JADX INFO: renamed from: d */
        public final int f73944d;

        /* JADX INFO: renamed from: e */
        public final int f73945e;

        /* JADX INFO: renamed from: f */
        public volatile uif<U> f73946f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f73947m;

        public C11424b(ycg<? super U> ycgVar, py6<? super T, ? extends zjd<? extends U>> py6Var, boolean z, int i, int i2) {
            AtomicReference<C11423a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f73933H = atomicReference;
            this.f73934L = new AtomicLong();
            this.f73941a = ycgVar;
            this.f73942b = py6Var;
            this.f73943c = z;
            this.f73944d = i;
            this.f73945e = i2;
            this.f73940Z = Math.max(1, i >> 1);
            atomicReference.lazySet(f73929M1);
        }

        /* JADX INFO: renamed from: a */
        public boolean m20238a(C11423a<T, U> c11423a) {
            C11423a<?, ?>[] c11423aArr;
            C11423a[] c11423aArr2;
            do {
                c11423aArr = this.f73933H.get();
                if (c11423aArr == f73930V1) {
                    c11423a.dispose();
                    return false;
                }
                int length = c11423aArr.length;
                c11423aArr2 = new C11423a[length + 1];
                System.arraycopy(c11423aArr, 0, c11423aArr2, 0, length);
                c11423aArr2[length] = c11423a;
            } while (!v7b.m23844a(this.f73933H, c11423aArr, c11423aArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m20239b() {
            if (this.f73932F) {
                m20240c();
                return true;
            }
            if (this.f73943c || this.f73931C.get() == null) {
                return false;
            }
            m20240c();
            Throwable thTerminate = this.f73931C.terminate();
            if (thTerminate != j75.f49698a) {
                this.f73941a.onError(thTerminate);
            }
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m20240c() {
            uif<U> uifVar = this.f73946f;
            if (uifVar != null) {
                uifVar.clear();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            uif<U> uifVar;
            if (this.f73932F) {
                return;
            }
            this.f73932F = true;
            this.f73935M.cancel();
            m20241d();
            if (getAndIncrement() != 0 || (uifVar = this.f73946f) == null) {
                return;
            }
            uifVar.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m20241d() {
            C11423a<?, ?>[] andSet;
            C11423a<?, ?>[] c11423aArr = this.f73933H.get();
            C11423a<?, ?>[] c11423aArr2 = f73930V1;
            if (c11423aArr == c11423aArr2 || (andSet = this.f73933H.getAndSet(c11423aArr2)) == c11423aArr2) {
                return;
            }
            for (C11423a<?, ?> c11423a : andSet) {
                c11423a.dispose();
            }
            Throwable thTerminate = this.f73931C.terminate();
            if (thTerminate == null || thTerminate == j75.f49698a) {
                return;
            }
            pfe.onError(thTerminate);
        }

        /* JADX INFO: renamed from: e */
        public void m20242e() {
            if (getAndIncrement() == 0) {
                m20243f();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public void m20243f() {
            long j;
            long j2;
            boolean z;
            int i;
            int i2;
            long j3;
            Object obj;
            ycg<? super U> ycgVar = this.f73941a;
            int iAddAndGet = 1;
            while (!m20239b()) {
                uif<U> uifVar = this.f73946f;
                long jAddAndGet = this.f73934L.get();
                boolean z2 = jAddAndGet == Long.MAX_VALUE;
                long j4 = 0;
                long j5 = 0;
                if (uifVar != null) {
                    do {
                        long j6 = 0;
                        obj = null;
                        while (true) {
                            if (jAddAndGet == 0) {
                                break;
                            }
                            U uPoll = uifVar.poll();
                            if (m20239b()) {
                                return;
                            }
                            if (uPoll == null) {
                                obj = uPoll;
                                break;
                            }
                            ycgVar.onNext(uPoll);
                            j5++;
                            j6++;
                            jAddAndGet--;
                            obj = uPoll;
                        }
                        if (j6 != 0) {
                            jAddAndGet = z2 ? Long.MAX_VALUE : this.f73934L.addAndGet(-j6);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                }
                boolean z3 = this.f73947m;
                uif<U> uifVar2 = this.f73946f;
                C11423a<?, ?>[] c11423aArr = this.f73933H.get();
                int length = c11423aArr.length;
                if (z3 && ((uifVar2 == null || uifVar2.isEmpty()) && length == 0)) {
                    Throwable thTerminate = this.f73931C.terminate();
                    if (thTerminate != j75.f49698a) {
                        if (thTerminate == null) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            ycgVar.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                int i3 = iAddAndGet;
                if (length != 0) {
                    long j7 = this.f73937Q;
                    int i4 = this.f73938X;
                    if (length <= i4 || c11423aArr[i4].f73922a != j7) {
                        if (length <= i4) {
                            i4 = 0;
                        }
                        for (int i5 = 0; i5 < length && c11423aArr[i4].f73922a != j7; i5++) {
                            i4++;
                            if (i4 == length) {
                                i4 = 0;
                            }
                        }
                        this.f73938X = i4;
                        this.f73937Q = c11423aArr[i4].f73922a;
                    }
                    int i6 = i4;
                    boolean z4 = false;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            z = z4;
                            break;
                        }
                        if (m20239b()) {
                            return;
                        }
                        C11423a<T, U> c11423a = c11423aArr[i6];
                        Object obj2 = null;
                        while (!m20239b()) {
                            ajf<U> ajfVar = c11423a.f73927f;
                            if (ajfVar == null) {
                                i = length;
                            } else {
                                i = length;
                                Object obj3 = obj2;
                                long j8 = j4;
                                while (true) {
                                    if (jAddAndGet == j4) {
                                        break;
                                    }
                                    try {
                                        U uPoll2 = ajfVar.poll();
                                        if (uPoll2 == null) {
                                            obj3 = uPoll2;
                                            j4 = 0;
                                            break;
                                        }
                                        ycgVar.onNext(uPoll2);
                                        if (m20239b()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j8++;
                                        obj3 = uPoll2;
                                        j4 = 0;
                                    } catch (Throwable th) {
                                        n75.throwIfFatal(th);
                                        c11423a.dispose();
                                        this.f73931C.addThrowable(th);
                                        if (!this.f73943c) {
                                            this.f73935M.cancel();
                                        }
                                        if (m20239b()) {
                                            return;
                                        }
                                        m20247j(c11423a);
                                        i7++;
                                        z4 = true;
                                        i2 = 1;
                                    }
                                }
                                if (j8 != j4) {
                                    jAddAndGet = !z2 ? this.f73934L.addAndGet(-j8) : Long.MAX_VALUE;
                                    c11423a.m20237a(j8);
                                    j3 = 0;
                                } else {
                                    j3 = j4;
                                }
                                if (jAddAndGet != j3 && obj3 != null) {
                                    length = i;
                                    obj2 = obj3;
                                    j4 = 0;
                                }
                            }
                            boolean z5 = c11423a.f73926e;
                            ajf<U> ajfVar2 = c11423a.f73927f;
                            if (z5 && (ajfVar2 == null || ajfVar2.isEmpty())) {
                                m20247j(c11423a);
                                if (m20239b()) {
                                    return;
                                }
                                j5++;
                                z4 = true;
                            }
                            if (jAddAndGet == 0) {
                                z = z4;
                                break;
                            }
                            i6++;
                            if (i6 == i) {
                                i6 = 0;
                            }
                            i2 = 1;
                            i7 += i2;
                            length = i;
                            j4 = 0;
                        }
                        return;
                    }
                    this.f73938X = i6;
                    this.f73937Q = c11423aArr[i6].f73922a;
                    j2 = j5;
                    j = 0;
                } else {
                    j = 0;
                    j2 = j5;
                    z = false;
                }
                if (j2 != j && !this.f73932F) {
                    this.f73935M.request(j2);
                }
                if (z) {
                    iAddAndGet = i3;
                } else {
                    iAddAndGet = addAndGet(-i3);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public ajf<U> m20244g(C11423a<T, U> c11423a) {
            ajf<U> ajfVar = c11423a.f73927f;
            if (ajfVar != null) {
                return ajfVar;
            }
            pzf pzfVar = new pzf(this.f73945e);
            c11423a.f73927f = pzfVar;
            return pzfVar;
        }

        /* JADX INFO: renamed from: h */
        public ajf<U> m20245h() {
            uif<U> rzfVar = this.f73946f;
            if (rzfVar == null) {
                rzfVar = this.f73944d == Integer.MAX_VALUE ? new rzf<>(this.f73945e) : new pzf<>(this.f73944d);
                this.f73946f = rzfVar;
            }
            return rzfVar;
        }

        /* JADX INFO: renamed from: i */
        public void m20246i(C11423a<T, U> c11423a, Throwable th) {
            if (!this.f73931C.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            c11423a.f73926e = true;
            if (!this.f73943c) {
                this.f73935M.cancel();
                for (C11423a<?, ?> c11423a2 : this.f73933H.getAndSet(f73930V1)) {
                    c11423a2.dispose();
                }
            }
            m20242e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: j */
        public void m20247j(C11423a<T, U> c11423a) {
            C11423a<?, ?>[] c11423aArr;
            C11423a<?, ?>[] c11423aArr2;
            do {
                c11423aArr = this.f73933H.get();
                int length = c11423aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c11423aArr[i] == c11423a) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c11423aArr2 = f73929M1;
                } else {
                    C11423a<?, ?>[] c11423aArr3 = new C11423a[length - 1];
                    System.arraycopy(c11423aArr, 0, c11423aArr3, 0, i);
                    System.arraycopy(c11423aArr, i + 1, c11423aArr3, i, (length - i) - 1);
                    c11423aArr2 = c11423aArr3;
                }
            } while (!v7b.m23844a(this.f73933H, c11423aArr, c11423aArr2));
        }

        /* JADX INFO: renamed from: k */
        public void m20248k(U u, C11423a<T, U> c11423a) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f73934L.get();
                ajf<U> ajfVarM20244g = c11423a.f73927f;
                if (j == 0 || !(ajfVarM20244g == null || ajfVarM20244g.isEmpty())) {
                    if (ajfVarM20244g == null) {
                        ajfVarM20244g = m20244g(c11423a);
                    }
                    if (!ajfVarM20244g.offer(u)) {
                        onError(new cwa("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.f73941a.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.f73934L.decrementAndGet();
                    }
                    c11423a.m20237a(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                ajf pzfVar = c11423a.f73927f;
                if (pzfVar == null) {
                    pzfVar = new pzf(this.f73945e);
                    c11423a.f73927f = pzfVar;
                }
                if (!pzfVar.offer(u)) {
                    onError(new cwa("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            m20243f();
        }

        /* JADX INFO: renamed from: l */
        public void m20249l(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f73934L.get();
                ajf<U> ajfVarM20245h = this.f73946f;
                if (j == 0 || !(ajfVarM20245h == null || ajfVarM20245h.isEmpty())) {
                    if (ajfVarM20245h == null) {
                        ajfVarM20245h = m20245h();
                    }
                    if (!ajfVarM20245h.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.f73941a.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.f73934L.decrementAndGet();
                    }
                    if (this.f73944d != Integer.MAX_VALUE && !this.f73932F) {
                        int i = this.f73939Y + 1;
                        this.f73939Y = i;
                        int i2 = this.f73940Z;
                        if (i == i2) {
                            this.f73939Y = 0;
                            this.f73935M.request(i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!m20245h().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            m20243f();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f73947m) {
                return;
            }
            this.f73947m = true;
            m20242e();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f73947m) {
                pfe.onError(th);
                return;
            }
            if (!this.f73931C.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            this.f73947m = true;
            if (!this.f73943c) {
                for (C11423a<?, ?> c11423a : this.f73933H.getAndSet(f73930V1)) {
                    c11423a.dispose();
                }
            }
            m20242e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f73947m) {
                return;
            }
            try {
                zjd zjdVar = (zjd) xjb.requireNonNull(this.f73942b.apply(t), "The mapper returned a null Publisher");
                if (!(zjdVar instanceof Callable)) {
                    long j = this.f73936N;
                    this.f73936N = 1 + j;
                    C11423a c11423a = new C11423a(this, j);
                    if (m20238a(c11423a)) {
                        zjdVar.subscribe(c11423a);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) zjdVar).call();
                    if (objCall != null) {
                        m20249l(objCall);
                        return;
                    }
                    if (this.f73944d == Integer.MAX_VALUE || this.f73932F) {
                        return;
                    }
                    int i = this.f73939Y + 1;
                    this.f73939Y = i;
                    int i2 = this.f73940Z;
                    if (i == i2) {
                        this.f73939Y = 0;
                        this.f73935M.request(i2);
                    }
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f73931C.addThrowable(th);
                    m20242e();
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f73935M.cancel();
                onError(th2);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f73935M, fdgVar)) {
                this.f73935M = fdgVar;
                this.f73941a.onSubscribe(this);
                if (this.f73932F) {
                    return;
                }
                int i = this.f73944d;
                if (i == Integer.MAX_VALUE) {
                    fdgVar.request(Long.MAX_VALUE);
                } else {
                    fdgVar.request(i);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f73934L, j);
                m20242e();
            }
        }
    }

    public qc6(m86<T> m86Var, py6<? super T, ? extends zjd<? extends U>> py6Var, boolean z, int i, int i2) {
        super(m86Var);
        this.f73917c = py6Var;
        this.f73918d = z;
        this.f73919e = i;
        this.f73920f = i2;
    }

    public static <T, U> lj6<T> subscribe(ycg<? super U> ycgVar, py6<? super T, ? extends zjd<? extends U>> py6Var, boolean z, int i, int i2) {
        return new C11424b(ycgVar, py6Var, z, i, i2);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super U> ycgVar) {
        if (ei6.tryScalarXMapSubscribe(this.f52360b, ycgVar, this.f73917c)) {
            return;
        }
        this.f52360b.subscribe((lj6) subscribe(ycgVar, this.f73917c, this.f73918d, this.f73919e, this.f73920f));
    }
}
