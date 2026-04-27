package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class o2e<T> extends ncg<T> {

    /* JADX INFO: renamed from: d */
    public static final C10157c[] f66318d = new C10157c[0];

    /* JADX INFO: renamed from: e */
    public static final C10157c[] f66319e = new C10157c[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f66320f = new Object[0];

    /* JADX INFO: renamed from: a */
    public final InterfaceC10156b<T> f66321a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C10157c<T>[]> f66322b = new AtomicReference<>(f66318d);

    /* JADX INFO: renamed from: c */
    public boolean f66323c;

    /* JADX INFO: renamed from: o2e$a */
    public static final class C10155a<T> extends AtomicReference<C10155a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a */
        public final T f66324a;

        public C10155a(T value) {
            this.f66324a = value;
        }
    }

    /* JADX INFO: renamed from: o2e$b */
    public interface InterfaceC10156b<T> {
        void add(T value);

        void addFinal(Object notificationLite);

        boolean compareAndSet(Object expected, Object next);

        Object get();

        @dib
        T getValue();

        T[] getValues(T[] array);

        void replay(C10157c<T> rs);

        int size();

        void trimHead();
    }

    /* JADX INFO: renamed from: o2e$c */
    public static final class C10157c<T> extends AtomicInteger implements lf4 {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f66325a;

        /* JADX INFO: renamed from: b */
        public final o2e<T> f66326b;

        /* JADX INFO: renamed from: c */
        public Object f66327c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f66328d;

        public C10157c(pxb<? super T> actual, o2e<T> state) {
            this.f66325a = actual;
            this.f66326b = state;
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f66328d) {
                return;
            }
            this.f66328d = true;
            this.f66326b.m18284d(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f66328d;
        }
    }

    /* JADX INFO: renamed from: o2e$d */
    public static final class C10158d<T> extends AtomicReference<Object> implements InterfaceC10156b<T> {
        private static final long serialVersionUID = -8056260896137901749L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f66329C;

        /* JADX INFO: renamed from: a */
        public final int f66330a;

        /* JADX INFO: renamed from: b */
        public final long f66331b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f66332c;

        /* JADX INFO: renamed from: d */
        public final woe f66333d;

        /* JADX INFO: renamed from: e */
        public int f66334e;

        /* JADX INFO: renamed from: f */
        public volatile C10160f<Object> f66335f;

        /* JADX INFO: renamed from: m */
        public C10160f<Object> f66336m;

        public C10158d(int maxSize, long maxAge, TimeUnit unit, woe scheduler) {
            this.f66330a = maxSize;
            this.f66331b = maxAge;
            this.f66332c = unit;
            this.f66333d = scheduler;
            C10160f<Object> c10160f = new C10160f<>(null, 0L);
            this.f66336m = c10160f;
            this.f66335f = c10160f;
        }

        /* JADX INFO: renamed from: a */
        public C10160f<Object> m18287a() {
            C10160f<Object> c10160f;
            C10160f<Object> c10160f2 = this.f66335f;
            long jNow = this.f66333d.now(this.f66332c) - this.f66331b;
            C10160f<T> c10160f3 = c10160f2.get();
            while (true) {
                C10160f<T> c10160f4 = c10160f3;
                c10160f = c10160f2;
                c10160f2 = c10160f4;
                if (c10160f2 == null || c10160f2.f66343b > jNow) {
                    break;
                }
                c10160f3 = c10160f2.get();
            }
            return c10160f;
        }

        @Override // p000.o2e.InterfaceC10156b
        public void add(T value) {
            C10160f<Object> c10160f = new C10160f<>(value, this.f66333d.now(this.f66332c));
            C10160f<Object> c10160f2 = this.f66336m;
            this.f66336m = c10160f;
            this.f66334e++;
            c10160f2.set(c10160f);
            m18289c();
        }

        @Override // p000.o2e.InterfaceC10156b
        public void addFinal(Object notificationLite) {
            C10160f<Object> c10160f = new C10160f<>(notificationLite, Long.MAX_VALUE);
            C10160f<Object> c10160f2 = this.f66336m;
            this.f66336m = c10160f;
            this.f66334e++;
            c10160f2.lazySet(c10160f);
            m18290d();
            this.f66329C = true;
        }

        /* JADX INFO: renamed from: b */
        public int m18288b(C10160f<Object> h) {
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                C10160f<T> c10160f = h.get();
                if (c10160f == null) {
                    Object obj = h.f66342a;
                    return (fhb.isComplete(obj) || fhb.isError(obj)) ? i - 1 : i;
                }
                i++;
                h = c10160f;
            }
            return i;
        }

        /* JADX INFO: renamed from: c */
        public void m18289c() {
            int i = this.f66334e;
            if (i > this.f66330a) {
                this.f66334e = i - 1;
                this.f66335f = this.f66335f.get();
            }
            long jNow = this.f66333d.now(this.f66332c) - this.f66331b;
            C10160f<Object> c10160f = this.f66335f;
            while (this.f66334e > 1) {
                C10160f<T> c10160f2 = c10160f.get();
                if (c10160f2.f66343b > jNow) {
                    this.f66335f = c10160f;
                    return;
                } else {
                    this.f66334e--;
                    c10160f = c10160f2;
                }
            }
            this.f66335f = c10160f;
        }

        /* JADX INFO: renamed from: d */
        public void m18290d() {
            long jNow = this.f66333d.now(this.f66332c) - this.f66331b;
            C10160f<Object> c10160f = this.f66335f;
            while (true) {
                C10160f<T> c10160f2 = c10160f.get();
                if (c10160f2.get() == null) {
                    if (c10160f.f66342a == null) {
                        this.f66335f = c10160f;
                        return;
                    }
                    C10160f<Object> c10160f3 = new C10160f<>(null, 0L);
                    c10160f3.lazySet(c10160f.get());
                    this.f66335f = c10160f3;
                    return;
                }
                if (c10160f2.f66343b > jNow) {
                    if (c10160f.f66342a == null) {
                        this.f66335f = c10160f;
                        return;
                    }
                    C10160f<Object> c10160f4 = new C10160f<>(null, 0L);
                    c10160f4.lazySet(c10160f.get());
                    this.f66335f = c10160f4;
                    return;
                }
                c10160f = c10160f2;
            }
        }

        @Override // p000.o2e.InterfaceC10156b
        @dib
        public T getValue() {
            T t;
            C10160f<Object> c10160f = this.f66335f;
            C10160f<Object> c10160f2 = null;
            while (true) {
                C10160f<T> c10160f3 = c10160f.get();
                if (c10160f3 == null) {
                    break;
                }
                c10160f2 = c10160f;
                c10160f = c10160f3;
            }
            if (c10160f.f66343b >= this.f66333d.now(this.f66332c) - this.f66331b && (t = (T) c10160f.f66342a) != null) {
                return (fhb.isComplete(t) || fhb.isError(t)) ? (T) c10160f2.f66342a : t;
            }
            return null;
        }

        @Override // p000.o2e.InterfaceC10156b
        public T[] getValues(T[] tArr) {
            C10160f<T> c10160fM18287a = m18287a();
            int iM18288b = m18288b(c10160fM18287a);
            if (iM18288b != 0) {
                if (tArr.length < iM18288b) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iM18288b));
                }
                for (int i = 0; i != iM18288b; i++) {
                    c10160fM18287a = c10160fM18287a.get();
                    tArr[i] = c10160fM18287a.f66342a;
                }
                if (tArr.length > iM18288b) {
                    tArr[iM18288b] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // p000.o2e.InterfaceC10156b
        public void replay(C10157c<T> c10157c) {
            if (c10157c.getAndIncrement() != 0) {
                return;
            }
            pxb<? super T> pxbVar = c10157c.f66325a;
            C10160f<Object> c10160fM18287a = (C10160f) c10157c.f66327c;
            if (c10160fM18287a == null) {
                c10160fM18287a = m18287a();
            }
            int iAddAndGet = 1;
            while (!c10157c.f66328d) {
                C10160f<T> c10160f = c10160fM18287a.get();
                if (c10160f == null) {
                    c10157c.f66327c = c10160fM18287a;
                    iAddAndGet = c10157c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    T t = c10160f.f66342a;
                    if (this.f66329C && c10160f.get() == null) {
                        if (fhb.isComplete(t)) {
                            pxbVar.onComplete();
                        } else {
                            pxbVar.onError(fhb.getError(t));
                        }
                        c10157c.f66327c = null;
                        c10157c.f66328d = true;
                        return;
                    }
                    pxbVar.onNext(t);
                    c10160fM18287a = c10160f;
                }
            }
            c10157c.f66327c = null;
        }

        @Override // p000.o2e.InterfaceC10156b
        public int size() {
            return m18288b(m18287a());
        }

        @Override // p000.o2e.InterfaceC10156b
        public void trimHead() {
            C10160f<Object> c10160f = this.f66335f;
            if (c10160f.f66342a != null) {
                C10160f<Object> c10160f2 = new C10160f<>(null, 0L);
                c10160f2.lazySet(c10160f.get());
                this.f66335f = c10160f2;
            }
        }
    }

    /* JADX INFO: renamed from: o2e$e */
    public static final class C10159e<T> extends AtomicReference<Object> implements InterfaceC10156b<T> {
        private static final long serialVersionUID = 1107649250281456395L;

        /* JADX INFO: renamed from: a */
        public final int f66337a;

        /* JADX INFO: renamed from: b */
        public int f66338b;

        /* JADX INFO: renamed from: c */
        public volatile C10155a<Object> f66339c;

        /* JADX INFO: renamed from: d */
        public C10155a<Object> f66340d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f66341e;

        public C10159e(int maxSize) {
            this.f66337a = maxSize;
            C10155a<Object> c10155a = new C10155a<>(null);
            this.f66340d = c10155a;
            this.f66339c = c10155a;
        }

        /* JADX INFO: renamed from: a */
        public void m18291a() {
            int i = this.f66338b;
            if (i > this.f66337a) {
                this.f66338b = i - 1;
                this.f66339c = this.f66339c.get();
            }
        }

        @Override // p000.o2e.InterfaceC10156b
        public void add(T value) {
            C10155a<Object> c10155a = new C10155a<>(value);
            C10155a<Object> c10155a2 = this.f66340d;
            this.f66340d = c10155a;
            this.f66338b++;
            c10155a2.set(c10155a);
            m18291a();
        }

        @Override // p000.o2e.InterfaceC10156b
        public void addFinal(Object notificationLite) {
            C10155a<Object> c10155a = new C10155a<>(notificationLite);
            C10155a<Object> c10155a2 = this.f66340d;
            this.f66340d = c10155a;
            this.f66338b++;
            c10155a2.lazySet(c10155a);
            trimHead();
            this.f66341e = true;
        }

        @Override // p000.o2e.InterfaceC10156b
        @dib
        public T getValue() {
            C10155a<Object> c10155a = this.f66339c;
            C10155a<Object> c10155a2 = null;
            while (true) {
                C10155a<T> c10155a3 = c10155a.get();
                if (c10155a3 == null) {
                    break;
                }
                c10155a2 = c10155a;
                c10155a = c10155a3;
            }
            T t = (T) c10155a.f66324a;
            if (t == null) {
                return null;
            }
            return (fhb.isComplete(t) || fhb.isError(t)) ? (T) c10155a2.f66324a : t;
        }

        @Override // p000.o2e.InterfaceC10156b
        public T[] getValues(T[] tArr) {
            C10155a<T> c10155a = this.f66339c;
            int size = size();
            if (size != 0) {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i = 0; i != size; i++) {
                    c10155a = c10155a.get();
                    tArr[i] = c10155a.f66324a;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // p000.o2e.InterfaceC10156b
        public void replay(C10157c<T> c10157c) {
            if (c10157c.getAndIncrement() != 0) {
                return;
            }
            pxb<? super T> pxbVar = c10157c.f66325a;
            C10155a<Object> c10155a = (C10155a) c10157c.f66327c;
            if (c10155a == null) {
                c10155a = this.f66339c;
            }
            int iAddAndGet = 1;
            while (!c10157c.f66328d) {
                C10155a<T> c10155a2 = c10155a.get();
                if (c10155a2 != null) {
                    T t = c10155a2.f66324a;
                    if (this.f66341e && c10155a2.get() == null) {
                        if (fhb.isComplete(t)) {
                            pxbVar.onComplete();
                        } else {
                            pxbVar.onError(fhb.getError(t));
                        }
                        c10157c.f66327c = null;
                        c10157c.f66328d = true;
                        return;
                    }
                    pxbVar.onNext(t);
                    c10155a = c10155a2;
                } else if (c10155a.get() != null) {
                    continue;
                } else {
                    c10157c.f66327c = c10155a;
                    iAddAndGet = c10157c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            c10157c.f66327c = null;
        }

        @Override // p000.o2e.InterfaceC10156b
        public int size() {
            C10155a<Object> c10155a = this.f66339c;
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                C10155a<T> c10155a2 = c10155a.get();
                if (c10155a2 == null) {
                    Object obj = c10155a.f66324a;
                    return (fhb.isComplete(obj) || fhb.isError(obj)) ? i - 1 : i;
                }
                i++;
                c10155a = c10155a2;
            }
            return i;
        }

        @Override // p000.o2e.InterfaceC10156b
        public void trimHead() {
            C10155a<Object> c10155a = this.f66339c;
            if (c10155a.f66324a != null) {
                C10155a<Object> c10155a2 = new C10155a<>(null);
                c10155a2.lazySet(c10155a.get());
                this.f66339c = c10155a2;
            }
        }
    }

    /* JADX INFO: renamed from: o2e$f */
    public static final class C10160f<T> extends AtomicReference<C10160f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a */
        public final T f66342a;

        /* JADX INFO: renamed from: b */
        public final long f66343b;

        public C10160f(T value, long time) {
            this.f66342a = value;
            this.f66343b = time;
        }
    }

    /* JADX INFO: renamed from: o2e$g */
    public static final class C10161g<T> extends AtomicReference<Object> implements InterfaceC10156b<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* JADX INFO: renamed from: a */
        public final List<Object> f66344a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f66345b;

        /* JADX INFO: renamed from: c */
        public volatile int f66346c;

        public C10161g(int capacityHint) {
            this.f66344a = new ArrayList(capacityHint);
        }

        @Override // p000.o2e.InterfaceC10156b
        public void add(T value) {
            this.f66344a.add(value);
            this.f66346c++;
        }

        @Override // p000.o2e.InterfaceC10156b
        public void addFinal(Object notificationLite) {
            this.f66344a.add(notificationLite);
            trimHead();
            this.f66346c++;
            this.f66345b = true;
        }

        @Override // p000.o2e.InterfaceC10156b
        @dib
        public T getValue() {
            int i = this.f66346c;
            if (i == 0) {
                return null;
            }
            List<Object> list = this.f66344a;
            T t = (T) list.get(i - 1);
            if (!fhb.isComplete(t) && !fhb.isError(t)) {
                return t;
            }
            if (i == 1) {
                return null;
            }
            return (T) list.get(i - 2);
        }

        @Override // p000.o2e.InterfaceC10156b
        public T[] getValues(T[] tArr) {
            int i = this.f66346c;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.f66344a;
            Object obj = list.get(i - 1);
            if ((fhb.isComplete(obj) || fhb.isError(obj)) && i - 1 == 0) {
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

        @Override // p000.o2e.InterfaceC10156b
        public void replay(C10157c<T> rs) {
            int iIntValue;
            int i;
            if (rs.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.f66344a;
            pxb<? super T> pxbVar = rs.f66325a;
            Integer num = (Integer) rs.f66327c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                rs.f66327c = 0;
            }
            int iAddAndGet = 1;
            while (!rs.f66328d) {
                int i2 = this.f66346c;
                while (i2 != iIntValue) {
                    if (rs.f66328d) {
                        rs.f66327c = null;
                        return;
                    }
                    Object obj = list.get(iIntValue);
                    if (this.f66345b && (i = iIntValue + 1) == i2 && i == (i2 = this.f66346c)) {
                        if (fhb.isComplete(obj)) {
                            pxbVar.onComplete();
                        } else {
                            pxbVar.onError(fhb.getError(obj));
                        }
                        rs.f66327c = null;
                        rs.f66328d = true;
                        return;
                    }
                    pxbVar.onNext(obj);
                    iIntValue++;
                }
                if (iIntValue == this.f66346c) {
                    rs.f66327c = Integer.valueOf(iIntValue);
                    iAddAndGet = rs.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            rs.f66327c = null;
        }

        @Override // p000.o2e.InterfaceC10156b
        public int size() {
            int i = this.f66346c;
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            Object obj = this.f66344a.get(i2);
            return (fhb.isComplete(obj) || fhb.isError(obj)) ? i2 : i;
        }

        @Override // p000.o2e.InterfaceC10156b
        public void trimHead() {
        }
    }

    public o2e(InterfaceC10156b<T> buffer) {
        this.f66321a = buffer;
    }

    /* JADX INFO: renamed from: b */
    public static <T> o2e<T> m18281b() {
        return new o2e<>(new C10159e(Integer.MAX_VALUE));
    }

    @cfb
    @cy1
    public static <T> o2e<T> create() {
        return new o2e<>(new C10161g(16));
    }

    @cfb
    @cy1
    public static <T> o2e<T> createWithSize(int maxSize) {
        yjb.verifyPositive(maxSize, "maxSize");
        return new o2e<>(new C10159e(maxSize));
    }

    @cfb
    @cy1
    public static <T> o2e<T> createWithTime(long maxAge, @cfb TimeUnit unit, @cfb woe scheduler) {
        yjb.verifyPositive(maxAge, "maxAge");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new o2e<>(new C10158d(Integer.MAX_VALUE, maxAge, unit, scheduler));
    }

    @cfb
    @cy1
    public static <T> o2e<T> createWithTimeAndSize(long maxAge, @cfb TimeUnit unit, @cfb woe scheduler, int maxSize) {
        yjb.verifyPositive(maxSize, "maxSize");
        yjb.verifyPositive(maxAge, "maxAge");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new o2e<>(new C10158d(maxSize, maxAge, unit, scheduler));
    }

    /* JADX INFO: renamed from: a */
    public boolean m18282a(C10157c<T> rs) {
        C10157c<T>[] c10157cArr;
        C10157c[] c10157cArr2;
        do {
            c10157cArr = this.f66322b.get();
            if (c10157cArr == f66319e) {
                return false;
            }
            int length = c10157cArr.length;
            c10157cArr2 = new C10157c[length + 1];
            System.arraycopy(c10157cArr, 0, c10157cArr2, 0, length);
            c10157cArr2[length] = rs;
        } while (!v7b.m23844a(this.f66322b, c10157cArr, c10157cArr2));
        return true;
    }

    @cy1
    /* JADX INFO: renamed from: c */
    public int m18283c() {
        return this.f66322b.get().length;
    }

    public void cleanupBuffer() {
        this.f66321a.trimHead();
    }

    /* JADX INFO: renamed from: d */
    public void m18284d(C10157c<T> rs) {
        C10157c<T>[] c10157cArr;
        C10157c[] c10157cArr2;
        do {
            c10157cArr = this.f66322b.get();
            if (c10157cArr == f66319e || c10157cArr == f66318d) {
                return;
            }
            int length = c10157cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c10157cArr[i] == rs) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c10157cArr2 = f66318d;
            } else {
                C10157c[] c10157cArr3 = new C10157c[length - 1];
                System.arraycopy(c10157cArr, 0, c10157cArr3, 0, i);
                System.arraycopy(c10157cArr, i + 1, c10157cArr3, i, (length - i) - 1);
                c10157cArr2 = c10157cArr3;
            }
        } while (!v7b.m23844a(this.f66322b, c10157cArr, c10157cArr2));
    }

    @cy1
    /* JADX INFO: renamed from: e */
    public int m18285e() {
        return this.f66321a.size();
    }

    /* JADX INFO: renamed from: f */
    public C10157c<T>[] m18286f(Object terminalValue) {
        this.f66321a.compareAndSet(null, terminalValue);
        return this.f66322b.getAndSet(f66319e);
    }

    @Override // p000.ncg
    @dib
    @cy1
    public Throwable getThrowable() {
        Object obj = this.f66321a.get();
        if (fhb.isError(obj)) {
            return fhb.getError(obj);
        }
        return null;
    }

    @dib
    @cy1
    public T getValue() {
        return this.f66321a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    public Object[] getValues() {
        Object[] objArr = f66320f;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasComplete() {
        return fhb.isComplete(this.f66321a.get());
    }

    @Override // p000.ncg
    @cy1
    public boolean hasObservers() {
        return this.f66322b.get().length != 0;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasThrowable() {
        return fhb.isError(this.f66321a.get());
    }

    @cy1
    public boolean hasValue() {
        return this.f66321a.size() != 0;
    }

    @Override // p000.pxb
    public void onComplete() {
        if (this.f66323c) {
            return;
        }
        this.f66323c = true;
        Object objComplete = fhb.complete();
        InterfaceC10156b<T> interfaceC10156b = this.f66321a;
        interfaceC10156b.addFinal(objComplete);
        for (C10157c<T> c10157c : m18286f(objComplete)) {
            interfaceC10156b.replay(c10157c);
        }
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        if (this.f66323c) {
            ofe.onError(t);
            return;
        }
        this.f66323c = true;
        Object objError = fhb.error(t);
        InterfaceC10156b<T> interfaceC10156b = this.f66321a;
        interfaceC10156b.addFinal(objError);
        for (C10157c<T> c10157c : m18286f(objError)) {
            interfaceC10156b.replay(c10157c);
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        k75.nullCheck(t, "onNext called with a null value.");
        if (this.f66323c) {
            return;
        }
        InterfaceC10156b<T> interfaceC10156b = this.f66321a;
        interfaceC10156b.add(t);
        for (C10157c<T> c10157c : this.f66322b.get()) {
            interfaceC10156b.replay(c10157c);
        }
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        if (this.f66323c) {
            d.dispose();
        }
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        C10157c<T> c10157c = new C10157c<>(observer, this);
        observer.onSubscribe(c10157c);
        if (m18282a(c10157c) && c10157c.f66328d) {
            m18284d(c10157c);
        } else {
            this.f66321a.replay(c10157c);
        }
    }

    @cfb
    @cy1
    public static <T> o2e<T> create(int capacityHint) {
        yjb.verifyPositive(capacityHint, "capacityHint");
        return new o2e<>(new C10161g(capacityHint));
    }

    @cy1
    public T[] getValues(T[] array) {
        return this.f66321a.getValues(array);
    }
}
