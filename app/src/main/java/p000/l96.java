package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class l96<T> extends AbstractC7714j1<T, T> implements kj6<T> {

    /* JADX INFO: renamed from: M */
    public static final C8726a[] f56884M = new C8726a[0];

    /* JADX INFO: renamed from: N */
    public static final C8726a[] f56885N = new C8726a[0];

    /* JADX INFO: renamed from: C */
    public C8727b<T> f56886C;

    /* JADX INFO: renamed from: F */
    public int f56887F;

    /* JADX INFO: renamed from: H */
    public Throwable f56888H;

    /* JADX INFO: renamed from: L */
    public volatile boolean f56889L;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f56890c;

    /* JADX INFO: renamed from: d */
    public final int f56891d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference<C8726a<T>[]> f56892e;

    /* JADX INFO: renamed from: f */
    public volatile long f56893f;

    /* JADX INFO: renamed from: m */
    public final C8727b<T> f56894m;

    /* JADX INFO: renamed from: l96$a */
    public static final class C8726a<T> extends AtomicInteger implements fdg {
        private static final long serialVersionUID = 6770240836423125754L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f56895a;

        /* JADX INFO: renamed from: b */
        public final l96<T> f56896b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f56897c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public C8727b<T> f56898d;

        /* JADX INFO: renamed from: e */
        public int f56899e;

        /* JADX INFO: renamed from: f */
        public long f56900f;

        public C8726a(ycg<? super T> downstream, l96<T> parent) {
            this.f56895a = downstream;
            this.f56896b = parent;
            this.f56898d = parent.f56894m;
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f56897c.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f56896b.m16012e(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.addCancel(this.f56897c, n);
                this.f56896b.m16013f(this);
            }
        }
    }

    /* JADX INFO: renamed from: l96$b */
    public static final class C8727b<T> {

        /* JADX INFO: renamed from: a */
        public final T[] f56901a;

        /* JADX INFO: renamed from: b */
        public volatile C8727b<T> f56902b;

        public C8727b(int i) {
            this.f56901a = (T[]) new Object[i];
        }
    }

    public l96(l86<T> source, int capacityHint) {
        super(source);
        this.f56891d = capacityHint;
        this.f56890c = new AtomicBoolean();
        C8727b<T> c8727b = new C8727b<>(capacityHint);
        this.f56894m = c8727b;
        this.f56886C = c8727b;
        this.f56892e = new AtomicReference<>(f56884M);
    }

    /* JADX INFO: renamed from: b */
    public void m16009b(C8726a<T> consumer) {
        C8726a<T>[] c8726aArr;
        C8726a[] c8726aArr2;
        do {
            c8726aArr = this.f56892e.get();
            if (c8726aArr == f56885N) {
                return;
            }
            int length = c8726aArr.length;
            c8726aArr2 = new C8726a[length + 1];
            System.arraycopy(c8726aArr, 0, c8726aArr2, 0, length);
            c8726aArr2[length] = consumer;
        } while (!v7b.m23844a(this.f56892e, c8726aArr, c8726aArr2));
    }

    /* JADX INFO: renamed from: c */
    public long m16010c() {
        return this.f56893f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m16011d() {
        return this.f56890c.get();
    }

    /* JADX INFO: renamed from: e */
    public void m16012e(C8726a<T> consumer) {
        C8726a<T>[] c8726aArr;
        C8726a[] c8726aArr2;
        do {
            c8726aArr = this.f56892e.get();
            int length = c8726aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c8726aArr[i] == consumer) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c8726aArr2 = f56884M;
            } else {
                C8726a[] c8726aArr3 = new C8726a[length - 1];
                System.arraycopy(c8726aArr, 0, c8726aArr3, 0, i);
                System.arraycopy(c8726aArr, i + 1, c8726aArr3, i, (length - i) - 1);
                c8726aArr2 = c8726aArr3;
            }
        } while (!v7b.m23844a(this.f56892e, c8726aArr, c8726aArr2));
    }

    /* JADX INFO: renamed from: f */
    public void m16013f(C8726a<T> c8726a) {
        if (c8726a.getAndIncrement() != 0) {
            return;
        }
        long j = c8726a.f56900f;
        int i = c8726a.f56899e;
        C8727b<T> c8727b = c8726a.f56898d;
        AtomicLong atomicLong = c8726a.f56897c;
        ycg<? super T> ycgVar = c8726a.f56895a;
        int i2 = this.f56891d;
        int iAddAndGet = 1;
        while (true) {
            boolean z = this.f56889L;
            boolean z2 = this.f56893f == j;
            if (z && z2) {
                c8726a.f56898d = null;
                Throwable th = this.f56888H;
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
                    c8726a.f56898d = null;
                    return;
                } else if (j2 != j) {
                    if (i == i2) {
                        c8727b = c8727b.f56902b;
                        i = 0;
                    }
                    ycgVar.onNext(c8727b.f56901a[i]);
                    i++;
                    j++;
                }
            }
            c8726a.f56900f = j;
            c8726a.f56899e = i;
            c8726a.f56898d = c8727b;
            iAddAndGet = c8726a.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public boolean hasSubscribers() {
        return this.f56892e.get().length != 0;
    }

    @Override // p000.ycg
    public void onComplete() {
        this.f56889L = true;
        for (C8726a<T> c8726a : this.f56892e.getAndSet(f56885N)) {
            m16013f(c8726a);
        }
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        if (this.f56889L) {
            ofe.onError(t);
            return;
        }
        this.f56888H = t;
        this.f56889L = true;
        for (C8726a<T> c8726a : this.f56892e.getAndSet(f56885N)) {
            m16013f(c8726a);
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        int i = this.f56887F;
        if (i == this.f56891d) {
            C8727b<T> c8727b = new C8727b<>(i);
            c8727b.f56901a[0] = t;
            this.f56887F = 1;
            this.f56886C.f56902b = c8727b;
            this.f56886C = c8727b;
        } else {
            this.f56886C.f56901a[i] = t;
            this.f56887F = i + 1;
        }
        this.f56893f++;
        for (C8726a<T> c8726a : this.f56892e.get()) {
            m16013f(c8726a);
        }
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        s.request(Long.MAX_VALUE);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> t) {
        C8726a<T> c8726a = new C8726a<>(t, this);
        t.onSubscribe(c8726a);
        m16009b(c8726a);
        if (this.f56890c.get() || !this.f56890c.compareAndSet(false, true)) {
            m16013f(c8726a);
        } else {
            this.f49321b.subscribe((kj6) this);
        }
    }
}
