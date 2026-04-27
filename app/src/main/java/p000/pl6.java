package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class pl6<T, B, V> extends AbstractC8162k1<T, m86<T>> {

    /* JADX INFO: renamed from: c */
    public final zjd<B> f71310c;

    /* JADX INFO: renamed from: d */
    public final py6<? super B, ? extends zjd<V>> f71311d;

    /* JADX INFO: renamed from: e */
    public final int f71312e;

    /* JADX INFO: renamed from: pl6$a */
    public static final class C11013a<T, V> extends mg4<V> {

        /* JADX INFO: renamed from: b */
        public final C11015c<T, ?, V> f71313b;

        /* JADX INFO: renamed from: c */
        public final msh<T> f71314c;

        /* JADX INFO: renamed from: d */
        public boolean f71315d;

        public C11013a(C11015c<T, ?, V> c11015c, msh<T> mshVar) {
            this.f71313b = c11015c;
            this.f71314c = mshVar;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f71315d) {
                return;
            }
            this.f71315d = true;
            this.f71313b.m19603c(this);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f71315d) {
                pfe.onError(th);
            } else {
                this.f71315d = true;
                this.f71313b.m19605e(th);
            }
        }

        @Override // p000.ycg
        public void onNext(V v) {
            m17290a();
            onComplete();
        }
    }

    /* JADX INFO: renamed from: pl6$b */
    public static final class C11014b<T, B> extends mg4<B> {

        /* JADX INFO: renamed from: b */
        public final C11015c<T, B, ?> f71316b;

        public C11014b(C11015c<T, B, ?> c11015c) {
            this.f71316b = c11015c;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f71316b.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f71316b.m19605e(th);
        }

        @Override // p000.ycg
        public void onNext(B b) {
            this.f71316b.m19606f(b);
        }
    }

    /* JADX INFO: renamed from: pl6$c */
    public static final class C11015c<T, B, V> extends cnd<T, Object, m86<T>> implements fdg {

        /* JADX INFO: renamed from: G2 */
        public final zjd<B> f71317G2;

        /* JADX INFO: renamed from: H2 */
        public final py6<? super B, ? extends zjd<V>> f71318H2;

        /* JADX INFO: renamed from: I2 */
        public final int f71319I2;

        /* JADX INFO: renamed from: J2 */
        public final nm2 f71320J2;

        /* JADX INFO: renamed from: K2 */
        public fdg f71321K2;

        /* JADX INFO: renamed from: L2 */
        public final AtomicReference<mf4> f71322L2;

        /* JADX INFO: renamed from: M2 */
        public final List<msh<T>> f71323M2;

        /* JADX INFO: renamed from: N2 */
        public final AtomicLong f71324N2;

        /* JADX INFO: renamed from: O2 */
        public final AtomicBoolean f71325O2;

        public C11015c(ycg<? super m86<T>> ycgVar, zjd<B> zjdVar, py6<? super B, ? extends zjd<V>> py6Var, int i) {
            super(ycgVar, new s1b());
            this.f71322L2 = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f71324N2 = atomicLong;
            this.f71325O2 = new AtomicBoolean();
            this.f71317G2 = zjdVar;
            this.f71318H2 = py6Var;
            this.f71319I2 = i;
            this.f71320J2 = new nm2();
            this.f71323M2 = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // p000.cnd, p000.wmd
        public boolean accept(ycg<? super m86<T>> ycgVar, Object obj) {
            return false;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: c */
        public void m19603c(C11013a<T, V> c11013a) {
            this.f71320J2.delete(c11013a);
            this.f17084C2.offer((U) new C11016d(c11013a.f71314c, null));
            if (enter()) {
                m19604d();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f71325O2.compareAndSet(false, true)) {
                ag4.dispose(this.f71322L2);
                if (this.f71324N2.decrementAndGet() == 0) {
                    this.f71321K2.cancel();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public void m19604d() {
            ajf ajfVar = this.f17084C2;
            ycg<? super V> ycgVar = this.f17083B2;
            List<msh<T>> list = this.f71323M2;
            int iLeave = 1;
            while (true) {
                boolean z = this.f17086E2;
                Object objPoll = ajfVar.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    dispose();
                    Throwable th = this.f17087F2;
                    if (th != null) {
                        Iterator<msh<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<msh<T>> it2 = list.iterator();
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
                } else if (objPoll instanceof C11016d) {
                    C11016d c11016d = (C11016d) objPoll;
                    msh<T> mshVar = c11016d.f71326a;
                    if (mshVar != null) {
                        if (list.remove(mshVar)) {
                            c11016d.f71326a.onComplete();
                            if (this.f71324N2.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f71325O2.get()) {
                        msh<T> mshVarCreate = msh.create(this.f71319I2);
                        long jRequested = requested();
                        if (jRequested != 0) {
                            list.add(mshVarCreate);
                            ycgVar.onNext(mshVarCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            try {
                                zjd zjdVar = (zjd) xjb.requireNonNull(this.f71318H2.apply(c11016d.f71327b), "The publisher supplied is null");
                                C11013a c11013a = new C11013a(this, mshVarCreate);
                                if (this.f71320J2.add(c11013a)) {
                                    this.f71324N2.getAndIncrement();
                                    zjdVar.subscribe(c11013a);
                                }
                            } catch (Throwable th2) {
                                cancel();
                                ycgVar.onError(th2);
                            }
                        } else {
                            cancel();
                            ycgVar.onError(new cwa("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<msh<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(ehb.getValue(objPoll));
                    }
                }
            }
        }

        public void dispose() {
            this.f71320J2.dispose();
            ag4.dispose(this.f71322L2);
        }

        /* JADX INFO: renamed from: e */
        public void m19605e(Throwable th) {
            this.f71321K2.cancel();
            this.f71320J2.dispose();
            ag4.dispose(this.f71322L2);
            this.f17083B2.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: f */
        public void m19606f(B b) {
            this.f17084C2.offer((U) new C11016d(null, b));
            if (enter()) {
                m19604d();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f17086E2) {
                return;
            }
            this.f17086E2 = true;
            if (enter()) {
                m19604d();
            }
            if (this.f71324N2.decrementAndGet() == 0) {
                this.f71320J2.dispose();
            }
            this.f17083B2.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f17086E2) {
                pfe.onError(th);
                return;
            }
            this.f17087F2 = th;
            this.f17086E2 = true;
            if (enter()) {
                m19604d();
            }
            if (this.f71324N2.decrementAndGet() == 0) {
                this.f71320J2.dispose();
            }
            this.f17083B2.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f17086E2) {
                return;
            }
            if (fastEnter()) {
                Iterator<msh<T>> it = this.f71323M2.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.f17084C2.offer((U) ehb.next(t));
                if (!enter()) {
                    return;
                }
            }
            m19604d();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f71321K2, fdgVar)) {
                this.f71321K2 = fdgVar;
                this.f17083B2.onSubscribe(this);
                if (this.f71325O2.get()) {
                    return;
                }
                C11014b c11014b = new C11014b(this);
                if (v7b.m23844a(this.f71322L2, null, c11014b)) {
                    fdgVar.request(Long.MAX_VALUE);
                    this.f71317G2.subscribe(c11014b);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            requested(j);
        }
    }

    /* JADX INFO: renamed from: pl6$d */
    public static final class C11016d<T, B> {

        /* JADX INFO: renamed from: a */
        public final msh<T> f71326a;

        /* JADX INFO: renamed from: b */
        public final B f71327b;

        public C11016d(msh<T> mshVar, B b) {
            this.f71326a = mshVar;
            this.f71327b = b;
        }
    }

    public pl6(m86<T> m86Var, zjd<B> zjdVar, py6<? super B, ? extends zjd<V>> py6Var, int i) {
        super(m86Var);
        this.f71310c = zjdVar;
        this.f71311d = py6Var;
        this.f71312e = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super m86<T>> ycgVar) {
        this.f52360b.subscribe((lj6) new C11015c(new t1f(ycgVar), this.f71310c, this.f71311d, this.f71312e));
    }
}
