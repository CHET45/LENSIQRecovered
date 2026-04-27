package p000;

import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.g40;

/* JADX INFO: loaded from: classes7.dex */
public final class o01<T> extends rg6<T> {

    /* JADX INFO: renamed from: F */
    public static final Object[] f66131F = new Object[0];

    /* JADX INFO: renamed from: H */
    public static final C10127a[] f66132H = new C10127a[0];

    /* JADX INFO: renamed from: L */
    public static final C10127a[] f66133L = new C10127a[0];

    /* JADX INFO: renamed from: C */
    public long f66134C;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C10127a<T>[]> f66135b;

    /* JADX INFO: renamed from: c */
    public final ReadWriteLock f66136c;

    /* JADX INFO: renamed from: d */
    public final Lock f66137d;

    /* JADX INFO: renamed from: e */
    public final Lock f66138e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference<Object> f66139f;

    /* JADX INFO: renamed from: m */
    public final AtomicReference<Throwable> f66140m;

    /* JADX INFO: renamed from: o01$a */
    public static final class C10127a<T> extends AtomicLong implements fdg, g40.InterfaceC6115a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;

        /* JADX INFO: renamed from: C */
        public long f66141C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f66142a;

        /* JADX INFO: renamed from: b */
        public final o01<T> f66143b;

        /* JADX INFO: renamed from: c */
        public boolean f66144c;

        /* JADX INFO: renamed from: d */
        public boolean f66145d;

        /* JADX INFO: renamed from: e */
        public g40<Object> f66146e;

        /* JADX INFO: renamed from: f */
        public boolean f66147f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f66148m;

        public C10127a(ycg<? super T> ycgVar, o01<T> o01Var) {
            this.f66142a = ycgVar;
            this.f66143b = o01Var;
        }

        /* JADX INFO: renamed from: a */
        public void m18239a() {
            if (this.f66148m) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f66148m) {
                        return;
                    }
                    if (this.f66144c) {
                        return;
                    }
                    o01<T> o01Var = this.f66143b;
                    Lock lock = o01Var.f66137d;
                    lock.lock();
                    this.f66141C = o01Var.f66134C;
                    Object obj = o01Var.f66139f.get();
                    lock.unlock();
                    this.f66145d = obj != null;
                    this.f66144c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    m18240b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m18240b() {
            g40<Object> g40Var;
            while (!this.f66148m) {
                synchronized (this) {
                    try {
                        g40Var = this.f66146e;
                        if (g40Var == null) {
                            this.f66145d = false;
                            return;
                        }
                        this.f66146e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                g40Var.forEachWhile(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m18241c(Object obj, long j) {
            if (this.f66148m) {
                return;
            }
            if (!this.f66147f) {
                synchronized (this) {
                    try {
                        if (this.f66148m) {
                            return;
                        }
                        if (this.f66141C == j) {
                            return;
                        }
                        if (this.f66145d) {
                            g40<Object> g40Var = this.f66146e;
                            if (g40Var == null) {
                                g40Var = new g40<>(4);
                                this.f66146e = g40Var;
                            }
                            g40Var.add(obj);
                            return;
                        }
                        this.f66144c = true;
                        this.f66147f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f66148m) {
                return;
            }
            this.f66148m = true;
            this.f66143b.m18235c(this);
        }

        public boolean isFull() {
            return get() == 0;
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this, j);
            }
        }

        @Override // p000.g40.InterfaceC6115a, p000.m8d
        public boolean test(Object obj) {
            if (this.f66148m) {
                return true;
            }
            if (ehb.isComplete(obj)) {
                this.f66142a.onComplete();
                return true;
            }
            if (ehb.isError(obj)) {
                this.f66142a.onError(ehb.getError(obj));
                return true;
            }
            long j = get();
            if (j == 0) {
                cancel();
                this.f66142a.onError(new cwa("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f66142a.onNext((Object) ehb.getValue(obj));
            if (j == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public o01() {
        this.f66139f = new AtomicReference<>();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f66136c = reentrantReadWriteLock;
        this.f66137d = reentrantReadWriteLock.readLock();
        this.f66138e = reentrantReadWriteLock.writeLock();
        this.f66135b = new AtomicReference<>(f66132H);
        this.f66140m = new AtomicReference<>();
    }

    @bfb
    @by1
    public static <T> o01<T> create() {
        return new o01<>();
    }

    @bfb
    @by1
    public static <T> o01<T> createDefault(T t) {
        xjb.requireNonNull(t, "defaultValue is null");
        return new o01<>(t);
    }

    /* JADX INFO: renamed from: b */
    public boolean m18234b(C10127a<T> c10127a) {
        C10127a<T>[] c10127aArr;
        C10127a[] c10127aArr2;
        do {
            c10127aArr = this.f66135b.get();
            if (c10127aArr == f66133L) {
                return false;
            }
            int length = c10127aArr.length;
            c10127aArr2 = new C10127a[length + 1];
            System.arraycopy(c10127aArr, 0, c10127aArr2, 0, length);
            c10127aArr2[length] = c10127a;
        } while (!v7b.m23844a(this.f66135b, c10127aArr, c10127aArr2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m18235c(C10127a<T> c10127a) {
        C10127a<T>[] c10127aArr;
        C10127a[] c10127aArr2;
        do {
            c10127aArr = this.f66135b.get();
            int length = c10127aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c10127aArr[i] == c10127a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c10127aArr2 = f66132H;
            } else {
                C10127a[] c10127aArr3 = new C10127a[length - 1];
                System.arraycopy(c10127aArr, 0, c10127aArr3, 0, i);
                System.arraycopy(c10127aArr, i + 1, c10127aArr3, i, (length - i) - 1);
                c10127aArr2 = c10127aArr3;
            }
        } while (!v7b.m23844a(this.f66135b, c10127aArr, c10127aArr2));
    }

    /* JADX INFO: renamed from: d */
    public void m18236d(Object obj) {
        Lock lock = this.f66138e;
        lock.lock();
        this.f66134C++;
        this.f66139f.lazySet(obj);
        lock.unlock();
    }

    /* JADX INFO: renamed from: e */
    public int m18237e() {
        return this.f66135b.get().length;
    }

    /* JADX INFO: renamed from: f */
    public C10127a<T>[] m18238f(Object obj) {
        C10127a<T>[] andSet = this.f66135b.get();
        C10127a<T>[] c10127aArr = f66133L;
        if (andSet != c10127aArr && (andSet = this.f66135b.getAndSet(c10127aArr)) != c10127aArr) {
            m18236d(obj);
        }
        return andSet;
    }

    @Override // p000.rg6
    @cib
    public Throwable getThrowable() {
        Object obj = this.f66139f.get();
        if (ehb.isError(obj)) {
            return ehb.getError(obj);
        }
        return null;
    }

    @cib
    public T getValue() {
        Object obj = this.f66139f.get();
        if (ehb.isComplete(obj) || ehb.isError(obj)) {
            return null;
        }
        return (T) ehb.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] getValues() {
        Object[] objArr = f66131F;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // p000.rg6
    public boolean hasComplete() {
        return ehb.isComplete(this.f66139f.get());
    }

    @Override // p000.rg6
    public boolean hasSubscribers() {
        return this.f66135b.get().length != 0;
    }

    @Override // p000.rg6
    public boolean hasThrowable() {
        return ehb.isError(this.f66139f.get());
    }

    public boolean hasValue() {
        Object obj = this.f66139f.get();
        return (obj == null || ehb.isComplete(obj) || ehb.isError(obj)) ? false : true;
    }

    public boolean offer(T t) {
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        C10127a<T>[] c10127aArr = this.f66135b.get();
        for (C10127a<T> c10127a : c10127aArr) {
            if (c10127a.isFull()) {
                return false;
            }
        }
        Object next = ehb.next(t);
        m18236d(next);
        for (C10127a<T> c10127a2 : c10127aArr) {
            c10127a2.m18241c(next, this.f66134C);
        }
        return true;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (v7b.m23844a(this.f66140m, null, j75.f49698a)) {
            Object objComplete = ehb.complete();
            for (C10127a<T> c10127a : m18238f(objComplete)) {
                c10127a.m18241c(objComplete, this.f66134C);
            }
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!v7b.m23844a(this.f66140m, null, th)) {
            pfe.onError(th);
            return;
        }
        Object objError = ehb.error(th);
        for (C10127a<T> c10127a : m18238f(objError)) {
            c10127a.m18241c(objError, this.f66134C);
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66140m.get() != null) {
            return;
        }
        Object next = ehb.next(t);
        m18236d(next);
        for (C10127a<T> c10127a : this.f66135b.get()) {
            c10127a.m18241c(next, this.f66134C);
        }
    }

    @Override // p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (this.f66140m.get() != null) {
            fdgVar.cancel();
        } else {
            fdgVar.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C10127a<T> c10127a = new C10127a<>(ycgVar, this);
        ycgVar.onSubscribe(c10127a);
        if (m18234b(c10127a)) {
            if (c10127a.f66148m) {
                m18235c(c10127a);
                return;
            } else {
                c10127a.m18239a();
                return;
            }
        }
        Throwable th = this.f66140m.get();
        if (th == j75.f49698a) {
            ycgVar.onComplete();
        } else {
            ycgVar.onError(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] getValues(T[] tArr) {
        Object obj = this.f66139f.get();
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

    public o01(T t) {
        this();
        this.f66139f.lazySet(xjb.requireNonNull(t, "defaultValue is null"));
    }
}
