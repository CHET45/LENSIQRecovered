package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jvb<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final Observable<T> f52089a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends pof<? extends R>> f52090b;

    /* JADX INFO: renamed from: c */
    public final boolean f52091c;

    /* JADX INFO: renamed from: jvb$a */
    public static final class C8113a<T, R> extends AtomicInteger implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: F */
        public static final a<Object> f52092F = new a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f52093C;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f52094a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends pof<? extends R>> f52095b;

        /* JADX INFO: renamed from: c */
        public final boolean f52096c;

        /* JADX INFO: renamed from: d */
        public final cc0 f52097d = new cc0();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<a<R>> f52098e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public mf4 f52099f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f52100m;

        /* JADX INFO: renamed from: jvb$a$a */
        public static final class a<R> extends AtomicReference<mf4> implements inf<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: a */
            public final C8113a<?, R> f52101a;

            /* JADX INFO: renamed from: b */
            public volatile R f52102b;

            public a(C8113a<?, R> c8113a) {
                this.f52101a = c8113a;
            }

            /* JADX INFO: renamed from: a */
            public void m14356a() {
                ag4.dispose(this);
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                this.f52101a.m14355c(this, th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(R r) {
                this.f52102b = r;
                this.f52101a.m14354b();
            }
        }

        public C8113a(oxb<? super R> oxbVar, py6<? super T, ? extends pof<? extends R>> py6Var, boolean z) {
            this.f52094a = oxbVar;
            this.f52095b = py6Var;
            this.f52096c = z;
        }

        /* JADX INFO: renamed from: a */
        public void m14353a() {
            AtomicReference<a<R>> atomicReference = this.f52098e;
            a<Object> aVar = f52092F;
            a<R> andSet = atomicReference.getAndSet((a<R>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m14356a();
        }

        /* JADX INFO: renamed from: b */
        public void m14354b() {
            if (getAndIncrement() != 0) {
                return;
            }
            oxb<? super R> oxbVar = this.f52094a;
            cc0 cc0Var = this.f52097d;
            AtomicReference<a<R>> atomicReference = this.f52098e;
            int iAddAndGet = 1;
            while (!this.f52093C) {
                if (cc0Var.get() != null && !this.f52096c) {
                    oxbVar.onError(cc0Var.terminate());
                    return;
                }
                boolean z = this.f52100m;
                a<R> aVar = atomicReference.get();
                boolean z2 = aVar == null;
                if (z && z2) {
                    Throwable thTerminate = cc0Var.terminate();
                    if (thTerminate != null) {
                        oxbVar.onError(thTerminate);
                        return;
                    } else {
                        oxbVar.onComplete();
                        return;
                    }
                }
                if (z2 || aVar.f52102b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    v7b.m23844a(atomicReference, aVar, null);
                    oxbVar.onNext(aVar.f52102b);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m14355c(a<R> aVar, Throwable th) {
            if (!v7b.m23844a(this.f52098e, aVar, null) || !this.f52097d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f52096c) {
                this.f52099f.dispose();
                m14353a();
            }
            m14354b();
        }

        @Override // p000.mf4
        public void dispose() {
            this.f52093C = true;
            this.f52099f.dispose();
            m14353a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f52093C;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f52100m = true;
            m14354b();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f52097d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f52096c) {
                m14353a();
            }
            this.f52100m = true;
            m14354b();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            a<R> aVar;
            a<R> aVar2 = this.f52098e.get();
            if (aVar2 != null) {
                aVar2.m14356a();
            }
            try {
                pof pofVar = (pof) xjb.requireNonNull(this.f52095b.apply(t), "The mapper returned a null SingleSource");
                a aVar3 = new a(this);
                do {
                    aVar = this.f52098e.get();
                    if (aVar == f52092F) {
                        return;
                    }
                } while (!v7b.m23844a(this.f52098e, aVar, aVar3));
                pofVar.subscribe(aVar3);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f52099f.dispose();
                this.f52098e.getAndSet((a<R>) f52092F);
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f52099f, mf4Var)) {
                this.f52099f = mf4Var;
                this.f52094a.onSubscribe(this);
            }
        }
    }

    public jvb(Observable<T> observable, py6<? super T, ? extends pof<? extends R>> py6Var, boolean z) {
        this.f52089a = observable;
        this.f52090b = py6Var;
        this.f52091c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        if (nme.m18011c(this.f52089a, this.f52090b, oxbVar)) {
            return;
        }
        this.f52089a.subscribe(new C8113a(oxbVar, this.f52090b, this.f52091c));
    }
}
