package p000;

import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.f40;

/* JADX INFO: loaded from: classes6.dex */
public final class q01<T> extends xxd<T> {

    /* JADX INFO: renamed from: f */
    public static final Object[] f72620f = new Object[0];

    /* JADX INFO: renamed from: m */
    public static final C11200a[] f72621m = new C11200a[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference<T> f72622a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C11200a<T>[]> f72623b;

    /* JADX INFO: renamed from: c */
    public final Lock f72624c;

    /* JADX INFO: renamed from: d */
    public final Lock f72625d;

    /* JADX INFO: renamed from: e */
    public long f72626e;

    /* JADX INFO: renamed from: q01$a */
    public static final class C11200a<T> implements lf4, f40.InterfaceC5587a<T> {

        /* JADX INFO: renamed from: C */
        public long f72627C;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f72628a;

        /* JADX INFO: renamed from: b */
        public final q01<T> f72629b;

        /* JADX INFO: renamed from: c */
        public boolean f72630c;

        /* JADX INFO: renamed from: d */
        public boolean f72631d;

        /* JADX INFO: renamed from: e */
        public f40<T> f72632e;

        /* JADX INFO: renamed from: f */
        public boolean f72633f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f72634m;

        public C11200a(pxb<? super T> pxbVar, q01<T> q01Var) {
            this.f72628a = pxbVar;
            this.f72629b = q01Var;
        }

        /* JADX INFO: renamed from: a */
        public void m19905a() {
            if (this.f72634m) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f72634m) {
                        return;
                    }
                    if (this.f72630c) {
                        return;
                    }
                    q01<T> q01Var = this.f72629b;
                    Lock lock = q01Var.f72624c;
                    lock.lock();
                    this.f72627C = q01Var.f72626e;
                    T t = q01Var.f72622a.get();
                    lock.unlock();
                    this.f72631d = t != null;
                    this.f72630c = true;
                    if (t != null) {
                        test(t);
                        m19906b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m19906b() {
            f40<T> f40Var;
            while (!this.f72634m) {
                synchronized (this) {
                    try {
                        f40Var = this.f72632e;
                        if (f40Var == null) {
                            this.f72631d = false;
                            return;
                        }
                        this.f72632e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                f40Var.m10504c(this);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m19907c(T t, long j) {
            if (this.f72634m) {
                return;
            }
            if (!this.f72633f) {
                synchronized (this) {
                    try {
                        if (this.f72634m) {
                            return;
                        }
                        if (this.f72627C == j) {
                            return;
                        }
                        if (this.f72631d) {
                            f40<T> f40Var = this.f72632e;
                            if (f40Var == null) {
                                f40Var = new f40<>(4);
                                this.f72632e = f40Var;
                            }
                            f40Var.m10503b(t);
                            return;
                        }
                        this.f72630c = true;
                        this.f72633f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(t);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f72634m) {
                return;
            }
            this.f72634m = true;
            this.f72629b.m19902b(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f72634m;
        }

        @Override // p000.f40.InterfaceC5587a, p000.n8d
        public boolean test(T t) {
            if (this.f72634m) {
                return false;
            }
            this.f72628a.onNext(t);
            return false;
        }
    }

    public q01() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f72624c = reentrantReadWriteLock.readLock();
        this.f72625d = reentrantReadWriteLock.writeLock();
        this.f72623b = new AtomicReference<>(f72621m);
        this.f72622a = new AtomicReference<>();
    }

    @cfb
    @cy1
    public static <T> q01<T> create() {
        return new q01<>();
    }

    @cfb
    @cy1
    public static <T> q01<T> createDefault(@cfb T t) {
        return new q01<>(t);
    }

    /* JADX INFO: renamed from: a */
    public void m19901a(C11200a<T> c11200a) {
        C11200a<T>[] c11200aArr;
        C11200a[] c11200aArr2;
        do {
            c11200aArr = this.f72623b.get();
            int length = c11200aArr.length;
            c11200aArr2 = new C11200a[length + 1];
            System.arraycopy(c11200aArr, 0, c11200aArr2, 0, length);
            c11200aArr2[length] = c11200a;
        } while (!v7b.m23844a(this.f72623b, c11200aArr, c11200aArr2));
    }

    @Override // p000.xxd, p000.uu2
    public void accept(@cfb T t) {
        if (t == null) {
            throw new NullPointerException("value == null");
        }
        m19903c(t);
        for (C11200a<T> c11200a : this.f72623b.get()) {
            c11200a.m19907c(t, this.f72626e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19902b(C11200a<T> c11200a) {
        C11200a<T>[] c11200aArr;
        C11200a[] c11200aArr2;
        do {
            c11200aArr = this.f72623b.get();
            int length = c11200aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c11200aArr[i] == c11200a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c11200aArr2 = f72621m;
            } else {
                C11200a[] c11200aArr3 = new C11200a[length - 1];
                System.arraycopy(c11200aArr, 0, c11200aArr3, 0, i);
                System.arraycopy(c11200aArr, i + 1, c11200aArr3, i, (length - i) - 1);
                c11200aArr2 = c11200aArr3;
            }
        } while (!v7b.m23844a(this.f72623b, c11200aArr, c11200aArr2));
    }

    /* JADX INFO: renamed from: c */
    public void m19903c(@cfb T t) {
        this.f72625d.lock();
        this.f72626e++;
        this.f72622a.lazySet(t);
        this.f72625d.unlock();
    }

    /* JADX INFO: renamed from: d */
    public int m19904d() {
        return this.f72623b.get().length;
    }

    @dib
    public T getValue() {
        return this.f72622a.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] getValues() {
        Object[] objArr = f72620f;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // p000.xxd
    public boolean hasObservers() {
        return this.f72623b.get().length != 0;
    }

    public boolean hasValue() {
        return this.f72622a.get() != null;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> pxbVar) {
        C11200a<T> c11200a = new C11200a<>(pxbVar, this);
        pxbVar.onSubscribe(c11200a);
        m19901a(c11200a);
        if (c11200a.f72634m) {
            m19902b(c11200a);
        } else {
            c11200a.m19905a();
        }
    }

    @Deprecated
    public T[] getValues(T[] tArr) {
        T t = this.f72622a.get();
        if (t == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length != 0) {
            tArr[0] = t;
            if (tArr.length == 1) {
                return tArr;
            }
            tArr[1] = null;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
        tArr2[0] = t;
        return tArr2;
    }

    public q01(@cfb T t) {
        this();
        if (t != null) {
            this.f72622a.lazySet(t);
            return;
        }
        throw new NullPointerException("defaultValue == null");
    }
}
