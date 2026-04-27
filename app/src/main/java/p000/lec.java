package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes7.dex */
public final class lec<T> extends eec<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f57385a;

    /* JADX INFO: renamed from: b */
    public final int f57386b;

    /* JADX INFO: renamed from: c */
    public final int f57387c;

    /* JADX INFO: renamed from: lec$a */
    public static final class C8799a<T> extends AtomicInteger implements kj6<T> {
        private static final long serialVersionUID = -4470634016609963609L;

        /* JADX INFO: renamed from: C */
        public Throwable f57388C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f57389F;

        /* JADX INFO: renamed from: H */
        public int f57390H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f57391L;

        /* JADX INFO: renamed from: M */
        public final AtomicInteger f57392M = new AtomicInteger();

        /* JADX INFO: renamed from: N */
        public int f57393N;

        /* JADX INFO: renamed from: Q */
        public int f57394Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T>[] f57395a;

        /* JADX INFO: renamed from: b */
        public final AtomicLongArray f57396b;

        /* JADX INFO: renamed from: c */
        public final long[] f57397c;

        /* JADX INFO: renamed from: d */
        public final int f57398d;

        /* JADX INFO: renamed from: e */
        public final int f57399e;

        /* JADX INFO: renamed from: f */
        public fdg f57400f;

        /* JADX INFO: renamed from: m */
        public zif<T> f57401m;

        /* JADX INFO: renamed from: lec$a$a */
        public final class a implements fdg {

            /* JADX INFO: renamed from: a */
            public final int f57402a;

            /* JADX INFO: renamed from: b */
            public final int f57403b;

            public a(int j, int m) {
                this.f57402a = j;
                this.f57403b = m;
            }

            @Override // p000.fdg
            public void cancel() {
                if (C8799a.this.f57396b.compareAndSet(this.f57402a + this.f57403b, 0L, 1L)) {
                    C8799a c8799a = C8799a.this;
                    int i = this.f57403b;
                    c8799a.m16109a(i + i);
                }
            }

            @Override // p000.fdg
            public void request(long n) {
                long j;
                if (ldg.validate(n)) {
                    AtomicLongArray atomicLongArray = C8799a.this.f57396b;
                    do {
                        j = atomicLongArray.get(this.f57402a);
                        if (j == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f57402a, j, ro0.addCap(j, n)));
                    if (C8799a.this.f57392M.get() == this.f57403b) {
                        C8799a.this.m16110b();
                    }
                }
            }
        }

        public C8799a(ycg<? super T>[] subscribers, int prefetch) {
            this.f57395a = subscribers;
            this.f57398d = prefetch;
            this.f57399e = prefetch - (prefetch >> 2);
            int length = subscribers.length;
            int i = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i + 1);
            this.f57396b = atomicLongArray;
            atomicLongArray.lazySet(i, length);
            this.f57397c = new long[length];
        }

        /* JADX INFO: renamed from: a */
        public void m16109a(int m) {
            if (this.f57396b.decrementAndGet(m) == 0) {
                this.f57391L = true;
                this.f57400f.cancel();
                if (getAndIncrement() == 0) {
                    this.f57401m.clear();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m16110b() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f57394Q == 1) {
                m16112d();
            } else {
                m16111c();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m16111c() {
            Throwable th;
            zif<T> zifVar = this.f57401m;
            ycg<? super T>[] ycgVarArr = this.f57395a;
            AtomicLongArray atomicLongArray = this.f57396b;
            long[] jArr = this.f57397c;
            int length = jArr.length;
            int i = this.f57390H;
            int i2 = this.f57393N;
            int iAddAndGet = 1;
            while (true) {
                int i3 = 0;
                int i4 = 0;
                while (!this.f57391L) {
                    boolean z = this.f57389F;
                    if (z && (th = this.f57388C) != null) {
                        zifVar.clear();
                        int length2 = ycgVarArr.length;
                        while (i3 < length2) {
                            ycgVarArr[i3].onError(th);
                            i3++;
                        }
                        return;
                    }
                    boolean zIsEmpty = zifVar.isEmpty();
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
                                T tPoll = zifVar.poll();
                                if (tPoll != null) {
                                    ycgVarArr[i].onNext(tPoll);
                                    jArr[i] = j2 + 1;
                                    i2++;
                                    if (i2 == this.f57399e) {
                                        this.f57400f.request(i2);
                                        i2 = 0;
                                    }
                                    i4 = 0;
                                }
                            } catch (Throwable th2) {
                                o75.throwIfFatal(th2);
                                this.f57400f.cancel();
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
                        this.f57390H = i;
                        this.f57393N = i2;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i5;
                    }
                }
                zifVar.clear();
                return;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m16112d() {
            zif<T> zifVar = this.f57401m;
            ycg<? super T>[] ycgVarArr = this.f57395a;
            AtomicLongArray atomicLongArray = this.f57396b;
            long[] jArr = this.f57397c;
            int length = jArr.length;
            int i = this.f57390H;
            int iAddAndGet = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                while (!this.f57391L) {
                    if (zifVar.isEmpty()) {
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
                            T tPoll = zifVar.poll();
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
                            o75.throwIfFatal(th);
                            this.f57400f.cancel();
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
                            this.f57390H = i;
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        } else {
                            iAddAndGet = i4;
                        }
                    }
                }
                zifVar.clear();
                return;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m16113e() {
            ycg<? super T>[] ycgVarArr = this.f57395a;
            int length = ycgVarArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                this.f57392M.lazySet(i2);
                ycgVarArr[i].onSubscribe(new a(i, length));
                i = i2;
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f57389F = true;
            m16110b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f57388C = t;
            this.f57389F = true;
            m16110b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f57394Q != 0 || this.f57401m.offer(t)) {
                m16110b();
            } else {
                this.f57400f.cancel();
                onError(new bwa("Queue is full?"));
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f57400f, s)) {
                this.f57400f = s;
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f57394Q = iRequestFusion;
                        this.f57401m = bodVar;
                        this.f57389F = true;
                        m16113e();
                        m16110b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f57394Q = iRequestFusion;
                        this.f57401m = bodVar;
                        m16113e();
                        s.request(this.f57398d);
                        return;
                    }
                }
                this.f57401m = new ozf(this.f57398d);
                m16113e();
                s.request(this.f57398d);
            }
        }
    }

    public lec(zjd<? extends T> source, int parallelism, int prefetch) {
        this.f57385a = source;
        this.f57386b = parallelism;
        this.f57387c = prefetch;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f57386b;
    }

    @Override // p000.eec
    public void subscribe(ycg<? super T>[] subscribers) {
        ycg<?>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            this.f57385a.subscribe(new C8799a(ycgVarArrOnSubscribe, this.f57387c));
        }
    }
}
