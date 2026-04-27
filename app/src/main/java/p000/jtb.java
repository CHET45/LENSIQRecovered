package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jtb<T> extends or2<T> implements bh7<T> {

    /* JADX INFO: renamed from: e */
    public static final InterfaceC8068b f51773e = new C8080n();

    /* JADX INFO: renamed from: a */
    public final wub<T> f51774a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C8075i<T>> f51775b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8068b<T> f51776c;

    /* JADX INFO: renamed from: d */
    public final wub<T> f51777d;

    /* JADX INFO: renamed from: jtb$a */
    public static abstract class AbstractC8067a<T> extends AtomicReference<C8072f> implements InterfaceC8073g<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* JADX INFO: renamed from: a */
        public C8072f f51778a;

        /* JADX INFO: renamed from: b */
        public int f51779b;

        /* JADX INFO: renamed from: c */
        public final boolean f51780c;

        public AbstractC8067a(boolean eagerTruncate) {
            this.f51780c = eagerTruncate;
            C8072f c8072f = new C8072f(null);
            this.f51778a = c8072f;
            set(c8072f);
        }

        /* JADX INFO: renamed from: a */
        public final void m14285a(C8072f n) {
            this.f51778a.set(n);
            this.f51778a = n;
            this.f51779b++;
        }

        /* JADX INFO: renamed from: b */
        public final void m14286b(Collection<? super T> collection) {
            C8072f c8072fMo14288d = mo14288d();
            while (true) {
                c8072fMo14288d = c8072fMo14288d.get();
                if (c8072fMo14288d == null) {
                    return;
                }
                Object objMo14291g = mo14291g(c8072fMo14288d.f51788a);
                if (fhb.isComplete(objMo14291g) || fhb.isError(objMo14291g)) {
                    return;
                } else {
                    collection.add((Object) fhb.getValue(objMo14291g));
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public Object mo14287c(Object value) {
            return value;
        }

        @Override // p000.jtb.InterfaceC8073g
        public final void complete() {
            m14285a(new C8072f(mo14287c(fhb.complete())));
            mo14297m();
        }

        /* JADX INFO: renamed from: d */
        public C8072f mo14288d() {
            return get();
        }

        /* JADX INFO: renamed from: e */
        public boolean m14289e() {
            Object obj = this.f51778a.f51788a;
            return obj != null && fhb.isComplete(mo14291g(obj));
        }

        @Override // p000.jtb.InterfaceC8073g
        public final void error(Throwable e) {
            m14285a(new C8072f(mo14287c(fhb.error(e))));
            mo14297m();
        }

        /* JADX INFO: renamed from: f */
        public boolean m14290f() {
            Object obj = this.f51778a.f51788a;
            return obj != null && fhb.isError(mo14291g(obj));
        }

        /* JADX INFO: renamed from: g */
        public Object mo14291g(Object value) {
            return value;
        }

        /* JADX INFO: renamed from: h */
        public final void m14292h() {
            this.f51779b--;
            m14294j(get().get());
        }

        /* JADX INFO: renamed from: i */
        public final void m14293i(int n) {
            C8072f c8072f = get();
            while (n > 0) {
                c8072f = c8072f.get();
                n--;
                this.f51779b--;
            }
            m14294j(c8072f);
            C8072f c8072f2 = get();
            if (c8072f2.get() == null) {
                this.f51778a = c8072f2;
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m14294j(C8072f n) {
            if (this.f51780c) {
                C8072f c8072f = new C8072f(null);
                c8072f.lazySet(n.get());
                n = c8072f;
            }
            set(n);
        }

        /* JADX INFO: renamed from: k */
        public final void m14295k() {
            C8072f c8072f = get();
            if (c8072f.f51788a != null) {
                C8072f c8072f2 = new C8072f(null);
                c8072f2.lazySet(c8072f.get());
                set(c8072f2);
            }
        }

        /* JADX INFO: renamed from: l */
        public abstract void mo14296l();

        /* JADX INFO: renamed from: m */
        public void mo14297m() {
            m14295k();
        }

        @Override // p000.jtb.InterfaceC8073g
        public final void next(T value) {
            m14285a(new C8072f(mo14287c(fhb.next(value))));
            mo14296l();
        }

        @Override // p000.jtb.InterfaceC8073g
        public final void replay(C8070d<T> output) {
            if (output.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                C8072f c8072fMo14288d = (C8072f) output.m14298a();
                if (c8072fMo14288d == null) {
                    c8072fMo14288d = mo14288d();
                    output.f51784c = c8072fMo14288d;
                }
                while (!output.isDisposed()) {
                    C8072f c8072f = c8072fMo14288d.get();
                    if (c8072f == null) {
                        output.f51784c = c8072fMo14288d;
                        iAddAndGet = output.addAndGet(-iAddAndGet);
                    } else {
                        if (fhb.accept(mo14291g(c8072f.f51788a), output.f51783b)) {
                            output.f51784c = null;
                            return;
                        }
                        c8072fMo14288d = c8072f;
                    }
                }
                output.f51784c = null;
                return;
            } while (iAddAndGet != 0);
        }
    }

    /* JADX INFO: renamed from: jtb$b */
    public interface InterfaceC8068b<T> {
        InterfaceC8073g<T> call();
    }

    /* JADX INFO: renamed from: jtb$c */
    public static final class C8069c<R> implements uu2<lf4> {

        /* JADX INFO: renamed from: a */
        public final vxb<R> f51781a;

        public C8069c(vxb<R> srw) {
            this.f51781a = srw;
        }

        @Override // p000.uu2
        public void accept(lf4 r) {
            this.f51781a.setResource(r);
        }
    }

    /* JADX INFO: renamed from: jtb$d */
    public static final class C8070d<T> extends AtomicInteger implements lf4 {
        private static final long serialVersionUID = 2728361546769921047L;

        /* JADX INFO: renamed from: a */
        public final C8075i<T> f51782a;

        /* JADX INFO: renamed from: b */
        public final pxb<? super T> f51783b;

        /* JADX INFO: renamed from: c */
        public Object f51784c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f51785d;

        public C8070d(C8075i<T> parent, pxb<? super T> child) {
            this.f51782a = parent;
            this.f51783b = child;
        }

        /* JADX INFO: renamed from: a */
        public <U> U m14298a() {
            return (U) this.f51784c;
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f51785d) {
                return;
            }
            this.f51785d = true;
            this.f51782a.m14300b(this);
            this.f51784c = null;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f51785d;
        }
    }

    /* JADX INFO: renamed from: jtb$e */
    public static final class C8071e<R, U> extends vkb<R> {

        /* JADX INFO: renamed from: a */
        public final nfg<? extends or2<U>> f51786a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super vkb<U>, ? extends wub<R>> f51787b;

        public C8071e(nfg<? extends or2<U>> connectableFactory, sy6<? super vkb<U>, ? extends wub<R>> selector) {
            this.f51786a = connectableFactory;
            this.f51787b = selector;
        }

        @Override // p000.vkb
        public void subscribeActual(pxb<? super R> pxbVar) {
            try {
                or2<U> or2Var = this.f51786a.get();
                Objects.requireNonNull(or2Var, "The connectableFactory returned a null ConnectableObservable");
                or2<U> or2Var2 = or2Var;
                wub<R> wubVarApply = this.f51787b.apply(or2Var2);
                Objects.requireNonNull(wubVarApply, "The selector returned a null ObservableSource");
                wub<R> wubVar = wubVarApply;
                vxb vxbVar = new vxb(pxbVar);
                wubVar.subscribe(vxbVar);
                or2Var2.connect(new C8069c(vxbVar));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                b05.error(th, pxbVar);
            }
        }
    }

    /* JADX INFO: renamed from: jtb$f */
    public static final class C8072f extends AtomicReference<C8072f> {
        private static final long serialVersionUID = 245354315435971818L;

        /* JADX INFO: renamed from: a */
        public final Object f51788a;

        public C8072f(Object value) {
            this.f51788a = value;
        }
    }

    /* JADX INFO: renamed from: jtb$g */
    public interface InterfaceC8073g<T> {
        void complete();

        void error(Throwable e);

        void next(T value);

        void replay(C8070d<T> output);
    }

    /* JADX INFO: renamed from: jtb$h */
    public static final class C8074h<T> implements InterfaceC8068b<T> {

        /* JADX INFO: renamed from: a */
        public final int f51789a;

        /* JADX INFO: renamed from: b */
        public final boolean f51790b;

        public C8074h(int bufferSize, boolean eagerTruncate) {
            this.f51789a = bufferSize;
            this.f51790b = eagerTruncate;
        }

        @Override // p000.jtb.InterfaceC8068b
        public InterfaceC8073g<T> call() {
            return new C8079m(this.f51789a, this.f51790b);
        }
    }

    /* JADX INFO: renamed from: jtb$i */
    public static final class C8075i<T> extends AtomicReference<lf4> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: f */
        public static final C8070d[] f51791f = new C8070d[0];

        /* JADX INFO: renamed from: m */
        public static final C8070d[] f51792m = new C8070d[0];
        private static final long serialVersionUID = -533785617179540163L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC8073g<T> f51793a;

        /* JADX INFO: renamed from: b */
        public boolean f51794b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<C8070d[]> f51795c = new AtomicReference<>(f51791f);

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f51796d = new AtomicBoolean();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<C8075i<T>> f51797e;

        public C8075i(InterfaceC8073g<T> buffer, AtomicReference<C8075i<T>> current) {
            this.f51793a = buffer;
            this.f51797e = current;
        }

        /* JADX INFO: renamed from: a */
        public boolean m14299a(C8070d<T> producer) {
            C8070d[] c8070dArr;
            C8070d[] c8070dArr2;
            do {
                c8070dArr = this.f51795c.get();
                if (c8070dArr == f51792m) {
                    return false;
                }
                int length = c8070dArr.length;
                c8070dArr2 = new C8070d[length + 1];
                System.arraycopy(c8070dArr, 0, c8070dArr2, 0, length);
                c8070dArr2[length] = producer;
            } while (!v7b.m23844a(this.f51795c, c8070dArr, c8070dArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m14300b(C8070d<T> producer) {
            C8070d[] c8070dArr;
            C8070d[] c8070dArr2;
            do {
                c8070dArr = this.f51795c.get();
                int length = c8070dArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c8070dArr[i].equals(producer)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c8070dArr2 = f51791f;
                } else {
                    C8070d[] c8070dArr3 = new C8070d[length - 1];
                    System.arraycopy(c8070dArr, 0, c8070dArr3, 0, i);
                    System.arraycopy(c8070dArr, i + 1, c8070dArr3, i, (length - i) - 1);
                    c8070dArr2 = c8070dArr3;
                }
            } while (!v7b.m23844a(this.f51795c, c8070dArr, c8070dArr2));
        }

        /* JADX INFO: renamed from: c */
        public void m14301c() {
            for (C8070d<T> c8070d : this.f51795c.get()) {
                this.f51793a.replay(c8070d);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m14302d() {
            for (C8070d<T> c8070d : this.f51795c.getAndSet(f51792m)) {
                this.f51793a.replay(c8070d);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f51795c.set(f51792m);
            v7b.m23844a(this.f51797e, this, null);
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f51795c.get() == f51792m;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f51794b) {
                return;
            }
            this.f51794b = true;
            this.f51793a.complete();
            m14302d();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            if (this.f51794b) {
                ofe.onError(e);
                return;
            }
            this.f51794b = true;
            this.f51793a.error(e);
            m14302d();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f51794b) {
                return;
            }
            this.f51793a.next(t);
            m14301c();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 p) {
            if (zf4.setOnce(this, p)) {
                m14301c();
            }
        }
    }

    /* JADX INFO: renamed from: jtb$j */
    public static final class C8076j<T> implements wub<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C8075i<T>> f51798a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC8068b<T> f51799b;

        public C8076j(AtomicReference<C8075i<T>> curr, InterfaceC8068b<T> bufferFactory) {
            this.f51798a = curr;
            this.f51799b = bufferFactory;
        }

        @Override // p000.wub
        public void subscribe(pxb<? super T> child) {
            C8075i<T> c8075i;
            while (true) {
                c8075i = this.f51798a.get();
                if (c8075i != null) {
                    break;
                }
                C8075i<T> c8075i2 = new C8075i<>(this.f51799b.call(), this.f51798a);
                if (v7b.m23844a(this.f51798a, null, c8075i2)) {
                    c8075i = c8075i2;
                    break;
                }
            }
            C8070d<T> c8070d = new C8070d<>(c8075i, child);
            child.onSubscribe(c8070d);
            c8075i.m14299a(c8070d);
            if (c8070d.isDisposed()) {
                c8075i.m14300b(c8070d);
            } else {
                c8075i.f51793a.replay(c8070d);
            }
        }
    }

    /* JADX INFO: renamed from: jtb$k */
    public static final class C8077k<T> implements InterfaceC8068b<T> {

        /* JADX INFO: renamed from: a */
        public final int f51800a;

        /* JADX INFO: renamed from: b */
        public final long f51801b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f51802c;

        /* JADX INFO: renamed from: d */
        public final woe f51803d;

        /* JADX INFO: renamed from: e */
        public final boolean f51804e;

        public C8077k(int bufferSize, long maxAge, TimeUnit unit, woe scheduler, boolean eagerTruncate) {
            this.f51800a = bufferSize;
            this.f51801b = maxAge;
            this.f51802c = unit;
            this.f51803d = scheduler;
            this.f51804e = eagerTruncate;
        }

        @Override // p000.jtb.InterfaceC8068b
        public InterfaceC8073g<T> call() {
            return new C8078l(this.f51800a, this.f51801b, this.f51802c, this.f51803d, this.f51804e);
        }
    }

    /* JADX INFO: renamed from: jtb$l */
    public static final class C8078l<T> extends AbstractC8067a<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* JADX INFO: renamed from: d */
        public final woe f51805d;

        /* JADX INFO: renamed from: e */
        public final long f51806e;

        /* JADX INFO: renamed from: f */
        public final TimeUnit f51807f;

        /* JADX INFO: renamed from: m */
        public final int f51808m;

        public C8078l(int limit, long maxAge, TimeUnit unit, woe scheduler, boolean eagerTruncate) {
            super(eagerTruncate);
            this.f51805d = scheduler;
            this.f51808m = limit;
            this.f51806e = maxAge;
            this.f51807f = unit;
        }

        @Override // p000.jtb.AbstractC8067a
        /* JADX INFO: renamed from: c */
        public Object mo14287c(Object value) {
            return new j1h(value, this.f51805d.now(this.f51807f), this.f51807f);
        }

        @Override // p000.jtb.AbstractC8067a
        /* JADX INFO: renamed from: d */
        public C8072f mo14288d() {
            C8072f c8072f;
            long jNow = this.f51805d.now(this.f51807f) - this.f51806e;
            C8072f c8072f2 = get();
            C8072f c8072f3 = c8072f2.get();
            while (true) {
                C8072f c8072f4 = c8072f3;
                c8072f = c8072f2;
                c8072f2 = c8072f4;
                if (c8072f2 == null) {
                    break;
                }
                j1h j1hVar = (j1h) c8072f2.f51788a;
                if (fhb.isComplete(j1hVar.value()) || fhb.isError(j1hVar.value()) || j1hVar.time() > jNow) {
                    break;
                }
                c8072f3 = c8072f2.get();
            }
            return c8072f;
        }

        @Override // p000.jtb.AbstractC8067a
        /* JADX INFO: renamed from: g */
        public Object mo14291g(Object value) {
            return ((j1h) value).value();
        }

        @Override // p000.jtb.AbstractC8067a
        /* JADX INFO: renamed from: l */
        public void mo14296l() {
            C8072f c8072f;
            long jNow = this.f51805d.now(this.f51807f) - this.f51806e;
            C8072f c8072f2 = get();
            C8072f c8072f3 = c8072f2.get();
            int i = 0;
            while (true) {
                C8072f c8072f4 = c8072f3;
                c8072f = c8072f2;
                c8072f2 = c8072f4;
                int i2 = this.f51779b;
                if (i2 > 1) {
                    if (i2 <= this.f51808m) {
                        if (((j1h) c8072f2.f51788a).time() > jNow) {
                            break;
                        }
                        i++;
                        this.f51779b--;
                        c8072f3 = c8072f2.get();
                    } else {
                        i++;
                        this.f51779b = i2 - 1;
                        c8072f3 = c8072f2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                m14294j(c8072f);
            }
        }

        @Override // p000.jtb.AbstractC8067a
        /* JADX INFO: renamed from: m */
        public void mo14297m() {
            C8072f c8072f;
            long jNow = this.f51805d.now(this.f51807f) - this.f51806e;
            C8072f c8072f2 = get();
            C8072f c8072f3 = c8072f2.get();
            int i = 0;
            while (true) {
                C8072f c8072f4 = c8072f3;
                c8072f = c8072f2;
                c8072f2 = c8072f4;
                if (this.f51779b <= 1 || ((j1h) c8072f2.f51788a).time() > jNow) {
                    break;
                }
                i++;
                this.f51779b--;
                c8072f3 = c8072f2.get();
            }
            if (i != 0) {
                m14294j(c8072f);
            }
        }
    }

    /* JADX INFO: renamed from: jtb$m */
    public static final class C8079m<T> extends AbstractC8067a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* JADX INFO: renamed from: d */
        public final int f51809d;

        public C8079m(int limit, boolean eagerTruncate) {
            super(eagerTruncate);
            this.f51809d = limit;
        }

        @Override // p000.jtb.AbstractC8067a
        /* JADX INFO: renamed from: l */
        public void mo14296l() {
            if (this.f51779b > this.f51809d) {
                m14292h();
            }
        }
    }

    /* JADX INFO: renamed from: jtb$n */
    public static final class C8080n implements InterfaceC8068b<Object> {
        @Override // p000.jtb.InterfaceC8068b
        public InterfaceC8073g<Object> call() {
            return new C8081o(16);
        }
    }

    /* JADX INFO: renamed from: jtb$o */
    public static final class C8081o<T> extends ArrayList<Object> implements InterfaceC8073g<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: a */
        public volatile int f51810a;

        public C8081o(int capacityHint) {
            super(capacityHint);
        }

        @Override // p000.jtb.InterfaceC8073g
        public void complete() {
            add(fhb.complete());
            this.f51810a++;
        }

        @Override // p000.jtb.InterfaceC8073g
        public void error(Throwable e) {
            add(fhb.error(e));
            this.f51810a++;
        }

        @Override // p000.jtb.InterfaceC8073g
        public void next(T value) {
            add(fhb.next(value));
            this.f51810a++;
        }

        @Override // p000.jtb.InterfaceC8073g
        public void replay(C8070d<T> output) {
            if (output.getAndIncrement() != 0) {
                return;
            }
            pxb<? super T> pxbVar = output.f51783b;
            int iAddAndGet = 1;
            while (!output.isDisposed()) {
                int i = this.f51810a;
                Integer num = (Integer) output.m14298a();
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i) {
                    if (fhb.accept(get(iIntValue), pxbVar) || output.isDisposed()) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                output.f51784c = Integer.valueOf(iIntValue);
                iAddAndGet = output.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    private jtb(wub<T> onSubscribe, wub<T> source, final AtomicReference<C8075i<T>> current, final InterfaceC8068b<T> bufferFactory) {
        this.f51777d = onSubscribe;
        this.f51774a = source;
        this.f51775b = current;
        this.f51776c = bufferFactory;
    }

    /* JADX INFO: renamed from: a */
    public static <T> or2<T> m14284a(wub<T> source, final InterfaceC8068b<T> bufferFactory) {
        AtomicReference atomicReference = new AtomicReference();
        return ofe.onAssembly((or2) new jtb(new C8076j(atomicReference, bufferFactory), source, atomicReference, bufferFactory));
    }

    public static <T> or2<T> create(wub<T> source, final int bufferSize, boolean eagerTruncate) {
        return bufferSize == Integer.MAX_VALUE ? createFrom(source) : m14284a(source, new C8074h(bufferSize, eagerTruncate));
    }

    public static <T> or2<T> createFrom(wub<? extends T> source) {
        return m14284a(source, f51773e);
    }

    public static <U, R> vkb<R> multicastSelector(final nfg<? extends or2<U>> connectableFactory, final sy6<? super vkb<U>, ? extends wub<R>> selector) {
        return ofe.onAssembly(new C8071e(connectableFactory, selector));
    }

    @Override // p000.or2
    public void connect(uu2<? super lf4> connection) {
        C8075i<T> c8075i;
        while (true) {
            c8075i = this.f51775b.get();
            if (c8075i != null && !c8075i.isDisposed()) {
                break;
            }
            C8075i<T> c8075i2 = new C8075i<>(this.f51776c.call(), this.f51775b);
            if (v7b.m23844a(this.f51775b, c8075i, c8075i2)) {
                c8075i = c8075i2;
                break;
            }
        }
        boolean z = !c8075i.f51796d.get() && c8075i.f51796d.compareAndSet(false, true);
        try {
            connection.accept(c8075i);
            if (z) {
                this.f51774a.subscribe(c8075i);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (z) {
                c8075i.f51796d.compareAndSet(true, false);
            }
            o75.throwIfFatal(th);
            throw k75.wrapOrThrow(th);
        }
    }

    @Override // p000.or2
    public void reset() {
        C8075i<T> c8075i = this.f51775b.get();
        if (c8075i == null || !c8075i.isDisposed()) {
            return;
        }
        v7b.m23844a(this.f51775b, c8075i, null);
    }

    @Override // p000.bh7
    public wub<T> source() {
        return this.f51774a;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f51777d.subscribe(observer);
    }

    public static <T> or2<T> create(wub<T> source, long maxAge, TimeUnit unit, woe scheduler, boolean eagerTruncate) {
        return create(source, maxAge, unit, scheduler, Integer.MAX_VALUE, eagerTruncate);
    }

    public static <T> or2<T> create(wub<T> source, final long maxAge, final TimeUnit unit, final woe scheduler, final int bufferSize, boolean eagerTruncate) {
        return m14284a(source, new C8077k(bufferSize, maxAge, unit, scheduler, eagerTruncate));
    }
}
