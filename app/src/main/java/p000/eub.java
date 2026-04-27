package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class eub<T> extends kjf<Boolean> implements y07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final wub<? extends T> f34038a;

    /* JADX INFO: renamed from: b */
    public final wub<? extends T> f34039b;

    /* JADX INFO: renamed from: c */
    public final l11<? super T, ? super T> f34040c;

    /* JADX INFO: renamed from: d */
    public final int f34041d;

    /* JADX INFO: renamed from: eub$a */
    public static final class C5471a<T> extends AtomicInteger implements lf4 {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: C */
        public T f34042C;

        /* JADX INFO: renamed from: F */
        public T f34043F;

        /* JADX INFO: renamed from: a */
        public final hnf<? super Boolean> f34044a;

        /* JADX INFO: renamed from: b */
        public final l11<? super T, ? super T> f34045b;

        /* JADX INFO: renamed from: c */
        public final w50 f34046c = new w50(2);

        /* JADX INFO: renamed from: d */
        public final wub<? extends T> f34047d;

        /* JADX INFO: renamed from: e */
        public final wub<? extends T> f34048e;

        /* JADX INFO: renamed from: f */
        public final C5472b<T>[] f34049f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f34050m;

        public C5471a(hnf<? super Boolean> actual, int bufferSize, wub<? extends T> first, wub<? extends T> second, l11<? super T, ? super T> comparer) {
            this.f34044a = actual;
            this.f34047d = first;
            this.f34048e = second;
            this.f34045b = comparer;
            this.f34049f = new C5472b[]{new C5472b<>(this, 0, bufferSize), new C5472b<>(this, 1, bufferSize)};
        }

        /* JADX INFO: renamed from: a */
        public void m10232a(qzf<T> q1, qzf<T> q2) {
            this.f34050m = true;
            q1.clear();
            q2.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m10233b() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            C5472b<T>[] c5472bArr = this.f34049f;
            C5472b<T> c5472b = c5472bArr[0];
            qzf<T> qzfVar = c5472b.f34052b;
            C5472b<T> c5472b2 = c5472bArr[1];
            qzf<T> qzfVar2 = c5472b2.f34052b;
            int iAddAndGet = 1;
            while (!this.f34050m) {
                boolean z = c5472b.f34054d;
                if (z && (th2 = c5472b.f34055e) != null) {
                    m10232a(qzfVar, qzfVar2);
                    this.f34044a.onError(th2);
                    return;
                }
                boolean z2 = c5472b2.f34054d;
                if (z2 && (th = c5472b2.f34055e) != null) {
                    m10232a(qzfVar, qzfVar2);
                    this.f34044a.onError(th);
                    return;
                }
                if (this.f34042C == null) {
                    this.f34042C = qzfVar.poll();
                }
                boolean z3 = this.f34042C == null;
                if (this.f34043F == null) {
                    this.f34043F = qzfVar2.poll();
                }
                T t = this.f34043F;
                boolean z4 = t == null;
                if (z && z2 && z3 && z4) {
                    this.f34044a.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z && z2 && z3 != z4) {
                    m10232a(qzfVar, qzfVar2);
                    this.f34044a.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z3 && !z4) {
                    try {
                        if (!this.f34045b.test(this.f34042C, t)) {
                            m10232a(qzfVar, qzfVar2);
                            this.f34044a.onSuccess(Boolean.FALSE);
                            return;
                        } else {
                            this.f34042C = null;
                            this.f34043F = null;
                        }
                    } catch (Throwable th3) {
                        o75.throwIfFatal(th3);
                        m10232a(qzfVar, qzfVar2);
                        this.f34044a.onError(th3);
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
            qzfVar.clear();
            qzfVar2.clear();
        }

        /* JADX INFO: renamed from: c */
        public boolean m10234c(lf4 d, int index) {
            return this.f34046c.setResource(index, d);
        }

        /* JADX INFO: renamed from: d */
        public void m10235d() {
            C5472b<T>[] c5472bArr = this.f34049f;
            this.f34047d.subscribe(c5472bArr[0]);
            this.f34048e.subscribe(c5472bArr[1]);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f34050m) {
                return;
            }
            this.f34050m = true;
            this.f34046c.dispose();
            if (getAndIncrement() == 0) {
                C5472b<T>[] c5472bArr = this.f34049f;
                c5472bArr[0].f34052b.clear();
                c5472bArr[1].f34052b.clear();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f34050m;
        }
    }

    /* JADX INFO: renamed from: eub$b */
    public static final class C5472b<T> implements pxb<T> {

        /* JADX INFO: renamed from: a */
        public final C5471a<T> f34051a;

        /* JADX INFO: renamed from: b */
        public final qzf<T> f34052b;

        /* JADX INFO: renamed from: c */
        public final int f34053c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f34054d;

        /* JADX INFO: renamed from: e */
        public Throwable f34055e;

        public C5472b(C5471a<T> parent, int index, int bufferSize) {
            this.f34051a = parent;
            this.f34053c = index;
            this.f34052b = new qzf<>(bufferSize);
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f34054d = true;
            this.f34051a.m10233b();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f34055e = t;
            this.f34054d = true;
            this.f34051a.m10233b();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f34052b.offer(t);
            this.f34051a.m10233b();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f34051a.m10234c(d, this.f34053c);
        }
    }

    public eub(wub<? extends T> first, wub<? extends T> second, l11<? super T, ? super T> comparer, int bufferSize) {
        this.f34038a = first;
        this.f34039b = second;
        this.f34040c = comparer;
        this.f34041d = bufferSize;
    }

    @Override // p000.y07
    public vkb<Boolean> fuseToObservable() {
        return ofe.onAssembly(new cub(this.f34038a, this.f34039b, this.f34040c, this.f34041d));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Boolean> observer) {
        C5471a c5471a = new C5471a(observer, this.f34041d, this.f34038a, this.f34039b, this.f34040c);
        observer.onSubscribe(c5471a);
        c5471a.m10235d();
    }
}
