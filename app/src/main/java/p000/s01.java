package p000;

import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.g40;

/* JADX INFO: loaded from: classes7.dex */
public final class s01<T> extends mcg<T> {

    /* JADX INFO: renamed from: C */
    public static final Object[] f80241C = new Object[0];

    /* JADX INFO: renamed from: F */
    public static final C12382a[] f80242F = new C12382a[0];

    /* JADX INFO: renamed from: H */
    public static final C12382a[] f80243H = new C12382a[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference<Object> f80244a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C12382a<T>[]> f80245b;

    /* JADX INFO: renamed from: c */
    public final ReadWriteLock f80246c;

    /* JADX INFO: renamed from: d */
    public final Lock f80247d;

    /* JADX INFO: renamed from: e */
    public final Lock f80248e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference<Throwable> f80249f;

    /* JADX INFO: renamed from: m */
    public long f80250m;

    /* JADX INFO: renamed from: s01$a */
    public static final class C12382a<T> implements mf4, g40.InterfaceC6115a<Object> {

        /* JADX INFO: renamed from: C */
        public long f80251C;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f80252a;

        /* JADX INFO: renamed from: b */
        public final s01<T> f80253b;

        /* JADX INFO: renamed from: c */
        public boolean f80254c;

        /* JADX INFO: renamed from: d */
        public boolean f80255d;

        /* JADX INFO: renamed from: e */
        public g40<Object> f80256e;

        /* JADX INFO: renamed from: f */
        public boolean f80257f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f80258m;

        public C12382a(oxb<? super T> oxbVar, s01<T> s01Var) {
            this.f80252a = oxbVar;
            this.f80253b = s01Var;
        }

        /* JADX INFO: renamed from: a */
        public void m21628a() {
            if (this.f80258m) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f80258m) {
                        return;
                    }
                    if (this.f80254c) {
                        return;
                    }
                    s01<T> s01Var = this.f80253b;
                    Lock lock = s01Var.f80247d;
                    lock.lock();
                    this.f80251C = s01Var.f80250m;
                    Object obj = s01Var.f80244a.get();
                    lock.unlock();
                    this.f80255d = obj != null;
                    this.f80254c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    m21629b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m21629b() {
            g40<Object> g40Var;
            while (!this.f80258m) {
                synchronized (this) {
                    try {
                        g40Var = this.f80256e;
                        if (g40Var == null) {
                            this.f80255d = false;
                            return;
                        }
                        this.f80256e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                g40Var.forEachWhile(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m21630c(Object obj, long j) {
            if (this.f80258m) {
                return;
            }
            if (!this.f80257f) {
                synchronized (this) {
                    try {
                        if (this.f80258m) {
                            return;
                        }
                        if (this.f80251C == j) {
                            return;
                        }
                        if (this.f80255d) {
                            g40<Object> g40Var = this.f80256e;
                            if (g40Var == null) {
                                g40Var = new g40<>(4);
                                this.f80256e = g40Var;
                            }
                            g40Var.add(obj);
                            return;
                        }
                        this.f80254c = true;
                        this.f80257f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f80258m) {
                return;
            }
            this.f80258m = true;
            this.f80253b.m21624b(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f80258m;
        }

        @Override // p000.g40.InterfaceC6115a, p000.m8d
        public boolean test(Object obj) {
            return this.f80258m || ehb.accept(obj, this.f80252a);
        }
    }

    public s01() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f80246c = reentrantReadWriteLock;
        this.f80247d = reentrantReadWriteLock.readLock();
        this.f80248e = reentrantReadWriteLock.writeLock();
        this.f80245b = new AtomicReference<>(f80242F);
        this.f80244a = new AtomicReference<>();
        this.f80249f = new AtomicReference<>();
    }

    @bfb
    @by1
    public static <T> s01<T> create() {
        return new s01<>();
    }

    @bfb
    @by1
    public static <T> s01<T> createDefault(T t) {
        return new s01<>(t);
    }

    /* JADX INFO: renamed from: a */
    public boolean m21623a(C12382a<T> c12382a) {
        C12382a<T>[] c12382aArr;
        C12382a[] c12382aArr2;
        do {
            c12382aArr = this.f80245b.get();
            if (c12382aArr == f80243H) {
                return false;
            }
            int length = c12382aArr.length;
            c12382aArr2 = new C12382a[length + 1];
            System.arraycopy(c12382aArr, 0, c12382aArr2, 0, length);
            c12382aArr2[length] = c12382a;
        } while (!v7b.m23844a(this.f80245b, c12382aArr, c12382aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m21624b(C12382a<T> c12382a) {
        C12382a<T>[] c12382aArr;
        C12382a[] c12382aArr2;
        do {
            c12382aArr = this.f80245b.get();
            int length = c12382aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c12382aArr[i] == c12382a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c12382aArr2 = f80242F;
            } else {
                C12382a[] c12382aArr3 = new C12382a[length - 1];
                System.arraycopy(c12382aArr, 0, c12382aArr3, 0, i);
                System.arraycopy(c12382aArr, i + 1, c12382aArr3, i, (length - i) - 1);
                c12382aArr2 = c12382aArr3;
            }
        } while (!v7b.m23844a(this.f80245b, c12382aArr, c12382aArr2));
    }

    /* JADX INFO: renamed from: c */
    public void m21625c(Object obj) {
        this.f80248e.lock();
        this.f80250m++;
        this.f80244a.lazySet(obj);
        this.f80248e.unlock();
    }

    /* JADX INFO: renamed from: d */
    public int m21626d() {
        return this.f80245b.get().length;
    }

    /* JADX INFO: renamed from: e */
    public C12382a<T>[] m21627e(Object obj) {
        AtomicReference<C12382a<T>[]> atomicReference = this.f80245b;
        C12382a<T>[] c12382aArr = f80243H;
        C12382a<T>[] andSet = atomicReference.getAndSet(c12382aArr);
        if (andSet != c12382aArr) {
            m21625c(obj);
        }
        return andSet;
    }

    @Override // p000.mcg
    @cib
    public Throwable getThrowable() {
        Object obj = this.f80244a.get();
        if (ehb.isError(obj)) {
            return ehb.getError(obj);
        }
        return null;
    }

    @cib
    public T getValue() {
        Object obj = this.f80244a.get();
        if (ehb.isComplete(obj) || ehb.isError(obj)) {
            return null;
        }
        return (T) ehb.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] getValues() {
        Object[] objArr = f80241C;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // p000.mcg
    public boolean hasComplete() {
        return ehb.isComplete(this.f80244a.get());
    }

    @Override // p000.mcg
    public boolean hasObservers() {
        return this.f80245b.get().length != 0;
    }

    @Override // p000.mcg
    public boolean hasThrowable() {
        return ehb.isError(this.f80244a.get());
    }

    public boolean hasValue() {
        Object obj = this.f80244a.get();
        return (obj == null || ehb.isComplete(obj) || ehb.isError(obj)) ? false : true;
    }

    @Override // p000.oxb
    public void onComplete() {
        if (v7b.m23844a(this.f80249f, null, j75.f49698a)) {
            Object objComplete = ehb.complete();
            for (C12382a<T> c12382a : m21627e(objComplete)) {
                c12382a.m21630c(objComplete, this.f80250m);
            }
        }
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!v7b.m23844a(this.f80249f, null, th)) {
            pfe.onError(th);
            return;
        }
        Object objError = ehb.error(th);
        for (C12382a<T> c12382a : m21627e(objError)) {
            c12382a.m21630c(objError, this.f80250m);
        }
    }

    @Override // p000.oxb
    public void onNext(T t) {
        xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f80249f.get() != null) {
            return;
        }
        Object next = ehb.next(t);
        m21625c(next);
        for (C12382a<T> c12382a : this.f80245b.get()) {
            c12382a.m21630c(next, this.f80250m);
        }
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        if (this.f80249f.get() != null) {
            mf4Var.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C12382a<T> c12382a = new C12382a<>(oxbVar, this);
        oxbVar.onSubscribe(c12382a);
        if (m21623a(c12382a)) {
            if (c12382a.f80258m) {
                m21624b(c12382a);
                return;
            } else {
                c12382a.m21628a();
                return;
            }
        }
        Throwable th = this.f80249f.get();
        if (th == j75.f49698a) {
            oxbVar.onComplete();
        } else {
            oxbVar.onError(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] getValues(T[] tArr) {
        Object obj = this.f80244a.get();
        if (obj != null && !ehb.isComplete(obj) && !ehb.isError(obj)) {
            Object value = ehb.getValue(obj);
            if (tArr.length != 0) {
                tArr[0] = value;
                if (tArr.length == 1) {
                    return tArr;
                }
                tArr[1] = 0;
                return tArr;
            }
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
            tArr2[0] = value;
            return tArr2;
        }
        if (tArr.length != 0) {
            tArr[0] = 0;
        }
        return tArr;
    }

    public s01(T t) {
        this();
        this.f80244a.lazySet(xjb.requireNonNull(t, "defaultValue is null"));
    }
}
