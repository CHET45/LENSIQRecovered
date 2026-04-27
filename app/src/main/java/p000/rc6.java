package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rc6<T, U> extends AbstractC7714j1<T, U> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends zjd<? extends U>> f77776c;

    /* JADX INFO: renamed from: d */
    public final boolean f77777d;

    /* JADX INFO: renamed from: e */
    public final int f77778e;

    /* JADX INFO: renamed from: f */
    public final int f77779f;

    /* JADX INFO: renamed from: rc6$a */
    public static final class C12011a<T, U> extends AtomicReference<fdg> implements kj6<U>, lf4 {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: C */
        public int f77780C;

        /* JADX INFO: renamed from: a */
        public final long f77781a;

        /* JADX INFO: renamed from: b */
        public final C12012b<T, U> f77782b;

        /* JADX INFO: renamed from: c */
        public final int f77783c;

        /* JADX INFO: renamed from: d */
        public final int f77784d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f77785e;

        /* JADX INFO: renamed from: f */
        public volatile zif<U> f77786f;

        /* JADX INFO: renamed from: m */
        public long f77787m;

        public C12011a(C12012b<T, U> parent, int bufferSize, long id) {
            this.f77781a = id;
            this.f77782b = parent;
            this.f77784d = bufferSize;
            this.f77783c = bufferSize >> 2;
        }

        /* JADX INFO: renamed from: a */
        public void m21151a(long n) {
            if (this.f77780C != 1) {
                long j = this.f77787m + n;
                if (j < this.f77783c) {
                    this.f77787m = j;
                } else {
                    this.f77787m = 0L;
                    get().request(j);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            ldg.cancel(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f77785e = true;
            this.f77782b.m21156e();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            lazySet(ldg.CANCELLED);
            this.f77782b.m21159h(this, t);
        }

        @Override // p000.ycg
        public void onNext(U t) {
            if (this.f77780C != 2) {
                this.f77782b.m21161j(t, this);
            } else {
                this.f77782b.m21156e();
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.setOnce(this, s)) {
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f77780C = iRequestFusion;
                        this.f77786f = bodVar;
                        this.f77785e = true;
                        this.f77782b.m21156e();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f77780C = iRequestFusion;
                        this.f77786f = bodVar;
                    }
                }
                s.request(this.f77784d);
            }
        }
    }

    /* JADX INFO: renamed from: rc6$b */
    public static final class C12012b<T, U> extends AtomicInteger implements kj6<T>, fdg {

        /* JADX INFO: renamed from: M1 */
        public static final C12011a<?, ?>[] f77788M1 = new C12011a[0];

        /* JADX INFO: renamed from: V1 */
        public static final C12011a<?, ?>[] f77789V1 = new C12011a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: C */
        public final bc0 f77790C = new bc0();

        /* JADX INFO: renamed from: F */
        public volatile boolean f77791F;

        /* JADX INFO: renamed from: H */
        public final AtomicReference<C12011a<?, ?>[]> f77792H;

        /* JADX INFO: renamed from: L */
        public final AtomicLong f77793L;

        /* JADX INFO: renamed from: M */
        public fdg f77794M;

        /* JADX INFO: renamed from: N */
        public long f77795N;

        /* JADX INFO: renamed from: Q */
        public long f77796Q;

        /* JADX INFO: renamed from: X */
        public int f77797X;

        /* JADX INFO: renamed from: Y */
        public int f77798Y;

        /* JADX INFO: renamed from: Z */
        public final int f77799Z;

        /* JADX INFO: renamed from: a */
        public final ycg<? super U> f77800a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends zjd<? extends U>> f77801b;

        /* JADX INFO: renamed from: c */
        public final boolean f77802c;

        /* JADX INFO: renamed from: d */
        public final int f77803d;

        /* JADX INFO: renamed from: e */
        public final int f77804e;

        /* JADX INFO: renamed from: f */
        public volatile tif<U> f77805f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f77806m;

        public C12012b(ycg<? super U> actual, sy6<? super T, ? extends zjd<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
            AtomicReference<C12011a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f77792H = atomicReference;
            this.f77793L = new AtomicLong();
            this.f77800a = actual;
            this.f77801b = mapper;
            this.f77802c = delayErrors;
            this.f77803d = maxConcurrency;
            this.f77804e = bufferSize;
            this.f77799Z = Math.max(1, maxConcurrency >> 1);
            atomicReference.lazySet(f77788M1);
        }

        /* JADX INFO: renamed from: a */
        public boolean m21152a(C12011a<T, U> inner) {
            C12011a<?, ?>[] c12011aArr;
            C12011a[] c12011aArr2;
            do {
                c12011aArr = this.f77792H.get();
                if (c12011aArr == f77789V1) {
                    inner.dispose();
                    return false;
                }
                int length = c12011aArr.length;
                c12011aArr2 = new C12011a[length + 1];
                System.arraycopy(c12011aArr, 0, c12011aArr2, 0, length);
                c12011aArr2[length] = inner;
            } while (!v7b.m23844a(this.f77792H, c12011aArr, c12011aArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m21153b() {
            if (this.f77791F) {
                m21154c();
                return true;
            }
            if (this.f77802c || this.f77790C.get() == null) {
                return false;
            }
            m21154c();
            this.f77790C.tryTerminateConsumer(this.f77800a);
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m21154c() {
            tif<U> tifVar = this.f77805f;
            if (tifVar != null) {
                tifVar.clear();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            tif<U> tifVar;
            if (this.f77791F) {
                return;
            }
            this.f77791F = true;
            this.f77794M.cancel();
            m21155d();
            if (getAndIncrement() != 0 || (tifVar = this.f77805f) == null) {
                return;
            }
            tifVar.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m21155d() {
            AtomicReference<C12011a<?, ?>[]> atomicReference = this.f77792H;
            C12011a<?, ?>[] c12011aArr = f77789V1;
            C12011a<?, ?>[] andSet = atomicReference.getAndSet(c12011aArr);
            if (andSet != c12011aArr) {
                for (C12011a<?, ?> c12011a : andSet) {
                    c12011a.dispose();
                }
                this.f77790C.tryTerminateAndReport();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m21156e() {
            if (getAndIncrement() == 0) {
                m21157f();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public void m21157f() {
            long j;
            long j2;
            long j3;
            boolean z;
            int i;
            int i2;
            long j4;
            long j5;
            ycg<? super U> ycgVar = this.f77800a;
            int iAddAndGet = 1;
            while (!m21153b()) {
                tif<U> tifVar = this.f77805f;
                long jAddAndGet = this.f77793L.get();
                boolean z2 = jAddAndGet == Long.MAX_VALUE;
                long j6 = 0;
                if (tifVar != null) {
                    long j7 = 0;
                    j = 0;
                    while (jAddAndGet != 0) {
                        U uPoll = tifVar.poll();
                        if (m21153b()) {
                            return;
                        }
                        if (uPoll == null) {
                            break;
                        }
                        ycgVar.onNext(uPoll);
                        j++;
                        j7++;
                        jAddAndGet--;
                    }
                    if (j7 != 0) {
                        jAddAndGet = z2 ? Long.MAX_VALUE : this.f77793L.addAndGet(-j7);
                    }
                } else {
                    j = 0;
                }
                boolean z3 = this.f77806m;
                tif<U> tifVar2 = this.f77805f;
                C12011a<?, ?>[] c12011aArr = this.f77792H.get();
                int length = c12011aArr.length;
                if (z3 && ((tifVar2 == null || tifVar2.isEmpty()) && length == 0)) {
                    this.f77790C.tryTerminateConsumer(this.f77800a);
                    return;
                }
                int i3 = iAddAndGet;
                if (length != 0) {
                    long j8 = this.f77796Q;
                    int i4 = this.f77797X;
                    if (length <= i4 || c12011aArr[i4].f77781a != j8) {
                        if (length <= i4) {
                            i4 = 0;
                        }
                        for (int i5 = 0; i5 < length && c12011aArr[i4].f77781a != j8; i5++) {
                            i4++;
                            if (i4 == length) {
                                i4 = 0;
                            }
                        }
                        this.f77797X = i4;
                        this.f77796Q = c12011aArr[i4].f77781a;
                    }
                    int i6 = i4;
                    boolean z4 = false;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            z = z4;
                            break;
                        }
                        if (m21153b()) {
                            return;
                        }
                        C12011a<T, U> c12011a = c12011aArr[i6];
                        Object obj = null;
                        while (true) {
                            zif<U> zifVar = c12011a.f77786f;
                            if (zifVar == null) {
                                i = length;
                                break;
                            }
                            i = length;
                            Object obj2 = obj;
                            long j9 = j6;
                            while (true) {
                                if (jAddAndGet == j6) {
                                    j4 = j6;
                                    break;
                                }
                                if (m21153b()) {
                                    return;
                                }
                                try {
                                    U uPoll2 = zifVar.poll();
                                    if (uPoll2 == null) {
                                        obj2 = uPoll2;
                                        j4 = 0;
                                        break;
                                    } else {
                                        ycgVar.onNext(uPoll2);
                                        jAddAndGet--;
                                        j9++;
                                        obj2 = uPoll2;
                                        j6 = 0;
                                    }
                                } catch (Throwable th) {
                                    o75.throwIfFatal(th);
                                    c12011a.dispose();
                                    this.f77790C.tryAddThrowableOrReport(th);
                                    if (!this.f77802c) {
                                        this.f77794M.cancel();
                                    }
                                    if (m21153b()) {
                                        return;
                                    }
                                    m21160i(c12011a);
                                    i7++;
                                    i2 = i;
                                    z4 = true;
                                }
                            }
                            if (j9 != j4) {
                                jAddAndGet = !z2 ? this.f77793L.addAndGet(-j9) : Long.MAX_VALUE;
                                c12011a.m21151a(j9);
                                j5 = 0;
                            } else {
                                j5 = j4;
                            }
                            if (jAddAndGet == j5 || obj2 == null) {
                                break;
                            }
                            length = i;
                            obj = obj2;
                            j6 = 0;
                        }
                        boolean z5 = c12011a.f77785e;
                        zif<U> zifVar2 = c12011a.f77786f;
                        if (z5 && (zifVar2 == null || zifVar2.isEmpty())) {
                            m21160i(c12011a);
                            if (m21153b()) {
                                return;
                            }
                            j++;
                            z4 = true;
                        }
                        if (jAddAndGet == 0) {
                            z = z4;
                            break;
                        }
                        i6++;
                        i2 = i;
                        if (i6 == i2) {
                            i6 = 0;
                        }
                        i7++;
                        length = i2;
                        j6 = 0;
                    }
                    this.f77797X = i6;
                    this.f77796Q = c12011aArr[i6].f77781a;
                    j3 = j;
                    j2 = 0;
                } else {
                    j2 = 0;
                    j3 = j;
                    z = false;
                }
                if (j3 != j2 && !this.f77791F) {
                    this.f77794M.request(j3);
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
        public zif<U> m21158g() {
            tif<U> qzfVar = this.f77805f;
            if (qzfVar == null) {
                qzfVar = this.f77803d == Integer.MAX_VALUE ? new qzf<>(this.f77804e) : new ozf<>(this.f77803d);
                this.f77805f = qzfVar;
            }
            return qzfVar;
        }

        /* JADX INFO: renamed from: h */
        public void m21159h(C12011a<T, U> inner, Throwable t) {
            if (this.f77790C.tryAddThrowableOrReport(t)) {
                inner.f77785e = true;
                if (!this.f77802c) {
                    this.f77794M.cancel();
                    for (C12011a<?, ?> c12011a : this.f77792H.getAndSet(f77789V1)) {
                        c12011a.dispose();
                    }
                }
                m21156e();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public void m21160i(C12011a<T, U> inner) {
            C12011a<?, ?>[] c12011aArr;
            C12011a<?, ?>[] c12011aArr2;
            do {
                c12011aArr = this.f77792H.get();
                int length = c12011aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c12011aArr[i] == inner) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c12011aArr2 = f77788M1;
                } else {
                    C12011a<?, ?>[] c12011aArr3 = new C12011a[length - 1];
                    System.arraycopy(c12011aArr, 0, c12011aArr3, 0, i);
                    System.arraycopy(c12011aArr, i + 1, c12011aArr3, i, (length - i) - 1);
                    c12011aArr2 = c12011aArr3;
                }
            } while (!v7b.m23844a(this.f77792H, c12011aArr, c12011aArr2));
        }

        /* JADX INFO: renamed from: j */
        public void m21161j(U value, C12011a<T, U> inner) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f77793L.get();
                zif ozfVar = inner.f77786f;
                if (j == 0 || !(ozfVar == null || ozfVar.isEmpty())) {
                    if (ozfVar == null) {
                        ozfVar = new ozf(this.f77804e);
                        inner.f77786f = ozfVar;
                    }
                    if (!ozfVar.offer(value)) {
                        onError(new bwa("Inner queue full?!"));
                    }
                } else {
                    this.f77800a.onNext(value);
                    if (j != Long.MAX_VALUE) {
                        this.f77793L.decrementAndGet();
                    }
                    inner.m21151a(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                zif ozfVar2 = inner.f77786f;
                if (ozfVar2 == null) {
                    ozfVar2 = new ozf(this.f77804e);
                    inner.f77786f = ozfVar2;
                }
                if (!ozfVar2.offer(value)) {
                    onError(new bwa("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            m21157f();
        }

        /* JADX INFO: renamed from: k */
        public void m21162k(U value) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f77793L.get();
                zif<U> zifVarM21158g = this.f77805f;
                if (j == 0 || !(zifVarM21158g == null || zifVarM21158g.isEmpty())) {
                    if (zifVarM21158g == null) {
                        zifVarM21158g = m21158g();
                    }
                    if (!zifVarM21158g.offer(value)) {
                        onError(new bwa("Scalar queue full?!"));
                    }
                } else {
                    this.f77800a.onNext(value);
                    if (j != Long.MAX_VALUE) {
                        this.f77793L.decrementAndGet();
                    }
                    if (this.f77803d != Integer.MAX_VALUE && !this.f77791F) {
                        int i = this.f77798Y + 1;
                        this.f77798Y = i;
                        int i2 = this.f77799Z;
                        if (i == i2) {
                            this.f77798Y = 0;
                            this.f77794M.request(i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!m21158g().offer(value)) {
                onError(new bwa("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            m21157f();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f77806m) {
                return;
            }
            this.f77806m = true;
            m21156e();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f77806m) {
                ofe.onError(t);
                return;
            }
            if (this.f77790C.tryAddThrowableOrReport(t)) {
                this.f77806m = true;
                if (!this.f77802c) {
                    for (C12011a<?, ?> c12011a : this.f77792H.getAndSet(f77789V1)) {
                        c12011a.dispose();
                    }
                }
                m21156e();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f77806m) {
                return;
            }
            try {
                zjd<? extends U> zjdVarApply = this.f77801b.apply(t);
                Objects.requireNonNull(zjdVarApply, "The mapper returned a null Publisher");
                zjd<? extends U> zjdVar = zjdVarApply;
                if (!(zjdVar instanceof nfg)) {
                    int i = this.f77804e;
                    long j = this.f77795N;
                    this.f77795N = 1 + j;
                    C12011a c12011a = new C12011a(this, i, j);
                    if (m21152a(c12011a)) {
                        zjdVar.subscribe(c12011a);
                        return;
                    }
                    return;
                }
                try {
                    Object obj = ((nfg) zjdVar).get();
                    if (obj != null) {
                        m21162k(obj);
                        return;
                    }
                    if (this.f77803d == Integer.MAX_VALUE || this.f77791F) {
                        return;
                    }
                    int i2 = this.f77798Y + 1;
                    this.f77798Y = i2;
                    int i3 = this.f77799Z;
                    if (i2 == i3) {
                        this.f77798Y = 0;
                        this.f77794M.request(i3);
                    }
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f77790C.tryAddThrowableOrReport(th);
                    m21156e();
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                this.f77794M.cancel();
                onError(th2);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f77794M, s)) {
                this.f77794M = s;
                this.f77800a.onSubscribe(this);
                if (this.f77791F) {
                    return;
                }
                int i = this.f77803d;
                if (i == Integer.MAX_VALUE) {
                    s.request(Long.MAX_VALUE);
                } else {
                    s.request(i);
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f77793L, n);
                m21156e();
            }
        }
    }

    public rc6(l86<T> source, sy6<? super T, ? extends zjd<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
        super(source);
        this.f77776c = mapper;
        this.f77777d = delayErrors;
        this.f77778e = maxConcurrency;
        this.f77779f = bufferSize;
    }

    public static <T, U> kj6<T> subscribe(ycg<? super U> s, sy6<? super T, ? extends zjd<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
        return new C12012b(s, mapper, delayErrors, maxConcurrency, bufferSize);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super U> s) {
        if (fi6.tryScalarXMapSubscribe(this.f49321b, s, this.f77776c)) {
            return;
        }
        this.f49321b.subscribe((kj6) subscribe(s, this.f77776c, this.f77777d, this.f77778e, this.f77779f));
    }
}
