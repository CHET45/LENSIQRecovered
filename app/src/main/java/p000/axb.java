package p000;

import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class axb<T, B, V> extends AbstractC10162o3<T, Observable<T>> {

    /* JADX INFO: renamed from: b */
    public final xub<B> f12138b;

    /* JADX INFO: renamed from: c */
    public final py6<? super B, ? extends xub<V>> f12139c;

    /* JADX INFO: renamed from: d */
    public final int f12140d;

    /* JADX INFO: renamed from: axb$a */
    public static final class C1646a<T, V> extends gg4<V> {

        /* JADX INFO: renamed from: b */
        public final C1648c<T, ?, V> f12141b;

        /* JADX INFO: renamed from: c */
        public final psh<T> f12142c;

        /* JADX INFO: renamed from: d */
        public boolean f12143d;

        public C1646a(C1648c<T, ?, V> c1648c, psh<T> pshVar) {
            this.f12141b = c1648c;
            this.f12142c = pshVar;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f12143d) {
                return;
            }
            this.f12143d = true;
            this.f12141b.m2734c(this);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f12143d) {
                pfe.onError(th);
            } else {
                this.f12143d = true;
                this.f12141b.m2737f(th);
            }
        }

        @Override // p000.oxb
        public void onNext(V v) {
            dispose();
            onComplete();
        }
    }

    /* JADX INFO: renamed from: axb$b */
    public static final class C1647b<T, B> extends gg4<B> {

        /* JADX INFO: renamed from: b */
        public final C1648c<T, B, ?> f12144b;

        public C1647b(C1648c<T, B, ?> c1648c) {
            this.f12144b = c1648c;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f12144b.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f12144b.m2737f(th);
        }

        @Override // p000.oxb
        public void onNext(B b) {
            this.f12144b.m2738g(b);
        }
    }

    /* JADX INFO: renamed from: axb$c */
    public static final class C1648c<T, B, V> extends and<T, Object, Observable<T>> implements mf4 {

        /* JADX INFO: renamed from: q2 */
        public final xub<B> f12145q2;

        /* JADX INFO: renamed from: r2 */
        public final py6<? super B, ? extends xub<V>> f12146r2;

        /* JADX INFO: renamed from: s2 */
        public final int f12147s2;

        /* JADX INFO: renamed from: t2 */
        public final nm2 f12148t2;

        /* JADX INFO: renamed from: u2 */
        public mf4 f12149u2;

        /* JADX INFO: renamed from: v2 */
        public final AtomicReference<mf4> f12150v2;

        /* JADX INFO: renamed from: w2 */
        public final List<psh<T>> f12151w2;

        /* JADX INFO: renamed from: x2 */
        public final AtomicLong f12152x2;

        /* JADX INFO: renamed from: y2 */
        public final AtomicBoolean f12153y2;

        public C1648c(oxb<? super Observable<T>> oxbVar, xub<B> xubVar, py6<? super B, ? extends xub<V>> py6Var, int i) {
            super(oxbVar, new s1b());
            this.f12150v2 = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f12152x2 = atomicLong;
            this.f12153y2 = new AtomicBoolean();
            this.f12145q2 = xubVar;
            this.f12146r2 = py6Var;
            this.f12147s2 = i;
            this.f12148t2 = new nm2();
            this.f12151w2 = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // p000.and, p000.osb
        public void accept(oxb<? super Observable<T>> oxbVar, Object obj) {
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: c */
        public void m2734c(C1646a<T, V> c1646a) {
            this.f12148t2.delete(c1646a);
            this.f2166m2.offer((U) new C1649d(c1646a.f12142c, null));
            if (enter()) {
                m2736e();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m2735d() {
            this.f12148t2.dispose();
            ag4.dispose(this.f12150v2);
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f12153y2.compareAndSet(false, true)) {
                ag4.dispose(this.f12150v2);
                if (this.f12152x2.decrementAndGet() == 0) {
                    this.f12149u2.dispose();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public void m2736e() {
            s1b s1bVar = (s1b) this.f2166m2;
            oxb<? super V> oxbVar = this.f2165l2;
            List<psh<T>> list = this.f12151w2;
            int iLeave = 1;
            while (true) {
                boolean z = this.f2168o2;
                Object objPoll = s1bVar.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    m2735d();
                    Throwable th = this.f2169p2;
                    if (th != null) {
                        Iterator<psh<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<psh<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll instanceof C1649d) {
                    C1649d c1649d = (C1649d) objPoll;
                    psh<T> pshVar = c1649d.f12154a;
                    if (pshVar != null) {
                        if (list.remove(pshVar)) {
                            c1649d.f12154a.onComplete();
                            if (this.f12152x2.decrementAndGet() == 0) {
                                m2735d();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f12153y2.get()) {
                        psh<T> pshVarCreate = psh.create(this.f12147s2);
                        list.add(pshVarCreate);
                        oxbVar.onNext(pshVarCreate);
                        try {
                            xub xubVar = (xub) xjb.requireNonNull(this.f12146r2.apply(c1649d.f12155b), "The ObservableSource supplied is null");
                            C1646a c1646a = new C1646a(this, pshVarCreate);
                            if (this.f12148t2.add(c1646a)) {
                                this.f12152x2.getAndIncrement();
                                xubVar.subscribe(c1646a);
                            }
                        } catch (Throwable th2) {
                            n75.throwIfFatal(th2);
                            this.f12153y2.set(true);
                            oxbVar.onError(th2);
                        }
                    }
                } else {
                    Iterator<psh<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(ehb.getValue(objPoll));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m2737f(Throwable th) {
            this.f12149u2.dispose();
            this.f12148t2.dispose();
            onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: g */
        public void m2738g(B b) {
            this.f2166m2.offer((U) new C1649d(null, b));
            if (enter()) {
                m2736e();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f12153y2.get();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f2168o2) {
                return;
            }
            this.f2168o2 = true;
            if (enter()) {
                m2736e();
            }
            if (this.f12152x2.decrementAndGet() == 0) {
                this.f12148t2.dispose();
            }
            this.f2165l2.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f2168o2) {
                pfe.onError(th);
                return;
            }
            this.f2169p2 = th;
            this.f2168o2 = true;
            if (enter()) {
                m2736e();
            }
            if (this.f12152x2.decrementAndGet() == 0) {
                this.f12148t2.dispose();
            }
            this.f2165l2.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onNext(T t) {
            if (fastEnter()) {
                Iterator<psh<T>> it = this.f12151w2.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.f2166m2.offer((U) ehb.next(t));
                if (!enter()) {
                    return;
                }
            }
            m2736e();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f12149u2, mf4Var)) {
                this.f12149u2 = mf4Var;
                this.f2165l2.onSubscribe(this);
                if (this.f12153y2.get()) {
                    return;
                }
                C1647b c1647b = new C1647b(this);
                if (v7b.m23844a(this.f12150v2, null, c1647b)) {
                    this.f12145q2.subscribe(c1647b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: axb$d */
    public static final class C1649d<T, B> {

        /* JADX INFO: renamed from: a */
        public final psh<T> f12154a;

        /* JADX INFO: renamed from: b */
        public final B f12155b;

        public C1649d(psh<T> pshVar, B b) {
            this.f12154a = pshVar;
            this.f12155b = b;
        }
    }

    public axb(xub<T> xubVar, xub<B> xubVar2, py6<? super B, ? extends xub<V>> py6Var, int i) {
        super(xubVar);
        this.f12138b = xubVar2;
        this.f12139c = py6Var;
        this.f12140d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Observable<T>> oxbVar) {
        this.f66354a.subscribe(new C1648c(new n1f(oxbVar), this.f12138b, this.f12139c, this.f12140d));
    }
}
