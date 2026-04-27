package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rrb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final pof<? extends T> f79125b;

    /* JADX INFO: renamed from: rrb$a */
    public static final class C12221a<T> extends AtomicInteger implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: H */
        public static final int f79126H = 1;

        /* JADX INFO: renamed from: L */
        public static final int f79127L = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f79128C;

        /* JADX INFO: renamed from: F */
        public volatile int f79129F;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f79130a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<mf4> f79131b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a<T> f79132c = new a<>(this);

        /* JADX INFO: renamed from: d */
        public final cc0 f79133d = new cc0();

        /* JADX INFO: renamed from: e */
        public volatile uif<T> f79134e;

        /* JADX INFO: renamed from: f */
        public T f79135f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f79136m;

        /* JADX INFO: renamed from: rrb$a$a */
        public static final class a<T> extends AtomicReference<mf4> implements inf<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C12221a<T> f79137a;

            public a(C12221a<T> c12221a) {
                this.f79137a = c12221a;
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                this.f79137a.m21493d(th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(T t) {
                this.f79137a.m21494e(t);
            }
        }

        public C12221a(oxb<? super T> oxbVar) {
            this.f79130a = oxbVar;
        }

        /* JADX INFO: renamed from: a */
        public void m21490a() {
            if (getAndIncrement() == 0) {
                m21491b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m21491b() {
            oxb<? super T> oxbVar = this.f79130a;
            int iAddAndGet = 1;
            while (!this.f79136m) {
                if (this.f79133d.get() != null) {
                    this.f79135f = null;
                    this.f79134e = null;
                    oxbVar.onError(this.f79133d.terminate());
                    return;
                }
                int i = this.f79129F;
                if (i == 1) {
                    T t = this.f79135f;
                    this.f79135f = null;
                    this.f79129F = 2;
                    oxbVar.onNext(t);
                    i = 2;
                }
                boolean z = this.f79128C;
                uif<T> uifVar = this.f79134e;
                InterfaceC0000a interfaceC0000aPoll = uifVar != null ? uifVar.poll() : null;
                boolean z2 = interfaceC0000aPoll == null;
                if (z && z2 && i == 2) {
                    this.f79134e = null;
                    oxbVar.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    oxbVar.onNext(interfaceC0000aPoll);
                }
            }
            this.f79135f = null;
            this.f79134e = null;
        }

        /* JADX INFO: renamed from: c */
        public uif<T> m21492c() {
            uif<T> uifVar = this.f79134e;
            if (uifVar != null) {
                return uifVar;
            }
            rzf rzfVar = new rzf(Observable.bufferSize());
            this.f79134e = rzfVar;
            return rzfVar;
        }

        /* JADX INFO: renamed from: d */
        public void m21493d(Throwable th) {
            if (!this.f79133d.addThrowable(th)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this.f79131b);
                m21490a();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f79136m = true;
            ag4.dispose(this.f79131b);
            ag4.dispose(this.f79132c);
            if (getAndIncrement() == 0) {
                this.f79134e = null;
                this.f79135f = null;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m21494e(T t) {
            if (compareAndSet(0, 1)) {
                this.f79130a.onNext(t);
                this.f79129F = 2;
            } else {
                this.f79135f = t;
                this.f79129F = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m21491b();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f79131b.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f79128C = true;
            m21490a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f79133d.addThrowable(th)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this.f79132c);
                m21490a();
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f79130a.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                m21492c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m21491b();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f79131b, mf4Var);
        }
    }

    public rrb(Observable<T> observable, pof<? extends T> pofVar) {
        super(observable);
        this.f79125b = pofVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C12221a c12221a = new C12221a(oxbVar);
        oxbVar.onSubscribe(c12221a);
        this.f66354a.subscribe(c12221a);
        this.f79125b.subscribe(c12221a.f79132c);
    }
}
