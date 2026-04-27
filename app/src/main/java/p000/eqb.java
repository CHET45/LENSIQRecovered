package p000;

import io.reactivex.Observable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class eqb<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC10162o3<TLeft, R> {

    /* JADX INFO: renamed from: b */
    public final xub<? extends TRight> f33842b;

    /* JADX INFO: renamed from: c */
    public final py6<? super TLeft, ? extends xub<TLeftEnd>> f33843c;

    /* JADX INFO: renamed from: d */
    public final py6<? super TRight, ? extends xub<TRightEnd>> f33844d;

    /* JADX INFO: renamed from: e */
    public final j11<? super TLeft, ? super Observable<TRight>, ? extends R> f33845e;

    /* JADX INFO: renamed from: eqb$a */
    public static final class C5440a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements mf4, InterfaceC5441b {

        /* JADX INFO: renamed from: Q */
        public static final Integer f33846Q = 1;

        /* JADX INFO: renamed from: X */
        public static final Integer f33847X = 2;

        /* JADX INFO: renamed from: Y */
        public static final Integer f33848Y = 3;

        /* JADX INFO: renamed from: Z */
        public static final Integer f33849Z = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: C */
        public final py6<? super TRight, ? extends xub<TRightEnd>> f33850C;

        /* JADX INFO: renamed from: F */
        public final j11<? super TLeft, ? super Observable<TRight>, ? extends R> f33851F;

        /* JADX INFO: renamed from: L */
        public int f33853L;

        /* JADX INFO: renamed from: M */
        public int f33854M;

        /* JADX INFO: renamed from: N */
        public volatile boolean f33855N;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f33856a;

        /* JADX INFO: renamed from: m */
        public final py6<? super TLeft, ? extends xub<TLeftEnd>> f33862m;

        /* JADX INFO: renamed from: c */
        public final nm2 f33858c = new nm2();

        /* JADX INFO: renamed from: b */
        public final rzf<Object> f33857b = new rzf<>(Observable.bufferSize());

        /* JADX INFO: renamed from: d */
        public final Map<Integer, psh<TRight>> f33859d = new LinkedHashMap();

        /* JADX INFO: renamed from: e */
        public final Map<Integer, TRight> f33860e = new LinkedHashMap();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<Throwable> f33861f = new AtomicReference<>();

        /* JADX INFO: renamed from: H */
        public final AtomicInteger f33852H = new AtomicInteger(2);

        public C5440a(oxb<? super R> oxbVar, py6<? super TLeft, ? extends xub<TLeftEnd>> py6Var, py6<? super TRight, ? extends xub<TRightEnd>> py6Var2, j11<? super TLeft, ? super Observable<TRight>, ? extends R> j11Var) {
            this.f33856a = oxbVar;
            this.f33862m = py6Var;
            this.f33850C = py6Var2;
            this.f33851F = j11Var;
        }

        /* JADX INFO: renamed from: a */
        public void m10191a() {
            this.f33858c.dispose();
        }

        /* JADX INFO: renamed from: b */
        public void m10192b() {
            if (getAndIncrement() != 0) {
                return;
            }
            rzf<?> rzfVar = this.f33857b;
            oxb<? super R> oxbVar = this.f33856a;
            int iAddAndGet = 1;
            while (!this.f33855N) {
                if (this.f33861f.get() != null) {
                    rzfVar.clear();
                    m10191a();
                    m10193c(oxbVar);
                    return;
                }
                boolean z = this.f33852H.get() == 0;
                Integer num = (Integer) rzfVar.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    Iterator<psh<TRight>> it = this.f33859d.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.f33859d.clear();
                    this.f33860e.clear();
                    this.f33858c.dispose();
                    oxbVar.onComplete();
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = rzfVar.poll();
                    if (num == f33846Q) {
                        psh pshVarCreate = psh.create();
                        int i = this.f33853L;
                        this.f33853L = i + 1;
                        this.f33859d.put(Integer.valueOf(i), (psh<TRight>) pshVarCreate);
                        try {
                            xub xubVar = (xub) xjb.requireNonNull(this.f33862m.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            C5442c c5442c = new C5442c(this, true, i);
                            this.f33858c.add(c5442c);
                            xubVar.subscribe(c5442c);
                            if (this.f33861f.get() != null) {
                                rzfVar.clear();
                                m10191a();
                                m10193c(oxbVar);
                                return;
                            } else {
                                try {
                                    oxbVar.onNext((Object) xjb.requireNonNull(this.f33851F.apply(objPoll, pshVarCreate), "The resultSelector returned a null value"));
                                    Iterator<TRight> it2 = this.f33860e.values().iterator();
                                    while (it2.hasNext()) {
                                        pshVarCreate.onNext(it2.next());
                                    }
                                } catch (Throwable th) {
                                    m10194d(th, oxbVar, rzfVar);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            m10194d(th2, oxbVar, rzfVar);
                            return;
                        }
                    } else if (num == f33847X) {
                        int i2 = this.f33854M;
                        this.f33854M = i2 + 1;
                        this.f33860e.put(Integer.valueOf(i2), (TRight) objPoll);
                        try {
                            xub xubVar2 = (xub) xjb.requireNonNull(this.f33850C.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            C5442c c5442c2 = new C5442c(this, false, i2);
                            this.f33858c.add(c5442c2);
                            xubVar2.subscribe(c5442c2);
                            if (this.f33861f.get() != null) {
                                rzfVar.clear();
                                m10191a();
                                m10193c(oxbVar);
                                return;
                            } else {
                                Iterator<psh<TRight>> it3 = this.f33859d.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(objPoll);
                                }
                            }
                        } catch (Throwable th3) {
                            m10194d(th3, oxbVar, rzfVar);
                            return;
                        }
                    } else if (num == f33848Y) {
                        C5442c c5442c3 = (C5442c) objPoll;
                        psh<TRight> pshVarRemove = this.f33859d.remove(Integer.valueOf(c5442c3.f33865c));
                        this.f33858c.remove(c5442c3);
                        if (pshVarRemove != null) {
                            pshVarRemove.onComplete();
                        }
                    } else if (num == f33849Z) {
                        C5442c c5442c4 = (C5442c) objPoll;
                        this.f33860e.remove(Integer.valueOf(c5442c4.f33865c));
                        this.f33858c.remove(c5442c4);
                    }
                }
            }
            rzfVar.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m10193c(oxb<?> oxbVar) {
            Throwable thTerminate = j75.terminate(this.f33861f);
            Iterator<psh<TRight>> it = this.f33859d.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thTerminate);
            }
            this.f33859d.clear();
            this.f33860e.clear();
            oxbVar.onError(thTerminate);
        }

        /* JADX INFO: renamed from: d */
        public void m10194d(Throwable th, oxb<?> oxbVar, rzf<?> rzfVar) {
            n75.throwIfFatal(th);
            j75.addThrowable(this.f33861f, th);
            rzfVar.clear();
            m10191a();
            m10193c(oxbVar);
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f33855N) {
                return;
            }
            this.f33855N = true;
            m10191a();
            if (getAndIncrement() == 0) {
                this.f33857b.clear();
            }
        }

        @Override // p000.eqb.InterfaceC5441b
        public void innerClose(boolean z, C5442c c5442c) {
            synchronized (this) {
                try {
                    this.f33857b.offer(z ? f33848Y : f33849Z, c5442c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m10192b();
        }

        @Override // p000.eqb.InterfaceC5441b
        public void innerCloseError(Throwable th) {
            if (j75.addThrowable(this.f33861f, th)) {
                m10192b();
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.eqb.InterfaceC5441b
        public void innerComplete(C5443d c5443d) {
            this.f33858c.delete(c5443d);
            this.f33852H.decrementAndGet();
            m10192b();
        }

        @Override // p000.eqb.InterfaceC5441b
        public void innerError(Throwable th) {
            if (!j75.addThrowable(this.f33861f, th)) {
                pfe.onError(th);
            } else {
                this.f33852H.decrementAndGet();
                m10192b();
            }
        }

        @Override // p000.eqb.InterfaceC5441b
        public void innerValue(boolean z, Object obj) {
            synchronized (this) {
                try {
                    this.f33857b.offer(z ? f33846Q : f33847X, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m10192b();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f33855N;
        }
    }

    /* JADX INFO: renamed from: eqb$b */
    public interface InterfaceC5441b {
        void innerClose(boolean z, C5442c c5442c);

        void innerCloseError(Throwable th);

        void innerComplete(C5443d c5443d);

        void innerError(Throwable th);

        void innerValue(boolean z, Object obj);
    }

    /* JADX INFO: renamed from: eqb$c */
    public static final class C5442c extends AtomicReference<mf4> implements oxb<Object>, mf4 {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC5441b f33863a;

        /* JADX INFO: renamed from: b */
        public final boolean f33864b;

        /* JADX INFO: renamed from: c */
        public final int f33865c;

        public C5442c(InterfaceC5441b interfaceC5441b, boolean z, int i) {
            this.f33863a = interfaceC5441b;
            this.f33864b = z;
            this.f33865c = i;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f33863a.innerClose(this.f33864b, this);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f33863a.innerCloseError(th);
        }

        @Override // p000.oxb
        public void onNext(Object obj) {
            if (ag4.dispose(this)) {
                this.f33863a.innerClose(this.f33864b, this);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }

    /* JADX INFO: renamed from: eqb$d */
    public static final class C5443d extends AtomicReference<mf4> implements oxb<Object>, mf4 {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC5441b f33866a;

        /* JADX INFO: renamed from: b */
        public final boolean f33867b;

        public C5443d(InterfaceC5441b interfaceC5441b, boolean z) {
            this.f33866a = interfaceC5441b;
            this.f33867b = z;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f33866a.innerComplete(this);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f33866a.innerError(th);
        }

        @Override // p000.oxb
        public void onNext(Object obj) {
            this.f33866a.innerValue(this.f33867b, obj);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }

    public eqb(xub<TLeft> xubVar, xub<? extends TRight> xubVar2, py6<? super TLeft, ? extends xub<TLeftEnd>> py6Var, py6<? super TRight, ? extends xub<TRightEnd>> py6Var2, j11<? super TLeft, ? super Observable<TRight>, ? extends R> j11Var) {
        super(xubVar);
        this.f33842b = xubVar2;
        this.f33843c = py6Var;
        this.f33844d = py6Var2;
        this.f33845e = j11Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        C5440a c5440a = new C5440a(oxbVar, this.f33843c, this.f33844d, this.f33845e);
        oxbVar.onSubscribe(c5440a);
        C5443d c5443d = new C5443d(c5440a, true);
        c5440a.f33858c.add(c5443d);
        C5443d c5443d2 = new C5443d(c5440a, false);
        c5440a.f33858c.add(c5443d2);
        this.f66354a.subscribe(c5443d);
        this.f33842b.subscribe(c5443d2);
    }
}
