package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class cub<T> extends vkb<Boolean> {

    /* JADX INFO: renamed from: a */
    public final wub<? extends T> f27634a;

    /* JADX INFO: renamed from: b */
    public final wub<? extends T> f27635b;

    /* JADX INFO: renamed from: c */
    public final l11<? super T, ? super T> f27636c;

    /* JADX INFO: renamed from: d */
    public final int f27637d;

    /* JADX INFO: renamed from: cub$a */
    public static final class C4508a<T> extends AtomicInteger implements lf4 {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: C */
        public T f27638C;

        /* JADX INFO: renamed from: F */
        public T f27639F;

        /* JADX INFO: renamed from: a */
        public final pxb<? super Boolean> f27640a;

        /* JADX INFO: renamed from: b */
        public final l11<? super T, ? super T> f27641b;

        /* JADX INFO: renamed from: c */
        public final w50 f27642c = new w50(2);

        /* JADX INFO: renamed from: d */
        public final wub<? extends T> f27643d;

        /* JADX INFO: renamed from: e */
        public final wub<? extends T> f27644e;

        /* JADX INFO: renamed from: f */
        public final C4509b<T>[] f27645f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f27646m;

        public C4508a(pxb<? super Boolean> actual, int bufferSize, wub<? extends T> first, wub<? extends T> second, l11<? super T, ? super T> comparer) {
            this.f27640a = actual;
            this.f27643d = first;
            this.f27644e = second;
            this.f27641b = comparer;
            this.f27645f = new C4509b[]{new C4509b<>(this, 0, bufferSize), new C4509b<>(this, 1, bufferSize)};
        }

        /* JADX INFO: renamed from: a */
        public void m8707a(qzf<T> q1, qzf<T> q2) {
            this.f27646m = true;
            q1.clear();
            q2.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m8708b() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            C4509b<T>[] c4509bArr = this.f27645f;
            C4509b<T> c4509b = c4509bArr[0];
            qzf<T> qzfVar = c4509b.f27648b;
            C4509b<T> c4509b2 = c4509bArr[1];
            qzf<T> qzfVar2 = c4509b2.f27648b;
            int iAddAndGet = 1;
            while (!this.f27646m) {
                boolean z = c4509b.f27650d;
                if (z && (th2 = c4509b.f27651e) != null) {
                    m8707a(qzfVar, qzfVar2);
                    this.f27640a.onError(th2);
                    return;
                }
                boolean z2 = c4509b2.f27650d;
                if (z2 && (th = c4509b2.f27651e) != null) {
                    m8707a(qzfVar, qzfVar2);
                    this.f27640a.onError(th);
                    return;
                }
                if (this.f27638C == null) {
                    this.f27638C = qzfVar.poll();
                }
                boolean z3 = this.f27638C == null;
                if (this.f27639F == null) {
                    this.f27639F = qzfVar2.poll();
                }
                T t = this.f27639F;
                boolean z4 = t == null;
                if (z && z2 && z3 && z4) {
                    this.f27640a.onNext(Boolean.TRUE);
                    this.f27640a.onComplete();
                    return;
                }
                if (z && z2 && z3 != z4) {
                    m8707a(qzfVar, qzfVar2);
                    this.f27640a.onNext(Boolean.FALSE);
                    this.f27640a.onComplete();
                    return;
                }
                if (!z3 && !z4) {
                    try {
                        if (!this.f27641b.test(this.f27638C, t)) {
                            m8707a(qzfVar, qzfVar2);
                            this.f27640a.onNext(Boolean.FALSE);
                            this.f27640a.onComplete();
                            return;
                        }
                        this.f27638C = null;
                        this.f27639F = null;
                    } catch (Throwable th3) {
                        o75.throwIfFatal(th3);
                        m8707a(qzfVar, qzfVar2);
                        this.f27640a.onError(th3);
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
        public boolean m8709c(lf4 d, int index) {
            return this.f27642c.setResource(index, d);
        }

        /* JADX INFO: renamed from: d */
        public void m8710d() {
            C4509b<T>[] c4509bArr = this.f27645f;
            this.f27643d.subscribe(c4509bArr[0]);
            this.f27644e.subscribe(c4509bArr[1]);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f27646m) {
                return;
            }
            this.f27646m = true;
            this.f27642c.dispose();
            if (getAndIncrement() == 0) {
                C4509b<T>[] c4509bArr = this.f27645f;
                c4509bArr[0].f27648b.clear();
                c4509bArr[1].f27648b.clear();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f27646m;
        }
    }

    /* JADX INFO: renamed from: cub$b */
    public static final class C4509b<T> implements pxb<T> {

        /* JADX INFO: renamed from: a */
        public final C4508a<T> f27647a;

        /* JADX INFO: renamed from: b */
        public final qzf<T> f27648b;

        /* JADX INFO: renamed from: c */
        public final int f27649c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f27650d;

        /* JADX INFO: renamed from: e */
        public Throwable f27651e;

        public C4509b(C4508a<T> parent, int index, int bufferSize) {
            this.f27647a = parent;
            this.f27649c = index;
            this.f27648b = new qzf<>(bufferSize);
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f27650d = true;
            this.f27647a.m8708b();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f27651e = t;
            this.f27650d = true;
            this.f27647a.m8708b();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f27648b.offer(t);
            this.f27647a.m8708b();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f27647a.m8709c(d, this.f27649c);
        }
    }

    public cub(wub<? extends T> first, wub<? extends T> second, l11<? super T, ? super T> comparer, int bufferSize) {
        this.f27634a = first;
        this.f27635b = second;
        this.f27636c = comparer;
        this.f27637d = bufferSize;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super Boolean> observer) {
        C4508a c4508a = new C4508a(observer, this.f27637d, this.f27634a, this.f27635b, this.f27636c);
        observer.onSubscribe(c4508a);
        c4508a.m8710d();
    }
}
