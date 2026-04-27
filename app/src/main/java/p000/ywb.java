package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ywb<T, B> extends AbstractC10162o3<T, Observable<T>> {

    /* JADX INFO: renamed from: b */
    public final xub<B> f103190b;

    /* JADX INFO: renamed from: c */
    public final int f103191c;

    /* JADX INFO: renamed from: ywb$a */
    public static final class C15856a<T, B> extends gg4<B> {

        /* JADX INFO: renamed from: b */
        public final RunnableC15857b<T, B> f103192b;

        /* JADX INFO: renamed from: c */
        public boolean f103193c;

        public C15856a(RunnableC15857b<T, B> runnableC15857b) {
            this.f103192b = runnableC15857b;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f103193c) {
                return;
            }
            this.f103193c = true;
            this.f103192b.m26378b();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f103193c) {
                pfe.onError(th);
            } else {
                this.f103193c = true;
                this.f103192b.m26379c(th);
            }
        }

        @Override // p000.oxb
        public void onNext(B b) {
            if (this.f103193c) {
                return;
            }
            this.f103192b.m26380d();
        }
    }

    /* JADX INFO: renamed from: ywb$b */
    public static final class RunnableC15857b<T, B> extends AtomicInteger implements oxb<T>, mf4, Runnable {

        /* JADX INFO: renamed from: L */
        public static final Object f103194L = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* JADX INFO: renamed from: F */
        public volatile boolean f103196F;

        /* JADX INFO: renamed from: H */
        public psh<T> f103197H;

        /* JADX INFO: renamed from: a */
        public final oxb<? super Observable<T>> f103198a;

        /* JADX INFO: renamed from: b */
        public final int f103199b;

        /* JADX INFO: renamed from: c */
        public final C15856a<T, B> f103200c = new C15856a<>(this);

        /* JADX INFO: renamed from: d */
        public final AtomicReference<mf4> f103201d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f103202e = new AtomicInteger(1);

        /* JADX INFO: renamed from: f */
        public final s1b<Object> f103203f = new s1b<>();

        /* JADX INFO: renamed from: m */
        public final cc0 f103204m = new cc0();

        /* JADX INFO: renamed from: C */
        public final AtomicBoolean f103195C = new AtomicBoolean();

        public RunnableC15857b(oxb<? super Observable<T>> oxbVar, int i) {
            this.f103198a = oxbVar;
            this.f103199b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m26377a() {
            if (getAndIncrement() != 0) {
                return;
            }
            oxb<? super Observable<T>> oxbVar = this.f103198a;
            s1b<Object> s1bVar = this.f103203f;
            cc0 cc0Var = this.f103204m;
            int iAddAndGet = 1;
            while (this.f103202e.get() != 0) {
                psh<T> pshVar = this.f103197H;
                boolean z = this.f103196F;
                if (z && cc0Var.get() != null) {
                    s1bVar.clear();
                    Throwable thTerminate = cc0Var.terminate();
                    if (pshVar != null) {
                        this.f103197H = null;
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
                            this.f103197H = null;
                            pshVar.onComplete();
                        }
                        oxbVar.onComplete();
                        return;
                    }
                    if (pshVar != null) {
                        this.f103197H = null;
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
                } else if (objPoll != f103194L) {
                    pshVar.onNext((T) objPoll);
                } else {
                    if (pshVar != null) {
                        this.f103197H = null;
                        pshVar.onComplete();
                    }
                    if (!this.f103195C.get()) {
                        psh<T> pshVarCreate = psh.create(this.f103199b, this);
                        this.f103197H = pshVarCreate;
                        this.f103202e.getAndIncrement();
                        oxbVar.onNext(pshVarCreate);
                    }
                }
            }
            s1bVar.clear();
            this.f103197H = null;
        }

        /* JADX INFO: renamed from: b */
        public void m26378b() {
            ag4.dispose(this.f103201d);
            this.f103196F = true;
            m26377a();
        }

        /* JADX INFO: renamed from: c */
        public void m26379c(Throwable th) {
            ag4.dispose(this.f103201d);
            if (!this.f103204m.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f103196F = true;
                m26377a();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m26380d() {
            this.f103203f.offer(f103194L);
            m26377a();
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f103195C.compareAndSet(false, true)) {
                this.f103200c.dispose();
                if (this.f103202e.decrementAndGet() == 0) {
                    ag4.dispose(this.f103201d);
                }
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f103195C.get();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f103200c.dispose();
            this.f103196F = true;
            m26377a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f103200c.dispose();
            if (!this.f103204m.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f103196F = true;
                m26377a();
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f103203f.offer(t);
            m26377a();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this.f103201d, mf4Var)) {
                m26380d();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f103202e.decrementAndGet() == 0) {
                ag4.dispose(this.f103201d);
            }
        }
    }

    public ywb(xub<T> xubVar, xub<B> xubVar2, int i) {
        super(xubVar);
        this.f103190b = xubVar2;
        this.f103191c = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Observable<T>> oxbVar) {
        RunnableC15857b runnableC15857b = new RunnableC15857b(oxbVar, this.f103191c);
        oxbVar.onSubscribe(runnableC15857b);
        this.f103190b.subscribe(runnableC15857b.f103200c);
        this.f66354a.subscribe(runnableC15857b);
    }
}
