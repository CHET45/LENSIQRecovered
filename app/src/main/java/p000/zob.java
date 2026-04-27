package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zob<T> extends yd2 implements z07<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f105604a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends qh2> f105605b;

    /* JADX INFO: renamed from: c */
    public final boolean f105606c;

    /* JADX INFO: renamed from: zob$a */
    public static final class C16201a<T> extends AtomicInteger implements mf4, oxb<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: a */
        public final dh2 f105607a;

        /* JADX INFO: renamed from: c */
        public final py6<? super T, ? extends qh2> f105609c;

        /* JADX INFO: renamed from: d */
        public final boolean f105610d;

        /* JADX INFO: renamed from: f */
        public mf4 f105612f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f105613m;

        /* JADX INFO: renamed from: b */
        public final cc0 f105608b = new cc0();

        /* JADX INFO: renamed from: e */
        public final nm2 f105611e = new nm2();

        /* JADX INFO: renamed from: zob$a$a */
        public final class a extends AtomicReference<mf4> implements dh2, mf4 {
            private static final long serialVersionUID = 8606673141535671828L;

            public a() {
            }

            @Override // p000.mf4
            public void dispose() {
                ag4.dispose(this);
            }

            @Override // p000.mf4
            public boolean isDisposed() {
                return ag4.isDisposed(get());
            }

            @Override // p000.dh2
            public void onComplete() {
                C16201a.this.m26924a(this);
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                C16201a.this.m26925b(this, th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C16201a(dh2 dh2Var, py6<? super T, ? extends qh2> py6Var, boolean z) {
            this.f105607a = dh2Var;
            this.f105609c = py6Var;
            this.f105610d = z;
            lazySet(1);
        }

        /* JADX INFO: renamed from: a */
        public void m26924a(C16201a<T>.a aVar) {
            this.f105611e.delete(aVar);
            onComplete();
        }

        /* JADX INFO: renamed from: b */
        public void m26925b(C16201a<T>.a aVar, Throwable th) {
            this.f105611e.delete(aVar);
            onError(th);
        }

        @Override // p000.mf4
        public void dispose() {
            this.f105613m = true;
            this.f105612f.dispose();
            this.f105611e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f105612f.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thTerminate = this.f105608b.terminate();
                if (thTerminate != null) {
                    this.f105607a.onError(thTerminate);
                } else {
                    this.f105607a.onComplete();
                }
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f105608b.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f105610d) {
                if (decrementAndGet() == 0) {
                    this.f105607a.onError(this.f105608b.terminate());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f105607a.onError(this.f105608b.terminate());
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            try {
                qh2 qh2Var = (qh2) xjb.requireNonNull(this.f105609c.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                a aVar = new a();
                if (this.f105613m || !this.f105611e.add(aVar)) {
                    return;
                }
                qh2Var.subscribe(aVar);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f105612f.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f105612f, mf4Var)) {
                this.f105612f = mf4Var;
                this.f105607a.onSubscribe(this);
            }
        }
    }

    public zob(xub<T> xubVar, py6<? super T, ? extends qh2> py6Var, boolean z) {
        this.f105604a = xubVar;
        this.f105605b = py6Var;
        this.f105606c = z;
    }

    @Override // p000.z07
    public Observable<T> fuseToObservable() {
        return pfe.onAssembly(new xob(this.f105604a, this.f105605b, this.f105606c));
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f105604a.subscribe(new C16201a(dh2Var, this.f105605b, this.f105606c));
    }
}
