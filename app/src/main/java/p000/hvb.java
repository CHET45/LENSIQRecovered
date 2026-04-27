package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class hvb<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final Observable<T> f44951a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends aaa<? extends R>> f44952b;

    /* JADX INFO: renamed from: c */
    public final boolean f44953c;

    /* JADX INFO: renamed from: hvb$a */
    public static final class C7031a<T, R> extends AtomicInteger implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: F */
        public static final a<Object> f44954F = new a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f44955C;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f44956a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends aaa<? extends R>> f44957b;

        /* JADX INFO: renamed from: c */
        public final boolean f44958c;

        /* JADX INFO: renamed from: d */
        public final cc0 f44959d = new cc0();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<a<R>> f44960e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public mf4 f44961f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f44962m;

        /* JADX INFO: renamed from: hvb$a$a */
        public static final class a<R> extends AtomicReference<mf4> implements l9a<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: a */
            public final C7031a<?, R> f44963a;

            /* JADX INFO: renamed from: b */
            public volatile R f44964b;

            public a(C7031a<?, R> c7031a) {
                this.f44963a = c7031a;
            }

            /* JADX INFO: renamed from: a */
            public void m12626a() {
                ag4.dispose(this);
            }

            @Override // p000.l9a
            public void onComplete() {
                this.f44963a.m12624c(this);
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                this.f44963a.m12625d(this, th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(R r) {
                this.f44964b = r;
                this.f44963a.m12623b();
            }
        }

        public C7031a(oxb<? super R> oxbVar, py6<? super T, ? extends aaa<? extends R>> py6Var, boolean z) {
            this.f44956a = oxbVar;
            this.f44957b = py6Var;
            this.f44958c = z;
        }

        /* JADX INFO: renamed from: a */
        public void m12622a() {
            AtomicReference<a<R>> atomicReference = this.f44960e;
            a<Object> aVar = f44954F;
            a<R> andSet = atomicReference.getAndSet((a<R>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m12626a();
        }

        /* JADX INFO: renamed from: b */
        public void m12623b() {
            if (getAndIncrement() != 0) {
                return;
            }
            oxb<? super R> oxbVar = this.f44956a;
            cc0 cc0Var = this.f44959d;
            AtomicReference<a<R>> atomicReference = this.f44960e;
            int iAddAndGet = 1;
            while (!this.f44955C) {
                if (cc0Var.get() != null && !this.f44958c) {
                    oxbVar.onError(cc0Var.terminate());
                    return;
                }
                boolean z = this.f44962m;
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
                if (z2 || aVar.f44964b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    v7b.m23844a(atomicReference, aVar, null);
                    oxbVar.onNext(aVar.f44964b);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m12624c(a<R> aVar) {
            if (v7b.m23844a(this.f44960e, aVar, null)) {
                m12623b();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m12625d(a<R> aVar, Throwable th) {
            if (!v7b.m23844a(this.f44960e, aVar, null) || !this.f44959d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f44958c) {
                this.f44961f.dispose();
                m12622a();
            }
            m12623b();
        }

        @Override // p000.mf4
        public void dispose() {
            this.f44955C = true;
            this.f44961f.dispose();
            m12622a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f44955C;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f44962m = true;
            m12623b();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f44959d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f44958c) {
                m12622a();
            }
            this.f44962m = true;
            m12623b();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            a<R> aVar;
            a<R> aVar2 = this.f44960e.get();
            if (aVar2 != null) {
                aVar2.m12626a();
            }
            try {
                aaa aaaVar = (aaa) xjb.requireNonNull(this.f44957b.apply(t), "The mapper returned a null MaybeSource");
                a aVar3 = new a(this);
                do {
                    aVar = this.f44960e.get();
                    if (aVar == f44954F) {
                        return;
                    }
                } while (!v7b.m23844a(this.f44960e, aVar, aVar3));
                aaaVar.subscribe(aVar3);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f44961f.dispose();
                this.f44960e.getAndSet((a<R>) f44954F);
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f44961f, mf4Var)) {
                this.f44961f = mf4Var;
                this.f44956a.onSubscribe(this);
            }
        }
    }

    public hvb(Observable<T> observable, py6<? super T, ? extends aaa<? extends R>> py6Var, boolean z) {
        this.f44951a = observable;
        this.f44952b = py6Var;
        this.f44953c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        if (nme.m18010b(this.f44951a, this.f44952b, oxbVar)) {
            return;
        }
        this.f44951a.subscribe(new C7031a(oxbVar, this.f44952b, this.f44953c));
    }
}
