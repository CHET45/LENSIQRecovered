package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class p2e<T> extends mcg<T> {

    /* JADX INFO: renamed from: d */
    public static final C10768c[] f69481d = new C10768c[0];

    /* JADX INFO: renamed from: e */
    public static final C10768c[] f69482e = new C10768c[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f69483f = new Object[0];

    /* JADX INFO: renamed from: a */
    public final InterfaceC10767b<T> f69484a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C10768c<T>[]> f69485b = new AtomicReference<>(f69481d);

    /* JADX INFO: renamed from: c */
    public boolean f69486c;

    /* JADX INFO: renamed from: p2e$a */
    public static final class C10766a<T> extends AtomicReference<C10766a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a */
        public final T f69487a;

        public C10766a(T t) {
            this.f69487a = t;
        }
    }

    /* JADX INFO: renamed from: p2e$b */
    public interface InterfaceC10767b<T> {
        void add(T t);

        void addFinal(Object obj);

        boolean compareAndSet(Object obj, Object obj2);

        Object get();

        @cib
        T getValue();

        T[] getValues(T[] tArr);

        void replay(C10768c<T> c10768c);

        int size();

        void trimHead();
    }

    /* JADX INFO: renamed from: p2e$c */
    public static final class C10768c<T> extends AtomicInteger implements mf4 {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f69488a;

        /* JADX INFO: renamed from: b */
        public final p2e<T> f69489b;

        /* JADX INFO: renamed from: c */
        public Object f69490c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f69491d;

        public C10768c(oxb<? super T> oxbVar, p2e<T> p2eVar) {
            this.f69488a = oxbVar;
            this.f69489b = p2eVar;
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f69491d) {
                return;
            }
            this.f69491d = true;
            this.f69489b.m19182d(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f69491d;
        }
    }

    /* JADX INFO: renamed from: p2e$d */
    public static final class C10769d<T> extends AtomicReference<Object> implements InterfaceC10767b<T> {
        private static final long serialVersionUID = -8056260896137901749L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f69492C;

        /* JADX INFO: renamed from: a */
        public final int f69493a;

        /* JADX INFO: renamed from: b */
        public final long f69494b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f69495c;

        /* JADX INFO: renamed from: d */
        public final voe f69496d;

        /* JADX INFO: renamed from: e */
        public int f69497e;

        /* JADX INFO: renamed from: f */
        public volatile C10771f<Object> f69498f;

        /* JADX INFO: renamed from: m */
        public C10771f<Object> f69499m;

        public C10769d(int i, long j, TimeUnit timeUnit, voe voeVar) {
            this.f69493a = xjb.verifyPositive(i, "maxSize");
            this.f69494b = xjb.verifyPositive(j, "maxAge");
            this.f69495c = (TimeUnit) xjb.requireNonNull(timeUnit, "unit is null");
            this.f69496d = (voe) xjb.requireNonNull(voeVar, "scheduler is null");
            C10771f<Object> c10771f = new C10771f<>(null, 0L);
            this.f69499m = c10771f;
            this.f69498f = c10771f;
        }

        /* JADX INFO: renamed from: a */
        public C10771f<Object> m19185a() {
            C10771f<Object> c10771f;
            C10771f<Object> c10771f2 = this.f69498f;
            long jNow = this.f69496d.now(this.f69495c) - this.f69494b;
            C10771f<T> c10771f3 = c10771f2.get();
            while (true) {
                C10771f<T> c10771f4 = c10771f3;
                c10771f = c10771f2;
                c10771f2 = c10771f4;
                if (c10771f2 == null || c10771f2.f69506b > jNow) {
                    break;
                }
                c10771f3 = c10771f2.get();
            }
            return c10771f;
        }

        @Override // p000.p2e.InterfaceC10767b
        public void add(T t) {
            C10771f<Object> c10771f = new C10771f<>(t, this.f69496d.now(this.f69495c));
            C10771f<Object> c10771f2 = this.f69499m;
            this.f69499m = c10771f;
            this.f69497e++;
            c10771f2.set(c10771f);
            m19187c();
        }

        @Override // p000.p2e.InterfaceC10767b
        public void addFinal(Object obj) {
            C10771f<Object> c10771f = new C10771f<>(obj, Long.MAX_VALUE);
            C10771f<Object> c10771f2 = this.f69499m;
            this.f69499m = c10771f;
            this.f69497e++;
            c10771f2.lazySet(c10771f);
            m19188d();
            this.f69492C = true;
        }

        /* JADX INFO: renamed from: b */
        public int m19186b(C10771f<Object> c10771f) {
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                C10771f<T> c10771f2 = c10771f.get();
                if (c10771f2 == null) {
                    Object obj = c10771f.f69505a;
                    return (ehb.isComplete(obj) || ehb.isError(obj)) ? i - 1 : i;
                }
                i++;
                c10771f = c10771f2;
            }
            return i;
        }

        /* JADX INFO: renamed from: c */
        public void m19187c() {
            int i = this.f69497e;
            if (i > this.f69493a) {
                this.f69497e = i - 1;
                this.f69498f = this.f69498f.get();
            }
            long jNow = this.f69496d.now(this.f69495c) - this.f69494b;
            C10771f<Object> c10771f = this.f69498f;
            while (this.f69497e > 1) {
                C10771f<T> c10771f2 = c10771f.get();
                if (c10771f2 == null) {
                    this.f69498f = c10771f;
                    return;
                } else if (c10771f2.f69506b > jNow) {
                    this.f69498f = c10771f;
                    return;
                } else {
                    this.f69497e--;
                    c10771f = c10771f2;
                }
            }
            this.f69498f = c10771f;
        }

        /* JADX INFO: renamed from: d */
        public void m19188d() {
            long jNow = this.f69496d.now(this.f69495c) - this.f69494b;
            C10771f<Object> c10771f = this.f69498f;
            while (true) {
                C10771f<T> c10771f2 = c10771f.get();
                if (c10771f2.get() == null) {
                    if (c10771f.f69505a == null) {
                        this.f69498f = c10771f;
                        return;
                    }
                    C10771f<Object> c10771f3 = new C10771f<>(null, 0L);
                    c10771f3.lazySet(c10771f.get());
                    this.f69498f = c10771f3;
                    return;
                }
                if (c10771f2.f69506b > jNow) {
                    if (c10771f.f69505a == null) {
                        this.f69498f = c10771f;
                        return;
                    }
                    C10771f<Object> c10771f4 = new C10771f<>(null, 0L);
                    c10771f4.lazySet(c10771f.get());
                    this.f69498f = c10771f4;
                    return;
                }
                c10771f = c10771f2;
            }
        }

        @Override // p000.p2e.InterfaceC10767b
        @cib
        public T getValue() {
            T t;
            C10771f<Object> c10771f = this.f69498f;
            C10771f<Object> c10771f2 = null;
            while (true) {
                C10771f<T> c10771f3 = c10771f.get();
                if (c10771f3 == null) {
                    break;
                }
                c10771f2 = c10771f;
                c10771f = c10771f3;
            }
            if (c10771f.f69506b >= this.f69496d.now(this.f69495c) - this.f69494b && (t = (T) c10771f.f69505a) != null) {
                return (ehb.isComplete(t) || ehb.isError(t)) ? (T) c10771f2.f69505a : t;
            }
            return null;
        }

        @Override // p000.p2e.InterfaceC10767b
        public T[] getValues(T[] tArr) {
            C10771f<T> c10771fM19185a = m19185a();
            int iM19186b = m19186b(c10771fM19185a);
            if (iM19186b != 0) {
                if (tArr.length < iM19186b) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iM19186b));
                }
                for (int i = 0; i != iM19186b; i++) {
                    c10771fM19185a = c10771fM19185a.get();
                    tArr[i] = c10771fM19185a.f69505a;
                }
                if (tArr.length > iM19186b) {
                    tArr[iM19186b] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // p000.p2e.InterfaceC10767b
        public void replay(C10768c<T> c10768c) {
            if (c10768c.getAndIncrement() != 0) {
                return;
            }
            oxb<? super T> oxbVar = c10768c.f69488a;
            C10771f<Object> c10771fM19185a = (C10771f) c10768c.f69490c;
            if (c10771fM19185a == null) {
                c10771fM19185a = m19185a();
            }
            int iAddAndGet = 1;
            while (!c10768c.f69491d) {
                while (!c10768c.f69491d) {
                    C10771f<T> c10771f = c10771fM19185a.get();
                    if (c10771f != null) {
                        T t = c10771f.f69505a;
                        if (this.f69492C && c10771f.get() == null) {
                            if (ehb.isComplete(t)) {
                                oxbVar.onComplete();
                            } else {
                                oxbVar.onError(ehb.getError(t));
                            }
                            c10768c.f69490c = null;
                            c10768c.f69491d = true;
                            return;
                        }
                        oxbVar.onNext(t);
                        c10771fM19185a = c10771f;
                    } else if (c10771fM19185a.get() == null) {
                        c10768c.f69490c = c10771fM19185a;
                        iAddAndGet = c10768c.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                c10768c.f69490c = null;
                return;
            }
            c10768c.f69490c = null;
        }

        @Override // p000.p2e.InterfaceC10767b
        public int size() {
            return m19186b(m19185a());
        }

        @Override // p000.p2e.InterfaceC10767b
        public void trimHead() {
            C10771f<Object> c10771f = this.f69498f;
            if (c10771f.f69505a != null) {
                C10771f<Object> c10771f2 = new C10771f<>(null, 0L);
                c10771f2.lazySet(c10771f.get());
                this.f69498f = c10771f2;
            }
        }
    }

    /* JADX INFO: renamed from: p2e$e */
    public static final class C10770e<T> extends AtomicReference<Object> implements InterfaceC10767b<T> {
        private static final long serialVersionUID = 1107649250281456395L;

        /* JADX INFO: renamed from: a */
        public final int f69500a;

        /* JADX INFO: renamed from: b */
        public int f69501b;

        /* JADX INFO: renamed from: c */
        public volatile C10766a<Object> f69502c;

        /* JADX INFO: renamed from: d */
        public C10766a<Object> f69503d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f69504e;

        public C10770e(int i) {
            this.f69500a = xjb.verifyPositive(i, "maxSize");
            C10766a<Object> c10766a = new C10766a<>(null);
            this.f69503d = c10766a;
            this.f69502c = c10766a;
        }

        /* JADX INFO: renamed from: a */
        public void m19189a() {
            int i = this.f69501b;
            if (i > this.f69500a) {
                this.f69501b = i - 1;
                this.f69502c = this.f69502c.get();
            }
        }

        @Override // p000.p2e.InterfaceC10767b
        public void add(T t) {
            C10766a<Object> c10766a = new C10766a<>(t);
            C10766a<Object> c10766a2 = this.f69503d;
            this.f69503d = c10766a;
            this.f69501b++;
            c10766a2.set(c10766a);
            m19189a();
        }

        @Override // p000.p2e.InterfaceC10767b
        public void addFinal(Object obj) {
            C10766a<Object> c10766a = new C10766a<>(obj);
            C10766a<Object> c10766a2 = this.f69503d;
            this.f69503d = c10766a;
            this.f69501b++;
            c10766a2.lazySet(c10766a);
            trimHead();
            this.f69504e = true;
        }

        @Override // p000.p2e.InterfaceC10767b
        @cib
        public T getValue() {
            C10766a<Object> c10766a = this.f69502c;
            C10766a<Object> c10766a2 = null;
            while (true) {
                C10766a<T> c10766a3 = c10766a.get();
                if (c10766a3 == null) {
                    break;
                }
                c10766a2 = c10766a;
                c10766a = c10766a3;
            }
            T t = (T) c10766a.f69487a;
            if (t == null) {
                return null;
            }
            return (ehb.isComplete(t) || ehb.isError(t)) ? (T) c10766a2.f69487a : t;
        }

        @Override // p000.p2e.InterfaceC10767b
        public T[] getValues(T[] tArr) {
            C10766a<T> c10766a = this.f69502c;
            int size = size();
            if (size != 0) {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i = 0; i != size; i++) {
                    c10766a = c10766a.get();
                    tArr[i] = c10766a.f69487a;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // p000.p2e.InterfaceC10767b
        public void replay(C10768c<T> c10768c) {
            if (c10768c.getAndIncrement() != 0) {
                return;
            }
            oxb<? super T> oxbVar = c10768c.f69488a;
            C10766a<Object> c10766a = (C10766a) c10768c.f69490c;
            if (c10766a == null) {
                c10766a = this.f69502c;
            }
            int iAddAndGet = 1;
            while (!c10768c.f69491d) {
                C10766a<T> c10766a2 = c10766a.get();
                if (c10766a2 != null) {
                    T t = c10766a2.f69487a;
                    if (this.f69504e && c10766a2.get() == null) {
                        if (ehb.isComplete(t)) {
                            oxbVar.onComplete();
                        } else {
                            oxbVar.onError(ehb.getError(t));
                        }
                        c10768c.f69490c = null;
                        c10768c.f69491d = true;
                        return;
                    }
                    oxbVar.onNext(t);
                    c10766a = c10766a2;
                } else if (c10766a.get() != null) {
                    continue;
                } else {
                    c10768c.f69490c = c10766a;
                    iAddAndGet = c10768c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            c10768c.f69490c = null;
        }

        @Override // p000.p2e.InterfaceC10767b
        public int size() {
            C10766a<Object> c10766a = this.f69502c;
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                C10766a<T> c10766a2 = c10766a.get();
                if (c10766a2 == null) {
                    Object obj = c10766a.f69487a;
                    return (ehb.isComplete(obj) || ehb.isError(obj)) ? i - 1 : i;
                }
                i++;
                c10766a = c10766a2;
            }
            return i;
        }

        @Override // p000.p2e.InterfaceC10767b
        public void trimHead() {
            C10766a<Object> c10766a = this.f69502c;
            if (c10766a.f69487a != null) {
                C10766a<Object> c10766a2 = new C10766a<>(null);
                c10766a2.lazySet(c10766a.get());
                this.f69502c = c10766a2;
            }
        }
    }

    /* JADX INFO: renamed from: p2e$f */
    public static final class C10771f<T> extends AtomicReference<C10771f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a */
        public final T f69505a;

        /* JADX INFO: renamed from: b */
        public final long f69506b;

        public C10771f(T t, long j) {
            this.f69505a = t;
            this.f69506b = j;
        }
    }

    /* JADX INFO: renamed from: p2e$g */
    public static final class C10772g<T> extends AtomicReference<Object> implements InterfaceC10767b<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* JADX INFO: renamed from: a */
        public final List<Object> f69507a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f69508b;

        /* JADX INFO: renamed from: c */
        public volatile int f69509c;

        public C10772g(int i) {
            this.f69507a = new ArrayList(xjb.verifyPositive(i, "capacityHint"));
        }

        @Override // p000.p2e.InterfaceC10767b
        public void add(T t) {
            this.f69507a.add(t);
            this.f69509c++;
        }

        @Override // p000.p2e.InterfaceC10767b
        public void addFinal(Object obj) {
            this.f69507a.add(obj);
            trimHead();
            this.f69509c++;
            this.f69508b = true;
        }

        @Override // p000.p2e.InterfaceC10767b
        @cib
        public T getValue() {
            int i = this.f69509c;
            if (i == 0) {
                return null;
            }
            List<Object> list = this.f69507a;
            T t = (T) list.get(i - 1);
            if (!ehb.isComplete(t) && !ehb.isError(t)) {
                return t;
            }
            if (i == 1) {
                return null;
            }
            return (T) list.get(i - 2);
        }

        @Override // p000.p2e.InterfaceC10767b
        public T[] getValues(T[] tArr) {
            int i = this.f69509c;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.f69507a;
            Object obj = list.get(i - 1);
            if ((ehb.isComplete(obj) || ehb.isError(obj)) && i - 1 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // p000.p2e.InterfaceC10767b
        public void replay(C10768c<T> c10768c) {
            int iIntValue;
            int i;
            if (c10768c.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.f69507a;
            oxb<? super T> oxbVar = c10768c.f69488a;
            Integer num = (Integer) c10768c.f69490c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                c10768c.f69490c = 0;
            }
            int iAddAndGet = 1;
            while (!c10768c.f69491d) {
                int i2 = this.f69509c;
                while (i2 != iIntValue) {
                    if (c10768c.f69491d) {
                        c10768c.f69490c = null;
                        return;
                    }
                    Object obj = list.get(iIntValue);
                    if (this.f69508b && (i = iIntValue + 1) == i2 && i == (i2 = this.f69509c)) {
                        if (ehb.isComplete(obj)) {
                            oxbVar.onComplete();
                        } else {
                            oxbVar.onError(ehb.getError(obj));
                        }
                        c10768c.f69490c = null;
                        c10768c.f69491d = true;
                        return;
                    }
                    oxbVar.onNext(obj);
                    iIntValue++;
                }
                if (iIntValue == this.f69509c) {
                    c10768c.f69490c = Integer.valueOf(iIntValue);
                    iAddAndGet = c10768c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            c10768c.f69490c = null;
        }

        @Override // p000.p2e.InterfaceC10767b
        public int size() {
            int i = this.f69509c;
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            Object obj = this.f69507a.get(i2);
            return (ehb.isComplete(obj) || ehb.isError(obj)) ? i2 : i;
        }

        @Override // p000.p2e.InterfaceC10767b
        public void trimHead() {
        }
    }

    public p2e(InterfaceC10767b<T> interfaceC10767b) {
        this.f69484a = interfaceC10767b;
    }

    /* JADX INFO: renamed from: b */
    public static <T> p2e<T> m19179b() {
        return new p2e<>(new C10770e(Integer.MAX_VALUE));
    }

    @bfb
    @by1
    public static <T> p2e<T> create() {
        return new p2e<>(new C10772g(16));
    }

    @bfb
    @by1
    public static <T> p2e<T> createWithSize(int i) {
        return new p2e<>(new C10770e(i));
    }

    @bfb
    @by1
    public static <T> p2e<T> createWithTime(long j, TimeUnit timeUnit, voe voeVar) {
        return new p2e<>(new C10769d(Integer.MAX_VALUE, j, timeUnit, voeVar));
    }

    @bfb
    @by1
    public static <T> p2e<T> createWithTimeAndSize(long j, TimeUnit timeUnit, voe voeVar, int i) {
        return new p2e<>(new C10769d(i, j, timeUnit, voeVar));
    }

    /* JADX INFO: renamed from: a */
    public boolean m19180a(C10768c<T> c10768c) {
        C10768c<T>[] c10768cArr;
        C10768c[] c10768cArr2;
        do {
            c10768cArr = this.f69485b.get();
            if (c10768cArr == f69482e) {
                return false;
            }
            int length = c10768cArr.length;
            c10768cArr2 = new C10768c[length + 1];
            System.arraycopy(c10768cArr, 0, c10768cArr2, 0, length);
            c10768cArr2[length] = c10768c;
        } while (!v7b.m23844a(this.f69485b, c10768cArr, c10768cArr2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public int m19181c() {
        return this.f69485b.get().length;
    }

    public void cleanupBuffer() {
        this.f69484a.trimHead();
    }

    /* JADX INFO: renamed from: d */
    public void m19182d(C10768c<T> c10768c) {
        C10768c<T>[] c10768cArr;
        C10768c[] c10768cArr2;
        do {
            c10768cArr = this.f69485b.get();
            if (c10768cArr == f69482e || c10768cArr == f69481d) {
                return;
            }
            int length = c10768cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c10768cArr[i] == c10768c) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c10768cArr2 = f69481d;
            } else {
                C10768c[] c10768cArr3 = new C10768c[length - 1];
                System.arraycopy(c10768cArr, 0, c10768cArr3, 0, i);
                System.arraycopy(c10768cArr, i + 1, c10768cArr3, i, (length - i) - 1);
                c10768cArr2 = c10768cArr3;
            }
        } while (!v7b.m23844a(this.f69485b, c10768cArr, c10768cArr2));
    }

    /* JADX INFO: renamed from: e */
    public int m19183e() {
        return this.f69484a.size();
    }

    /* JADX INFO: renamed from: f */
    public C10768c<T>[] m19184f(Object obj) {
        return this.f69484a.compareAndSet(null, obj) ? this.f69485b.getAndSet(f69482e) : f69482e;
    }

    @Override // p000.mcg
    @cib
    public Throwable getThrowable() {
        Object obj = this.f69484a.get();
        if (ehb.isError(obj)) {
            return ehb.getError(obj);
        }
        return null;
    }

    @cib
    public T getValue() {
        return this.f69484a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f69483f;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // p000.mcg
    public boolean hasComplete() {
        return ehb.isComplete(this.f69484a.get());
    }

    @Override // p000.mcg
    public boolean hasObservers() {
        return this.f69485b.get().length != 0;
    }

    @Override // p000.mcg
    public boolean hasThrowable() {
        return ehb.isError(this.f69484a.get());
    }

    public boolean hasValue() {
        return this.f69484a.size() != 0;
    }

    @Override // p000.oxb
    public void onComplete() {
        if (this.f69486c) {
            return;
        }
        this.f69486c = true;
        Object objComplete = ehb.complete();
        InterfaceC10767b<T> interfaceC10767b = this.f69484a;
        interfaceC10767b.addFinal(objComplete);
        for (C10768c<T> c10768c : m19184f(objComplete)) {
            interfaceC10767b.replay(c10768c);
        }
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f69486c) {
            pfe.onError(th);
            return;
        }
        this.f69486c = true;
        Object objError = ehb.error(th);
        InterfaceC10767b<T> interfaceC10767b = this.f69484a;
        interfaceC10767b.addFinal(objError);
        for (C10768c<T> c10768c : m19184f(objError)) {
            interfaceC10767b.replay(c10768c);
        }
    }

    @Override // p000.oxb
    public void onNext(T t) {
        xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f69486c) {
            return;
        }
        InterfaceC10767b<T> interfaceC10767b = this.f69484a;
        interfaceC10767b.add(t);
        for (C10768c<T> c10768c : this.f69485b.get()) {
            interfaceC10767b.replay(c10768c);
        }
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        if (this.f69486c) {
            mf4Var.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C10768c<T> c10768c = new C10768c<>(oxbVar, this);
        oxbVar.onSubscribe(c10768c);
        if (c10768c.f69491d) {
            return;
        }
        if (m19180a(c10768c) && c10768c.f69491d) {
            m19182d(c10768c);
        } else {
            this.f69484a.replay(c10768c);
        }
    }

    @bfb
    @by1
    public static <T> p2e<T> create(int i) {
        return new p2e<>(new C10772g(i));
    }

    public T[] getValues(T[] tArr) {
        return this.f69484a.getValues(tArr);
    }
}
