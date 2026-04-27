package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
@hpe("none")
@ap0(uo0.FULL)
public final class s3b<T> extends rg6<T> {

    /* JADX INFO: renamed from: Q */
    public static final C12421a[] f80537Q = new C12421a[0];

    /* JADX INFO: renamed from: X */
    public static final C12421a[] f80538X = new C12421a[0];

    /* JADX INFO: renamed from: C */
    public final boolean f80539C;

    /* JADX INFO: renamed from: F */
    public volatile ajf<T> f80540F;

    /* JADX INFO: renamed from: H */
    public volatile boolean f80541H;

    /* JADX INFO: renamed from: L */
    public volatile Throwable f80542L;

    /* JADX INFO: renamed from: M */
    public int f80543M;

    /* JADX INFO: renamed from: N */
    public int f80544N;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f80545b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<fdg> f80546c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<C12421a<T>[]> f80547d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f80548e;

    /* JADX INFO: renamed from: f */
    public final int f80549f;

    /* JADX INFO: renamed from: m */
    public final int f80550m;

    /* JADX INFO: renamed from: s3b$a */
    public static final class C12421a<T> extends AtomicLong implements fdg {
        private static final long serialVersionUID = -363282618957264509L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f80551a;

        /* JADX INFO: renamed from: b */
        public final s3b<T> f80552b;

        /* JADX INFO: renamed from: c */
        public long f80553c;

        public C12421a(ycg<? super T> ycgVar, s3b<T> s3bVar) {
            this.f80551a = ycgVar;
            this.f80552b = s3bVar;
        }

        /* JADX INFO: renamed from: a */
        public void m21688a() {
            if (get() != Long.MIN_VALUE) {
                this.f80551a.onComplete();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m21689b(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f80551a.onError(th);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m21690c(T t) {
            if (get() != Long.MIN_VALUE) {
                this.f80553c++;
                this.f80551a.onNext(t);
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f80552b.m21687d(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            long j2;
            long j3;
            if (mdg.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j3 = j2 + j;
                    }
                } while (!compareAndSet(j2, j3 >= 0 ? j3 : Long.MAX_VALUE));
                this.f80552b.m21686c();
            }
        }
    }

    public s3b(int i, boolean z) {
        xjb.verifyPositive(i, "bufferSize");
        this.f80549f = i;
        this.f80550m = i - (i >> 2);
        this.f80545b = new AtomicInteger();
        this.f80547d = new AtomicReference<>(f80537Q);
        this.f80546c = new AtomicReference<>();
        this.f80539C = z;
        this.f80548e = new AtomicBoolean();
    }

    @bfb
    @by1
    public static <T> s3b<T> create() {
        return new s3b<>(m86.bufferSize(), false);
    }

    /* JADX INFO: renamed from: b */
    public boolean m21685b(C12421a<T> c12421a) {
        C12421a<T>[] c12421aArr;
        C12421a[] c12421aArr2;
        do {
            c12421aArr = this.f80547d.get();
            if (c12421aArr == f80538X) {
                return false;
            }
            int length = c12421aArr.length;
            c12421aArr2 = new C12421a[length + 1];
            System.arraycopy(c12421aArr, 0, c12421aArr2, 0, length);
            c12421aArr2[length] = c12421a;
        } while (!v7b.m23844a(this.f80547d, c12421aArr, c12421aArr2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m21686c() {
        T tPoll;
        if (this.f80545b.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<C12421a<T>[]> atomicReference = this.f80547d;
        int i = this.f80543M;
        int i2 = this.f80550m;
        int i3 = this.f80544N;
        int iAddAndGet = 1;
        while (true) {
            ajf<T> ajfVar = this.f80540F;
            if (ajfVar != null) {
                C12421a<T>[] c12421aArr = atomicReference.get();
                if (c12421aArr.length != 0) {
                    int length = c12421aArr.length;
                    long j = -1;
                    long jMin = -1;
                    int i4 = 0;
                    while (i4 < length) {
                        C12421a<T> c12421a = c12421aArr[i4];
                        long j2 = c12421a.get();
                        if (j2 >= 0) {
                            jMin = jMin == j ? j2 - c12421a.f80553c : Math.min(jMin, j2 - c12421a.f80553c);
                        }
                        i4++;
                        j = -1;
                    }
                    int i5 = i;
                    while (jMin > 0) {
                        C12421a<T>[] c12421aArr2 = atomicReference.get();
                        if (c12421aArr2 == f80538X) {
                            ajfVar.clear();
                            return;
                        }
                        if (c12421aArr != c12421aArr2) {
                            break;
                        }
                        boolean z = this.f80541H;
                        try {
                            tPoll = ajfVar.poll();
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            mdg.cancel(this.f80546c);
                            this.f80542L = th;
                            this.f80541H = true;
                            tPoll = null;
                            z = true;
                        }
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            Throwable th2 = this.f80542L;
                            if (th2 != null) {
                                for (C12421a<T> c12421a2 : atomicReference.getAndSet(f80538X)) {
                                    c12421a2.m21689b(th2);
                                }
                                return;
                            }
                            for (C12421a<T> c12421a3 : atomicReference.getAndSet(f80538X)) {
                                c12421a3.m21688a();
                            }
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        for (C12421a<T> c12421a4 : c12421aArr) {
                            c12421a4.m21690c(tPoll);
                        }
                        jMin--;
                        if (i3 != 1 && (i5 = i5 + 1) == i2) {
                            this.f80546c.get().request(i2);
                            i5 = 0;
                        }
                    }
                    if (jMin == 0) {
                        C12421a<T>[] c12421aArr3 = atomicReference.get();
                        C12421a<T>[] c12421aArr4 = f80538X;
                        if (c12421aArr3 == c12421aArr4) {
                            ajfVar.clear();
                            return;
                        }
                        if (c12421aArr != c12421aArr3) {
                            i = i5;
                        } else if (this.f80541H && ajfVar.isEmpty()) {
                            Throwable th3 = this.f80542L;
                            if (th3 != null) {
                                for (C12421a<T> c12421a5 : atomicReference.getAndSet(c12421aArr4)) {
                                    c12421a5.m21689b(th3);
                                }
                                return;
                            }
                            for (C12421a<T> c12421a6 : atomicReference.getAndSet(c12421aArr4)) {
                                c12421a6.m21688a();
                            }
                            return;
                        }
                    }
                    i = i5;
                }
            }
            this.f80543M = i;
            iAddAndGet = this.f80545b.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m21687d(C12421a<T> c12421a) {
        while (true) {
            C12421a<T>[] c12421aArr = this.f80547d.get();
            int length = c12421aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c12421aArr[i] == c12421a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                C12421a[] c12421aArr2 = new C12421a[length - 1];
                System.arraycopy(c12421aArr, 0, c12421aArr2, 0, i);
                System.arraycopy(c12421aArr, i + 1, c12421aArr2, i, (length - i) - 1);
                if (v7b.m23844a(this.f80547d, c12421aArr, c12421aArr2)) {
                    return;
                }
            } else if (this.f80539C) {
                if (v7b.m23844a(this.f80547d, c12421aArr, f80538X)) {
                    mdg.cancel(this.f80546c);
                    this.f80548e.set(true);
                    return;
                }
            } else if (v7b.m23844a(this.f80547d, c12421aArr, f80537Q)) {
                return;
            }
        }
    }

    @Override // p000.rg6
    public Throwable getThrowable() {
        if (this.f80548e.get()) {
            return this.f80542L;
        }
        return null;
    }

    @Override // p000.rg6
    public boolean hasComplete() {
        return this.f80548e.get() && this.f80542L == null;
    }

    @Override // p000.rg6
    public boolean hasSubscribers() {
        return this.f80547d.get().length != 0;
    }

    @Override // p000.rg6
    public boolean hasThrowable() {
        return this.f80548e.get() && this.f80542L != null;
    }

    public boolean offer(T t) {
        if (this.f80548e.get()) {
            return false;
        }
        xjb.requireNonNull(t, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f80544N != 0 || !this.f80540F.offer(t)) {
            return false;
        }
        m21686c();
        return true;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f80548e.compareAndSet(false, true)) {
            this.f80541H = true;
            m21686c();
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f80548e.compareAndSet(false, true)) {
            pfe.onError(th);
            return;
        }
        this.f80542L = th;
        this.f80541H = true;
        m21686c();
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f80548e.get()) {
            return;
        }
        if (this.f80544N == 0) {
            xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.f80540F.offer(t)) {
                mdg.cancel(this.f80546c);
                onError(new cwa());
                return;
            }
        }
        m21686c();
    }

    @Override // p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (mdg.setOnce(this.f80546c, fdgVar)) {
            if (fdgVar instanceof cod) {
                cod codVar = (cod) fdgVar;
                int iRequestFusion = codVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f80544N = iRequestFusion;
                    this.f80540F = codVar;
                    this.f80541H = true;
                    m21686c();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f80544N = iRequestFusion;
                    this.f80540F = codVar;
                    fdgVar.request(this.f80549f);
                    return;
                }
            }
            this.f80540F = new pzf(this.f80549f);
            fdgVar.request(this.f80549f);
        }
    }

    public void start() {
        if (mdg.setOnce(this.f80546c, x05.INSTANCE)) {
            this.f80540F = new pzf(this.f80549f);
        }
    }

    public void startUnbounded() {
        if (mdg.setOnce(this.f80546c, x05.INSTANCE)) {
            this.f80540F = new rzf(this.f80549f);
        }
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        Throwable th;
        C12421a<T> c12421a = new C12421a<>(ycgVar, this);
        ycgVar.onSubscribe(c12421a);
        if (m21685b(c12421a)) {
            if (c12421a.get() == Long.MIN_VALUE) {
                m21687d(c12421a);
                return;
            } else {
                m21686c();
                return;
            }
        }
        if ((this.f80548e.get() || !this.f80539C) && (th = this.f80542L) != null) {
            ycgVar.onError(th);
        } else {
            ycgVar.onComplete();
        }
    }

    @bfb
    @by1
    public static <T> s3b<T> create(boolean z) {
        return new s3b<>(m86.bufferSize(), z);
    }

    @bfb
    @by1
    public static <T> s3b<T> create(int i) {
        return new s3b<>(i, false);
    }

    @bfb
    @by1
    public static <T> s3b<T> create(int i, boolean z) {
        return new s3b<>(i, z);
    }
}
