package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class cxb<T, B> extends AbstractC10162o3<T, Observable<T>> {

    /* JADX INFO: renamed from: b */
    public final Callable<? extends xub<B>> f27997b;

    /* JADX INFO: renamed from: c */
    public final int f27998c;

    /* JADX INFO: renamed from: cxb$a */
    public static final class C4554a<T, B> extends gg4<B> {

        /* JADX INFO: renamed from: b */
        public final RunnableC4555b<T, B> f27999b;

        /* JADX INFO: renamed from: c */
        public boolean f28000c;

        public C4554a(RunnableC4555b<T, B> runnableC4555b) {
            this.f27999b = runnableC4555b;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f28000c) {
                return;
            }
            this.f28000c = true;
            this.f27999b.m8771c();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f28000c) {
                pfe.onError(th);
            } else {
                this.f28000c = true;
                this.f27999b.m8772d(th);
            }
        }

        @Override // p000.oxb
        public void onNext(B b) {
            if (this.f28000c) {
                return;
            }
            this.f28000c = true;
            dispose();
            this.f27999b.m8773e(this);
        }
    }

    /* JADX INFO: renamed from: cxb$b */
    public static final class RunnableC4555b<T, B> extends AtomicInteger implements oxb<T>, mf4, Runnable {

        /* JADX INFO: renamed from: M */
        public static final C4554a<Object, Object> f28001M = new C4554a<>(null);

        /* JADX INFO: renamed from: N */
        public static final Object f28002N = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* JADX INFO: renamed from: C */
        public final Callable<? extends xub<B>> f28003C;

        /* JADX INFO: renamed from: F */
        public mf4 f28004F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f28005H;

        /* JADX INFO: renamed from: L */
        public psh<T> f28006L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super Observable<T>> f28007a;

        /* JADX INFO: renamed from: b */
        public final int f28008b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<C4554a<T, B>> f28009c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f28010d = new AtomicInteger(1);

        /* JADX INFO: renamed from: e */
        public final s1b<Object> f28011e = new s1b<>();

        /* JADX INFO: renamed from: f */
        public final cc0 f28012f = new cc0();

        /* JADX INFO: renamed from: m */
        public final AtomicBoolean f28013m = new AtomicBoolean();

        public RunnableC4555b(oxb<? super Observable<T>> oxbVar, int i, Callable<? extends xub<B>> callable) {
            this.f28007a = oxbVar;
            this.f28008b = i;
            this.f28003C = callable;
        }

        /* JADX INFO: renamed from: a */
        public void m8769a() {
            AtomicReference<C4554a<T, B>> atomicReference = this.f28009c;
            C4554a<Object, Object> c4554a = f28001M;
            C4554a<T, B> andSet = atomicReference.getAndSet((C4554a<T, B>) c4554a);
            if (andSet == null || andSet == c4554a) {
                return;
            }
            andSet.dispose();
        }

        /* JADX INFO: renamed from: b */
        public void m8770b() {
            if (getAndIncrement() != 0) {
                return;
            }
            oxb<? super Observable<T>> oxbVar = this.f28007a;
            s1b<Object> s1bVar = this.f28011e;
            cc0 cc0Var = this.f28012f;
            int iAddAndGet = 1;
            while (this.f28010d.get() != 0) {
                psh<T> pshVar = this.f28006L;
                boolean z = this.f28005H;
                if (z && cc0Var.get() != null) {
                    s1bVar.clear();
                    Throwable thTerminate = cc0Var.terminate();
                    if (pshVar != null) {
                        this.f28006L = null;
                        pshVar.onError(thTerminate);
                    }
                    oxbVar.onError(thTerminate);
                    return;
                }
                Object objPoll = s1bVar.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    Throwable thTerminate2 = cc0Var.terminate();
                    if (thTerminate2 == null) {
                        if (pshVar != null) {
                            this.f28006L = null;
                            pshVar.onComplete();
                        }
                        oxbVar.onComplete();
                        return;
                    }
                    if (pshVar != null) {
                        this.f28006L = null;
                        pshVar.onError(thTerminate2);
                    }
                    oxbVar.onError(thTerminate2);
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f28002N) {
                    pshVar.onNext((T) objPoll);
                } else {
                    if (pshVar != null) {
                        this.f28006L = null;
                        pshVar.onComplete();
                    }
                    if (!this.f28013m.get()) {
                        psh<T> pshVarCreate = psh.create(this.f28008b, this);
                        this.f28006L = pshVarCreate;
                        this.f28010d.getAndIncrement();
                        try {
                            xub xubVar = (xub) xjb.requireNonNull(this.f28003C.call(), "The other Callable returned a null ObservableSource");
                            C4554a c4554a = new C4554a(this);
                            if (v7b.m23844a(this.f28009c, null, c4554a)) {
                                xubVar.subscribe(c4554a);
                                oxbVar.onNext(pshVarCreate);
                            }
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            cc0Var.addThrowable(th);
                            this.f28005H = true;
                        }
                    }
                }
            }
            s1bVar.clear();
            this.f28006L = null;
        }

        /* JADX INFO: renamed from: c */
        public void m8771c() {
            this.f28004F.dispose();
            this.f28005H = true;
            m8770b();
        }

        /* JADX INFO: renamed from: d */
        public void m8772d(Throwable th) {
            this.f28004F.dispose();
            if (!this.f28012f.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f28005H = true;
                m8770b();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f28013m.compareAndSet(false, true)) {
                m8769a();
                if (this.f28010d.decrementAndGet() == 0) {
                    this.f28004F.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m8773e(C4554a<T, B> c4554a) {
            v7b.m23844a(this.f28009c, c4554a, null);
            this.f28011e.offer(f28002N);
            m8770b();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f28013m.get();
        }

        @Override // p000.oxb
        public void onComplete() {
            m8769a();
            this.f28005H = true;
            m8770b();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            m8769a();
            if (!this.f28012f.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f28005H = true;
                m8770b();
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f28011e.offer(t);
            m8770b();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f28004F, mf4Var)) {
                this.f28004F = mf4Var;
                this.f28007a.onSubscribe(this);
                this.f28011e.offer(f28002N);
                m8770b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f28010d.decrementAndGet() == 0) {
                this.f28004F.dispose();
            }
        }
    }

    public cxb(xub<T> xubVar, Callable<? extends xub<B>> callable, int i) {
        super(xubVar);
        this.f27997b = callable;
        this.f27998c = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Observable<T>> oxbVar) {
        this.f66354a.subscribe(new RunnableC4555b(oxbVar, this.f27998c, this.f27997b));
    }
}
