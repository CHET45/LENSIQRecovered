package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wg6<T, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final py6<? super m86<T>, ? extends zjd<? extends R>> f94149c;

    /* JADX INFO: renamed from: d */
    public final int f94150d;

    /* JADX INFO: renamed from: e */
    public final boolean f94151e;

    /* JADX INFO: renamed from: wg6$a */
    public static final class C14575a<T> extends m86<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: N */
        public static final C14576b[] f94152N = new C14576b[0];

        /* JADX INFO: renamed from: Q */
        public static final C14576b[] f94153Q = new C14576b[0];

        /* JADX INFO: renamed from: C */
        public volatile ajf<T> f94154C;

        /* JADX INFO: renamed from: F */
        public int f94155F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f94156H;

        /* JADX INFO: renamed from: L */
        public Throwable f94157L;

        /* JADX INFO: renamed from: M */
        public int f94158M;

        /* JADX INFO: renamed from: d */
        public final int f94161d;

        /* JADX INFO: renamed from: e */
        public final int f94162e;

        /* JADX INFO: renamed from: f */
        public final boolean f94163f;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f94159b = new AtomicInteger();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<fdg> f94164m = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<C14576b<T>[]> f94160c = new AtomicReference<>(f94152N);

        public C14575a(int i, boolean z) {
            this.f94161d = i;
            this.f94162e = i - (i >> 2);
            this.f94163f = z;
        }

        /* JADX INFO: renamed from: b */
        public boolean m24501b(C14576b<T> c14576b) {
            C14576b<T>[] c14576bArr;
            C14576b[] c14576bArr2;
            do {
                c14576bArr = this.f94160c.get();
                if (c14576bArr == f94153Q) {
                    return false;
                }
                int length = c14576bArr.length;
                c14576bArr2 = new C14576b[length + 1];
                System.arraycopy(c14576bArr, 0, c14576bArr2, 0, length);
                c14576bArr2[length] = c14576b;
            } while (!v7b.m23844a(this.f94160c, c14576bArr, c14576bArr2));
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m24502c() {
            for (C14576b<T> c14576b : this.f94160c.getAndSet(f94153Q)) {
                if (c14576b.get() != Long.MIN_VALUE) {
                    c14576b.f94165a.onComplete();
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m24503d() {
            AtomicReference<C14576b<T>[]> atomicReference;
            Throwable th;
            Throwable th2;
            if (this.f94159b.getAndIncrement() != 0) {
                return;
            }
            ajf<T> ajfVar = this.f94154C;
            int i = this.f94158M;
            int i2 = this.f94162e;
            boolean z = this.f94155F != 1;
            AtomicReference<C14576b<T>[]> atomicReference2 = this.f94160c;
            C14576b<T>[] c14576bArr = atomicReference2.get();
            int iAddAndGet = 1;
            while (true) {
                int length = c14576bArr.length;
                if (ajfVar == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = c14576bArr.length;
                    long j = Long.MAX_VALUE;
                    long j2 = Long.MAX_VALUE;
                    int i3 = 0;
                    while (i3 < length2) {
                        C14576b<T> c14576b = c14576bArr[i3];
                        AtomicReference<C14576b<T>[]> atomicReference3 = atomicReference2;
                        long j3 = c14576b.get() - c14576b.f94167c;
                        if (j3 == Long.MIN_VALUE) {
                            length--;
                        } else if (j2 > j3) {
                            j2 = j3;
                        }
                        i3++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j4 = 0;
                    if (length == 0) {
                        j2 = 0;
                    }
                    while (j2 != j4) {
                        if (isDisposed()) {
                            ajfVar.clear();
                            return;
                        }
                        boolean z2 = this.f94156H;
                        if (z2 && !this.f94163f && (th2 = this.f94157L) != null) {
                            m24504e(th2);
                            return;
                        }
                        try {
                            T tPoll = ajfVar.poll();
                            boolean z3 = tPoll == null;
                            if (z2 && z3) {
                                Throwable th3 = this.f94157L;
                                if (th3 != null) {
                                    m24504e(th3);
                                    return;
                                } else {
                                    m24502c();
                                    return;
                                }
                            }
                            if (z3) {
                                break;
                            }
                            int length3 = c14576bArr.length;
                            int i4 = 0;
                            boolean z4 = false;
                            while (i4 < length3) {
                                C14576b<T> c14576b2 = c14576bArr[i4];
                                long j5 = c14576b2.get();
                                if (j5 != Long.MIN_VALUE) {
                                    if (j5 != j) {
                                        c14576b2.f94167c++;
                                    }
                                    c14576b2.f94165a.onNext(tPoll);
                                } else {
                                    z4 = true;
                                }
                                i4++;
                                j = Long.MAX_VALUE;
                            }
                            j2--;
                            if (z && (i = i + 1) == i2) {
                                this.f94164m.get().request(i2);
                                i = 0;
                            }
                            C14576b<T>[] c14576bArr2 = atomicReference.get();
                            if (z4 || c14576bArr2 != c14576bArr) {
                                c14576bArr = c14576bArr2;
                                break;
                            } else {
                                j4 = 0;
                                j = Long.MAX_VALUE;
                            }
                        } catch (Throwable th4) {
                            n75.throwIfFatal(th4);
                            mdg.cancel(this.f94164m);
                            m24504e(th4);
                            return;
                        }
                    }
                    if (j2 == j4) {
                        if (isDisposed()) {
                            ajfVar.clear();
                            return;
                        }
                        boolean z5 = this.f94156H;
                        if (z5 && !this.f94163f && (th = this.f94157L) != null) {
                            m24504e(th);
                            return;
                        }
                        if (z5 && ajfVar.isEmpty()) {
                            Throwable th5 = this.f94157L;
                            if (th5 != null) {
                                m24504e(th5);
                                return;
                            } else {
                                m24502c();
                                return;
                            }
                        }
                    }
                }
                this.f94158M = i;
                iAddAndGet = this.f94159b.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (ajfVar == null) {
                    ajfVar = this.f94154C;
                }
                c14576bArr = atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        @Override // p000.mf4
        public void dispose() {
            ajf<T> ajfVar;
            mdg.cancel(this.f94164m);
            if (this.f94159b.getAndIncrement() != 0 || (ajfVar = this.f94154C) == null) {
                return;
            }
            ajfVar.clear();
        }

        /* JADX INFO: renamed from: e */
        public void m24504e(Throwable th) {
            for (C14576b<T> c14576b : this.f94160c.getAndSet(f94153Q)) {
                if (c14576b.get() != Long.MIN_VALUE) {
                    c14576b.f94165a.onError(th);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m24505f(C14576b<T> c14576b) {
            C14576b<T>[] c14576bArr;
            C14576b[] c14576bArr2;
            do {
                c14576bArr = this.f94160c.get();
                int length = c14576bArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c14576bArr[i] == c14576b) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c14576bArr2 = f94152N;
                } else {
                    C14576b[] c14576bArr3 = new C14576b[length - 1];
                    System.arraycopy(c14576bArr, 0, c14576bArr3, 0, i);
                    System.arraycopy(c14576bArr, i + 1, c14576bArr3, i, (length - i) - 1);
                    c14576bArr2 = c14576bArr3;
                }
            } while (!v7b.m23844a(this.f94160c, c14576bArr, c14576bArr2));
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f94164m.get() == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f94156H) {
                return;
            }
            this.f94156H = true;
            m24503d();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f94156H) {
                pfe.onError(th);
                return;
            }
            this.f94157L = th;
            this.f94156H = true;
            m24503d();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f94156H) {
                return;
            }
            if (this.f94155F != 0 || this.f94154C.offer(t)) {
                m24503d();
            } else {
                this.f94164m.get().cancel();
                onError(new cwa());
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this.f94164m, fdgVar)) {
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f94155F = iRequestFusion;
                        this.f94154C = codVar;
                        this.f94156H = true;
                        m24503d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f94155F = iRequestFusion;
                        this.f94154C = codVar;
                        ymd.request(fdgVar, this.f94161d);
                        return;
                    }
                }
                this.f94154C = ymd.createQueue(this.f94161d);
                ymd.request(fdgVar, this.f94161d);
            }
        }

        @Override // p000.m86
        public void subscribeActual(ycg<? super T> ycgVar) {
            C14576b<T> c14576b = new C14576b<>(ycgVar, this);
            ycgVar.onSubscribe(c14576b);
            if (m24501b(c14576b)) {
                if (c14576b.isCancelled()) {
                    m24505f(c14576b);
                    return;
                } else {
                    m24503d();
                    return;
                }
            }
            Throwable th = this.f94157L;
            if (th != null) {
                ycgVar.onError(th);
            } else {
                ycgVar.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: wg6$b */
    public static final class C14576b<T> extends AtomicLong implements fdg {
        private static final long serialVersionUID = 8664815189257569791L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f94165a;

        /* JADX INFO: renamed from: b */
        public final C14575a<T> f94166b;

        /* JADX INFO: renamed from: c */
        public long f94167c;

        public C14576b(ycg<? super T> ycgVar, C14575a<T> c14575a) {
            this.f94165a = ycgVar;
            this.f94166b = c14575a;
        }

        @Override // p000.fdg
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f94166b.m24505f(this);
                this.f94166b.m24503d();
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.addCancel(this, j);
                this.f94166b.m24503d();
            }
        }
    }

    /* JADX INFO: renamed from: wg6$c */
    public static final class C14577c<R> implements lj6<R>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f94168a;

        /* JADX INFO: renamed from: b */
        public final C14575a<?> f94169b;

        /* JADX INFO: renamed from: c */
        public fdg f94170c;

        public C14577c(ycg<? super R> ycgVar, C14575a<?> c14575a) {
            this.f94168a = ycgVar;
            this.f94169b = c14575a;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f94170c.cancel();
            this.f94169b.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f94168a.onComplete();
            this.f94169b.dispose();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f94168a.onError(th);
            this.f94169b.dispose();
        }

        @Override // p000.ycg
        public void onNext(R r) {
            this.f94168a.onNext(r);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f94170c, fdgVar)) {
                this.f94170c = fdgVar;
                this.f94168a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f94170c.request(j);
        }
    }

    public wg6(m86<T> m86Var, py6<? super m86<T>, ? extends zjd<? extends R>> py6Var, int i, boolean z) {
        super(m86Var);
        this.f94149c = py6Var;
        this.f94150d = i;
        this.f94151e = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        C14575a c14575a = new C14575a(this.f94150d, this.f94151e);
        try {
            ((zjd) xjb.requireNonNull(this.f94149c.apply(c14575a), "selector returned a null Publisher")).subscribe(new C14577c(ycgVar, c14575a));
            this.f52360b.subscribe((lj6) c14575a);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }
}
