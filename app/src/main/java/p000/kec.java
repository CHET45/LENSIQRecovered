package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes7.dex */
public final class kec<T> extends fec<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f53782a;

    /* JADX INFO: renamed from: b */
    public final int f53783b;

    /* JADX INFO: renamed from: c */
    public final int f53784c;

    /* JADX INFO: renamed from: kec$a */
    public static final class C8322a<T> extends AtomicInteger implements lj6<T> {
        private static final long serialVersionUID = -4470634016609963609L;

        /* JADX INFO: renamed from: C */
        public Throwable f53785C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f53786F;

        /* JADX INFO: renamed from: H */
        public int f53787H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f53788L;

        /* JADX INFO: renamed from: M */
        public final AtomicInteger f53789M = new AtomicInteger();

        /* JADX INFO: renamed from: N */
        public int f53790N;

        /* JADX INFO: renamed from: Q */
        public int f53791Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T>[] f53792a;

        /* JADX INFO: renamed from: b */
        public final AtomicLongArray f53793b;

        /* JADX INFO: renamed from: c */
        public final long[] f53794c;

        /* JADX INFO: renamed from: d */
        public final int f53795d;

        /* JADX INFO: renamed from: e */
        public final int f53796e;

        /* JADX INFO: renamed from: f */
        public fdg f53797f;

        /* JADX INFO: renamed from: m */
        public ajf<T> f53798m;

        /* JADX INFO: renamed from: kec$a$a */
        public final class a implements fdg {

            /* JADX INFO: renamed from: a */
            public final int f53799a;

            /* JADX INFO: renamed from: b */
            public final int f53800b;

            public a(int i, int i2) {
                this.f53799a = i;
                this.f53800b = i2;
            }

            @Override // p000.fdg
            public void cancel() {
                if (C8322a.this.f53793b.compareAndSet(this.f53799a + this.f53800b, 0L, 1L)) {
                    C8322a c8322a = C8322a.this;
                    int i = this.f53800b;
                    c8322a.m14678a(i + i);
                }
            }

            @Override // p000.fdg
            public void request(long j) {
                long j2;
                if (mdg.validate(j)) {
                    AtomicLongArray atomicLongArray = C8322a.this.f53793b;
                    do {
                        j2 = atomicLongArray.get(this.f53799a);
                        if (j2 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f53799a, j2, so0.addCap(j2, j)));
                    if (C8322a.this.f53789M.get() == this.f53800b) {
                        C8322a.this.m14679b();
                    }
                }
            }
        }

        public C8322a(ycg<? super T>[] ycgVarArr, int i) {
            this.f53792a = ycgVarArr;
            this.f53795d = i;
            this.f53796e = i - (i >> 2);
            int length = ycgVarArr.length;
            int i2 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i2 + 1);
            this.f53793b = atomicLongArray;
            atomicLongArray.lazySet(i2, length);
            this.f53794c = new long[length];
        }

        /* JADX INFO: renamed from: a */
        public void m14678a(int i) {
            if (this.f53793b.decrementAndGet(i) == 0) {
                this.f53788L = true;
                this.f53797f.cancel();
                if (getAndIncrement() == 0) {
                    this.f53798m.clear();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14679b() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f53791Q == 1) {
                m14681d();
            } else {
                m14680c();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m14680c() {
            Throwable th;
            ajf<T> ajfVar = this.f53798m;
            ycg<? super T>[] ycgVarArr = this.f53792a;
            AtomicLongArray atomicLongArray = this.f53793b;
            long[] jArr = this.f53794c;
            int length = jArr.length;
            int i = this.f53787H;
            int i2 = this.f53790N;
            int iAddAndGet = 1;
            while (true) {
                int i3 = 0;
                int i4 = 0;
                while (!this.f53788L) {
                    boolean z = this.f53786F;
                    if (z && (th = this.f53785C) != null) {
                        ajfVar.clear();
                        int length2 = ycgVarArr.length;
                        while (i3 < length2) {
                            ycgVarArr[i3].onError(th);
                            i3++;
                        }
                        return;
                    }
                    boolean zIsEmpty = ajfVar.isEmpty();
                    if (z && zIsEmpty) {
                        int length3 = ycgVarArr.length;
                        while (i3 < length3) {
                            ycgVarArr[i3].onComplete();
                            i3++;
                        }
                        return;
                    }
                    if (!zIsEmpty) {
                        long j = atomicLongArray.get(i);
                        long j2 = jArr[i];
                        if (j == j2 || atomicLongArray.get(length + i) != 0) {
                            i4++;
                        } else {
                            try {
                                T tPoll = ajfVar.poll();
                                if (tPoll != null) {
                                    ycgVarArr[i].onNext(tPoll);
                                    jArr[i] = j2 + 1;
                                    i2++;
                                    if (i2 == this.f53796e) {
                                        this.f53797f.request(i2);
                                        i2 = 0;
                                    }
                                    i4 = 0;
                                }
                            } catch (Throwable th2) {
                                n75.throwIfFatal(th2);
                                this.f53797f.cancel();
                                int length4 = ycgVarArr.length;
                                while (i3 < length4) {
                                    ycgVarArr[i3].onError(th2);
                                    i3++;
                                }
                                return;
                            }
                        }
                        i++;
                        if (i == length) {
                            i = 0;
                        }
                        if (i4 == length) {
                        }
                    }
                    int i5 = get();
                    if (i5 == iAddAndGet) {
                        this.f53787H = i;
                        this.f53790N = i2;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i5;
                    }
                }
                ajfVar.clear();
                return;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m14681d() {
            ajf<T> ajfVar = this.f53798m;
            ycg<? super T>[] ycgVarArr = this.f53792a;
            AtomicLongArray atomicLongArray = this.f53793b;
            long[] jArr = this.f53794c;
            int length = jArr.length;
            int i = this.f53787H;
            int iAddAndGet = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                while (!this.f53788L) {
                    if (ajfVar.isEmpty()) {
                        int length2 = ycgVarArr.length;
                        while (i2 < length2) {
                            ycgVarArr[i2].onComplete();
                            i2++;
                        }
                        return;
                    }
                    long j = atomicLongArray.get(i);
                    long j2 = jArr[i];
                    if (j == j2 || atomicLongArray.get(length + i) != 0) {
                        i3++;
                    } else {
                        try {
                            T tPoll = ajfVar.poll();
                            if (tPoll == null) {
                                int length3 = ycgVarArr.length;
                                while (i2 < length3) {
                                    ycgVarArr[i2].onComplete();
                                    i2++;
                                }
                                return;
                            }
                            ycgVarArr[i].onNext(tPoll);
                            jArr[i] = j2 + 1;
                            i3 = 0;
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            this.f53797f.cancel();
                            int length4 = ycgVarArr.length;
                            while (i2 < length4) {
                                ycgVarArr[i2].onError(th);
                                i2++;
                            }
                            return;
                        }
                    }
                    i++;
                    if (i == length) {
                        i = 0;
                    }
                    if (i3 == length) {
                        int i4 = get();
                        if (i4 == iAddAndGet) {
                            this.f53787H = i;
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        } else {
                            iAddAndGet = i4;
                        }
                    }
                }
                ajfVar.clear();
                return;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m14682e() {
            ycg<? super T>[] ycgVarArr = this.f53792a;
            int length = ycgVarArr.length;
            int i = 0;
            while (i < length && !this.f53788L) {
                int i2 = i + 1;
                this.f53789M.lazySet(i2);
                ycgVarArr[i].onSubscribe(new a(i, length));
                i = i2;
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f53786F = true;
            m14679b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f53785C = th;
            this.f53786F = true;
            m14679b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f53791Q != 0 || this.f53798m.offer(t)) {
                m14679b();
            } else {
                this.f53797f.cancel();
                onError(new cwa("Queue is full?"));
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f53797f, fdgVar)) {
                this.f53797f = fdgVar;
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f53791Q = iRequestFusion;
                        this.f53798m = codVar;
                        this.f53786F = true;
                        m14682e();
                        m14679b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f53791Q = iRequestFusion;
                        this.f53798m = codVar;
                        m14682e();
                        fdgVar.request(this.f53795d);
                        return;
                    }
                }
                this.f53798m = new pzf(this.f53795d);
                m14682e();
                fdgVar.request(this.f53795d);
            }
        }
    }

    public kec(zjd<? extends T> zjdVar, int i, int i2) {
        this.f53782a = zjdVar;
        this.f53783b = i;
        this.f53784c = i2;
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f53783b;
    }

    @Override // p000.fec
    public void subscribe(ycg<? super T>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            this.f53782a.subscribe(new C8322a(ycgVarArr, this.f53784c));
        }
    }
}
