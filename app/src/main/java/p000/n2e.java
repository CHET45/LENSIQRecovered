package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class n2e<T> extends xxd<T> {

    /* JADX INFO: renamed from: c */
    public static final C9659c[] f63067c = new C9659c[0];

    /* JADX INFO: renamed from: d */
    public static final Object[] f63068d = new Object[0];

    /* JADX INFO: renamed from: a */
    public final InterfaceC9658b<T> f63069a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C9659c<T>[]> f63070b = new AtomicReference<>(f63067c);

    /* JADX INFO: renamed from: n2e$a */
    public static final class C9657a<T> extends AtomicReference<C9657a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a */
        public final T f63071a;

        public C9657a(T t) {
            this.f63071a = t;
        }
    }

    /* JADX INFO: renamed from: n2e$b */
    public interface InterfaceC9658b<T> {
        void add(T t);

        @dib
        T getValue();

        T[] getValues(T[] tArr);

        void replay(C9659c<T> c9659c);

        int size();

        void trimHead();
    }

    /* JADX INFO: renamed from: n2e$c */
    public static final class C9659c<T> extends AtomicInteger implements lf4 {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f63072a;

        /* JADX INFO: renamed from: b */
        public final n2e<T> f63073b;

        /* JADX INFO: renamed from: c */
        public Object f63074c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f63075d;

        public C9659c(pxb<? super T> pxbVar, n2e<T> n2eVar) {
            this.f63072a = pxbVar;
            this.f63073b = n2eVar;
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f63075d) {
                return;
            }
            this.f63075d = true;
            this.f63073b.m17737d(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f63075d;
        }
    }

    /* JADX INFO: renamed from: n2e$d */
    public static final class C9660d<T> extends AtomicReference<Object> implements InterfaceC9658b<T> {
        private static final long serialVersionUID = -8056260896137901749L;

        /* JADX INFO: renamed from: a */
        public final int f63076a;

        /* JADX INFO: renamed from: b */
        public final long f63077b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f63078c;

        /* JADX INFO: renamed from: d */
        public final woe f63079d;

        /* JADX INFO: renamed from: e */
        public int f63080e;

        /* JADX INFO: renamed from: f */
        public volatile C9662f<T> f63081f;

        /* JADX INFO: renamed from: m */
        public C9662f<T> f63082m;

        public C9660d(int i, long j, TimeUnit timeUnit, woe woeVar) {
            if (i <= 0) {
                throw new IllegalArgumentException("maxSize > 0 required but it was " + i);
            }
            if (j <= 0) {
                throw new IllegalArgumentException("maxAge > 0 required but it was " + j);
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (woeVar == null) {
                throw new NullPointerException("scheduler == null");
            }
            this.f63076a = i;
            this.f63077b = j;
            this.f63078c = timeUnit;
            this.f63079d = woeVar;
            C9662f<T> c9662f = new C9662f<>(null, 0L);
            this.f63082m = c9662f;
            this.f63081f = c9662f;
        }

        /* JADX INFO: renamed from: a */
        public C9662f<T> m17739a() {
            C9662f<T> c9662f;
            C9662f<T> c9662f2 = this.f63081f;
            long jNow = this.f63079d.now(this.f63078c) - this.f63077b;
            C9662f<T> c9662f3 = c9662f2.get();
            while (true) {
                C9662f<T> c9662f4 = c9662f3;
                c9662f = c9662f2;
                c9662f2 = c9662f4;
                if (c9662f2 == null || c9662f2.f63088b > jNow) {
                    break;
                }
                c9662f3 = c9662f2.get();
            }
            return c9662f;
        }

        @Override // p000.n2e.InterfaceC9658b
        public void add(T t) {
            C9662f<T> c9662f = new C9662f<>(t, this.f63079d.now(this.f63078c));
            C9662f<T> c9662f2 = this.f63082m;
            this.f63082m = c9662f;
            this.f63080e++;
            c9662f2.set(c9662f);
            m17741c();
        }

        /* JADX INFO: renamed from: b */
        public int m17740b(C9662f<T> c9662f) {
            int i = 0;
            while (i != Integer.MAX_VALUE && (c9662f = c9662f.get()) != null) {
                i++;
            }
            return i;
        }

        /* JADX INFO: renamed from: c */
        public void m17741c() {
            int i = this.f63080e;
            if (i > this.f63076a) {
                this.f63080e = i - 1;
                this.f63081f = this.f63081f.get();
            }
            long jNow = this.f63079d.now(this.f63078c) - this.f63077b;
            C9662f<T> c9662f = this.f63081f;
            while (this.f63080e > 1) {
                C9662f<T> c9662f2 = c9662f.get();
                if (c9662f2 == null) {
                    this.f63081f = c9662f;
                    return;
                } else if (c9662f2.f63088b > jNow) {
                    this.f63081f = c9662f;
                    return;
                } else {
                    this.f63080e--;
                    c9662f = c9662f2;
                }
            }
            this.f63081f = c9662f;
        }

        @Override // p000.n2e.InterfaceC9658b
        @dib
        public T getValue() {
            C9662f<T> c9662f = this.f63081f;
            while (true) {
                C9662f<T> c9662f2 = c9662f.get();
                if (c9662f2 == null) {
                    break;
                }
                c9662f = c9662f2;
            }
            if (c9662f.f63088b < this.f63079d.now(this.f63078c) - this.f63077b) {
                return null;
            }
            return c9662f.f63087a;
        }

        @Override // p000.n2e.InterfaceC9658b
        public T[] getValues(T[] tArr) {
            C9662f<T> c9662fM17739a = m17739a();
            int iM17740b = m17740b(c9662fM17739a);
            if (iM17740b != 0) {
                if (tArr.length < iM17740b) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iM17740b));
                }
                for (int i = 0; i != iM17740b; i++) {
                    c9662fM17739a = c9662fM17739a.get();
                    tArr[i] = c9662fM17739a.f63087a;
                }
                if (tArr.length > iM17740b) {
                    tArr[iM17740b] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // p000.n2e.InterfaceC9658b
        public void replay(C9659c<T> c9659c) {
            if (c9659c.getAndIncrement() != 0) {
                return;
            }
            pxb<? super T> pxbVar = c9659c.f63072a;
            C9662f<T> c9662fM17739a = (C9662f) c9659c.f63074c;
            int iAddAndGet = 1;
            if (c9662fM17739a == null) {
                c9662fM17739a = m17739a();
            }
            while (!c9659c.f63075d) {
                while (!c9659c.f63075d) {
                    C9662f<T> c9662f = c9662fM17739a.get();
                    if (c9662f != null) {
                        pxbVar.onNext(c9662f.f63087a);
                        c9662fM17739a = c9662f;
                    } else if (c9662fM17739a.get() == null) {
                        c9659c.f63074c = c9662fM17739a;
                        iAddAndGet = c9659c.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                c9659c.f63074c = null;
                return;
            }
            c9659c.f63074c = null;
        }

        @Override // p000.n2e.InterfaceC9658b
        public int size() {
            return m17740b(m17739a());
        }

        @Override // p000.n2e.InterfaceC9658b
        public void trimHead() {
            C9662f<T> c9662f = this.f63081f;
            if (c9662f.f63087a != null) {
                C9662f<T> c9662f2 = new C9662f<>(null, 0L);
                c9662f2.lazySet(c9662f.get());
                this.f63081f = c9662f2;
            }
        }
    }

    /* JADX INFO: renamed from: n2e$e */
    public static final class C9661e<T> extends AtomicReference<Object> implements InterfaceC9658b<T> {
        private static final long serialVersionUID = 1107649250281456395L;

        /* JADX INFO: renamed from: a */
        public final int f63083a;

        /* JADX INFO: renamed from: b */
        public int f63084b;

        /* JADX INFO: renamed from: c */
        public volatile C9657a<T> f63085c;

        /* JADX INFO: renamed from: d */
        public C9657a<T> f63086d;

        public C9661e(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("maxSize > 0 required but it was " + i);
            }
            this.f63083a = i;
            C9657a<T> c9657a = new C9657a<>(null);
            this.f63086d = c9657a;
            this.f63085c = c9657a;
        }

        /* JADX INFO: renamed from: a */
        public void m17742a() {
            int i = this.f63084b;
            if (i > this.f63083a) {
                this.f63084b = i - 1;
                this.f63085c = this.f63085c.get();
            }
        }

        @Override // p000.n2e.InterfaceC9658b
        public void add(T t) {
            C9657a<T> c9657a = new C9657a<>(t);
            C9657a<T> c9657a2 = this.f63086d;
            this.f63086d = c9657a;
            this.f63084b++;
            c9657a2.set(c9657a);
            m17742a();
        }

        @Override // p000.n2e.InterfaceC9658b
        @dib
        public T getValue() {
            C9657a<T> c9657a = this.f63085c;
            while (true) {
                C9657a<T> c9657a2 = c9657a.get();
                if (c9657a2 == null) {
                    return c9657a.f63071a;
                }
                c9657a = c9657a2;
            }
        }

        @Override // p000.n2e.InterfaceC9658b
        public T[] getValues(T[] tArr) {
            C9657a<T> c9657a = this.f63085c;
            int size = size();
            if (size != 0) {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i = 0; i != size; i++) {
                    c9657a = c9657a.get();
                    tArr[i] = c9657a.f63071a;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // p000.n2e.InterfaceC9658b
        public void replay(C9659c<T> c9659c) {
            if (c9659c.getAndIncrement() != 0) {
                return;
            }
            pxb<? super T> pxbVar = c9659c.f63072a;
            C9657a<T> c9657a = (C9657a) c9659c.f63074c;
            int iAddAndGet = 1;
            if (c9657a == null) {
                c9657a = this.f63085c;
            }
            while (!c9659c.f63075d) {
                C9657a<T> c9657a2 = c9657a.get();
                if (c9657a2 != null) {
                    pxbVar.onNext(c9657a2.f63071a);
                    c9657a = c9657a2;
                } else if (c9657a.get() != null) {
                    continue;
                } else {
                    c9659c.f63074c = c9657a;
                    iAddAndGet = c9659c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            c9659c.f63074c = null;
        }

        @Override // p000.n2e.InterfaceC9658b
        public int size() {
            C9657a<T> c9657a = this.f63085c;
            int i = 0;
            while (i != Integer.MAX_VALUE && (c9657a = c9657a.get()) != null) {
                i++;
            }
            return i;
        }

        @Override // p000.n2e.InterfaceC9658b
        public void trimHead() {
            C9657a<T> c9657a = this.f63085c;
            if (c9657a.f63071a != null) {
                C9657a<T> c9657a2 = new C9657a<>(null);
                c9657a2.lazySet(c9657a.get());
                this.f63085c = c9657a2;
            }
        }
    }

    /* JADX INFO: renamed from: n2e$f */
    public static final class C9662f<T> extends AtomicReference<C9662f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a */
        public final T f63087a;

        /* JADX INFO: renamed from: b */
        public final long f63088b;

        public C9662f(T t, long j) {
            this.f63087a = t;
            this.f63088b = j;
        }
    }

    /* JADX INFO: renamed from: n2e$g */
    public static final class C9663g<T> extends AtomicReference<Object> implements InterfaceC9658b<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* JADX INFO: renamed from: a */
        public final List<T> f63089a;

        /* JADX INFO: renamed from: b */
        public volatile int f63090b;

        public C9663g(int i) {
            if (i > 0) {
                this.f63089a = new ArrayList(i);
                return;
            }
            throw new IllegalArgumentException("capacityHint > 0 required but it was " + i);
        }

        @Override // p000.n2e.InterfaceC9658b
        public void add(T t) {
            this.f63089a.add(t);
            this.f63090b++;
        }

        @Override // p000.n2e.InterfaceC9658b
        @dib
        public T getValue() {
            int i = this.f63090b;
            if (i != 0) {
                return this.f63089a.get(i - 1);
            }
            return null;
        }

        @Override // p000.n2e.InterfaceC9658b
        public T[] getValues(T[] tArr) {
            int i = this.f63090b;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            List<T> list = this.f63089a;
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // p000.n2e.InterfaceC9658b
        public void replay(C9659c<T> c9659c) {
            int iIntValue;
            if (c9659c.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.f63089a;
            pxb<? super T> pxbVar = c9659c.f63072a;
            Integer num = (Integer) c9659c.f63074c;
            int iAddAndGet = 1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                c9659c.f63074c = 0;
            }
            while (!c9659c.f63075d) {
                int i = this.f63090b;
                while (i != iIntValue) {
                    if (c9659c.f63075d) {
                        c9659c.f63074c = null;
                        return;
                    } else {
                        pxbVar.onNext(list.get(iIntValue));
                        iIntValue++;
                    }
                }
                if (iIntValue == this.f63090b) {
                    c9659c.f63074c = Integer.valueOf(iIntValue);
                    iAddAndGet = c9659c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            c9659c.f63074c = null;
        }

        @Override // p000.n2e.InterfaceC9658b
        public int size() {
            return this.f63090b;
        }

        @Override // p000.n2e.InterfaceC9658b
        public void trimHead() {
        }
    }

    public n2e(InterfaceC9658b<T> interfaceC9658b) {
        this.f63069a = interfaceC9658b;
    }

    /* JADX INFO: renamed from: b */
    public static <T> n2e<T> m17734b() {
        return new n2e<>(new C9661e(Integer.MAX_VALUE));
    }

    @cfb
    @cy1
    public static <T> n2e<T> create() {
        return new n2e<>(new C9663g(16));
    }

    @cfb
    @cy1
    public static <T> n2e<T> createWithSize(int i) {
        return new n2e<>(new C9661e(i));
    }

    @cfb
    @cy1
    public static <T> n2e<T> createWithTime(long j, TimeUnit timeUnit, woe woeVar) {
        return new n2e<>(new C9660d(Integer.MAX_VALUE, j, timeUnit, woeVar));
    }

    @cfb
    @cy1
    public static <T> n2e<T> createWithTimeAndSize(long j, TimeUnit timeUnit, woe woeVar, int i) {
        return new n2e<>(new C9660d(i, j, timeUnit, woeVar));
    }

    /* JADX INFO: renamed from: a */
    public boolean m17735a(C9659c<T> c9659c) {
        C9659c<T>[] c9659cArr;
        C9659c[] c9659cArr2;
        do {
            c9659cArr = this.f63070b.get();
            int length = c9659cArr.length;
            c9659cArr2 = new C9659c[length + 1];
            System.arraycopy(c9659cArr, 0, c9659cArr2, 0, length);
            c9659cArr2[length] = c9659c;
        } while (!v7b.m23844a(this.f63070b, c9659cArr, c9659cArr2));
        return true;
    }

    @Override // p000.xxd, p000.uu2
    public void accept(@cfb T t) {
        if (t == null) {
            throw new NullPointerException("value == null");
        }
        InterfaceC9658b<T> interfaceC9658b = this.f63069a;
        interfaceC9658b.add(t);
        for (C9659c<T> c9659c : this.f63070b.get()) {
            interfaceC9658b.replay(c9659c);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m17736c() {
        return this.f63070b.get().length;
    }

    public void cleanupBuffer() {
        this.f63069a.trimHead();
    }

    /* JADX INFO: renamed from: d */
    public void m17737d(C9659c<T> c9659c) {
        C9659c<T>[] c9659cArr;
        C9659c[] c9659cArr2;
        do {
            c9659cArr = this.f63070b.get();
            if (c9659cArr == f63067c) {
                return;
            }
            int length = c9659cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c9659cArr[i] == c9659c) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c9659cArr2 = f63067c;
            } else {
                C9659c[] c9659cArr3 = new C9659c[length - 1];
                System.arraycopy(c9659cArr, 0, c9659cArr3, 0, i);
                System.arraycopy(c9659cArr, i + 1, c9659cArr3, i, (length - i) - 1);
                c9659cArr2 = c9659cArr3;
            }
        } while (!v7b.m23844a(this.f63070b, c9659cArr, c9659cArr2));
    }

    /* JADX INFO: renamed from: e */
    public int m17738e() {
        return this.f63069a.size();
    }

    @dib
    public T getValue() {
        return this.f63069a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f63068d;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // p000.xxd
    public boolean hasObservers() {
        return this.f63070b.get().length != 0;
    }

    public boolean hasValue() {
        return this.f63069a.size() != 0;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> pxbVar) {
        C9659c<T> c9659c = new C9659c<>(pxbVar, this);
        pxbVar.onSubscribe(c9659c);
        if (c9659c.f63075d) {
            return;
        }
        if (m17735a(c9659c) && c9659c.f63075d) {
            m17737d(c9659c);
        } else {
            this.f63069a.replay(c9659c);
        }
    }

    @cfb
    @cy1
    public static <T> n2e<T> create(int i) {
        return new n2e<>(new C9663g(i));
    }

    public T[] getValues(T[] tArr) {
        return this.f63069a.getValues(tArr);
    }
}
