package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class th6<T> extends mr2<T> implements dh7<T> {

    /* JADX INFO: renamed from: f */
    public static final nfg f84678f = new C13026b();

    /* JADX INFO: renamed from: b */
    public final l86<T> f84679b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C13033i<T>> f84680c;

    /* JADX INFO: renamed from: d */
    public final nfg<? extends InterfaceC13030f<T>> f84681d;

    /* JADX INFO: renamed from: e */
    public final zjd<T> f84682e;

    /* JADX INFO: renamed from: th6$a */
    public static abstract class AbstractC13025a<T> extends AtomicReference<C13029e> implements InterfaceC13030f<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* JADX INFO: renamed from: a */
        public final boolean f84683a;

        /* JADX INFO: renamed from: b */
        public C13029e f84684b;

        /* JADX INFO: renamed from: c */
        public int f84685c;

        /* JADX INFO: renamed from: d */
        public long f84686d;

        public AbstractC13025a(boolean eagerTruncate) {
            this.f84683a = eagerTruncate;
            C13029e c13029e = new C13029e(null, 0L);
            this.f84684b = c13029e;
            set(c13029e);
        }

        /* JADX INFO: renamed from: a */
        public final void m22504a(C13029e n) {
            this.f84684b.set(n);
            this.f84684b = n;
            this.f84685c++;
        }

        /* JADX INFO: renamed from: b */
        public final void m22505b(Collection<? super T> collection) {
            C13029e c13029eMo22507d = mo22507d();
            while (true) {
                c13029eMo22507d = c13029eMo22507d.get();
                if (c13029eMo22507d == null) {
                    return;
                }
                Object objMo22510g = mo22510g(c13029eMo22507d.f84698a);
                if (fhb.isComplete(objMo22510g) || fhb.isError(objMo22510g)) {
                    return;
                } else {
                    collection.add((Object) fhb.getValue(objMo22510g));
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public Object mo22506c(Object value, boolean terminal) {
            return value;
        }

        @Override // p000.th6.InterfaceC13030f
        public final void complete() {
            Object objMo22506c = mo22506c(fhb.complete(), true);
            long j = this.f84686d + 1;
            this.f84686d = j;
            m22504a(new C13029e(objMo22506c, j));
            mo22516m();
        }

        /* JADX INFO: renamed from: d */
        public C13029e mo22507d() {
            return get();
        }

        /* JADX INFO: renamed from: e */
        public boolean m22508e() {
            Object obj = this.f84684b.f84698a;
            return obj != null && fhb.isComplete(mo22510g(obj));
        }

        @Override // p000.th6.InterfaceC13030f
        public final void error(Throwable e) {
            Object objMo22506c = mo22506c(fhb.error(e), true);
            long j = this.f84686d + 1;
            this.f84686d = j;
            m22504a(new C13029e(objMo22506c, j));
            mo22516m();
        }

        /* JADX INFO: renamed from: f */
        public boolean m22509f() {
            Object obj = this.f84684b.f84698a;
            return obj != null && fhb.isError(mo22510g(obj));
        }

        /* JADX INFO: renamed from: g */
        public Object mo22510g(Object value) {
            return value;
        }

        /* JADX INFO: renamed from: h */
        public final void m22511h() {
            C13029e c13029e = get().get();
            if (c13029e == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.f84685c--;
            m22513j(c13029e);
        }

        /* JADX INFO: renamed from: i */
        public final void m22512i(int n) {
            C13029e c13029e = get();
            while (n > 0) {
                c13029e = c13029e.get();
                n--;
                this.f84685c--;
            }
            m22513j(c13029e);
            C13029e c13029e2 = get();
            if (c13029e2.get() == null) {
                this.f84684b = c13029e2;
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m22513j(C13029e n) {
            if (this.f84683a) {
                C13029e c13029e = new C13029e(null, n.f84699b);
                c13029e.lazySet(n.get());
                n = c13029e;
            }
            set(n);
        }

        /* JADX INFO: renamed from: k */
        public final void m22514k() {
            C13029e c13029e = get();
            if (c13029e.f84698a != null) {
                C13029e c13029e2 = new C13029e(null, 0L);
                c13029e2.lazySet(c13029e.get());
                set(c13029e2);
            }
        }

        /* JADX INFO: renamed from: l */
        public abstract void mo22515l();

        /* JADX INFO: renamed from: m */
        public void mo22516m() {
            m22514k();
        }

        @Override // p000.th6.InterfaceC13030f
        public final void next(T value) {
            Object objMo22506c = mo22506c(fhb.next(value), false);
            long j = this.f84686d + 1;
            this.f84686d = j;
            m22504a(new C13029e(objMo22506c, j));
            mo22515l();
        }

        @Override // p000.th6.InterfaceC13030f
        public final void replay(C13027c<T> output) {
            synchronized (output) {
                try {
                    if (output.f84692e) {
                        output.f84693f = true;
                        return;
                    }
                    output.f84692e = true;
                    while (true) {
                        long j = output.get();
                        boolean z = j == Long.MAX_VALUE;
                        C13029e c13029eMo22507d = (C13029e) output.m22517a();
                        if (c13029eMo22507d == null) {
                            c13029eMo22507d = mo22507d();
                            output.f84690c = c13029eMo22507d;
                            ro0.add(output.f84691d, c13029eMo22507d.f84699b);
                        }
                        long j2 = 0;
                        while (j != 0) {
                            if (!output.isDisposed()) {
                                C13029e c13029e = c13029eMo22507d.get();
                                if (c13029e == null) {
                                    break;
                                }
                                Object objMo22510g = mo22510g(c13029e.f84698a);
                                try {
                                    if (fhb.accept(objMo22510g, output.f84689b)) {
                                        output.f84690c = null;
                                        return;
                                    } else {
                                        j2++;
                                        j--;
                                        c13029eMo22507d = c13029e;
                                    }
                                } catch (Throwable th) {
                                    o75.throwIfFatal(th);
                                    output.f84690c = null;
                                    output.dispose();
                                    if (fhb.isError(objMo22510g) || fhb.isComplete(objMo22510g)) {
                                        ofe.onError(th);
                                        return;
                                    } else {
                                        output.f84689b.onError(th);
                                        return;
                                    }
                                }
                            } else {
                                output.f84690c = null;
                                return;
                            }
                        }
                        if (j == 0 && output.isDisposed()) {
                            output.f84690c = null;
                            return;
                        }
                        if (j2 != 0) {
                            output.f84690c = c13029eMo22507d;
                            if (!z) {
                                output.produced(j2);
                            }
                        }
                        synchronized (output) {
                            try {
                                if (!output.f84693f) {
                                    output.f84692e = false;
                                    return;
                                }
                                output.f84693f = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: th6$b */
    public static final class C13026b implements nfg<Object> {
        @Override // p000.nfg
        public Object get() {
            return new C13037m(16);
        }
    }

    /* JADX INFO: renamed from: th6$c */
    public static final class C13027c<T> extends AtomicLong implements fdg, lf4 {

        /* JADX INFO: renamed from: m */
        public static final long f84687m = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;

        /* JADX INFO: renamed from: a */
        public final C13033i<T> f84688a;

        /* JADX INFO: renamed from: b */
        public final ycg<? super T> f84689b;

        /* JADX INFO: renamed from: c */
        public Object f84690c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f84691d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public boolean f84692e;

        /* JADX INFO: renamed from: f */
        public boolean f84693f;

        public C13027c(C13033i<T> parent, ycg<? super T> child) {
            this.f84688a = parent;
            this.f84689b = child;
        }

        /* JADX INFO: renamed from: a */
        public <U> U m22517a() {
            return (U) this.f84690c;
        }

        @Override // p000.fdg
        public void cancel() {
            dispose();
        }

        @Override // p000.lf4
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f84688a.m22520c(this);
                this.f84688a.m22519b();
                this.f84690c = null;
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        public long produced(long n) {
            return ro0.producedCancel(this, n);
        }

        @Override // p000.fdg
        public void request(long n) {
            if (!ldg.validate(n) || ro0.addCancel(this, n) == Long.MIN_VALUE) {
                return;
            }
            ro0.add(this.f84691d, n);
            this.f84688a.m22519b();
            this.f84688a.f84706a.replay(this);
        }
    }

    /* JADX INFO: renamed from: th6$d */
    public static final class C13028d<R, U> extends l86<R> {

        /* JADX INFO: renamed from: b */
        public final nfg<? extends mr2<U>> f84694b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super l86<U>, ? extends zjd<R>> f84695c;

        /* JADX INFO: renamed from: th6$d$a */
        public final class a implements uu2<lf4> {

            /* JADX INFO: renamed from: a */
            public final ddg<R> f84696a;

            public a(ddg<R> srw) {
                this.f84696a = srw;
            }

            @Override // p000.uu2
            public void accept(lf4 r) {
                this.f84696a.setResource(r);
            }
        }

        public C13028d(nfg<? extends mr2<U>> connectableFactory, sy6<? super l86<U>, ? extends zjd<R>> selector) {
            this.f84694b = connectableFactory;
            this.f84695c = selector;
        }

        @Override // p000.l86
        public void subscribeActual(ycg<? super R> child) {
            try {
                mr2 mr2Var = (mr2) k75.nullCheck(this.f84694b.get(), "The connectableFactory returned a null ConnectableFlowable.");
                try {
                    zjd zjdVar = (zjd) k75.nullCheck(this.f84695c.apply(mr2Var), "The selector returned a null Publisher.");
                    ddg ddgVar = new ddg(child);
                    zjdVar.subscribe(ddgVar);
                    mr2Var.connect(new a(ddgVar));
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    w05.error(th, child);
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                w05.error(th2, child);
            }
        }
    }

    /* JADX INFO: renamed from: th6$e */
    public static final class C13029e extends AtomicReference<C13029e> {
        private static final long serialVersionUID = 245354315435971818L;

        /* JADX INFO: renamed from: a */
        public final Object f84698a;

        /* JADX INFO: renamed from: b */
        public final long f84699b;

        public C13029e(Object value, long index) {
            this.f84698a = value;
            this.f84699b = index;
        }
    }

    /* JADX INFO: renamed from: th6$f */
    public interface InterfaceC13030f<T> {
        void complete();

        void error(Throwable e);

        void next(T value);

        void replay(C13027c<T> output);
    }

    /* JADX INFO: renamed from: th6$g */
    public static final class C13031g<T> implements nfg<InterfaceC13030f<T>> {

        /* JADX INFO: renamed from: a */
        public final int f84700a;

        /* JADX INFO: renamed from: b */
        public final boolean f84701b;

        public C13031g(int bufferSize, boolean eagerTruncate) {
            this.f84700a = bufferSize;
            this.f84701b = eagerTruncate;
        }

        @Override // p000.nfg
        public InterfaceC13030f<T> get() {
            return new C13036l(this.f84700a, this.f84701b);
        }
    }

    /* JADX INFO: renamed from: th6$h */
    public static final class C13032h<T> implements zjd<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C13033i<T>> f84702a;

        /* JADX INFO: renamed from: b */
        public final nfg<? extends InterfaceC13030f<T>> f84703b;

        public C13032h(AtomicReference<C13033i<T>> curr, nfg<? extends InterfaceC13030f<T>> bufferFactory) {
            this.f84702a = curr;
            this.f84703b = bufferFactory;
        }

        @Override // p000.zjd
        public void subscribe(ycg<? super T> child) {
            C13033i<T> c13033i;
            while (true) {
                c13033i = this.f84702a.get();
                if (c13033i != null) {
                    break;
                }
                try {
                    C13033i<T> c13033i2 = new C13033i<>(this.f84703b.get(), this.f84702a);
                    if (v7b.m23844a(this.f84702a, null, c13033i2)) {
                        c13033i = c13033i2;
                        break;
                    }
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    w05.error(th, child);
                    return;
                }
            }
            C13027c<T> c13027c = new C13027c<>(c13033i, child);
            child.onSubscribe(c13027c);
            c13033i.m22518a(c13027c);
            if (c13027c.isDisposed()) {
                c13033i.m22520c(c13027c);
            } else {
                c13033i.m22519b();
                c13033i.f84706a.replay(c13027c);
            }
        }
    }

    /* JADX INFO: renamed from: th6$i */
    public static final class C13033i<T> extends AtomicReference<fdg> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: C */
        public static final C13027c[] f84704C = new C13027c[0];

        /* JADX INFO: renamed from: F */
        public static final C13027c[] f84705F = new C13027c[0];
        private static final long serialVersionUID = 7224554242710036740L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC13030f<T> f84706a;

        /* JADX INFO: renamed from: b */
        public boolean f84707b;

        /* JADX INFO: renamed from: f */
        public long f84711f;

        /* JADX INFO: renamed from: m */
        public final AtomicReference<C13033i<T>> f84712m;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f84710e = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<C13027c<T>[]> f84708c = new AtomicReference<>(f84704C);

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f84709d = new AtomicBoolean();

        public C13033i(InterfaceC13030f<T> buffer, AtomicReference<C13033i<T>> current) {
            this.f84706a = buffer;
            this.f84712m = current;
        }

        /* JADX INFO: renamed from: a */
        public boolean m22518a(C13027c<T> producer) {
            C13027c<T>[] c13027cArr;
            C13027c[] c13027cArr2;
            do {
                c13027cArr = this.f84708c.get();
                if (c13027cArr == f84705F) {
                    return false;
                }
                int length = c13027cArr.length;
                c13027cArr2 = new C13027c[length + 1];
                System.arraycopy(c13027cArr, 0, c13027cArr2, 0, length);
                c13027cArr2[length] = producer;
            } while (!v7b.m23844a(this.f84708c, c13027cArr, c13027cArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m22519b() {
            AtomicInteger atomicInteger = this.f84710e;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                fdg fdgVar = get();
                if (fdgVar != null) {
                    long j = this.f84711f;
                    long jMax = j;
                    for (C13027c<T> c13027c : this.f84708c.get()) {
                        jMax = Math.max(jMax, c13027c.f84691d.get());
                    }
                    long j2 = jMax - j;
                    if (j2 != 0) {
                        this.f84711f = jMax;
                        fdgVar.request(j2);
                    }
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m22520c(C13027c<T> p) {
            C13027c<T>[] c13027cArr;
            C13027c[] c13027cArr2;
            do {
                c13027cArr = this.f84708c.get();
                int length = c13027cArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c13027cArr[i].equals(p)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c13027cArr2 = f84704C;
                } else {
                    C13027c[] c13027cArr3 = new C13027c[length - 1];
                    System.arraycopy(c13027cArr, 0, c13027cArr3, 0, i);
                    System.arraycopy(c13027cArr, i + 1, c13027cArr3, i, (length - i) - 1);
                    c13027cArr2 = c13027cArr3;
                }
            } while (!v7b.m23844a(this.f84708c, c13027cArr, c13027cArr2));
        }

        @Override // p000.lf4
        public void dispose() {
            this.f84708c.set(f84705F);
            v7b.m23844a(this.f84712m, this, null);
            ldg.cancel(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f84708c.get() == f84705F;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f84707b) {
                return;
            }
            this.f84707b = true;
            this.f84706a.complete();
            for (C13027c<T> c13027c : this.f84708c.getAndSet(f84705F)) {
                this.f84706a.replay(c13027c);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            if (this.f84707b) {
                ofe.onError(e);
                return;
            }
            this.f84707b = true;
            this.f84706a.error(e);
            for (C13027c<T> c13027c : this.f84708c.getAndSet(f84705F)) {
                this.f84706a.replay(c13027c);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f84707b) {
                return;
            }
            this.f84706a.next(t);
            for (C13027c<T> c13027c : this.f84708c.get()) {
                this.f84706a.replay(c13027c);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg p) {
            if (ldg.setOnce(this, p)) {
                m22519b();
                for (C13027c<T> c13027c : this.f84708c.get()) {
                    this.f84706a.replay(c13027c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: th6$j */
    public static final class C13034j<T> implements nfg<InterfaceC13030f<T>> {

        /* JADX INFO: renamed from: a */
        public final int f84713a;

        /* JADX INFO: renamed from: b */
        public final long f84714b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f84715c;

        /* JADX INFO: renamed from: d */
        public final woe f84716d;

        /* JADX INFO: renamed from: e */
        public final boolean f84717e;

        public C13034j(int bufferSize, long maxAge, TimeUnit unit, woe scheduler, boolean eagerTruncate) {
            this.f84713a = bufferSize;
            this.f84714b = maxAge;
            this.f84715c = unit;
            this.f84716d = scheduler;
            this.f84717e = eagerTruncate;
        }

        @Override // p000.nfg
        public InterfaceC13030f<T> get() {
            return new C13035k(this.f84713a, this.f84714b, this.f84715c, this.f84716d, this.f84717e);
        }
    }

    /* JADX INFO: renamed from: th6$k */
    public static final class C13035k<T> extends AbstractC13025a<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* JADX INFO: renamed from: C */
        public final int f84718C;

        /* JADX INFO: renamed from: e */
        public final woe f84719e;

        /* JADX INFO: renamed from: f */
        public final long f84720f;

        /* JADX INFO: renamed from: m */
        public final TimeUnit f84721m;

        public C13035k(int limit, long maxAge, TimeUnit unit, woe scheduler, boolean eagerTruncate) {
            super(eagerTruncate);
            this.f84719e = scheduler;
            this.f84718C = limit;
            this.f84720f = maxAge;
            this.f84721m = unit;
        }

        @Override // p000.th6.AbstractC13025a
        /* JADX INFO: renamed from: c */
        public Object mo22506c(Object value, boolean terminal) {
            return new j1h(value, terminal ? Long.MAX_VALUE : this.f84719e.now(this.f84721m), this.f84721m);
        }

        @Override // p000.th6.AbstractC13025a
        /* JADX INFO: renamed from: d */
        public C13029e mo22507d() {
            C13029e c13029e;
            long jNow = this.f84719e.now(this.f84721m) - this.f84720f;
            C13029e c13029e2 = get();
            C13029e c13029e3 = c13029e2.get();
            while (true) {
                C13029e c13029e4 = c13029e3;
                c13029e = c13029e2;
                c13029e2 = c13029e4;
                if (c13029e2 == null) {
                    break;
                }
                j1h j1hVar = (j1h) c13029e2.f84698a;
                if (fhb.isComplete(j1hVar.value()) || fhb.isError(j1hVar.value()) || j1hVar.time() > jNow) {
                    break;
                }
                c13029e3 = c13029e2.get();
            }
            return c13029e;
        }

        @Override // p000.th6.AbstractC13025a
        /* JADX INFO: renamed from: g */
        public Object mo22510g(Object value) {
            return ((j1h) value).value();
        }

        @Override // p000.th6.AbstractC13025a
        /* JADX INFO: renamed from: l */
        public void mo22515l() {
            C13029e c13029e;
            long jNow = this.f84719e.now(this.f84721m) - this.f84720f;
            C13029e c13029e2 = get();
            C13029e c13029e3 = c13029e2.get();
            int i = 0;
            while (true) {
                C13029e c13029e4 = c13029e3;
                c13029e = c13029e2;
                c13029e2 = c13029e4;
                int i2 = this.f84685c;
                if (i2 > 1) {
                    if (i2 <= this.f84718C) {
                        if (((j1h) c13029e2.f84698a).time() > jNow) {
                            break;
                        }
                        i++;
                        this.f84685c--;
                        c13029e3 = c13029e2.get();
                    } else {
                        i++;
                        this.f84685c = i2 - 1;
                        c13029e3 = c13029e2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                m22513j(c13029e);
            }
        }

        @Override // p000.th6.AbstractC13025a
        /* JADX INFO: renamed from: m */
        public void mo22516m() {
            C13029e c13029e;
            long jNow = this.f84719e.now(this.f84721m) - this.f84720f;
            C13029e c13029e2 = get();
            C13029e c13029e3 = c13029e2.get();
            int i = 0;
            while (true) {
                C13029e c13029e4 = c13029e3;
                c13029e = c13029e2;
                c13029e2 = c13029e4;
                if (this.f84685c <= 1 || ((j1h) c13029e2.f84698a).time() > jNow) {
                    break;
                }
                i++;
                this.f84685c--;
                c13029e3 = c13029e2.get();
            }
            if (i != 0) {
                m22513j(c13029e);
            }
        }
    }

    /* JADX INFO: renamed from: th6$l */
    public static final class C13036l<T> extends AbstractC13025a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* JADX INFO: renamed from: e */
        public final int f84722e;

        public C13036l(int limit, boolean eagerTruncate) {
            super(eagerTruncate);
            this.f84722e = limit;
        }

        @Override // p000.th6.AbstractC13025a
        /* JADX INFO: renamed from: l */
        public void mo22515l() {
            if (this.f84685c > this.f84722e) {
                m22511h();
            }
        }
    }

    /* JADX INFO: renamed from: th6$m */
    public static final class C13037m<T> extends ArrayList<Object> implements InterfaceC13030f<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: a */
        public volatile int f84723a;

        public C13037m(int capacityHint) {
            super(capacityHint);
        }

        @Override // p000.th6.InterfaceC13030f
        public void complete() {
            add(fhb.complete());
            this.f84723a++;
        }

        @Override // p000.th6.InterfaceC13030f
        public void error(Throwable e) {
            add(fhb.error(e));
            this.f84723a++;
        }

        @Override // p000.th6.InterfaceC13030f
        public void next(T value) {
            add(fhb.next(value));
            this.f84723a++;
        }

        @Override // p000.th6.InterfaceC13030f
        public void replay(C13027c<T> output) {
            synchronized (output) {
                try {
                    if (output.f84692e) {
                        output.f84693f = true;
                        return;
                    }
                    output.f84692e = true;
                    ycg<? super T> ycgVar = output.f84689b;
                    while (!output.isDisposed()) {
                        int i = this.f84723a;
                        Integer num = (Integer) output.m22517a();
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j = output.get();
                        long j2 = j;
                        long j3 = 0;
                        while (j2 != 0 && iIntValue < i) {
                            Object obj = get(iIntValue);
                            try {
                                if (fhb.accept(obj, ycgVar) || output.isDisposed()) {
                                    return;
                                }
                                iIntValue++;
                                j2--;
                                j3++;
                            } catch (Throwable th) {
                                o75.throwIfFatal(th);
                                output.dispose();
                                if (fhb.isError(obj) || fhb.isComplete(obj)) {
                                    ofe.onError(th);
                                    return;
                                } else {
                                    ycgVar.onError(th);
                                    return;
                                }
                            }
                        }
                        if (j3 != 0) {
                            output.f84690c = Integer.valueOf(iIntValue);
                            if (j != Long.MAX_VALUE) {
                                output.produced(j3);
                            }
                        }
                        synchronized (output) {
                            try {
                                if (!output.f84693f) {
                                    output.f84692e = false;
                                    return;
                                }
                                output.f84693f = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    private th6(zjd<T> onSubscribe, l86<T> source, final AtomicReference<C13033i<T>> current, final nfg<? extends InterfaceC13030f<T>> bufferFactory) {
        this.f84682e = onSubscribe;
        this.f84679b = source;
        this.f84680c = current;
        this.f84681d = bufferFactory;
    }

    /* JADX INFO: renamed from: b */
    public static <T> mr2<T> m22503b(l86<T> source, final nfg<? extends InterfaceC13030f<T>> bufferFactory) {
        AtomicReference atomicReference = new AtomicReference();
        return ofe.onAssembly((mr2) new th6(new C13032h(atomicReference, bufferFactory), source, atomicReference, bufferFactory));
    }

    public static <T> mr2<T> create(l86<T> source, final int bufferSize, boolean eagerTruncate) {
        return bufferSize == Integer.MAX_VALUE ? createFrom(source) : m22503b(source, new C13031g(bufferSize, eagerTruncate));
    }

    public static <T> mr2<T> createFrom(l86<? extends T> source) {
        return m22503b(source, f84678f);
    }

    public static <U, R> l86<R> multicastSelector(final nfg<? extends mr2<U>> connectableFactory, final sy6<? super l86<U>, ? extends zjd<R>> selector) {
        return new C13028d(connectableFactory, selector);
    }

    @Override // p000.mr2
    public void connect(uu2<? super lf4> connection) {
        C13033i<T> c13033i;
        while (true) {
            c13033i = this.f84680c.get();
            if (c13033i != null && !c13033i.isDisposed()) {
                break;
            }
            try {
                C13033i<T> c13033i2 = new C13033i<>(this.f84681d.get(), this.f84680c);
                if (v7b.m23844a(this.f84680c, c13033i, c13033i2)) {
                    c13033i = c13033i2;
                    break;
                }
            } finally {
                o75.throwIfFatal(th);
                RuntimeException runtimeExceptionWrapOrThrow = k75.wrapOrThrow(th);
            }
        }
        boolean z = !c13033i.f84709d.get() && c13033i.f84709d.compareAndSet(false, true);
        try {
            connection.accept(c13033i);
            if (z) {
                this.f84679b.subscribe((kj6) c13033i);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (z) {
                c13033i.f84709d.compareAndSet(true, false);
            }
            throw k75.wrapOrThrow(th);
        }
    }

    @Override // p000.mr2
    public void reset() {
        C13033i<T> c13033i = this.f84680c.get();
        if (c13033i == null || !c13033i.isDisposed()) {
            return;
        }
        v7b.m23844a(this.f84680c, c13033i, null);
    }

    @Override // p000.dh7
    public zjd<T> source() {
        return this.f84679b;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f84682e.subscribe(s);
    }

    public static <T> mr2<T> create(l86<T> source, long maxAge, TimeUnit unit, woe scheduler, boolean eagerTruncate) {
        return create(source, maxAge, unit, scheduler, Integer.MAX_VALUE, eagerTruncate);
    }

    public static <T> mr2<T> create(l86<T> source, final long maxAge, final TimeUnit unit, final woe scheduler, final int bufferSize, boolean eagerTruncate) {
        return m22503b(source, new C13034j(bufferSize, maxAge, unit, scheduler, eagerTruncate));
    }
}
