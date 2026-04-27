package p000;

import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class itb<T> extends pr2<T> implements ch7<T>, m5e {

    /* JADX INFO: renamed from: e */
    public static final InterfaceC7598b f48218e = new C7611o();

    /* JADX INFO: renamed from: a */
    public final xub<T> f48219a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C7606j<T>> f48220b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7598b<T> f48221c;

    /* JADX INFO: renamed from: d */
    public final xub<T> f48222d;

    /* JADX INFO: renamed from: itb$a */
    public static abstract class AbstractC7597a<T> extends AtomicReference<C7602f> implements InterfaceC7604h<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* JADX INFO: renamed from: a */
        public C7602f f48223a;

        /* JADX INFO: renamed from: b */
        public int f48224b;

        public AbstractC7597a() {
            C7602f c7602f = new C7602f(null);
            this.f48223a = c7602f;
            set(c7602f);
        }

        /* JADX INFO: renamed from: a */
        public final void m13400a(C7602f c7602f) {
            this.f48223a.set(c7602f);
            this.f48223a = c7602f;
            this.f48224b++;
        }

        /* JADX INFO: renamed from: b */
        public final void m13401b(Collection<? super T> collection) {
            C7602f c7602fMo13403d = mo13403d();
            while (true) {
                c7602fMo13403d = c7602fMo13403d.get();
                if (c7602fMo13403d == null) {
                    return;
                }
                Object objMo13406g = mo13406g(c7602fMo13403d.f48232a);
                if (ehb.isComplete(objMo13406g) || ehb.isError(objMo13406g)) {
                    return;
                } else {
                    collection.add((Object) ehb.getValue(objMo13406g));
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public Object mo13402c(Object obj) {
            return obj;
        }

        @Override // p000.itb.InterfaceC7604h
        public final void complete() {
            m13400a(new C7602f(mo13402c(ehb.complete())));
            mo13412m();
        }

        /* JADX INFO: renamed from: d */
        public C7602f mo13403d() {
            return get();
        }

        /* JADX INFO: renamed from: e */
        public boolean m13404e() {
            Object obj = this.f48223a.f48232a;
            return obj != null && ehb.isComplete(mo13406g(obj));
        }

        @Override // p000.itb.InterfaceC7604h
        public final void error(Throwable th) {
            m13400a(new C7602f(mo13402c(ehb.error(th))));
            mo13412m();
        }

        /* JADX INFO: renamed from: f */
        public boolean m13405f() {
            Object obj = this.f48223a.f48232a;
            return obj != null && ehb.isError(mo13406g(obj));
        }

        /* JADX INFO: renamed from: g */
        public Object mo13406g(Object obj) {
            return obj;
        }

        /* JADX INFO: renamed from: h */
        public final void m13407h() {
            this.f48224b--;
            m13409j(get().get());
        }

        /* JADX INFO: renamed from: i */
        public final void m13408i(int i) {
            C7602f c7602f = get();
            while (i > 0) {
                c7602f = c7602f.get();
                i--;
                this.f48224b--;
            }
            m13409j(c7602f);
            C7602f c7602f2 = get();
            if (c7602f2.get() == null) {
                this.f48223a = c7602f2;
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m13409j(C7602f c7602f) {
            set(c7602f);
        }

        /* JADX INFO: renamed from: k */
        public final void m13410k() {
            C7602f c7602f = get();
            if (c7602f.f48232a != null) {
                C7602f c7602f2 = new C7602f(null);
                c7602f2.lazySet(c7602f.get());
                set(c7602f2);
            }
        }

        /* JADX INFO: renamed from: l */
        public abstract void mo13411l();

        /* JADX INFO: renamed from: m */
        public void mo13412m() {
            m13410k();
        }

        @Override // p000.itb.InterfaceC7604h
        public final void next(T t) {
            m13400a(new C7602f(mo13402c(ehb.next(t))));
            mo13411l();
        }

        @Override // p000.itb.InterfaceC7604h
        public final void replay(C7600d<T> c7600d) {
            if (c7600d.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                C7602f c7602fMo13403d = (C7602f) c7600d.m13413a();
                if (c7602fMo13403d == null) {
                    c7602fMo13403d = mo13403d();
                    c7600d.f48228c = c7602fMo13403d;
                }
                while (!c7600d.isDisposed()) {
                    C7602f c7602f = c7602fMo13403d.get();
                    if (c7602f == null) {
                        c7600d.f48228c = c7602fMo13403d;
                        iAddAndGet = c7600d.addAndGet(-iAddAndGet);
                    } else {
                        if (ehb.accept(mo13406g(c7602f.f48232a), c7600d.f48227b)) {
                            c7600d.f48228c = null;
                            return;
                        }
                        c7602fMo13403d = c7602f;
                    }
                }
                c7600d.f48228c = null;
                return;
            } while (iAddAndGet != 0);
        }
    }

    /* JADX INFO: renamed from: itb$b */
    public interface InterfaceC7598b<T> {
        InterfaceC7604h<T> call();
    }

    /* JADX INFO: renamed from: itb$c */
    public static final class C7599c<R> implements tu2<mf4> {

        /* JADX INFO: renamed from: a */
        public final wxb<R> f48225a;

        public C7599c(wxb<R> wxbVar) {
            this.f48225a = wxbVar;
        }

        @Override // p000.tu2
        public void accept(mf4 mf4Var) {
            this.f48225a.setResource(mf4Var);
        }
    }

    /* JADX INFO: renamed from: itb$d */
    public static final class C7600d<T> extends AtomicInteger implements mf4 {
        private static final long serialVersionUID = 2728361546769921047L;

        /* JADX INFO: renamed from: a */
        public final C7606j<T> f48226a;

        /* JADX INFO: renamed from: b */
        public final oxb<? super T> f48227b;

        /* JADX INFO: renamed from: c */
        public Object f48228c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48229d;

        public C7600d(C7606j<T> c7606j, oxb<? super T> oxbVar) {
            this.f48226a = c7606j;
            this.f48227b = oxbVar;
        }

        /* JADX INFO: renamed from: a */
        public <U> U m13413a() {
            return (U) this.f48228c;
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f48229d) {
                return;
            }
            this.f48229d = true;
            this.f48226a.m13415b(this);
            this.f48228c = null;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f48229d;
        }
    }

    /* JADX INFO: renamed from: itb$e */
    public static final class C7601e<R, U> extends Observable<R> {

        /* JADX INFO: renamed from: a */
        public final Callable<? extends pr2<U>> f48230a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Observable<U>, ? extends xub<R>> f48231b;

        public C7601e(Callable<? extends pr2<U>> callable, py6<? super Observable<U>, ? extends xub<R>> py6Var) {
            this.f48230a = callable;
            this.f48231b = py6Var;
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(oxb<? super R> oxbVar) {
            try {
                pr2 pr2Var = (pr2) xjb.requireNonNull(this.f48230a.call(), "The connectableFactory returned a null ConnectableObservable");
                xub xubVar = (xub) xjb.requireNonNull(this.f48231b.apply(pr2Var), "The selector returned a null ObservableSource");
                wxb wxbVar = new wxb(oxbVar);
                xubVar.subscribe(wxbVar);
                pr2Var.connect(new C7599c(wxbVar));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                c05.error(th, oxbVar);
            }
        }
    }

    /* JADX INFO: renamed from: itb$f */
    public static final class C7602f extends AtomicReference<C7602f> {
        private static final long serialVersionUID = 245354315435971818L;

        /* JADX INFO: renamed from: a */
        public final Object f48232a;

        public C7602f(Object obj) {
            this.f48232a = obj;
        }
    }

    /* JADX INFO: renamed from: itb$g */
    public static final class C7603g<T> extends pr2<T> {

        /* JADX INFO: renamed from: a */
        public final pr2<T> f48233a;

        /* JADX INFO: renamed from: b */
        public final Observable<T> f48234b;

        public C7603g(pr2<T> pr2Var, Observable<T> observable) {
            this.f48233a = pr2Var;
            this.f48234b = observable;
        }

        @Override // p000.pr2
        public void connect(tu2<? super mf4> tu2Var) {
            this.f48233a.connect(tu2Var);
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(oxb<? super T> oxbVar) {
            this.f48234b.subscribe(oxbVar);
        }
    }

    /* JADX INFO: renamed from: itb$h */
    public interface InterfaceC7604h<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(C7600d<T> c7600d);
    }

    /* JADX INFO: renamed from: itb$i */
    public static final class C7605i<T> implements InterfaceC7598b<T> {

        /* JADX INFO: renamed from: a */
        public final int f48235a;

        public C7605i(int i) {
            this.f48235a = i;
        }

        @Override // p000.itb.InterfaceC7598b
        public InterfaceC7604h<T> call() {
            return new C7610n(this.f48235a);
        }
    }

    /* JADX INFO: renamed from: itb$j */
    public static final class C7606j<T> extends AtomicReference<mf4> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: e */
        public static final C7600d[] f48236e = new C7600d[0];

        /* JADX INFO: renamed from: f */
        public static final C7600d[] f48237f = new C7600d[0];
        private static final long serialVersionUID = -533785617179540163L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC7604h<T> f48238a;

        /* JADX INFO: renamed from: b */
        public boolean f48239b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<C7600d[]> f48240c = new AtomicReference<>(f48236e);

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f48241d = new AtomicBoolean();

        public C7606j(InterfaceC7604h<T> interfaceC7604h) {
            this.f48238a = interfaceC7604h;
        }

        /* JADX INFO: renamed from: a */
        public boolean m13414a(C7600d<T> c7600d) {
            C7600d[] c7600dArr;
            C7600d[] c7600dArr2;
            do {
                c7600dArr = this.f48240c.get();
                if (c7600dArr == f48237f) {
                    return false;
                }
                int length = c7600dArr.length;
                c7600dArr2 = new C7600d[length + 1];
                System.arraycopy(c7600dArr, 0, c7600dArr2, 0, length);
                c7600dArr2[length] = c7600d;
            } while (!v7b.m23844a(this.f48240c, c7600dArr, c7600dArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m13415b(C7600d<T> c7600d) {
            C7600d[] c7600dArr;
            C7600d[] c7600dArr2;
            do {
                c7600dArr = this.f48240c.get();
                int length = c7600dArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c7600dArr[i].equals(c7600d)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c7600dArr2 = f48236e;
                } else {
                    C7600d[] c7600dArr3 = new C7600d[length - 1];
                    System.arraycopy(c7600dArr, 0, c7600dArr3, 0, i);
                    System.arraycopy(c7600dArr, i + 1, c7600dArr3, i, (length - i) - 1);
                    c7600dArr2 = c7600dArr3;
                }
            } while (!v7b.m23844a(this.f48240c, c7600dArr, c7600dArr2));
        }

        /* JADX INFO: renamed from: c */
        public void m13416c() {
            for (C7600d<T> c7600d : this.f48240c.get()) {
                this.f48238a.replay(c7600d);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m13417d() {
            for (C7600d<T> c7600d : this.f48240c.getAndSet(f48237f)) {
                this.f48238a.replay(c7600d);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f48240c.set(f48237f);
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f48240c.get() == f48237f;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f48239b) {
                return;
            }
            this.f48239b = true;
            this.f48238a.complete();
            m13417d();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f48239b) {
                pfe.onError(th);
                return;
            }
            this.f48239b = true;
            this.f48238a.error(th);
            m13417d();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f48239b) {
                return;
            }
            this.f48238a.next(t);
            m13416c();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                m13416c();
            }
        }
    }

    /* JADX INFO: renamed from: itb$k */
    public static final class C7607k<T> implements xub<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C7606j<T>> f48242a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7598b<T> f48243b;

        public C7607k(AtomicReference<C7606j<T>> atomicReference, InterfaceC7598b<T> interfaceC7598b) {
            this.f48242a = atomicReference;
            this.f48243b = interfaceC7598b;
        }

        @Override // p000.xub
        public void subscribe(oxb<? super T> oxbVar) {
            C7606j<T> c7606j;
            while (true) {
                c7606j = this.f48242a.get();
                if (c7606j != null) {
                    break;
                }
                C7606j<T> c7606j2 = new C7606j<>(this.f48243b.call());
                if (v7b.m23844a(this.f48242a, null, c7606j2)) {
                    c7606j = c7606j2;
                    break;
                }
            }
            C7600d<T> c7600d = new C7600d<>(c7606j, oxbVar);
            oxbVar.onSubscribe(c7600d);
            c7606j.m13414a(c7600d);
            if (c7600d.isDisposed()) {
                c7606j.m13415b(c7600d);
            } else {
                c7606j.f48238a.replay(c7600d);
            }
        }
    }

    /* JADX INFO: renamed from: itb$l */
    public static final class C7608l<T> implements InterfaceC7598b<T> {

        /* JADX INFO: renamed from: a */
        public final int f48244a;

        /* JADX INFO: renamed from: b */
        public final long f48245b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f48246c;

        /* JADX INFO: renamed from: d */
        public final voe f48247d;

        public C7608l(int i, long j, TimeUnit timeUnit, voe voeVar) {
            this.f48244a = i;
            this.f48245b = j;
            this.f48246c = timeUnit;
            this.f48247d = voeVar;
        }

        @Override // p000.itb.InterfaceC7598b
        public InterfaceC7604h<T> call() {
            return new C7609m(this.f48244a, this.f48245b, this.f48246c, this.f48247d);
        }
    }

    /* JADX INFO: renamed from: itb$m */
    public static final class C7609m<T> extends AbstractC7597a<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* JADX INFO: renamed from: c */
        public final voe f48248c;

        /* JADX INFO: renamed from: d */
        public final long f48249d;

        /* JADX INFO: renamed from: e */
        public final TimeUnit f48250e;

        /* JADX INFO: renamed from: f */
        public final int f48251f;

        public C7609m(int i, long j, TimeUnit timeUnit, voe voeVar) {
            this.f48248c = voeVar;
            this.f48251f = i;
            this.f48249d = j;
            this.f48250e = timeUnit;
        }

        @Override // p000.itb.AbstractC7597a
        /* JADX INFO: renamed from: c */
        public Object mo13402c(Object obj) {
            return new i1h(obj, this.f48248c.now(this.f48250e), this.f48250e);
        }

        @Override // p000.itb.AbstractC7597a
        /* JADX INFO: renamed from: d */
        public C7602f mo13403d() {
            C7602f c7602f;
            long jNow = this.f48248c.now(this.f48250e) - this.f48249d;
            C7602f c7602f2 = get();
            C7602f c7602f3 = c7602f2.get();
            while (true) {
                C7602f c7602f4 = c7602f3;
                c7602f = c7602f2;
                c7602f2 = c7602f4;
                if (c7602f2 == null) {
                    break;
                }
                i1h i1hVar = (i1h) c7602f2.f48232a;
                if (ehb.isComplete(i1hVar.value()) || ehb.isError(i1hVar.value()) || i1hVar.time() > jNow) {
                    break;
                }
                c7602f3 = c7602f2.get();
            }
            return c7602f;
        }

        @Override // p000.itb.AbstractC7597a
        /* JADX INFO: renamed from: g */
        public Object mo13406g(Object obj) {
            return ((i1h) obj).value();
        }

        @Override // p000.itb.AbstractC7597a
        /* JADX INFO: renamed from: l */
        public void mo13411l() {
            C7602f c7602f;
            long jNow = this.f48248c.now(this.f48250e) - this.f48249d;
            C7602f c7602f2 = get();
            C7602f c7602f3 = c7602f2.get();
            int i = 0;
            while (true) {
                C7602f c7602f4 = c7602f3;
                c7602f = c7602f2;
                c7602f2 = c7602f4;
                if (c7602f2 == null) {
                    break;
                }
                int i2 = this.f48224b;
                if (i2 > this.f48251f && i2 > 1) {
                    i++;
                    this.f48224b = i2 - 1;
                    c7602f3 = c7602f2.get();
                } else {
                    if (((i1h) c7602f2.f48232a).time() > jNow) {
                        break;
                    }
                    i++;
                    this.f48224b--;
                    c7602f3 = c7602f2.get();
                }
            }
            if (i != 0) {
                m13409j(c7602f);
            }
        }

        @Override // p000.itb.AbstractC7597a
        /* JADX INFO: renamed from: m */
        public void mo13412m() {
            C7602f c7602f;
            long jNow = this.f48248c.now(this.f48250e) - this.f48249d;
            C7602f c7602f2 = get();
            C7602f c7602f3 = c7602f2.get();
            int i = 0;
            while (true) {
                C7602f c7602f4 = c7602f3;
                c7602f = c7602f2;
                c7602f2 = c7602f4;
                if (c7602f2 == null || this.f48224b <= 1 || ((i1h) c7602f2.f48232a).time() > jNow) {
                    break;
                }
                i++;
                this.f48224b--;
                c7602f3 = c7602f2.get();
            }
            if (i != 0) {
                m13409j(c7602f);
            }
        }
    }

    /* JADX INFO: renamed from: itb$n */
    public static final class C7610n<T> extends AbstractC7597a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* JADX INFO: renamed from: c */
        public final int f48252c;

        public C7610n(int i) {
            this.f48252c = i;
        }

        @Override // p000.itb.AbstractC7597a
        /* JADX INFO: renamed from: l */
        public void mo13411l() {
            if (this.f48224b > this.f48252c) {
                m13407h();
            }
        }
    }

    /* JADX INFO: renamed from: itb$o */
    public static final class C7611o implements InterfaceC7598b<Object> {
        @Override // p000.itb.InterfaceC7598b
        public InterfaceC7604h<Object> call() {
            return new C7612p(16);
        }
    }

    /* JADX INFO: renamed from: itb$p */
    public static final class C7612p<T> extends ArrayList<Object> implements InterfaceC7604h<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: a */
        public volatile int f48253a;

        public C7612p(int i) {
            super(i);
        }

        @Override // p000.itb.InterfaceC7604h
        public void complete() {
            add(ehb.complete());
            this.f48253a++;
        }

        @Override // p000.itb.InterfaceC7604h
        public void error(Throwable th) {
            add(ehb.error(th));
            this.f48253a++;
        }

        @Override // p000.itb.InterfaceC7604h
        public void next(T t) {
            add(ehb.next(t));
            this.f48253a++;
        }

        @Override // p000.itb.InterfaceC7604h
        public void replay(C7600d<T> c7600d) {
            if (c7600d.getAndIncrement() != 0) {
                return;
            }
            oxb<? super T> oxbVar = c7600d.f48227b;
            int iAddAndGet = 1;
            while (!c7600d.isDisposed()) {
                int i = this.f48253a;
                Integer num = (Integer) c7600d.m13413a();
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i) {
                    if (ehb.accept(get(iIntValue), oxbVar) || c7600d.isDisposed()) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                c7600d.f48228c = Integer.valueOf(iIntValue);
                iAddAndGet = c7600d.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    private itb(xub<T> xubVar, xub<T> xubVar2, AtomicReference<C7606j<T>> atomicReference, InterfaceC7598b<T> interfaceC7598b) {
        this.f48222d = xubVar;
        this.f48219a = xubVar2;
        this.f48220b = atomicReference;
        this.f48221c = interfaceC7598b;
    }

    /* JADX INFO: renamed from: a */
    public static <T> pr2<T> m13399a(xub<T> xubVar, InterfaceC7598b<T> interfaceC7598b) {
        AtomicReference atomicReference = new AtomicReference();
        return pfe.onAssembly((pr2) new itb(new C7607k(atomicReference, interfaceC7598b), xubVar, atomicReference, interfaceC7598b));
    }

    public static <T> pr2<T> create(xub<T> xubVar, int i) {
        return i == Integer.MAX_VALUE ? createFrom(xubVar) : m13399a(xubVar, new C7605i(i));
    }

    public static <T> pr2<T> createFrom(xub<? extends T> xubVar) {
        return m13399a(xubVar, f48218e);
    }

    public static <U, R> Observable<R> multicastSelector(Callable<? extends pr2<U>> callable, py6<? super Observable<U>, ? extends xub<R>> py6Var) {
        return pfe.onAssembly(new C7601e(callable, py6Var));
    }

    public static <T> pr2<T> observeOn(pr2<T> pr2Var, voe voeVar) {
        return pfe.onAssembly((pr2) new C7603g(pr2Var, pr2Var.observeOn(voeVar)));
    }

    @Override // p000.pr2
    public void connect(tu2<? super mf4> tu2Var) {
        C7606j<T> c7606j;
        while (true) {
            c7606j = this.f48220b.get();
            if (c7606j != null && !c7606j.isDisposed()) {
                break;
            }
            C7606j<T> c7606j2 = new C7606j<>(this.f48221c.call());
            if (v7b.m23844a(this.f48220b, c7606j, c7606j2)) {
                c7606j = c7606j2;
                break;
            }
        }
        boolean z = !c7606j.f48241d.get() && c7606j.f48241d.compareAndSet(false, true);
        try {
            tu2Var.accept(c7606j);
            if (z) {
                this.f48219a.subscribe(c7606j);
            }
        } catch (Throwable th) {
            if (z) {
                c7606j.f48241d.compareAndSet(true, false);
            }
            n75.throwIfFatal(th);
            throw j75.wrapOrThrow(th);
        }
    }

    @Override // p000.m5e
    public void resetIf(mf4 mf4Var) {
        v7b.m23844a(this.f48220b, (C7606j) mf4Var, null);
    }

    @Override // p000.ch7
    public xub<T> source() {
        return this.f48219a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f48222d.subscribe(oxbVar);
    }

    public static <T> pr2<T> create(xub<T> xubVar, long j, TimeUnit timeUnit, voe voeVar) {
        return create(xubVar, j, timeUnit, voeVar, Integer.MAX_VALUE);
    }

    public static <T> pr2<T> create(xub<T> xubVar, long j, TimeUnit timeUnit, voe voeVar, int i) {
        return m13399a(xubVar, new C7608l(i, j, timeUnit, voeVar));
    }
}
