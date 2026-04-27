package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class k96<T> extends AbstractC8162k1<T, T> implements lj6<T> {

    /* JADX INFO: renamed from: M */
    public static final C8253a[] f53351M = new C8253a[0];

    /* JADX INFO: renamed from: N */
    public static final C8253a[] f53352N = new C8253a[0];

    /* JADX INFO: renamed from: C */
    public C8254b<T> f53353C;

    /* JADX INFO: renamed from: F */
    public int f53354F;

    /* JADX INFO: renamed from: H */
    public Throwable f53355H;

    /* JADX INFO: renamed from: L */
    public volatile boolean f53356L;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f53357c;

    /* JADX INFO: renamed from: d */
    public final int f53358d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference<C8253a<T>[]> f53359e;

    /* JADX INFO: renamed from: f */
    public volatile long f53360f;

    /* JADX INFO: renamed from: m */
    public final C8254b<T> f53361m;

    /* JADX INFO: renamed from: k96$a */
    public static final class C8253a<T> extends AtomicInteger implements fdg {
        private static final long serialVersionUID = 6770240836423125754L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f53362a;

        /* JADX INFO: renamed from: b */
        public final k96<T> f53363b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f53364c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public C8254b<T> f53365d;

        /* JADX INFO: renamed from: e */
        public int f53366e;

        /* JADX INFO: renamed from: f */
        public long f53367f;

        public C8253a(ycg<? super T> ycgVar, k96<T> k96Var) {
            this.f53362a = ycgVar;
            this.f53363b = k96Var;
            this.f53365d = k96Var.f53361m;
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f53364c.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f53363b.m14605e(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.addCancel(this.f53364c, j);
                this.f53363b.m14606f(this);
            }
        }
    }

    /* JADX INFO: renamed from: k96$b */
    public static final class C8254b<T> {

        /* JADX INFO: renamed from: a */
        public final T[] f53368a;

        /* JADX INFO: renamed from: b */
        public volatile C8254b<T> f53369b;

        public C8254b(int i) {
            this.f53368a = (T[]) new Object[i];
        }
    }

    public k96(m86<T> m86Var, int i) {
        super(m86Var);
        this.f53358d = i;
        this.f53357c = new AtomicBoolean();
        C8254b<T> c8254b = new C8254b<>(i);
        this.f53361m = c8254b;
        this.f53353C = c8254b;
        this.f53359e = new AtomicReference<>(f53351M);
    }

    /* JADX INFO: renamed from: b */
    public void m14602b(C8253a<T> c8253a) {
        C8253a<T>[] c8253aArr;
        C8253a[] c8253aArr2;
        do {
            c8253aArr = this.f53359e.get();
            if (c8253aArr == f53352N) {
                return;
            }
            int length = c8253aArr.length;
            c8253aArr2 = new C8253a[length + 1];
            System.arraycopy(c8253aArr, 0, c8253aArr2, 0, length);
            c8253aArr2[length] = c8253a;
        } while (!v7b.m23844a(this.f53359e, c8253aArr, c8253aArr2));
    }

    /* JADX INFO: renamed from: c */
    public long m14603c() {
        return this.f53360f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m14604d() {
        return this.f53357c.get();
    }

    /* JADX INFO: renamed from: e */
    public void m14605e(C8253a<T> c8253a) {
        C8253a<T>[] c8253aArr;
        C8253a[] c8253aArr2;
        do {
            c8253aArr = this.f53359e.get();
            int length = c8253aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c8253aArr[i] == c8253a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c8253aArr2 = f53351M;
            } else {
                C8253a[] c8253aArr3 = new C8253a[length - 1];
                System.arraycopy(c8253aArr, 0, c8253aArr3, 0, i);
                System.arraycopy(c8253aArr, i + 1, c8253aArr3, i, (length - i) - 1);
                c8253aArr2 = c8253aArr3;
            }
        } while (!v7b.m23844a(this.f53359e, c8253aArr, c8253aArr2));
    }

    /* JADX INFO: renamed from: f */
    public void m14606f(C8253a<T> c8253a) {
        if (c8253a.getAndIncrement() != 0) {
            return;
        }
        long j = c8253a.f53367f;
        int i = c8253a.f53366e;
        C8254b<T> c8254b = c8253a.f53365d;
        AtomicLong atomicLong = c8253a.f53364c;
        ycg<? super T> ycgVar = c8253a.f53362a;
        int i2 = this.f53358d;
        int iAddAndGet = 1;
        while (true) {
            boolean z = this.f53356L;
            boolean z2 = this.f53360f == j;
            if (z && z2) {
                c8253a.f53365d = null;
                Throwable th = this.f53355H;
                if (th != null) {
                    ycgVar.onError(th);
                    return;
                } else {
                    ycgVar.onComplete();
                    return;
                }
            }
            if (!z2) {
                long j2 = atomicLong.get();
                if (j2 == Long.MIN_VALUE) {
                    c8253a.f53365d = null;
                    return;
                } else if (j2 != j) {
                    if (i == i2) {
                        c8254b = c8254b.f53369b;
                        i = 0;
                    }
                    ycgVar.onNext(c8254b.f53368a[i]);
                    i++;
                    j++;
                }
            }
            c8253a.f53367f = j;
            c8253a.f53366e = i;
            c8253a.f53365d = c8254b;
            iAddAndGet = c8253a.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public boolean hasSubscribers() {
        return this.f53359e.get().length != 0;
    }

    @Override // p000.ycg
    public void onComplete() {
        this.f53356L = true;
        for (C8253a<T> c8253a : this.f53359e.getAndSet(f53352N)) {
            m14606f(c8253a);
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        if (this.f53356L) {
            pfe.onError(th);
            return;
        }
        this.f53355H = th;
        this.f53356L = true;
        for (C8253a<T> c8253a : this.f53359e.getAndSet(f53352N)) {
            m14606f(c8253a);
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        int i = this.f53354F;
        if (i == this.f53358d) {
            C8254b<T> c8254b = new C8254b<>(i);
            c8254b.f53368a[0] = t;
            this.f53354F = 1;
            this.f53353C.f53369b = c8254b;
            this.f53353C = c8254b;
        } else {
            this.f53353C.f53368a[i] = t;
            this.f53354F = i + 1;
        }
        this.f53360f++;
        for (C8253a<T> c8253a : this.f53359e.get()) {
            m14606f(c8253a);
        }
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        fdgVar.request(Long.MAX_VALUE);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C8253a<T> c8253a = new C8253a<>(ycgVar, this);
        ycgVar.onSubscribe(c8253a);
        m14602b(c8253a);
        if (this.f53357c.get() || !this.f53357c.compareAndSet(false, true)) {
            m14606f(c8253a);
        } else {
            this.f52360b.subscribe((lj6) this);
        }
    }
}
