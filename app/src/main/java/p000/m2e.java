package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class m2e<T> extends qg6<T> {

    /* JADX INFO: renamed from: e */
    public static final Object[] f59746e = new Object[0];

    /* JADX INFO: renamed from: f */
    public static final C9110c[] f59747f = new C9110c[0];

    /* JADX INFO: renamed from: m */
    public static final C9110c[] f59748m = new C9110c[0];

    /* JADX INFO: renamed from: b */
    public final InterfaceC9109b<T> f59749b;

    /* JADX INFO: renamed from: c */
    public boolean f59750c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<C9110c<T>[]> f59751d = new AtomicReference<>(f59747f);

    /* JADX INFO: renamed from: m2e$a */
    public static final class C9108a<T> extends AtomicReference<C9108a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a */
        public final T f59752a;

        public C9108a(T value) {
            this.f59752a = value;
        }
    }

    /* JADX INFO: renamed from: m2e$b */
    public interface InterfaceC9109b<T> {
        void complete();

        void error(Throwable ex);

        Throwable getError();

        @dib
        T getValue();

        T[] getValues(T[] array);

        boolean isDone();

        void next(T value);

        void replay(C9110c<T> rs);

        int size();

        void trimHead();
    }

    /* JADX INFO: renamed from: m2e$c */
    public static final class C9110c<T> extends AtomicInteger implements fdg {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f59753a;

        /* JADX INFO: renamed from: b */
        public final m2e<T> f59754b;

        /* JADX INFO: renamed from: c */
        public Object f59755c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f59756d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public volatile boolean f59757e;

        /* JADX INFO: renamed from: f */
        public long f59758f;

        public C9110c(ycg<? super T> actual, m2e<T> state) {
            this.f59753a = actual;
            this.f59754b = state;
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f59757e) {
                return;
            }
            this.f59757e = true;
            this.f59754b.m16586d(this);
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f59756d, n);
                this.f59754b.f59749b.replay(this);
            }
        }
    }

    /* JADX INFO: renamed from: m2e$d */
    public static final class C9111d<T> implements InterfaceC9109b<T> {

        /* JADX INFO: renamed from: a */
        public final int f59759a;

        /* JADX INFO: renamed from: b */
        public final long f59760b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f59761c;

        /* JADX INFO: renamed from: d */
        public final woe f59762d;

        /* JADX INFO: renamed from: e */
        public int f59763e;

        /* JADX INFO: renamed from: f */
        public volatile C9113f<T> f59764f;

        /* JADX INFO: renamed from: g */
        public C9113f<T> f59765g;

        /* JADX INFO: renamed from: h */
        public Throwable f59766h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f59767i;

        public C9111d(int maxSize, long maxAge, TimeUnit unit, woe scheduler) {
            this.f59759a = maxSize;
            this.f59760b = maxAge;
            this.f59761c = unit;
            this.f59762d = scheduler;
            C9113f<T> c9113f = new C9113f<>(null, 0L);
            this.f59765g = c9113f;
            this.f59764f = c9113f;
        }

        /* JADX INFO: renamed from: a */
        public C9113f<T> m16589a() {
            C9113f<T> c9113f;
            C9113f<T> c9113f2 = this.f59764f;
            long jNow = this.f59762d.now(this.f59761c) - this.f59760b;
            C9113f<T> c9113f3 = c9113f2.get();
            while (true) {
                C9113f<T> c9113f4 = c9113f3;
                c9113f = c9113f2;
                c9113f2 = c9113f4;
                if (c9113f2 == null || c9113f2.f59775b > jNow) {
                    break;
                }
                c9113f3 = c9113f2.get();
            }
            return c9113f;
        }

        /* JADX INFO: renamed from: b */
        public int m16590b(C9113f<T> h) {
            int i = 0;
            while (i != Integer.MAX_VALUE && (h = h.get()) != null) {
                i++;
            }
            return i;
        }

        /* JADX INFO: renamed from: c */
        public void m16591c() {
            int i = this.f59763e;
            if (i > this.f59759a) {
                this.f59763e = i - 1;
                this.f59764f = this.f59764f.get();
            }
            long jNow = this.f59762d.now(this.f59761c) - this.f59760b;
            C9113f<T> c9113f = this.f59764f;
            while (this.f59763e > 1) {
                C9113f<T> c9113f2 = c9113f.get();
                if (c9113f2.f59775b > jNow) {
                    this.f59764f = c9113f;
                    return;
                } else {
                    this.f59763e--;
                    c9113f = c9113f2;
                }
            }
            this.f59764f = c9113f;
        }

        @Override // p000.m2e.InterfaceC9109b
        public void complete() {
            m16592d();
            this.f59767i = true;
        }

        /* JADX INFO: renamed from: d */
        public void m16592d() {
            long jNow = this.f59762d.now(this.f59761c) - this.f59760b;
            C9113f<T> c9113f = this.f59764f;
            while (true) {
                C9113f<T> c9113f2 = c9113f.get();
                if (c9113f2 == null) {
                    if (c9113f.f59774a != null) {
                        this.f59764f = new C9113f<>(null, 0L);
                        return;
                    } else {
                        this.f59764f = c9113f;
                        return;
                    }
                }
                if (c9113f2.f59775b > jNow) {
                    if (c9113f.f59774a == null) {
                        this.f59764f = c9113f;
                        return;
                    }
                    C9113f<T> c9113f3 = new C9113f<>(null, 0L);
                    c9113f3.lazySet(c9113f.get());
                    this.f59764f = c9113f3;
                    return;
                }
                c9113f = c9113f2;
            }
        }

        @Override // p000.m2e.InterfaceC9109b
        public void error(Throwable ex) {
            m16592d();
            this.f59766h = ex;
            this.f59767i = true;
        }

        @Override // p000.m2e.InterfaceC9109b
        public Throwable getError() {
            return this.f59766h;
        }

        @Override // p000.m2e.InterfaceC9109b
        @dib
        public T getValue() {
            C9113f<T> c9113f = this.f59764f;
            while (true) {
                C9113f<T> c9113f2 = c9113f.get();
                if (c9113f2 == null) {
                    break;
                }
                c9113f = c9113f2;
            }
            if (c9113f.f59775b < this.f59762d.now(this.f59761c) - this.f59760b) {
                return null;
            }
            return c9113f.f59774a;
        }

        @Override // p000.m2e.InterfaceC9109b
        public T[] getValues(T[] tArr) {
            C9113f<T> c9113fM16589a = m16589a();
            int iM16590b = m16590b(c9113fM16589a);
            if (iM16590b != 0) {
                if (tArr.length < iM16590b) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iM16590b));
                }
                for (int i = 0; i != iM16590b; i++) {
                    c9113fM16589a = c9113fM16589a.get();
                    tArr[i] = c9113fM16589a.f59774a;
                }
                if (tArr.length > iM16590b) {
                    tArr[iM16590b] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // p000.m2e.InterfaceC9109b
        public boolean isDone() {
            return this.f59767i;
        }

        @Override // p000.m2e.InterfaceC9109b
        public void next(T value) {
            C9113f<T> c9113f = new C9113f<>(value, this.f59762d.now(this.f59761c));
            C9113f<T> c9113f2 = this.f59765g;
            this.f59765g = c9113f;
            this.f59763e++;
            c9113f2.set(c9113f);
            m16591c();
        }

        @Override // p000.m2e.InterfaceC9109b
        public void replay(C9110c<T> c9110c) {
            if (c9110c.getAndIncrement() != 0) {
                return;
            }
            ycg<? super T> ycgVar = c9110c.f59753a;
            C9113f<T> c9113fM16589a = (C9113f) c9110c.f59755c;
            if (c9113fM16589a == null) {
                c9113fM16589a = m16589a();
            }
            long j = c9110c.f59758f;
            int iAddAndGet = 1;
            do {
                long j2 = c9110c.f59756d.get();
                while (j != j2) {
                    if (c9110c.f59757e) {
                        c9110c.f59755c = null;
                        return;
                    }
                    boolean z = this.f59767i;
                    C9113f<T> c9113f = c9113fM16589a.get();
                    boolean z2 = c9113f == null;
                    if (z && z2) {
                        c9110c.f59755c = null;
                        c9110c.f59757e = true;
                        Throwable th = this.f59766h;
                        if (th == null) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            ycgVar.onError(th);
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    ycgVar.onNext(c9113f.f59774a);
                    j++;
                    c9113fM16589a = c9113f;
                }
                if (j == j2) {
                    if (c9110c.f59757e) {
                        c9110c.f59755c = null;
                        return;
                    }
                    if (this.f59767i && c9113fM16589a.get() == null) {
                        c9110c.f59755c = null;
                        c9110c.f59757e = true;
                        Throwable th2 = this.f59766h;
                        if (th2 == null) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            ycgVar.onError(th2);
                            return;
                        }
                    }
                }
                c9110c.f59755c = c9113fM16589a;
                c9110c.f59758f = j;
                iAddAndGet = c9110c.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.m2e.InterfaceC9109b
        public int size() {
            return m16590b(m16589a());
        }

        @Override // p000.m2e.InterfaceC9109b
        public void trimHead() {
            if (this.f59764f.f59774a != null) {
                C9113f<T> c9113f = new C9113f<>(null, 0L);
                c9113f.lazySet(this.f59764f.get());
                this.f59764f = c9113f;
            }
        }
    }

    /* JADX INFO: renamed from: m2e$e */
    public static final class C9112e<T> implements InterfaceC9109b<T> {

        /* JADX INFO: renamed from: a */
        public final int f59768a;

        /* JADX INFO: renamed from: b */
        public int f59769b;

        /* JADX INFO: renamed from: c */
        public volatile C9108a<T> f59770c;

        /* JADX INFO: renamed from: d */
        public C9108a<T> f59771d;

        /* JADX INFO: renamed from: e */
        public Throwable f59772e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f59773f;

        public C9112e(int maxSize) {
            this.f59768a = maxSize;
            C9108a<T> c9108a = new C9108a<>(null);
            this.f59771d = c9108a;
            this.f59770c = c9108a;
        }

        /* JADX INFO: renamed from: a */
        public void m16593a() {
            int i = this.f59769b;
            if (i > this.f59768a) {
                this.f59769b = i - 1;
                this.f59770c = this.f59770c.get();
            }
        }

        @Override // p000.m2e.InterfaceC9109b
        public void complete() {
            trimHead();
            this.f59773f = true;
        }

        @Override // p000.m2e.InterfaceC9109b
        public void error(Throwable ex) {
            this.f59772e = ex;
            trimHead();
            this.f59773f = true;
        }

        @Override // p000.m2e.InterfaceC9109b
        public Throwable getError() {
            return this.f59772e;
        }

        @Override // p000.m2e.InterfaceC9109b
        public T getValue() {
            C9108a<T> c9108a = this.f59770c;
            while (true) {
                C9108a<T> c9108a2 = c9108a.get();
                if (c9108a2 == null) {
                    return c9108a.f59752a;
                }
                c9108a = c9108a2;
            }
        }

        @Override // p000.m2e.InterfaceC9109b
        public T[] getValues(T[] tArr) {
            C9108a<T> c9108a = this.f59770c;
            C9108a<T> c9108a2 = c9108a;
            int i = 0;
            while (true) {
                c9108a2 = c9108a2.get();
                if (c9108a2 == null) {
                    break;
                }
                i++;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                c9108a = c9108a.get();
                tArr[i2] = c9108a.f59752a;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // p000.m2e.InterfaceC9109b
        public boolean isDone() {
            return this.f59773f;
        }

        @Override // p000.m2e.InterfaceC9109b
        public void next(T value) {
            C9108a<T> c9108a = new C9108a<>(value);
            C9108a<T> c9108a2 = this.f59771d;
            this.f59771d = c9108a;
            this.f59769b++;
            c9108a2.set(c9108a);
            m16593a();
        }

        @Override // p000.m2e.InterfaceC9109b
        public void replay(C9110c<T> c9110c) {
            if (c9110c.getAndIncrement() != 0) {
                return;
            }
            ycg<? super T> ycgVar = c9110c.f59753a;
            C9108a<T> c9108a = (C9108a) c9110c.f59755c;
            if (c9108a == null) {
                c9108a = this.f59770c;
            }
            long j = c9110c.f59758f;
            int iAddAndGet = 1;
            do {
                long j2 = c9110c.f59756d.get();
                while (j != j2) {
                    if (c9110c.f59757e) {
                        c9110c.f59755c = null;
                        return;
                    }
                    boolean z = this.f59773f;
                    C9108a<T> c9108a2 = c9108a.get();
                    boolean z2 = c9108a2 == null;
                    if (z && z2) {
                        c9110c.f59755c = null;
                        c9110c.f59757e = true;
                        Throwable th = this.f59772e;
                        if (th == null) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            ycgVar.onError(th);
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    ycgVar.onNext(c9108a2.f59752a);
                    j++;
                    c9108a = c9108a2;
                }
                if (j == j2) {
                    if (c9110c.f59757e) {
                        c9110c.f59755c = null;
                        return;
                    }
                    if (this.f59773f && c9108a.get() == null) {
                        c9110c.f59755c = null;
                        c9110c.f59757e = true;
                        Throwable th2 = this.f59772e;
                        if (th2 == null) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            ycgVar.onError(th2);
                            return;
                        }
                    }
                }
                c9110c.f59755c = c9108a;
                c9110c.f59758f = j;
                iAddAndGet = c9110c.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.m2e.InterfaceC9109b
        public int size() {
            C9108a<T> c9108a = this.f59770c;
            int i = 0;
            while (i != Integer.MAX_VALUE && (c9108a = c9108a.get()) != null) {
                i++;
            }
            return i;
        }

        @Override // p000.m2e.InterfaceC9109b
        public void trimHead() {
            if (this.f59770c.f59752a != null) {
                C9108a<T> c9108a = new C9108a<>(null);
                c9108a.lazySet(this.f59770c.get());
                this.f59770c = c9108a;
            }
        }
    }

    /* JADX INFO: renamed from: m2e$f */
    public static final class C9113f<T> extends AtomicReference<C9113f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a */
        public final T f59774a;

        /* JADX INFO: renamed from: b */
        public final long f59775b;

        public C9113f(T value, long time) {
            this.f59774a = value;
            this.f59775b = time;
        }
    }

    /* JADX INFO: renamed from: m2e$g */
    public static final class C9114g<T> implements InterfaceC9109b<T> {

        /* JADX INFO: renamed from: a */
        public final List<T> f59776a;

        /* JADX INFO: renamed from: b */
        public Throwable f59777b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f59778c;

        /* JADX INFO: renamed from: d */
        public volatile int f59779d;

        public C9114g(int capacityHint) {
            this.f59776a = new ArrayList(capacityHint);
        }

        @Override // p000.m2e.InterfaceC9109b
        public void complete() {
            this.f59778c = true;
        }

        @Override // p000.m2e.InterfaceC9109b
        public void error(Throwable ex) {
            this.f59777b = ex;
            this.f59778c = true;
        }

        @Override // p000.m2e.InterfaceC9109b
        public Throwable getError() {
            return this.f59777b;
        }

        @Override // p000.m2e.InterfaceC9109b
        @dib
        public T getValue() {
            int i = this.f59779d;
            if (i == 0) {
                return null;
            }
            return this.f59776a.get(i - 1);
        }

        @Override // p000.m2e.InterfaceC9109b
        public T[] getValues(T[] tArr) {
            int i = this.f59779d;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.f59776a;
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

        @Override // p000.m2e.InterfaceC9109b
        public boolean isDone() {
            return this.f59778c;
        }

        @Override // p000.m2e.InterfaceC9109b
        public void next(T value) {
            this.f59776a.add(value);
            this.f59779d++;
        }

        @Override // p000.m2e.InterfaceC9109b
        public void replay(C9110c<T> rs) {
            int iIntValue;
            if (rs.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.f59776a;
            ycg<? super T> ycgVar = rs.f59753a;
            Integer num = (Integer) rs.f59755c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                rs.f59755c = 0;
            }
            long j = rs.f59758f;
            int iAddAndGet = 1;
            do {
                long j2 = rs.f59756d.get();
                while (j != j2) {
                    if (rs.f59757e) {
                        rs.f59755c = null;
                        return;
                    }
                    boolean z = this.f59778c;
                    int i = this.f59779d;
                    if (z && iIntValue == i) {
                        rs.f59755c = null;
                        rs.f59757e = true;
                        Throwable th = this.f59777b;
                        if (th == null) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            ycgVar.onError(th);
                            return;
                        }
                    }
                    if (iIntValue == i) {
                        break;
                    }
                    ycgVar.onNext(list.get(iIntValue));
                    iIntValue++;
                    j++;
                }
                if (j == j2) {
                    if (rs.f59757e) {
                        rs.f59755c = null;
                        return;
                    }
                    boolean z2 = this.f59778c;
                    int i2 = this.f59779d;
                    if (z2 && iIntValue == i2) {
                        rs.f59755c = null;
                        rs.f59757e = true;
                        Throwable th2 = this.f59777b;
                        if (th2 == null) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            ycgVar.onError(th2);
                            return;
                        }
                    }
                }
                rs.f59755c = Integer.valueOf(iIntValue);
                rs.f59758f = j;
                iAddAndGet = rs.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.m2e.InterfaceC9109b
        public int size() {
            return this.f59779d;
        }

        @Override // p000.m2e.InterfaceC9109b
        public void trimHead() {
        }
    }

    public m2e(InterfaceC9109b<T> buffer) {
        this.f59749b = buffer;
    }

    @cy1
    /* JADX INFO: renamed from: c */
    public static <T> m2e<T> m16584c() {
        return new m2e<>(new C9112e(Integer.MAX_VALUE));
    }

    @cfb
    @cy1
    public static <T> m2e<T> create() {
        return new m2e<>(new C9114g(16));
    }

    @cfb
    @cy1
    public static <T> m2e<T> createWithSize(int maxSize) {
        yjb.verifyPositive(maxSize, "maxSize");
        return new m2e<>(new C9112e(maxSize));
    }

    @cfb
    @cy1
    public static <T> m2e<T> createWithTime(long maxAge, @cfb TimeUnit unit, @cfb woe scheduler) {
        yjb.verifyPositive(maxAge, "maxAge");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new m2e<>(new C9111d(Integer.MAX_VALUE, maxAge, unit, scheduler));
    }

    @cfb
    @cy1
    public static <T> m2e<T> createWithTimeAndSize(long maxAge, @cfb TimeUnit unit, @cfb woe scheduler, int maxSize) {
        yjb.verifyPositive(maxSize, "maxSize");
        yjb.verifyPositive(maxAge, "maxAge");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new m2e<>(new C9111d(maxSize, maxAge, unit, scheduler));
    }

    /* JADX INFO: renamed from: b */
    public boolean m16585b(C9110c<T> rs) {
        C9110c<T>[] c9110cArr;
        C9110c[] c9110cArr2;
        do {
            c9110cArr = this.f59751d.get();
            if (c9110cArr == f59748m) {
                return false;
            }
            int length = c9110cArr.length;
            c9110cArr2 = new C9110c[length + 1];
            System.arraycopy(c9110cArr, 0, c9110cArr2, 0, length);
            c9110cArr2[length] = rs;
        } while (!v7b.m23844a(this.f59751d, c9110cArr, c9110cArr2));
        return true;
    }

    public void cleanupBuffer() {
        this.f59749b.trimHead();
    }

    /* JADX INFO: renamed from: d */
    public void m16586d(C9110c<T> rs) {
        C9110c<T>[] c9110cArr;
        C9110c[] c9110cArr2;
        do {
            c9110cArr = this.f59751d.get();
            if (c9110cArr == f59748m || c9110cArr == f59747f) {
                return;
            }
            int length = c9110cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c9110cArr[i] == rs) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c9110cArr2 = f59747f;
            } else {
                C9110c[] c9110cArr3 = new C9110c[length - 1];
                System.arraycopy(c9110cArr, 0, c9110cArr3, 0, i);
                System.arraycopy(c9110cArr, i + 1, c9110cArr3, i, (length - i) - 1);
                c9110cArr2 = c9110cArr3;
            }
        } while (!v7b.m23844a(this.f59751d, c9110cArr, c9110cArr2));
    }

    @cy1
    /* JADX INFO: renamed from: e */
    public int m16587e() {
        return this.f59749b.size();
    }

    @cy1
    /* JADX INFO: renamed from: f */
    public int m16588f() {
        return this.f59751d.get().length;
    }

    @Override // p000.qg6
    @dib
    @cy1
    public Throwable getThrowable() {
        InterfaceC9109b<T> interfaceC9109b = this.f59749b;
        if (interfaceC9109b.isDone()) {
            return interfaceC9109b.getError();
        }
        return null;
    }

    @cy1
    public T getValue() {
        return this.f59749b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    public Object[] getValues() {
        Object[] objArr = f59746e;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasComplete() {
        InterfaceC9109b<T> interfaceC9109b = this.f59749b;
        return interfaceC9109b.isDone() && interfaceC9109b.getError() == null;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasSubscribers() {
        return this.f59751d.get().length != 0;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasThrowable() {
        InterfaceC9109b<T> interfaceC9109b = this.f59749b;
        return interfaceC9109b.isDone() && interfaceC9109b.getError() != null;
    }

    @cy1
    public boolean hasValue() {
        return this.f59749b.size() != 0;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f59750c) {
            return;
        }
        this.f59750c = true;
        InterfaceC9109b<T> interfaceC9109b = this.f59749b;
        interfaceC9109b.complete();
        for (C9110c<T> c9110c : this.f59751d.getAndSet(f59748m)) {
            interfaceC9109b.replay(c9110c);
        }
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        if (this.f59750c) {
            ofe.onError(t);
            return;
        }
        this.f59750c = true;
        InterfaceC9109b<T> interfaceC9109b = this.f59749b;
        interfaceC9109b.error(t);
        for (C9110c<T> c9110c : this.f59751d.getAndSet(f59748m)) {
            interfaceC9109b.replay(c9110c);
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        k75.nullCheck(t, "onNext called with a null value.");
        if (this.f59750c) {
            return;
        }
        InterfaceC9109b<T> interfaceC9109b = this.f59749b;
        interfaceC9109b.next(t);
        for (C9110c<T> c9110c : this.f59751d.get()) {
            interfaceC9109b.replay(c9110c);
        }
    }

    @Override // p000.ycg
    public void onSubscribe(fdg s) {
        if (this.f59750c) {
            s.cancel();
        } else {
            s.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        C9110c<T> c9110c = new C9110c<>(s, this);
        s.onSubscribe(c9110c);
        if (m16585b(c9110c) && c9110c.f59757e) {
            m16586d(c9110c);
        } else {
            this.f59749b.replay(c9110c);
        }
    }

    @cfb
    @cy1
    public static <T> m2e<T> create(int capacityHint) {
        yjb.verifyPositive(capacityHint, "capacityHint");
        return new m2e<>(new C9114g(capacityHint));
    }

    @cy1
    public T[] getValues(T[] array) {
        return this.f59749b.getValues(array);
    }
}
