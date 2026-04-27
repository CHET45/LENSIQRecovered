package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class l2e<T> extends rg6<T> {

    /* JADX INFO: renamed from: e */
    public static final Object[] f56011e = new Object[0];

    /* JADX INFO: renamed from: f */
    public static final C8587c[] f56012f = new C8587c[0];

    /* JADX INFO: renamed from: m */
    public static final C8587c[] f56013m = new C8587c[0];

    /* JADX INFO: renamed from: b */
    public final InterfaceC8586b<T> f56014b;

    /* JADX INFO: renamed from: c */
    public boolean f56015c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<C8587c<T>[]> f56016d = new AtomicReference<>(f56012f);

    /* JADX INFO: renamed from: l2e$a */
    public static final class C8585a<T> extends AtomicReference<C8585a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a */
        public final T f56017a;

        public C8585a(T t) {
            this.f56017a = t;
        }
    }

    /* JADX INFO: renamed from: l2e$b */
    public interface InterfaceC8586b<T> {
        void complete();

        void error(Throwable th);

        Throwable getError();

        @cib
        T getValue();

        T[] getValues(T[] tArr);

        boolean isDone();

        void next(T t);

        void replay(C8587c<T> c8587c);

        int size();

        void trimHead();
    }

    /* JADX INFO: renamed from: l2e$c */
    public static final class C8587c<T> extends AtomicInteger implements fdg {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f56018a;

        /* JADX INFO: renamed from: b */
        public final l2e<T> f56019b;

        /* JADX INFO: renamed from: c */
        public Object f56020c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f56021d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public volatile boolean f56022e;

        /* JADX INFO: renamed from: f */
        public long f56023f;

        public C8587c(ycg<? super T> ycgVar, l2e<T> l2eVar) {
            this.f56018a = ycgVar;
            this.f56019b = l2eVar;
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f56022e) {
                return;
            }
            this.f56022e = true;
            this.f56019b.m15280d(this);
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f56021d, j);
                this.f56019b.f56014b.replay(this);
            }
        }
    }

    /* JADX INFO: renamed from: l2e$d */
    public static final class C8588d<T> implements InterfaceC8586b<T> {

        /* JADX INFO: renamed from: a */
        public final int f56024a;

        /* JADX INFO: renamed from: b */
        public final long f56025b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f56026c;

        /* JADX INFO: renamed from: d */
        public final voe f56027d;

        /* JADX INFO: renamed from: e */
        public int f56028e;

        /* JADX INFO: renamed from: f */
        public volatile C8590f<T> f56029f;

        /* JADX INFO: renamed from: g */
        public C8590f<T> f56030g;

        /* JADX INFO: renamed from: h */
        public Throwable f56031h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f56032i;

        public C8588d(int i, long j, TimeUnit timeUnit, voe voeVar) {
            this.f56024a = xjb.verifyPositive(i, "maxSize");
            this.f56025b = xjb.verifyPositive(j, "maxAge");
            this.f56026c = (TimeUnit) xjb.requireNonNull(timeUnit, "unit is null");
            this.f56027d = (voe) xjb.requireNonNull(voeVar, "scheduler is null");
            C8590f<T> c8590f = new C8590f<>(null, 0L);
            this.f56030g = c8590f;
            this.f56029f = c8590f;
        }

        /* JADX INFO: renamed from: a */
        public C8590f<T> m15283a() {
            C8590f<T> c8590f;
            C8590f<T> c8590f2 = this.f56029f;
            long jNow = this.f56027d.now(this.f56026c) - this.f56025b;
            C8590f<T> c8590f3 = c8590f2.get();
            while (true) {
                C8590f<T> c8590f4 = c8590f3;
                c8590f = c8590f2;
                c8590f2 = c8590f4;
                if (c8590f2 == null || c8590f2.f56040b > jNow) {
                    break;
                }
                c8590f3 = c8590f2.get();
            }
            return c8590f;
        }

        /* JADX INFO: renamed from: b */
        public int m15284b(C8590f<T> c8590f) {
            int i = 0;
            while (i != Integer.MAX_VALUE && (c8590f = c8590f.get()) != null) {
                i++;
            }
            return i;
        }

        /* JADX INFO: renamed from: c */
        public void m15285c() {
            int i = this.f56028e;
            if (i > this.f56024a) {
                this.f56028e = i - 1;
                this.f56029f = this.f56029f.get();
            }
            long jNow = this.f56027d.now(this.f56026c) - this.f56025b;
            C8590f<T> c8590f = this.f56029f;
            while (this.f56028e > 1) {
                C8590f<T> c8590f2 = c8590f.get();
                if (c8590f2 == null) {
                    this.f56029f = c8590f;
                    return;
                } else if (c8590f2.f56040b > jNow) {
                    this.f56029f = c8590f;
                    return;
                } else {
                    this.f56028e--;
                    c8590f = c8590f2;
                }
            }
            this.f56029f = c8590f;
        }

        @Override // p000.l2e.InterfaceC8586b
        public void complete() {
            m15286d();
            this.f56032i = true;
        }

        /* JADX INFO: renamed from: d */
        public void m15286d() {
            long jNow = this.f56027d.now(this.f56026c) - this.f56025b;
            C8590f<T> c8590f = this.f56029f;
            while (true) {
                C8590f<T> c8590f2 = c8590f.get();
                if (c8590f2 == null) {
                    if (c8590f.f56039a != null) {
                        this.f56029f = new C8590f<>(null, 0L);
                        return;
                    } else {
                        this.f56029f = c8590f;
                        return;
                    }
                }
                if (c8590f2.f56040b > jNow) {
                    if (c8590f.f56039a == null) {
                        this.f56029f = c8590f;
                        return;
                    }
                    C8590f<T> c8590f3 = new C8590f<>(null, 0L);
                    c8590f3.lazySet(c8590f.get());
                    this.f56029f = c8590f3;
                    return;
                }
                c8590f = c8590f2;
            }
        }

        @Override // p000.l2e.InterfaceC8586b
        public void error(Throwable th) {
            m15286d();
            this.f56031h = th;
            this.f56032i = true;
        }

        @Override // p000.l2e.InterfaceC8586b
        public Throwable getError() {
            return this.f56031h;
        }

        @Override // p000.l2e.InterfaceC8586b
        @cib
        public T getValue() {
            C8590f<T> c8590f = this.f56029f;
            while (true) {
                C8590f<T> c8590f2 = c8590f.get();
                if (c8590f2 == null) {
                    break;
                }
                c8590f = c8590f2;
            }
            if (c8590f.f56040b < this.f56027d.now(this.f56026c) - this.f56025b) {
                return null;
            }
            return c8590f.f56039a;
        }

        @Override // p000.l2e.InterfaceC8586b
        public T[] getValues(T[] tArr) {
            C8590f<T> c8590fM15283a = m15283a();
            int iM15284b = m15284b(c8590fM15283a);
            if (iM15284b != 0) {
                if (tArr.length < iM15284b) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iM15284b));
                }
                for (int i = 0; i != iM15284b; i++) {
                    c8590fM15283a = c8590fM15283a.get();
                    tArr[i] = c8590fM15283a.f56039a;
                }
                if (tArr.length > iM15284b) {
                    tArr[iM15284b] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // p000.l2e.InterfaceC8586b
        public boolean isDone() {
            return this.f56032i;
        }

        @Override // p000.l2e.InterfaceC8586b
        public void next(T t) {
            C8590f<T> c8590f = new C8590f<>(t, this.f56027d.now(this.f56026c));
            C8590f<T> c8590f2 = this.f56030g;
            this.f56030g = c8590f;
            this.f56028e++;
            c8590f2.set(c8590f);
            m15285c();
        }

        @Override // p000.l2e.InterfaceC8586b
        public void replay(C8587c<T> c8587c) {
            if (c8587c.getAndIncrement() != 0) {
                return;
            }
            ycg<? super T> ycgVar = c8587c.f56018a;
            C8590f<T> c8590fM15283a = (C8590f) c8587c.f56020c;
            if (c8590fM15283a == null) {
                c8590fM15283a = m15283a();
            }
            long j = c8587c.f56023f;
            int iAddAndGet = 1;
            do {
                long j2 = c8587c.f56021d.get();
                while (j != j2) {
                    if (c8587c.f56022e) {
                        c8587c.f56020c = null;
                        return;
                    }
                    boolean z = this.f56032i;
                    C8590f<T> c8590f = c8590fM15283a.get();
                    boolean z2 = c8590f == null;
                    if (z && z2) {
                        c8587c.f56020c = null;
                        c8587c.f56022e = true;
                        Throwable th = this.f56031h;
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
                    ycgVar.onNext(c8590f.f56039a);
                    j++;
                    c8590fM15283a = c8590f;
                }
                if (j == j2) {
                    if (c8587c.f56022e) {
                        c8587c.f56020c = null;
                        return;
                    }
                    if (this.f56032i && c8590fM15283a.get() == null) {
                        c8587c.f56020c = null;
                        c8587c.f56022e = true;
                        Throwable th2 = this.f56031h;
                        if (th2 == null) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            ycgVar.onError(th2);
                            return;
                        }
                    }
                }
                c8587c.f56020c = c8590fM15283a;
                c8587c.f56023f = j;
                iAddAndGet = c8587c.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.l2e.InterfaceC8586b
        public int size() {
            return m15284b(m15283a());
        }

        @Override // p000.l2e.InterfaceC8586b
        public void trimHead() {
            if (this.f56029f.f56039a != null) {
                C8590f<T> c8590f = new C8590f<>(null, 0L);
                c8590f.lazySet(this.f56029f.get());
                this.f56029f = c8590f;
            }
        }
    }

    /* JADX INFO: renamed from: l2e$e */
    public static final class C8589e<T> implements InterfaceC8586b<T> {

        /* JADX INFO: renamed from: a */
        public final int f56033a;

        /* JADX INFO: renamed from: b */
        public int f56034b;

        /* JADX INFO: renamed from: c */
        public volatile C8585a<T> f56035c;

        /* JADX INFO: renamed from: d */
        public C8585a<T> f56036d;

        /* JADX INFO: renamed from: e */
        public Throwable f56037e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f56038f;

        public C8589e(int i) {
            this.f56033a = xjb.verifyPositive(i, "maxSize");
            C8585a<T> c8585a = new C8585a<>(null);
            this.f56036d = c8585a;
            this.f56035c = c8585a;
        }

        /* JADX INFO: renamed from: a */
        public void m15287a() {
            int i = this.f56034b;
            if (i > this.f56033a) {
                this.f56034b = i - 1;
                this.f56035c = this.f56035c.get();
            }
        }

        @Override // p000.l2e.InterfaceC8586b
        public void complete() {
            trimHead();
            this.f56038f = true;
        }

        @Override // p000.l2e.InterfaceC8586b
        public void error(Throwable th) {
            this.f56037e = th;
            trimHead();
            this.f56038f = true;
        }

        @Override // p000.l2e.InterfaceC8586b
        public Throwable getError() {
            return this.f56037e;
        }

        @Override // p000.l2e.InterfaceC8586b
        public T getValue() {
            C8585a<T> c8585a = this.f56035c;
            while (true) {
                C8585a<T> c8585a2 = c8585a.get();
                if (c8585a2 == null) {
                    return c8585a.f56017a;
                }
                c8585a = c8585a2;
            }
        }

        @Override // p000.l2e.InterfaceC8586b
        public T[] getValues(T[] tArr) {
            C8585a<T> c8585a = this.f56035c;
            C8585a<T> c8585a2 = c8585a;
            int i = 0;
            while (true) {
                c8585a2 = c8585a2.get();
                if (c8585a2 == null) {
                    break;
                }
                i++;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                c8585a = c8585a.get();
                tArr[i2] = c8585a.f56017a;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // p000.l2e.InterfaceC8586b
        public boolean isDone() {
            return this.f56038f;
        }

        @Override // p000.l2e.InterfaceC8586b
        public void next(T t) {
            C8585a<T> c8585a = new C8585a<>(t);
            C8585a<T> c8585a2 = this.f56036d;
            this.f56036d = c8585a;
            this.f56034b++;
            c8585a2.set(c8585a);
            m15287a();
        }

        @Override // p000.l2e.InterfaceC8586b
        public void replay(C8587c<T> c8587c) {
            if (c8587c.getAndIncrement() != 0) {
                return;
            }
            ycg<? super T> ycgVar = c8587c.f56018a;
            C8585a<T> c8585a = (C8585a) c8587c.f56020c;
            if (c8585a == null) {
                c8585a = this.f56035c;
            }
            long j = c8587c.f56023f;
            int iAddAndGet = 1;
            do {
                long j2 = c8587c.f56021d.get();
                while (j != j2) {
                    if (c8587c.f56022e) {
                        c8587c.f56020c = null;
                        return;
                    }
                    boolean z = this.f56038f;
                    C8585a<T> c8585a2 = c8585a.get();
                    boolean z2 = c8585a2 == null;
                    if (z && z2) {
                        c8587c.f56020c = null;
                        c8587c.f56022e = true;
                        Throwable th = this.f56037e;
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
                    ycgVar.onNext(c8585a2.f56017a);
                    j++;
                    c8585a = c8585a2;
                }
                if (j == j2) {
                    if (c8587c.f56022e) {
                        c8587c.f56020c = null;
                        return;
                    }
                    if (this.f56038f && c8585a.get() == null) {
                        c8587c.f56020c = null;
                        c8587c.f56022e = true;
                        Throwable th2 = this.f56037e;
                        if (th2 == null) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            ycgVar.onError(th2);
                            return;
                        }
                    }
                }
                c8587c.f56020c = c8585a;
                c8587c.f56023f = j;
                iAddAndGet = c8587c.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.l2e.InterfaceC8586b
        public int size() {
            C8585a<T> c8585a = this.f56035c;
            int i = 0;
            while (i != Integer.MAX_VALUE && (c8585a = c8585a.get()) != null) {
                i++;
            }
            return i;
        }

        @Override // p000.l2e.InterfaceC8586b
        public void trimHead() {
            if (this.f56035c.f56017a != null) {
                C8585a<T> c8585a = new C8585a<>(null);
                c8585a.lazySet(this.f56035c.get());
                this.f56035c = c8585a;
            }
        }
    }

    /* JADX INFO: renamed from: l2e$f */
    public static final class C8590f<T> extends AtomicReference<C8590f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a */
        public final T f56039a;

        /* JADX INFO: renamed from: b */
        public final long f56040b;

        public C8590f(T t, long j) {
            this.f56039a = t;
            this.f56040b = j;
        }
    }

    /* JADX INFO: renamed from: l2e$g */
    public static final class C8591g<T> implements InterfaceC8586b<T> {

        /* JADX INFO: renamed from: a */
        public final List<T> f56041a;

        /* JADX INFO: renamed from: b */
        public Throwable f56042b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f56043c;

        /* JADX INFO: renamed from: d */
        public volatile int f56044d;

        public C8591g(int i) {
            this.f56041a = new ArrayList(xjb.verifyPositive(i, "capacityHint"));
        }

        @Override // p000.l2e.InterfaceC8586b
        public void complete() {
            this.f56043c = true;
        }

        @Override // p000.l2e.InterfaceC8586b
        public void error(Throwable th) {
            this.f56042b = th;
            this.f56043c = true;
        }

        @Override // p000.l2e.InterfaceC8586b
        public Throwable getError() {
            return this.f56042b;
        }

        @Override // p000.l2e.InterfaceC8586b
        @cib
        public T getValue() {
            int i = this.f56044d;
            if (i == 0) {
                return null;
            }
            return this.f56041a.get(i - 1);
        }

        @Override // p000.l2e.InterfaceC8586b
        public T[] getValues(T[] tArr) {
            int i = this.f56044d;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.f56041a;
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

        @Override // p000.l2e.InterfaceC8586b
        public boolean isDone() {
            return this.f56043c;
        }

        @Override // p000.l2e.InterfaceC8586b
        public void next(T t) {
            this.f56041a.add(t);
            this.f56044d++;
        }

        @Override // p000.l2e.InterfaceC8586b
        public void replay(C8587c<T> c8587c) {
            int iIntValue;
            if (c8587c.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.f56041a;
            ycg<? super T> ycgVar = c8587c.f56018a;
            Integer num = (Integer) c8587c.f56020c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                c8587c.f56020c = 0;
            }
            long j = c8587c.f56023f;
            int iAddAndGet = 1;
            do {
                long j2 = c8587c.f56021d.get();
                while (j != j2) {
                    if (c8587c.f56022e) {
                        c8587c.f56020c = null;
                        return;
                    }
                    boolean z = this.f56043c;
                    int i = this.f56044d;
                    if (z && iIntValue == i) {
                        c8587c.f56020c = null;
                        c8587c.f56022e = true;
                        Throwable th = this.f56042b;
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
                    if (c8587c.f56022e) {
                        c8587c.f56020c = null;
                        return;
                    }
                    boolean z2 = this.f56043c;
                    int i2 = this.f56044d;
                    if (z2 && iIntValue == i2) {
                        c8587c.f56020c = null;
                        c8587c.f56022e = true;
                        Throwable th2 = this.f56042b;
                        if (th2 == null) {
                            ycgVar.onComplete();
                            return;
                        } else {
                            ycgVar.onError(th2);
                            return;
                        }
                    }
                }
                c8587c.f56020c = Integer.valueOf(iIntValue);
                c8587c.f56023f = j;
                iAddAndGet = c8587c.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.l2e.InterfaceC8586b
        public int size() {
            return this.f56044d;
        }

        @Override // p000.l2e.InterfaceC8586b
        public void trimHead() {
        }
    }

    public l2e(InterfaceC8586b<T> interfaceC8586b) {
        this.f56014b = interfaceC8586b;
    }

    /* JADX INFO: renamed from: c */
    public static <T> l2e<T> m15278c() {
        return new l2e<>(new C8589e(Integer.MAX_VALUE));
    }

    @bfb
    @by1
    public static <T> l2e<T> create() {
        return new l2e<>(new C8591g(16));
    }

    @bfb
    @by1
    public static <T> l2e<T> createWithSize(int i) {
        return new l2e<>(new C8589e(i));
    }

    @bfb
    @by1
    public static <T> l2e<T> createWithTime(long j, TimeUnit timeUnit, voe voeVar) {
        return new l2e<>(new C8588d(Integer.MAX_VALUE, j, timeUnit, voeVar));
    }

    @bfb
    @by1
    public static <T> l2e<T> createWithTimeAndSize(long j, TimeUnit timeUnit, voe voeVar, int i) {
        return new l2e<>(new C8588d(i, j, timeUnit, voeVar));
    }

    /* JADX INFO: renamed from: b */
    public boolean m15279b(C8587c<T> c8587c) {
        C8587c<T>[] c8587cArr;
        C8587c[] c8587cArr2;
        do {
            c8587cArr = this.f56016d.get();
            if (c8587cArr == f56013m) {
                return false;
            }
            int length = c8587cArr.length;
            c8587cArr2 = new C8587c[length + 1];
            System.arraycopy(c8587cArr, 0, c8587cArr2, 0, length);
            c8587cArr2[length] = c8587c;
        } while (!v7b.m23844a(this.f56016d, c8587cArr, c8587cArr2));
        return true;
    }

    public void cleanupBuffer() {
        this.f56014b.trimHead();
    }

    /* JADX INFO: renamed from: d */
    public void m15280d(C8587c<T> c8587c) {
        C8587c<T>[] c8587cArr;
        C8587c[] c8587cArr2;
        do {
            c8587cArr = this.f56016d.get();
            if (c8587cArr == f56013m || c8587cArr == f56012f) {
                return;
            }
            int length = c8587cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c8587cArr[i] == c8587c) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c8587cArr2 = f56012f;
            } else {
                C8587c[] c8587cArr3 = new C8587c[length - 1];
                System.arraycopy(c8587cArr, 0, c8587cArr3, 0, i);
                System.arraycopy(c8587cArr, i + 1, c8587cArr3, i, (length - i) - 1);
                c8587cArr2 = c8587cArr3;
            }
        } while (!v7b.m23844a(this.f56016d, c8587cArr, c8587cArr2));
    }

    /* JADX INFO: renamed from: e */
    public int m15281e() {
        return this.f56014b.size();
    }

    /* JADX INFO: renamed from: f */
    public int m15282f() {
        return this.f56016d.get().length;
    }

    @Override // p000.rg6
    @cib
    public Throwable getThrowable() {
        InterfaceC8586b<T> interfaceC8586b = this.f56014b;
        if (interfaceC8586b.isDone()) {
            return interfaceC8586b.getError();
        }
        return null;
    }

    public T getValue() {
        return this.f56014b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f56011e;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // p000.rg6
    public boolean hasComplete() {
        InterfaceC8586b<T> interfaceC8586b = this.f56014b;
        return interfaceC8586b.isDone() && interfaceC8586b.getError() == null;
    }

    @Override // p000.rg6
    public boolean hasSubscribers() {
        return this.f56016d.get().length != 0;
    }

    @Override // p000.rg6
    public boolean hasThrowable() {
        InterfaceC8586b<T> interfaceC8586b = this.f56014b;
        return interfaceC8586b.isDone() && interfaceC8586b.getError() != null;
    }

    public boolean hasValue() {
        return this.f56014b.size() != 0;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f56015c) {
            return;
        }
        this.f56015c = true;
        InterfaceC8586b<T> interfaceC8586b = this.f56014b;
        interfaceC8586b.complete();
        for (C8587c<T> c8587c : this.f56016d.getAndSet(f56013m)) {
            interfaceC8586b.replay(c8587c);
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f56015c) {
            pfe.onError(th);
            return;
        }
        this.f56015c = true;
        InterfaceC8586b<T> interfaceC8586b = this.f56014b;
        interfaceC8586b.error(th);
        for (C8587c<T> c8587c : this.f56016d.getAndSet(f56013m)) {
            interfaceC8586b.replay(c8587c);
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f56015c) {
            return;
        }
        InterfaceC8586b<T> interfaceC8586b = this.f56014b;
        interfaceC8586b.next(t);
        for (C8587c<T> c8587c : this.f56016d.get()) {
            interfaceC8586b.replay(c8587c);
        }
    }

    @Override // p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (this.f56015c) {
            fdgVar.cancel();
        } else {
            fdgVar.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C8587c<T> c8587c = new C8587c<>(ycgVar, this);
        ycgVar.onSubscribe(c8587c);
        if (m15279b(c8587c) && c8587c.f56022e) {
            m15280d(c8587c);
        } else {
            this.f56014b.replay(c8587c);
        }
    }

    @bfb
    @by1
    public static <T> l2e<T> create(int i) {
        return new l2e<>(new C8591g(i));
    }

    public T[] getValues(T[] tArr) {
        return this.f56014b.getValues(tArr);
    }
}
