package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.h40;

/* JADX INFO: loaded from: classes7.dex */
public final class r01<T> extends ncg<T> {

    /* JADX INFO: renamed from: C */
    public static final C11775a[] f76427C = new C11775a[0];

    /* JADX INFO: renamed from: F */
    public static final C11775a[] f76428F = new C11775a[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference<Object> f76429a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C11775a<T>[]> f76430b;

    /* JADX INFO: renamed from: c */
    public final ReadWriteLock f76431c;

    /* JADX INFO: renamed from: d */
    public final Lock f76432d;

    /* JADX INFO: renamed from: e */
    public final Lock f76433e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference<Throwable> f76434f;

    /* JADX INFO: renamed from: m */
    public long f76435m;

    /* JADX INFO: renamed from: r01$a */
    public static final class C11775a<T> implements lf4, h40.InterfaceC6699a<Object> {

        /* JADX INFO: renamed from: C */
        public long f76436C;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f76437a;

        /* JADX INFO: renamed from: b */
        public final r01<T> f76438b;

        /* JADX INFO: renamed from: c */
        public boolean f76439c;

        /* JADX INFO: renamed from: d */
        public boolean f76440d;

        /* JADX INFO: renamed from: e */
        public h40<Object> f76441e;

        /* JADX INFO: renamed from: f */
        public boolean f76442f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f76443m;

        public C11775a(pxb<? super T> actual, r01<T> state) {
            this.f76437a = actual;
            this.f76438b = state;
        }

        /* JADX INFO: renamed from: a */
        public void m20726a() {
            if (this.f76443m) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f76443m) {
                        return;
                    }
                    if (this.f76439c) {
                        return;
                    }
                    r01<T> r01Var = this.f76438b;
                    Lock lock = r01Var.f76432d;
                    lock.lock();
                    this.f76436C = r01Var.f76435m;
                    Object obj = r01Var.f76429a.get();
                    lock.unlock();
                    this.f76440d = obj != null;
                    this.f76439c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    m20727b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m20727b() {
            h40<Object> h40Var;
            while (!this.f76443m) {
                synchronized (this) {
                    try {
                        h40Var = this.f76441e;
                        if (h40Var == null) {
                            this.f76440d = false;
                            return;
                        }
                        this.f76441e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                h40Var.forEachWhile(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m20728c(Object value, long stateIndex) {
            if (this.f76443m) {
                return;
            }
            if (!this.f76442f) {
                synchronized (this) {
                    try {
                        if (this.f76443m) {
                            return;
                        }
                        if (this.f76436C == stateIndex) {
                            return;
                        }
                        if (this.f76440d) {
                            h40<Object> h40Var = this.f76441e;
                            if (h40Var == null) {
                                h40Var = new h40<>(4);
                                this.f76441e = h40Var;
                            }
                            h40Var.add(value);
                            return;
                        }
                        this.f76439c = true;
                        this.f76442f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(value);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f76443m) {
                return;
            }
            this.f76443m = true;
            this.f76438b.m20722b(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f76443m;
        }

        @Override // p000.h40.InterfaceC6699a, p000.n8d
        public boolean test(Object o) {
            return this.f76443m || fhb.accept(o, this.f76437a);
        }
    }

    public r01(T defaultValue) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f76431c = reentrantReadWriteLock;
        this.f76432d = reentrantReadWriteLock.readLock();
        this.f76433e = reentrantReadWriteLock.writeLock();
        this.f76430b = new AtomicReference<>(f76427C);
        this.f76429a = new AtomicReference<>(defaultValue);
        this.f76434f = new AtomicReference<>();
    }

    @cfb
    @cy1
    public static <T> r01<T> create() {
        return new r01<>(null);
    }

    @cfb
    @cy1
    public static <T> r01<T> createDefault(T defaultValue) {
        Objects.requireNonNull(defaultValue, "defaultValue is null");
        return new r01<>(defaultValue);
    }

    /* JADX INFO: renamed from: a */
    public boolean m20721a(C11775a<T> rs) {
        C11775a<T>[] c11775aArr;
        C11775a[] c11775aArr2;
        do {
            c11775aArr = this.f76430b.get();
            if (c11775aArr == f76428F) {
                return false;
            }
            int length = c11775aArr.length;
            c11775aArr2 = new C11775a[length + 1];
            System.arraycopy(c11775aArr, 0, c11775aArr2, 0, length);
            c11775aArr2[length] = rs;
        } while (!v7b.m23844a(this.f76430b, c11775aArr, c11775aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m20722b(C11775a<T> rs) {
        C11775a<T>[] c11775aArr;
        C11775a[] c11775aArr2;
        do {
            c11775aArr = this.f76430b.get();
            int length = c11775aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c11775aArr[i] == rs) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c11775aArr2 = f76427C;
            } else {
                C11775a[] c11775aArr3 = new C11775a[length - 1];
                System.arraycopy(c11775aArr, 0, c11775aArr3, 0, i);
                System.arraycopy(c11775aArr, i + 1, c11775aArr3, i, (length - i) - 1);
                c11775aArr2 = c11775aArr3;
            }
        } while (!v7b.m23844a(this.f76430b, c11775aArr, c11775aArr2));
    }

    /* JADX INFO: renamed from: c */
    public void m20723c(Object o) {
        this.f76433e.lock();
        this.f76435m++;
        this.f76429a.lazySet(o);
        this.f76433e.unlock();
    }

    @cy1
    /* JADX INFO: renamed from: d */
    public int m20724d() {
        return this.f76430b.get().length;
    }

    /* JADX INFO: renamed from: e */
    public C11775a<T>[] m20725e(Object terminalValue) {
        m20723c(terminalValue);
        return this.f76430b.getAndSet(f76428F);
    }

    @Override // p000.ncg
    @dib
    @cy1
    public Throwable getThrowable() {
        Object obj = this.f76429a.get();
        if (fhb.isError(obj)) {
            return fhb.getError(obj);
        }
        return null;
    }

    @dib
    @cy1
    public T getValue() {
        Object obj = this.f76429a.get();
        if (fhb.isComplete(obj) || fhb.isError(obj)) {
            return null;
        }
        return (T) fhb.getValue(obj);
    }

    @Override // p000.ncg
    @cy1
    public boolean hasComplete() {
        return fhb.isComplete(this.f76429a.get());
    }

    @Override // p000.ncg
    @cy1
    public boolean hasObservers() {
        return this.f76430b.get().length != 0;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasThrowable() {
        return fhb.isError(this.f76429a.get());
    }

    @cy1
    public boolean hasValue() {
        Object obj = this.f76429a.get();
        return (obj == null || fhb.isComplete(obj) || fhb.isError(obj)) ? false : true;
    }

    @Override // p000.pxb
    public void onComplete() {
        if (v7b.m23844a(this.f76434f, null, k75.f52721a)) {
            Object objComplete = fhb.complete();
            for (C11775a<T> c11775a : m20725e(objComplete)) {
                c11775a.m20728c(objComplete, this.f76435m);
            }
        }
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        if (!v7b.m23844a(this.f76434f, null, t)) {
            ofe.onError(t);
            return;
        }
        Object objError = fhb.error(t);
        for (C11775a<T> c11775a : m20725e(objError)) {
            c11775a.m20728c(objError, this.f76435m);
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        k75.nullCheck(t, "onNext called with a null value.");
        if (this.f76434f.get() != null) {
            return;
        }
        Object next = fhb.next(t);
        m20723c(next);
        for (C11775a<T> c11775a : this.f76430b.get()) {
            c11775a.m20728c(next, this.f76435m);
        }
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        if (this.f76434f.get() != null) {
            d.dispose();
        }
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        C11775a<T> c11775a = new C11775a<>(observer, this);
        observer.onSubscribe(c11775a);
        if (m20721a(c11775a)) {
            if (c11775a.f76443m) {
                m20722b(c11775a);
                return;
            } else {
                c11775a.m20726a();
                return;
            }
        }
        Throwable th = this.f76434f.get();
        if (th == k75.f52721a) {
            observer.onComplete();
        } else {
            observer.onError(th);
        }
    }
}
