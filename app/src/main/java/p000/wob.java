package p000;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wob<T, U> extends AbstractC9666n3<T, U> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends wub<? extends U>> f94943b;

    /* JADX INFO: renamed from: c */
    public final boolean f94944c;

    /* JADX INFO: renamed from: d */
    public final int f94945d;

    /* JADX INFO: renamed from: e */
    public final int f94946e;

    /* JADX INFO: renamed from: wob$a */
    public static final class C14725a<T, U> extends AtomicReference<lf4> implements pxb<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: a */
        public final long f94947a;

        /* JADX INFO: renamed from: b */
        public final C14726b<T, U> f94948b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f94949c;

        /* JADX INFO: renamed from: d */
        public volatile zif<U> f94950d;

        /* JADX INFO: renamed from: e */
        public int f94951e;

        public C14725a(C14726b<T, U> parent, long id) {
            this.f94947a = id;
            this.f94948b = parent;
        }

        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f94949c = true;
            this.f94948b.m24685d();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f94948b.f94954C.tryAddThrowableOrReport(t)) {
                C14726b<T, U> c14726b = this.f94948b;
                if (!c14726b.f94964c) {
                    c14726b.m24684c();
                }
                this.f94949c = true;
                this.f94948b.m24685d();
            }
        }

        @Override // p000.pxb
        public void onNext(U t) {
            if (this.f94951e == 0) {
                this.f94948b.m24690i(t, this);
            } else {
                this.f94948b.m24685d();
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d) && (d instanceof tmd)) {
                tmd tmdVar = (tmd) d;
                int iRequestFusion = tmdVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f94951e = iRequestFusion;
                    this.f94950d = tmdVar;
                    this.f94949c = true;
                    this.f94948b.m24685d();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f94951e = iRequestFusion;
                    this.f94950d = tmdVar;
                }
            }
        }
    }

    /* JADX INFO: renamed from: wob$b */
    public static final class C14726b<T, U> extends AtomicInteger implements lf4, pxb<T> {

        /* JADX INFO: renamed from: Y */
        public static final C14725a<?, ?>[] f94952Y = new C14725a[0];

        /* JADX INFO: renamed from: Z */
        public static final C14725a<?, ?>[] f94953Z = new C14725a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: C */
        public final bc0 f94954C = new bc0();

        /* JADX INFO: renamed from: F */
        public volatile boolean f94955F;

        /* JADX INFO: renamed from: H */
        public final AtomicReference<C14725a<?, ?>[]> f94956H;

        /* JADX INFO: renamed from: L */
        public lf4 f94957L;

        /* JADX INFO: renamed from: M */
        public long f94958M;

        /* JADX INFO: renamed from: N */
        public int f94959N;

        /* JADX INFO: renamed from: Q */
        public Queue<wub<? extends U>> f94960Q;

        /* JADX INFO: renamed from: X */
        public int f94961X;

        /* JADX INFO: renamed from: a */
        public final pxb<? super U> f94962a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends U>> f94963b;

        /* JADX INFO: renamed from: c */
        public final boolean f94964c;

        /* JADX INFO: renamed from: d */
        public final int f94965d;

        /* JADX INFO: renamed from: e */
        public final int f94966e;

        /* JADX INFO: renamed from: f */
        public volatile tif<U> f94967f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f94968m;

        public C14726b(pxb<? super U> actual, sy6<? super T, ? extends wub<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
            this.f94962a = actual;
            this.f94963b = mapper;
            this.f94964c = delayErrors;
            this.f94965d = maxConcurrency;
            this.f94966e = bufferSize;
            if (maxConcurrency != Integer.MAX_VALUE) {
                this.f94960Q = new ArrayDeque(maxConcurrency);
            }
            this.f94956H = new AtomicReference<>(f94952Y);
        }

        /* JADX INFO: renamed from: a */
        public boolean m24682a(C14725a<T, U> inner) {
            C14725a<?, ?>[] c14725aArr;
            C14725a[] c14725aArr2;
            do {
                c14725aArr = this.f94956H.get();
                if (c14725aArr == f94953Z) {
                    inner.dispose();
                    return false;
                }
                int length = c14725aArr.length;
                c14725aArr2 = new C14725a[length + 1];
                System.arraycopy(c14725aArr, 0, c14725aArr2, 0, length);
                c14725aArr2[length] = inner;
            } while (!v7b.m23844a(this.f94956H, c14725aArr, c14725aArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m24683b() {
            if (this.f94955F) {
                return true;
            }
            Throwable th = this.f94954C.get();
            if (this.f94964c || th == null) {
                return false;
            }
            m24684c();
            this.f94954C.tryTerminateConsumer(this.f94962a);
            return true;
        }

        /* JADX INFO: renamed from: c */
        public boolean m24684c() {
            this.f94957L.dispose();
            AtomicReference<C14725a<?, ?>[]> atomicReference = this.f94956H;
            C14725a<?, ?>[] c14725aArr = f94953Z;
            C14725a<?, ?>[] andSet = atomicReference.getAndSet(c14725aArr);
            if (andSet == c14725aArr) {
                return false;
            }
            for (C14725a<?, ?> c14725a : andSet) {
                c14725a.dispose();
            }
            return true;
        }

        /* JADX INFO: renamed from: d */
        public void m24685d() {
            if (getAndIncrement() == 0) {
                m24686e();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f94955F = true;
            if (m24684c()) {
                this.f94954C.tryTerminateAndReport();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00c4 A[PHI: r4
  0x00c4: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00aa, B:66:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m24686e() {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.wob.C14726b.m24686e():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public void m24687f(C14725a<T, U> inner) {
            C14725a<?, ?>[] c14725aArr;
            C14725a<?, ?>[] c14725aArr2;
            do {
                c14725aArr = this.f94956H.get();
                int length = c14725aArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c14725aArr[i] == inner) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c14725aArr2 = f94952Y;
                } else {
                    C14725a<?, ?>[] c14725aArr3 = new C14725a[length - 1];
                    System.arraycopy(c14725aArr, 0, c14725aArr3, 0, i);
                    System.arraycopy(c14725aArr, i + 1, c14725aArr3, i, (length - i) - 1);
                    c14725aArr2 = c14725aArr3;
                }
            } while (!v7b.m23844a(this.f94956H, c14725aArr, c14725aArr2));
        }

        /* JADX INFO: renamed from: g */
        public void m24688g(wub<? extends U> p) {
            boolean z;
            while (p instanceof nfg) {
                if (!m24691j((nfg) p) || this.f94965d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        p = this.f94960Q.poll();
                        if (p == null) {
                            z = true;
                            this.f94961X--;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    m24685d();
                    return;
                }
            }
            long j = this.f94958M;
            this.f94958M = 1 + j;
            C14725a<T, U> c14725a = new C14725a<>(this, j);
            if (m24682a(c14725a)) {
                p.subscribe(c14725a);
            }
        }

        /* JADX INFO: renamed from: h */
        public void m24689h(int innerCompleted) {
            while (true) {
                int i = innerCompleted - 1;
                if (innerCompleted == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        wub<? extends U> wubVarPoll = this.f94960Q.poll();
                        if (wubVarPoll == null) {
                            this.f94961X--;
                        } else {
                            m24688g(wubVarPoll);
                        }
                    } finally {
                    }
                }
                innerCompleted = i;
            }
        }

        /* JADX INFO: renamed from: i */
        public void m24690i(U value, C14725a<T, U> inner) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f94962a.onNext(value);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                zif qzfVar = inner.f94950d;
                if (qzfVar == null) {
                    qzfVar = new qzf(this.f94966e);
                    inner.f94950d = qzfVar;
                }
                qzfVar.offer(value);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m24686e();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f94955F;
        }

        /* JADX INFO: renamed from: j */
        public boolean m24691j(nfg<? extends U> value) {
            try {
                U u = value.get();
                if (u == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f94962a.onNext(u);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    tif<U> qzfVar = this.f94967f;
                    if (qzfVar == null) {
                        qzfVar = this.f94965d == Integer.MAX_VALUE ? new qzf<>(this.f94966e) : new ozf<>(this.f94965d);
                        this.f94967f = qzfVar;
                    }
                    qzfVar.offer(u);
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                m24686e();
                return true;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f94954C.tryAddThrowableOrReport(th);
                m24685d();
                return true;
            }
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f94968m) {
                return;
            }
            this.f94968m = true;
            m24685d();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f94968m) {
                ofe.onError(t);
            } else if (this.f94954C.tryAddThrowableOrReport(t)) {
                this.f94968m = true;
                m24685d();
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f94968m) {
                return;
            }
            try {
                wub<? extends U> wubVarApply = this.f94963b.apply(t);
                Objects.requireNonNull(wubVarApply, "The mapper returned a null ObservableSource");
                wub<? extends U> wubVar = wubVarApply;
                if (this.f94965d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.f94961X;
                            if (i == this.f94965d) {
                                this.f94960Q.offer(wubVar);
                                return;
                            }
                            this.f94961X = i + 1;
                        } finally {
                        }
                    }
                }
                m24688g(wubVar);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f94957L.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f94957L, d)) {
                this.f94957L = d;
                this.f94962a.onSubscribe(this);
            }
        }
    }

    public wob(wub<T> source, sy6<? super T, ? extends wub<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
        super(source);
        this.f94943b = mapper;
        this.f94944c = delayErrors;
        this.f94945d = maxConcurrency;
        this.f94946e = bufferSize;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super U> t) {
        if (vtb.tryScalarXMapSubscribe(this.f63101a, t, this.f94943b)) {
            return;
        }
        this.f63101a.subscribe(new C14726b(t, this.f94943b, this.f94944c, this.f94945d, this.f94946e));
    }
}
