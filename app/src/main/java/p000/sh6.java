package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class sh6<T> extends nr2<T> implements eh7<T>, m5e {

    /* JADX INFO: renamed from: f */
    public static final Callable f81772f = new CallableC12582c();

    /* JADX INFO: renamed from: b */
    public final m86<T> f81773b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C12589j<T>> f81774c;

    /* JADX INFO: renamed from: d */
    public final Callable<? extends InterfaceC12586g<T>> f81775d;

    /* JADX INFO: renamed from: e */
    public final zjd<T> f81776e;

    /* JADX INFO: renamed from: sh6$a */
    public static class C12580a<T> extends AtomicReference<C12585f> implements InterfaceC12586g<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* JADX INFO: renamed from: a */
        public C12585f f81777a;

        /* JADX INFO: renamed from: b */
        public int f81778b;

        /* JADX INFO: renamed from: c */
        public long f81779c;

        public C12580a() {
            C12585f c12585f = new C12585f(null, 0L);
            this.f81777a = c12585f;
            set(c12585f);
        }

        /* JADX INFO: renamed from: a */
        public final void m21985a(C12585f c12585f) {
            this.f81777a.set(c12585f);
            this.f81777a = c12585f;
            this.f81778b++;
        }

        /* JADX INFO: renamed from: b */
        public final void m21986b(Collection<? super T> collection) {
            C12585f c12585fMo21988d = mo21988d();
            while (true) {
                c12585fMo21988d = c12585fMo21988d.get();
                if (c12585fMo21988d == null) {
                    return;
                }
                Object objMo21991g = mo21991g(c12585fMo21988d.f81793a);
                if (ehb.isComplete(objMo21991g) || ehb.isError(objMo21991g)) {
                    return;
                } else {
                    collection.add((Object) ehb.getValue(objMo21991g));
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public Object mo21987c(Object obj) {
            return obj;
        }

        @Override // p000.sh6.InterfaceC12586g
        public final void complete() {
            Object objMo21987c = mo21987c(ehb.complete());
            long j = this.f81779c + 1;
            this.f81779c = j;
            m21985a(new C12585f(objMo21987c, j));
            mo21997m();
        }

        /* JADX INFO: renamed from: d */
        public C12585f mo21988d() {
            return get();
        }

        /* JADX INFO: renamed from: e */
        public boolean m21989e() {
            Object obj = this.f81777a.f81793a;
            return obj != null && ehb.isComplete(mo21991g(obj));
        }

        @Override // p000.sh6.InterfaceC12586g
        public final void error(Throwable th) {
            Object objMo21987c = mo21987c(ehb.error(th));
            long j = this.f81779c + 1;
            this.f81779c = j;
            m21985a(new C12585f(objMo21987c, j));
            mo21997m();
        }

        /* JADX INFO: renamed from: f */
        public boolean m21990f() {
            Object obj = this.f81777a.f81793a;
            return obj != null && ehb.isError(mo21991g(obj));
        }

        /* JADX INFO: renamed from: g */
        public Object mo21991g(Object obj) {
            return obj;
        }

        /* JADX INFO: renamed from: h */
        public final void m21992h() {
            C12585f c12585f = get().get();
            if (c12585f == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.f81778b--;
            m21994j(c12585f);
        }

        /* JADX INFO: renamed from: i */
        public final void m21993i(int i) {
            C12585f c12585f = get();
            while (i > 0) {
                c12585f = c12585f.get();
                i--;
                this.f81778b--;
            }
            m21994j(c12585f);
            C12585f c12585f2 = get();
            if (c12585f2.get() == null) {
                this.f81777a = c12585f2;
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m21994j(C12585f c12585f) {
            set(c12585f);
        }

        /* JADX INFO: renamed from: k */
        public final void m21995k() {
            C12585f c12585f = get();
            if (c12585f.f81793a != null) {
                C12585f c12585f2 = new C12585f(null, 0L);
                c12585f2.lazySet(c12585f.get());
                set(c12585f2);
            }
        }

        /* JADX INFO: renamed from: l */
        public void mo21996l() {
        }

        /* JADX INFO: renamed from: m */
        public void mo21997m() {
            m21995k();
        }

        @Override // p000.sh6.InterfaceC12586g
        public final void next(T t) {
            Object objMo21987c = mo21987c(ehb.next(t));
            long j = this.f81779c + 1;
            this.f81779c = j;
            m21985a(new C12585f(objMo21987c, j));
            mo21996l();
        }

        @Override // p000.sh6.InterfaceC12586g
        public final void replay(C12583d<T> c12583d) {
            C12585f c12585f;
            synchronized (c12583d) {
                try {
                    if (c12583d.f81787e) {
                        c12583d.f81788f = true;
                        return;
                    }
                    c12583d.f81787e = true;
                    while (!c12583d.isDisposed()) {
                        long j = c12583d.get();
                        boolean z = j == Long.MAX_VALUE;
                        C12585f c12585fMo21988d = (C12585f) c12583d.m21998a();
                        if (c12585fMo21988d == null) {
                            c12585fMo21988d = mo21988d();
                            c12583d.f81785c = c12585fMo21988d;
                            so0.add(c12583d.f81786d, c12585fMo21988d.f81794b);
                        }
                        long j2 = 0;
                        while (j != 0 && (c12585f = c12585fMo21988d.get()) != null) {
                            Object objMo21991g = mo21991g(c12585f.f81793a);
                            try {
                                if (ehb.accept(objMo21991g, c12583d.f81784b)) {
                                    c12583d.f81785c = null;
                                    return;
                                }
                                j2++;
                                j--;
                                if (c12583d.isDisposed()) {
                                    c12583d.f81785c = null;
                                    return;
                                }
                                c12585fMo21988d = c12585f;
                            } catch (Throwable th) {
                                n75.throwIfFatal(th);
                                c12583d.f81785c = null;
                                c12583d.dispose();
                                if (ehb.isError(objMo21991g) || ehb.isComplete(objMo21991g)) {
                                    return;
                                }
                                c12583d.f81784b.onError(th);
                                return;
                            }
                        }
                        if (j2 != 0) {
                            c12583d.f81785c = c12585fMo21988d;
                            if (!z) {
                                c12583d.produced(j2);
                            }
                        }
                        synchronized (c12583d) {
                            try {
                                if (!c12583d.f81788f) {
                                    c12583d.f81787e = false;
                                    return;
                                }
                                c12583d.f81788f = false;
                            } finally {
                            }
                        }
                    }
                    c12583d.f81785c = null;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: sh6$b */
    public static final class C12581b<T> extends nr2<T> {

        /* JADX INFO: renamed from: b */
        public final nr2<T> f81780b;

        /* JADX INFO: renamed from: c */
        public final m86<T> f81781c;

        public C12581b(nr2<T> nr2Var, m86<T> m86Var) {
            this.f81780b = nr2Var;
            this.f81781c = m86Var;
        }

        @Override // p000.nr2
        public void connect(tu2<? super mf4> tu2Var) {
            this.f81780b.connect(tu2Var);
        }

        @Override // p000.m86
        public void subscribeActual(ycg<? super T> ycgVar) {
            this.f81781c.subscribe(ycgVar);
        }
    }

    /* JADX INFO: renamed from: sh6$c */
    public static final class CallableC12582c implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return new C12593n(16);
        }
    }

    /* JADX INFO: renamed from: sh6$d */
    public static final class C12583d<T> extends AtomicLong implements fdg, mf4 {

        /* JADX INFO: renamed from: m */
        public static final long f81782m = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;

        /* JADX INFO: renamed from: a */
        public final C12589j<T> f81783a;

        /* JADX INFO: renamed from: b */
        public final ycg<? super T> f81784b;

        /* JADX INFO: renamed from: c */
        public Object f81785c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f81786d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public boolean f81787e;

        /* JADX INFO: renamed from: f */
        public boolean f81788f;

        public C12583d(C12589j<T> c12589j, ycg<? super T> ycgVar) {
            this.f81783a = c12589j;
            this.f81784b = ycgVar;
        }

        /* JADX INFO: renamed from: a */
        public <U> U m21998a() {
            return (U) this.f81785c;
        }

        @Override // p000.fdg
        public void cancel() {
            dispose();
        }

        @Override // p000.mf4
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f81783a.m22001c(this);
                this.f81783a.m22000b();
                this.f81785c = null;
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        public long produced(long j) {
            return so0.producedCancel(this, j);
        }

        @Override // p000.fdg
        public void request(long j) {
            if (!mdg.validate(j) || so0.addCancel(this, j) == Long.MIN_VALUE) {
                return;
            }
            so0.add(this.f81786d, j);
            this.f81783a.m22000b();
            this.f81783a.f81800a.replay(this);
        }
    }

    /* JADX INFO: renamed from: sh6$e */
    public static final class C12584e<R, U> extends m86<R> {

        /* JADX INFO: renamed from: b */
        public final Callable<? extends nr2<U>> f81789b;

        /* JADX INFO: renamed from: c */
        public final py6<? super m86<U>, ? extends zjd<R>> f81790c;

        /* JADX INFO: renamed from: sh6$e$a */
        public final class a implements tu2<mf4> {

            /* JADX INFO: renamed from: a */
            public final edg<R> f81791a;

            public a(edg<R> edgVar) {
                this.f81791a = edgVar;
            }

            @Override // p000.tu2
            public void accept(mf4 mf4Var) {
                this.f81791a.setResource(mf4Var);
            }
        }

        public C12584e(Callable<? extends nr2<U>> callable, py6<? super m86<U>, ? extends zjd<R>> py6Var) {
            this.f81789b = callable;
            this.f81790c = py6Var;
        }

        @Override // p000.m86
        public void subscribeActual(ycg<? super R> ycgVar) {
            try {
                nr2 nr2Var = (nr2) xjb.requireNonNull(this.f81789b.call(), "The connectableFactory returned null");
                try {
                    zjd zjdVar = (zjd) xjb.requireNonNull(this.f81790c.apply(nr2Var), "The selector returned a null Publisher");
                    edg edgVar = new edg(ycgVar);
                    zjdVar.subscribe(edgVar);
                    nr2Var.connect(new a(edgVar));
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    x05.error(th, ycgVar);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                x05.error(th2, ycgVar);
            }
        }
    }

    /* JADX INFO: renamed from: sh6$f */
    public static final class C12585f extends AtomicReference<C12585f> {
        private static final long serialVersionUID = 245354315435971818L;

        /* JADX INFO: renamed from: a */
        public final Object f81793a;

        /* JADX INFO: renamed from: b */
        public final long f81794b;

        public C12585f(Object obj, long j) {
            this.f81793a = obj;
            this.f81794b = j;
        }
    }

    /* JADX INFO: renamed from: sh6$g */
    public interface InterfaceC12586g<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(C12583d<T> c12583d);
    }

    /* JADX INFO: renamed from: sh6$h */
    public static final class CallableC12587h<T> implements Callable<InterfaceC12586g<T>> {

        /* JADX INFO: renamed from: a */
        public final int f81795a;

        public CallableC12587h(int i) {
            this.f81795a = i;
        }

        @Override // java.util.concurrent.Callable
        public InterfaceC12586g<T> call() {
            return new C12592m(this.f81795a);
        }
    }

    /* JADX INFO: renamed from: sh6$i */
    public static final class C12588i<T> implements zjd<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C12589j<T>> f81796a;

        /* JADX INFO: renamed from: b */
        public final Callable<? extends InterfaceC12586g<T>> f81797b;

        public C12588i(AtomicReference<C12589j<T>> atomicReference, Callable<? extends InterfaceC12586g<T>> callable) {
            this.f81796a = atomicReference;
            this.f81797b = callable;
        }

        @Override // p000.zjd
        public void subscribe(ycg<? super T> ycgVar) {
            C12589j<T> c12589j;
            while (true) {
                c12589j = this.f81796a.get();
                if (c12589j != null) {
                    break;
                }
                try {
                    C12589j<T> c12589j2 = new C12589j<>(this.f81797b.call());
                    if (v7b.m23844a(this.f81796a, null, c12589j2)) {
                        c12589j = c12589j2;
                        break;
                    }
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    x05.error(th, ycgVar);
                    return;
                }
            }
            C12583d<T> c12583d = new C12583d<>(c12589j, ycgVar);
            ycgVar.onSubscribe(c12583d);
            c12589j.m21999a(c12583d);
            if (c12583d.isDisposed()) {
                c12589j.m22001c(c12583d);
            } else {
                c12589j.m22000b();
                c12589j.f81800a.replay(c12583d);
            }
        }
    }

    /* JADX INFO: renamed from: sh6$j */
    public static final class C12589j<T> extends AtomicReference<fdg> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: C */
        public static final C12583d[] f81798C = new C12583d[0];

        /* JADX INFO: renamed from: F */
        public static final C12583d[] f81799F = new C12583d[0];
        private static final long serialVersionUID = 7224554242710036740L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC12586g<T> f81800a;

        /* JADX INFO: renamed from: b */
        public boolean f81801b;

        /* JADX INFO: renamed from: f */
        public long f81805f;

        /* JADX INFO: renamed from: m */
        public long f81806m;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f81804e = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<C12583d<T>[]> f81802c = new AtomicReference<>(f81798C);

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f81803d = new AtomicBoolean();

        public C12589j(InterfaceC12586g<T> interfaceC12586g) {
            this.f81800a = interfaceC12586g;
        }

        /* JADX INFO: renamed from: a */
        public boolean m21999a(C12583d<T> c12583d) {
            C12583d<T>[] c12583dArr;
            C12583d[] c12583dArr2;
            c12583d.getClass();
            do {
                c12583dArr = this.f81802c.get();
                if (c12583dArr == f81799F) {
                    return false;
                }
                int length = c12583dArr.length;
                c12583dArr2 = new C12583d[length + 1];
                System.arraycopy(c12583dArr, 0, c12583dArr2, 0, length);
                c12583dArr2[length] = c12583d;
            } while (!v7b.m23844a(this.f81802c, c12583dArr, c12583dArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m22000b() {
            if (this.f81804e.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                C12583d<T>[] c12583dArr = this.f81802c.get();
                long j = this.f81805f;
                long jMax = j;
                for (C12583d<T> c12583d : c12583dArr) {
                    jMax = Math.max(jMax, c12583d.f81786d.get());
                }
                long j2 = this.f81806m;
                fdg fdgVar = get();
                long j3 = jMax - j;
                if (j3 != 0) {
                    this.f81805f = jMax;
                    if (fdgVar == null) {
                        long j4 = j2 + j3;
                        if (j4 < 0) {
                            j4 = Long.MAX_VALUE;
                        }
                        this.f81806m = j4;
                    } else if (j2 != 0) {
                        this.f81806m = 0L;
                        fdgVar.request(j2 + j3);
                    } else {
                        fdgVar.request(j3);
                    }
                } else if (j2 != 0 && fdgVar != null) {
                    this.f81806m = 0L;
                    fdgVar.request(j2);
                }
                iAddAndGet = this.f81804e.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m22001c(C12583d<T> c12583d) {
            C12583d<T>[] c12583dArr;
            C12583d[] c12583dArr2;
            do {
                c12583dArr = this.f81802c.get();
                int length = c12583dArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c12583dArr[i].equals(c12583d)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c12583dArr2 = f81798C;
                } else {
                    C12583d[] c12583dArr3 = new C12583d[length - 1];
                    System.arraycopy(c12583dArr, 0, c12583dArr3, 0, i);
                    System.arraycopy(c12583dArr, i + 1, c12583dArr3, i, (length - i) - 1);
                    c12583dArr2 = c12583dArr3;
                }
            } while (!v7b.m23844a(this.f81802c, c12583dArr, c12583dArr2));
        }

        @Override // p000.mf4
        public void dispose() {
            this.f81802c.set(f81799F);
            mdg.cancel(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f81802c.get() == f81799F;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f81801b) {
                return;
            }
            this.f81801b = true;
            this.f81800a.complete();
            for (C12583d<T> c12583d : this.f81802c.getAndSet(f81799F)) {
                this.f81800a.replay(c12583d);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f81801b) {
                pfe.onError(th);
                return;
            }
            this.f81801b = true;
            this.f81800a.error(th);
            for (C12583d<T> c12583d : this.f81802c.getAndSet(f81799F)) {
                this.f81800a.replay(c12583d);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f81801b) {
                return;
            }
            this.f81800a.next(t);
            for (C12583d<T> c12583d : this.f81802c.get()) {
                this.f81800a.replay(c12583d);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this, fdgVar)) {
                m22000b();
                for (C12583d<T> c12583d : this.f81802c.get()) {
                    this.f81800a.replay(c12583d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: sh6$k */
    public static final class CallableC12590k<T> implements Callable<InterfaceC12586g<T>> {

        /* JADX INFO: renamed from: a */
        public final int f81807a;

        /* JADX INFO: renamed from: b */
        public final long f81808b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f81809c;

        /* JADX INFO: renamed from: d */
        public final voe f81810d;

        public CallableC12590k(int i, long j, TimeUnit timeUnit, voe voeVar) {
            this.f81807a = i;
            this.f81808b = j;
            this.f81809c = timeUnit;
            this.f81810d = voeVar;
        }

        @Override // java.util.concurrent.Callable
        public InterfaceC12586g<T> call() {
            return new C12591l(this.f81807a, this.f81808b, this.f81809c, this.f81810d);
        }
    }

    /* JADX INFO: renamed from: sh6$l */
    public static final class C12591l<T> extends C12580a<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* JADX INFO: renamed from: d */
        public final voe f81811d;

        /* JADX INFO: renamed from: e */
        public final long f81812e;

        /* JADX INFO: renamed from: f */
        public final TimeUnit f81813f;

        /* JADX INFO: renamed from: m */
        public final int f81814m;

        public C12591l(int i, long j, TimeUnit timeUnit, voe voeVar) {
            this.f81811d = voeVar;
            this.f81814m = i;
            this.f81812e = j;
            this.f81813f = timeUnit;
        }

        @Override // p000.sh6.C12580a
        /* JADX INFO: renamed from: c */
        public Object mo21987c(Object obj) {
            return new i1h(obj, this.f81811d.now(this.f81813f), this.f81813f);
        }

        @Override // p000.sh6.C12580a
        /* JADX INFO: renamed from: d */
        public C12585f mo21988d() {
            C12585f c12585f;
            long jNow = this.f81811d.now(this.f81813f) - this.f81812e;
            C12585f c12585f2 = get();
            C12585f c12585f3 = c12585f2.get();
            while (true) {
                C12585f c12585f4 = c12585f3;
                c12585f = c12585f2;
                c12585f2 = c12585f4;
                if (c12585f2 == null) {
                    break;
                }
                i1h i1hVar = (i1h) c12585f2.f81793a;
                if (ehb.isComplete(i1hVar.value()) || ehb.isError(i1hVar.value()) || i1hVar.time() > jNow) {
                    break;
                }
                c12585f3 = c12585f2.get();
            }
            return c12585f;
        }

        @Override // p000.sh6.C12580a
        /* JADX INFO: renamed from: g */
        public Object mo21991g(Object obj) {
            return ((i1h) obj).value();
        }

        @Override // p000.sh6.C12580a
        /* JADX INFO: renamed from: l */
        public void mo21996l() {
            C12585f c12585f;
            long jNow = this.f81811d.now(this.f81813f) - this.f81812e;
            C12585f c12585f2 = get();
            C12585f c12585f3 = c12585f2.get();
            int i = 0;
            while (true) {
                C12585f c12585f4 = c12585f3;
                c12585f = c12585f2;
                c12585f2 = c12585f4;
                if (c12585f2 == null) {
                    break;
                }
                int i2 = this.f81778b;
                if (i2 > this.f81814m && i2 > 1) {
                    i++;
                    this.f81778b = i2 - 1;
                    c12585f3 = c12585f2.get();
                } else {
                    if (((i1h) c12585f2.f81793a).time() > jNow) {
                        break;
                    }
                    i++;
                    this.f81778b--;
                    c12585f3 = c12585f2.get();
                }
            }
            if (i != 0) {
                m21994j(c12585f);
            }
        }

        @Override // p000.sh6.C12580a
        /* JADX INFO: renamed from: m */
        public void mo21997m() {
            C12585f c12585f;
            long jNow = this.f81811d.now(this.f81813f) - this.f81812e;
            C12585f c12585f2 = get();
            C12585f c12585f3 = c12585f2.get();
            int i = 0;
            while (true) {
                C12585f c12585f4 = c12585f3;
                c12585f = c12585f2;
                c12585f2 = c12585f4;
                if (c12585f2 == null || this.f81778b <= 1 || ((i1h) c12585f2.f81793a).time() > jNow) {
                    break;
                }
                i++;
                this.f81778b--;
                c12585f3 = c12585f2.get();
            }
            if (i != 0) {
                m21994j(c12585f);
            }
        }
    }

    /* JADX INFO: renamed from: sh6$m */
    public static final class C12592m<T> extends C12580a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* JADX INFO: renamed from: d */
        public final int f81815d;

        public C12592m(int i) {
            this.f81815d = i;
        }

        @Override // p000.sh6.C12580a
        /* JADX INFO: renamed from: l */
        public void mo21996l() {
            if (this.f81778b > this.f81815d) {
                m21992h();
            }
        }
    }

    /* JADX INFO: renamed from: sh6$n */
    public static final class C12593n<T> extends ArrayList<Object> implements InterfaceC12586g<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: a */
        public volatile int f81816a;

        public C12593n(int i) {
            super(i);
        }

        @Override // p000.sh6.InterfaceC12586g
        public void complete() {
            add(ehb.complete());
            this.f81816a++;
        }

        @Override // p000.sh6.InterfaceC12586g
        public void error(Throwable th) {
            add(ehb.error(th));
            this.f81816a++;
        }

        @Override // p000.sh6.InterfaceC12586g
        public void next(T t) {
            add(ehb.next(t));
            this.f81816a++;
        }

        @Override // p000.sh6.InterfaceC12586g
        public void replay(C12583d<T> c12583d) {
            synchronized (c12583d) {
                try {
                    if (c12583d.f81787e) {
                        c12583d.f81788f = true;
                        return;
                    }
                    c12583d.f81787e = true;
                    ycg<? super T> ycgVar = c12583d.f81784b;
                    while (!c12583d.isDisposed()) {
                        int i = this.f81816a;
                        Integer num = (Integer) c12583d.m21998a();
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j = c12583d.get();
                        long j2 = j;
                        long j3 = 0;
                        while (j2 != 0 && iIntValue < i) {
                            Object obj = get(iIntValue);
                            try {
                                if (ehb.accept(obj, ycgVar) || c12583d.isDisposed()) {
                                    return;
                                }
                                iIntValue++;
                                j2--;
                                j3++;
                            } catch (Throwable th) {
                                n75.throwIfFatal(th);
                                c12583d.dispose();
                                if (ehb.isError(obj) || ehb.isComplete(obj)) {
                                    return;
                                }
                                ycgVar.onError(th);
                                return;
                            }
                        }
                        if (j3 != 0) {
                            c12583d.f81785c = Integer.valueOf(iIntValue);
                            if (j != Long.MAX_VALUE) {
                                c12583d.produced(j3);
                            }
                        }
                        synchronized (c12583d) {
                            try {
                                if (!c12583d.f81788f) {
                                    c12583d.f81787e = false;
                                    return;
                                }
                                c12583d.f81788f = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    private sh6(zjd<T> zjdVar, m86<T> m86Var, AtomicReference<C12589j<T>> atomicReference, Callable<? extends InterfaceC12586g<T>> callable) {
        this.f81776e = zjdVar;
        this.f81773b = m86Var;
        this.f81774c = atomicReference;
        this.f81775d = callable;
    }

    /* JADX INFO: renamed from: b */
    public static <T> nr2<T> m21984b(m86<T> m86Var, Callable<? extends InterfaceC12586g<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return pfe.onAssembly((nr2) new sh6(new C12588i(atomicReference, callable), m86Var, atomicReference, callable));
    }

    public static <T> nr2<T> create(m86<T> m86Var, int i) {
        return i == Integer.MAX_VALUE ? createFrom(m86Var) : m21984b(m86Var, new CallableC12587h(i));
    }

    public static <T> nr2<T> createFrom(m86<? extends T> m86Var) {
        return m21984b(m86Var, f81772f);
    }

    public static <U, R> m86<R> multicastSelector(Callable<? extends nr2<U>> callable, py6<? super m86<U>, ? extends zjd<R>> py6Var) {
        return new C12584e(callable, py6Var);
    }

    public static <T> nr2<T> observeOn(nr2<T> nr2Var, voe voeVar) {
        return pfe.onAssembly((nr2) new C12581b(nr2Var, nr2Var.observeOn(voeVar)));
    }

    @Override // p000.nr2
    public void connect(tu2<? super mf4> tu2Var) {
        C12589j<T> c12589j;
        while (true) {
            c12589j = this.f81774c.get();
            if (c12589j != null && !c12589j.isDisposed()) {
                break;
            }
            try {
                C12589j<T> c12589j2 = new C12589j<>(this.f81775d.call());
                if (v7b.m23844a(this.f81774c, c12589j, c12589j2)) {
                    c12589j = c12589j2;
                    break;
                }
            } finally {
                n75.throwIfFatal(th);
                RuntimeException runtimeExceptionWrapOrThrow = j75.wrapOrThrow(th);
            }
        }
        boolean z = !c12589j.f81803d.get() && c12589j.f81803d.compareAndSet(false, true);
        try {
            tu2Var.accept(c12589j);
            if (z) {
                this.f81773b.subscribe((lj6) c12589j);
            }
        } catch (Throwable th) {
            if (z) {
                c12589j.f81803d.compareAndSet(true, false);
            }
            throw j75.wrapOrThrow(th);
        }
    }

    @Override // p000.m5e
    public void resetIf(mf4 mf4Var) {
        v7b.m23844a(this.f81774c, (C12589j) mf4Var, null);
    }

    @Override // p000.eh7
    public zjd<T> source() {
        return this.f81773b;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f81776e.subscribe(ycgVar);
    }

    public static <T> nr2<T> create(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar) {
        return create(m86Var, j, timeUnit, voeVar, Integer.MAX_VALUE);
    }

    public static <T> nr2<T> create(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar, int i) {
        return m21984b(m86Var, new CallableC12590k(i, j, timeUnit, voeVar));
    }
}
