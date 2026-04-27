package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
@gpe("none")
@zo0(to0.FULL)
public final class t3b<T> extends qg6<T> {

    /* JADX INFO: renamed from: N */
    public static final C12900a[] f83618N = new C12900a[0];

    /* JADX INFO: renamed from: Q */
    public static final C12900a[] f83619Q = new C12900a[0];

    /* JADX INFO: renamed from: C */
    public volatile zif<T> f83620C;

    /* JADX INFO: renamed from: F */
    public volatile boolean f83621F;

    /* JADX INFO: renamed from: H */
    public volatile Throwable f83622H;

    /* JADX INFO: renamed from: L */
    public int f83623L;

    /* JADX INFO: renamed from: M */
    public int f83624M;

    /* JADX INFO: renamed from: e */
    public final int f83628e;

    /* JADX INFO: renamed from: f */
    public final int f83629f;

    /* JADX INFO: renamed from: m */
    public final boolean f83630m;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f83625b = new AtomicInteger();

    /* JADX INFO: renamed from: d */
    public final AtomicReference<C12900a<T>[]> f83627d = new AtomicReference<>(f83618N);

    /* JADX INFO: renamed from: c */
    public final AtomicReference<fdg> f83626c = new AtomicReference<>();

    /* JADX INFO: renamed from: t3b$a */
    public static final class C12900a<T> extends AtomicLong implements fdg {
        private static final long serialVersionUID = -363282618957264509L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f83631a;

        /* JADX INFO: renamed from: b */
        public final t3b<T> f83632b;

        /* JADX INFO: renamed from: c */
        public long f83633c;

        public C12900a(ycg<? super T> actual, t3b<T> parent) {
            this.f83631a = actual;
            this.f83632b = parent;
        }

        /* JADX INFO: renamed from: a */
        public void m22355a() {
            if (get() != Long.MIN_VALUE) {
                this.f83631a.onComplete();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m22356b(Throwable t) {
            if (get() != Long.MIN_VALUE) {
                this.f83631a.onError(t);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m22357c(T t) {
            if (get() != Long.MIN_VALUE) {
                this.f83633c++;
                this.f83631a.onNext(t);
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f83632b.m22354d(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                long jAddCancel = ro0.addCancel(this, n);
                if (jAddCancel == Long.MIN_VALUE || jAddCancel == Long.MAX_VALUE) {
                    return;
                }
                this.f83632b.m22353c();
            }
        }
    }

    public t3b(int bufferSize, boolean refCount) {
        this.f83628e = bufferSize;
        this.f83629f = bufferSize - (bufferSize >> 2);
        this.f83630m = refCount;
    }

    @cfb
    @cy1
    public static <T> t3b<T> create() {
        return new t3b<>(l86.bufferSize(), false);
    }

    /* JADX INFO: renamed from: b */
    public boolean m22352b(C12900a<T> inner) {
        C12900a<T>[] c12900aArr;
        C12900a[] c12900aArr2;
        do {
            c12900aArr = this.f83627d.get();
            if (c12900aArr == f83619Q) {
                return false;
            }
            int length = c12900aArr.length;
            c12900aArr2 = new C12900a[length + 1];
            System.arraycopy(c12900aArr, 0, c12900aArr2, 0, length);
            c12900aArr2[length] = inner;
        } while (!v7b.m23844a(this.f83627d, c12900aArr, c12900aArr2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m22353c() {
        T tPoll;
        if (this.f83625b.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<C12900a<T>[]> atomicReference = this.f83627d;
        int i = this.f83623L;
        int i2 = this.f83629f;
        int i3 = this.f83624M;
        int iAddAndGet = 1;
        while (true) {
            zif<T> zifVar = this.f83620C;
            if (zifVar != null) {
                C12900a<T>[] c12900aArr = atomicReference.get();
                if (c12900aArr.length != 0) {
                    int length = c12900aArr.length;
                    long j = -1;
                    long jMin = -1;
                    int i4 = 0;
                    while (i4 < length) {
                        C12900a<T> c12900a = c12900aArr[i4];
                        long j2 = c12900a.get();
                        if (j2 >= 0) {
                            jMin = jMin == j ? j2 - c12900a.f83633c : Math.min(jMin, j2 - c12900a.f83633c);
                        }
                        i4++;
                        j = -1;
                    }
                    int i5 = i;
                    while (jMin > 0) {
                        C12900a<T>[] c12900aArr2 = atomicReference.get();
                        if (c12900aArr2 == f83619Q) {
                            zifVar.clear();
                            return;
                        }
                        if (c12900aArr != c12900aArr2) {
                            break;
                        }
                        boolean z = this.f83621F;
                        try {
                            tPoll = zifVar.poll();
                        } catch (Throwable th) {
                            o75.throwIfFatal(th);
                            ldg.cancel(this.f83626c);
                            this.f83622H = th;
                            this.f83621F = true;
                            tPoll = null;
                            z = true;
                        }
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            Throwable th2 = this.f83622H;
                            if (th2 != null) {
                                for (C12900a<T> c12900a2 : atomicReference.getAndSet(f83619Q)) {
                                    c12900a2.m22356b(th2);
                                }
                                return;
                            }
                            for (C12900a<T> c12900a3 : atomicReference.getAndSet(f83619Q)) {
                                c12900a3.m22355a();
                            }
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        for (C12900a<T> c12900a4 : c12900aArr) {
                            c12900a4.m22357c(tPoll);
                        }
                        jMin--;
                        if (i3 != 1 && (i5 = i5 + 1) == i2) {
                            this.f83626c.get().request(i2);
                            i5 = 0;
                        }
                    }
                    if (jMin == 0) {
                        C12900a<T>[] c12900aArr3 = atomicReference.get();
                        C12900a<T>[] c12900aArr4 = f83619Q;
                        if (c12900aArr3 == c12900aArr4) {
                            zifVar.clear();
                            return;
                        }
                        if (c12900aArr != c12900aArr3) {
                            i = i5;
                        } else if (this.f83621F && zifVar.isEmpty()) {
                            Throwable th3 = this.f83622H;
                            if (th3 != null) {
                                for (C12900a<T> c12900a5 : atomicReference.getAndSet(c12900aArr4)) {
                                    c12900a5.m22356b(th3);
                                }
                                return;
                            }
                            for (C12900a<T> c12900a6 : atomicReference.getAndSet(c12900aArr4)) {
                                c12900a6.m22355a();
                            }
                            return;
                        }
                    }
                    i = i5;
                }
            }
            this.f83623L = i;
            iAddAndGet = this.f83625b.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m22354d(C12900a<T> inner) {
        while (true) {
            C12900a<T>[] c12900aArr = this.f83627d.get();
            int length = c12900aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c12900aArr[i] == inner) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                C12900a[] c12900aArr2 = new C12900a[length - 1];
                System.arraycopy(c12900aArr, 0, c12900aArr2, 0, i);
                System.arraycopy(c12900aArr, i + 1, c12900aArr2, i, (length - i) - 1);
                if (v7b.m23844a(this.f83627d, c12900aArr, c12900aArr2)) {
                    return;
                }
            } else if (this.f83630m) {
                if (v7b.m23844a(this.f83627d, c12900aArr, f83619Q)) {
                    ldg.cancel(this.f83626c);
                    this.f83621F = true;
                    return;
                }
            } else if (v7b.m23844a(this.f83627d, c12900aArr, f83618N)) {
                return;
            }
        }
    }

    @Override // p000.qg6
    @cy1
    public Throwable getThrowable() {
        if (this.f83621F) {
            return this.f83622H;
        }
        return null;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasComplete() {
        return this.f83621F && this.f83622H == null;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasSubscribers() {
        return this.f83627d.get().length != 0;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasThrowable() {
        return this.f83621F && this.f83622H != null;
    }

    @cy1
    public boolean offer(@cfb T t) {
        k75.nullCheck(t, "offer called with a null value.");
        if (this.f83621F) {
            return false;
        }
        if (this.f83624M != 0) {
            throw new IllegalStateException("offer() should not be called in fusion mode!");
        }
        if (!this.f83620C.offer(t)) {
            return false;
        }
        m22353c();
        return true;
    }

    @Override // p000.ycg
    public void onComplete() {
        this.f83621F = true;
        m22353c();
    }

    @Override // p000.ycg
    public void onError(@cfb Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        if (this.f83621F) {
            ofe.onError(t);
            return;
        }
        this.f83622H = t;
        this.f83621F = true;
        m22353c();
    }

    @Override // p000.ycg
    public void onNext(@cfb T t) {
        if (this.f83621F) {
            return;
        }
        if (this.f83624M == 0) {
            k75.nullCheck(t, "onNext called with a null value.");
            if (!this.f83620C.offer(t)) {
                ldg.cancel(this.f83626c);
                onError(new bwa());
                return;
            }
        }
        m22353c();
    }

    @Override // p000.ycg
    public void onSubscribe(@cfb fdg s) {
        if (ldg.setOnce(this.f83626c, s)) {
            if (s instanceof bod) {
                bod bodVar = (bod) s;
                int iRequestFusion = bodVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f83624M = iRequestFusion;
                    this.f83620C = bodVar;
                    this.f83621F = true;
                    m22353c();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f83624M = iRequestFusion;
                    this.f83620C = bodVar;
                    s.request(this.f83628e);
                    return;
                }
            }
            this.f83620C = new ozf(this.f83628e);
            s.request(this.f83628e);
        }
    }

    public void start() {
        if (ldg.setOnce(this.f83626c, w05.INSTANCE)) {
            this.f83620C = new ozf(this.f83628e);
        }
    }

    public void startUnbounded() {
        if (ldg.setOnce(this.f83626c, w05.INSTANCE)) {
            this.f83620C = new qzf(this.f83628e);
        }
    }

    @Override // p000.l86
    public void subscribeActual(@cfb ycg<? super T> s) {
        Throwable th;
        C12900a<T> c12900a = new C12900a<>(s, this);
        s.onSubscribe(c12900a);
        if (m22352b(c12900a)) {
            if (c12900a.get() == Long.MIN_VALUE) {
                m22354d(c12900a);
                return;
            } else {
                m22353c();
                return;
            }
        }
        if (!this.f83621F || (th = this.f83622H) == null) {
            s.onComplete();
        } else {
            s.onError(th);
        }
    }

    @cfb
    @cy1
    public static <T> t3b<T> create(boolean refCount) {
        return new t3b<>(l86.bufferSize(), refCount);
    }

    @cfb
    @cy1
    public static <T> t3b<T> create(int bufferSize) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        return new t3b<>(bufferSize, false);
    }

    @cfb
    @cy1
    public static <T> t3b<T> create(int bufferSize, boolean refCount) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        return new t3b<>(bufferSize, refCount);
    }
}
