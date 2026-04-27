package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.h40;

/* JADX INFO: loaded from: classes7.dex */
public final class p01<T> extends qg6<T> {

    /* JADX INFO: renamed from: F */
    public static final Object[] f69298F = new Object[0];

    /* JADX INFO: renamed from: H */
    public static final C10729a[] f69299H = new C10729a[0];

    /* JADX INFO: renamed from: L */
    public static final C10729a[] f69300L = new C10729a[0];

    /* JADX INFO: renamed from: C */
    public long f69301C;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C10729a<T>[]> f69302b;

    /* JADX INFO: renamed from: c */
    public final ReadWriteLock f69303c;

    /* JADX INFO: renamed from: d */
    public final Lock f69304d;

    /* JADX INFO: renamed from: e */
    public final Lock f69305e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference<Object> f69306f;

    /* JADX INFO: renamed from: m */
    public final AtomicReference<Throwable> f69307m;

    /* JADX INFO: renamed from: p01$a */
    public static final class C10729a<T> extends AtomicLong implements fdg, h40.InterfaceC6699a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;

        /* JADX INFO: renamed from: C */
        public long f69308C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f69309a;

        /* JADX INFO: renamed from: b */
        public final p01<T> f69310b;

        /* JADX INFO: renamed from: c */
        public boolean f69311c;

        /* JADX INFO: renamed from: d */
        public boolean f69312d;

        /* JADX INFO: renamed from: e */
        public h40<Object> f69313e;

        /* JADX INFO: renamed from: f */
        public boolean f69314f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f69315m;

        public C10729a(ycg<? super T> actual, p01<T> state) {
            this.f69309a = actual;
            this.f69310b = state;
        }

        /* JADX INFO: renamed from: a */
        public void m19132a() {
            if (this.f69315m) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f69315m) {
                        return;
                    }
                    if (this.f69311c) {
                        return;
                    }
                    p01<T> p01Var = this.f69310b;
                    Lock lock = p01Var.f69304d;
                    lock.lock();
                    this.f69308C = p01Var.f69301C;
                    Object obj = p01Var.f69306f.get();
                    lock.unlock();
                    this.f69312d = obj != null;
                    this.f69311c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    m19133b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m19133b() {
            h40<Object> h40Var;
            while (!this.f69315m) {
                synchronized (this) {
                    try {
                        h40Var = this.f69313e;
                        if (h40Var == null) {
                            this.f69312d = false;
                            return;
                        }
                        this.f69313e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                h40Var.forEachWhile(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m19134c(Object value, long stateIndex) {
            if (this.f69315m) {
                return;
            }
            if (!this.f69314f) {
                synchronized (this) {
                    try {
                        if (this.f69315m) {
                            return;
                        }
                        if (this.f69308C == stateIndex) {
                            return;
                        }
                        if (this.f69312d) {
                            h40<Object> h40Var = this.f69313e;
                            if (h40Var == null) {
                                h40Var = new h40<>(4);
                                this.f69313e = h40Var;
                            }
                            h40Var.add(value);
                            return;
                        }
                        this.f69311c = true;
                        this.f69314f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(value);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f69315m) {
                return;
            }
            this.f69315m = true;
            this.f69310b.m19128c(this);
        }

        public boolean isFull() {
            return get() == 0;
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this, n);
            }
        }

        @Override // p000.h40.InterfaceC6699a, p000.n8d
        public boolean test(Object obj) {
            if (this.f69315m) {
                return true;
            }
            if (fhb.isComplete(obj)) {
                this.f69309a.onComplete();
                return true;
            }
            if (fhb.isError(obj)) {
                this.f69309a.onError(fhb.getError(obj));
                return true;
            }
            long j = get();
            if (j == 0) {
                cancel();
                this.f69309a.onError(new bwa("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f69309a.onNext((Object) fhb.getValue(obj));
            if (j == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public p01() {
        this.f69306f = new AtomicReference<>();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f69303c = reentrantReadWriteLock;
        this.f69304d = reentrantReadWriteLock.readLock();
        this.f69305e = reentrantReadWriteLock.writeLock();
        this.f69302b = new AtomicReference<>(f69299H);
        this.f69307m = new AtomicReference<>();
    }

    @cfb
    @cy1
    public static <T> p01<T> create() {
        return new p01<>();
    }

    @cfb
    @cy1
    public static <T> p01<T> createDefault(T defaultValue) {
        Objects.requireNonNull(defaultValue, "defaultValue is null");
        return new p01<>(defaultValue);
    }

    /* JADX INFO: renamed from: b */
    public boolean m19127b(C10729a<T> rs) {
        C10729a<T>[] c10729aArr;
        C10729a[] c10729aArr2;
        do {
            c10729aArr = this.f69302b.get();
            if (c10729aArr == f69300L) {
                return false;
            }
            int length = c10729aArr.length;
            c10729aArr2 = new C10729a[length + 1];
            System.arraycopy(c10729aArr, 0, c10729aArr2, 0, length);
            c10729aArr2[length] = rs;
        } while (!v7b.m23844a(this.f69302b, c10729aArr, c10729aArr2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m19128c(C10729a<T> rs) {
        C10729a<T>[] c10729aArr;
        C10729a[] c10729aArr2;
        do {
            c10729aArr = this.f69302b.get();
            int length = c10729aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c10729aArr[i] == rs) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c10729aArr2 = f69299H;
            } else {
                C10729a[] c10729aArr3 = new C10729a[length - 1];
                System.arraycopy(c10729aArr, 0, c10729aArr3, 0, i);
                System.arraycopy(c10729aArr, i + 1, c10729aArr3, i, (length - i) - 1);
                c10729aArr2 = c10729aArr3;
            }
        } while (!v7b.m23844a(this.f69302b, c10729aArr, c10729aArr2));
    }

    /* JADX INFO: renamed from: d */
    public void m19129d(Object o) {
        Lock lock = this.f69305e;
        lock.lock();
        this.f69301C++;
        this.f69306f.lazySet(o);
        lock.unlock();
    }

    @cy1
    /* JADX INFO: renamed from: e */
    public int m19130e() {
        return this.f69302b.get().length;
    }

    /* JADX INFO: renamed from: f */
    public C10729a<T>[] m19131f(Object terminalValue) {
        m19129d(terminalValue);
        return this.f69302b.getAndSet(f69300L);
    }

    @Override // p000.qg6
    @dib
    @cy1
    public Throwable getThrowable() {
        Object obj = this.f69306f.get();
        if (fhb.isError(obj)) {
            return fhb.getError(obj);
        }
        return null;
    }

    @dib
    @cy1
    public T getValue() {
        Object obj = this.f69306f.get();
        if (fhb.isComplete(obj) || fhb.isError(obj)) {
            return null;
        }
        return (T) fhb.getValue(obj);
    }

    @Override // p000.qg6
    @cy1
    public boolean hasComplete() {
        return fhb.isComplete(this.f69306f.get());
    }

    @Override // p000.qg6
    @cy1
    public boolean hasSubscribers() {
        return this.f69302b.get().length != 0;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasThrowable() {
        return fhb.isError(this.f69306f.get());
    }

    @cy1
    public boolean hasValue() {
        Object obj = this.f69306f.get();
        return (obj == null || fhb.isComplete(obj) || fhb.isError(obj)) ? false : true;
    }

    @cy1
    public boolean offer(@cfb T t) {
        k75.nullCheck(t, "offer called with a null value.");
        C10729a<T>[] c10729aArr = this.f69302b.get();
        for (C10729a<T> c10729a : c10729aArr) {
            if (c10729a.isFull()) {
                return false;
            }
        }
        Object next = fhb.next(t);
        m19129d(next);
        for (C10729a<T> c10729a2 : c10729aArr) {
            c10729a2.m19134c(next, this.f69301C);
        }
        return true;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (v7b.m23844a(this.f69307m, null, k75.f52721a)) {
            Object objComplete = fhb.complete();
            for (C10729a<T> c10729a : m19131f(objComplete)) {
                c10729a.m19134c(objComplete, this.f69301C);
            }
        }
    }

    @Override // p000.ycg
    public void onError(@cfb Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        if (!v7b.m23844a(this.f69307m, null, t)) {
            ofe.onError(t);
            return;
        }
        Object objError = fhb.error(t);
        for (C10729a<T> c10729a : m19131f(objError)) {
            c10729a.m19134c(objError, this.f69301C);
        }
    }

    @Override // p000.ycg
    public void onNext(@cfb T t) {
        k75.nullCheck(t, "onNext called with a null value.");
        if (this.f69307m.get() != null) {
            return;
        }
        Object next = fhb.next(t);
        m19129d(next);
        for (C10729a<T> c10729a : this.f69302b.get()) {
            c10729a.m19134c(next, this.f69301C);
        }
    }

    @Override // p000.ycg
    public void onSubscribe(@cfb fdg s) {
        if (this.f69307m.get() != null) {
            s.cancel();
        } else {
            s.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.l86
    public void subscribeActual(@cfb ycg<? super T> s) {
        C10729a<T> c10729a = new C10729a<>(s, this);
        s.onSubscribe(c10729a);
        if (m19127b(c10729a)) {
            if (c10729a.f69315m) {
                m19128c(c10729a);
                return;
            } else {
                c10729a.m19132a();
                return;
            }
        }
        Throwable th = this.f69307m.get();
        if (th == k75.f52721a) {
            s.onComplete();
        } else {
            s.onError(th);
        }
    }

    public p01(T defaultValue) {
        this();
        this.f69306f.lazySet(defaultValue);
    }
}
