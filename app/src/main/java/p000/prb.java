package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class prb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final aaa<? extends T> f71731b;

    /* JADX INFO: renamed from: prb$a */
    public static final class C11079a<T> extends AtomicInteger implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: H */
        public static final int f71732H = 1;

        /* JADX INFO: renamed from: L */
        public static final int f71733L = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f71734C;

        /* JADX INFO: renamed from: F */
        public volatile int f71735F;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f71736a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<mf4> f71737b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a<T> f71738c = new a<>(this);

        /* JADX INFO: renamed from: d */
        public final cc0 f71739d = new cc0();

        /* JADX INFO: renamed from: e */
        public volatile uif<T> f71740e;

        /* JADX INFO: renamed from: f */
        public T f71741f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f71742m;

        /* JADX INFO: renamed from: prb$a$a */
        public static final class a<T> extends AtomicReference<mf4> implements l9a<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C11079a<T> f71743a;

            public a(C11079a<T> c11079a) {
                this.f71743a = c11079a;
            }

            @Override // p000.l9a
            public void onComplete() {
                this.f71743a.m19719d();
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                this.f71743a.m19720e(th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(T t) {
                this.f71743a.m19721f(t);
            }
        }

        public C11079a(oxb<? super T> oxbVar) {
            this.f71736a = oxbVar;
        }

        /* JADX INFO: renamed from: a */
        public void m19716a() {
            if (getAndIncrement() == 0) {
                m19717b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m19717b() {
            oxb<? super T> oxbVar = this.f71736a;
            int iAddAndGet = 1;
            while (!this.f71742m) {
                if (this.f71739d.get() != null) {
                    this.f71741f = null;
                    this.f71740e = null;
                    oxbVar.onError(this.f71739d.terminate());
                    return;
                }
                int i = this.f71735F;
                if (i == 1) {
                    T t = this.f71741f;
                    this.f71741f = null;
                    this.f71735F = 2;
                    oxbVar.onNext(t);
                    i = 2;
                }
                boolean z = this.f71734C;
                uif<T> uifVar = this.f71740e;
                InterfaceC0000a interfaceC0000aPoll = uifVar != null ? uifVar.poll() : null;
                boolean z2 = interfaceC0000aPoll == null;
                if (z && z2 && i == 2) {
                    this.f71740e = null;
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
            this.f71741f = null;
            this.f71740e = null;
        }

        /* JADX INFO: renamed from: c */
        public uif<T> m19718c() {
            uif<T> uifVar = this.f71740e;
            if (uifVar != null) {
                return uifVar;
            }
            rzf rzfVar = new rzf(Observable.bufferSize());
            this.f71740e = rzfVar;
            return rzfVar;
        }

        /* JADX INFO: renamed from: d */
        public void m19719d() {
            this.f71735F = 2;
            m19716a();
        }

        @Override // p000.mf4
        public void dispose() {
            this.f71742m = true;
            ag4.dispose(this.f71737b);
            ag4.dispose(this.f71738c);
            if (getAndIncrement() == 0) {
                this.f71740e = null;
                this.f71741f = null;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m19720e(Throwable th) {
            if (!this.f71739d.addThrowable(th)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this.f71737b);
                m19716a();
            }
        }

        /* JADX INFO: renamed from: f */
        public void m19721f(T t) {
            if (compareAndSet(0, 1)) {
                this.f71736a.onNext(t);
                this.f71735F = 2;
            } else {
                this.f71741f = t;
                this.f71735F = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m19717b();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f71737b.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f71734C = true;
            m19716a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f71739d.addThrowable(th)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this.f71738c);
                m19716a();
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f71736a.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                m19718c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m19717b();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f71737b, mf4Var);
        }
    }

    public prb(Observable<T> observable, aaa<? extends T> aaaVar) {
        super(observable);
        this.f71731b = aaaVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C11079a c11079a = new C11079a(oxbVar);
        oxbVar.onSubscribe(c11079a);
        this.f66354a.subscribe(c11079a);
        this.f71731b.subscribe(c11079a.f71738c);
    }
}
