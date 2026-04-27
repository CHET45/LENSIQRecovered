package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class laa<T, U> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final zjd<U> f56971b;

    /* JADX INFO: renamed from: laa$a */
    public static final class C8741a<T, U> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = -2187421758664251153L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f56972a;

        /* JADX INFO: renamed from: b */
        public final a<U> f56973b = new a<>(this);

        /* JADX INFO: renamed from: laa$a$a */
        public static final class a<U> extends AtomicReference<fdg> implements lj6<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* JADX INFO: renamed from: a */
            public final C8741a<?, U> f56974a;

            public a(C8741a<?, U> c8741a) {
                this.f56974a = c8741a;
            }

            @Override // p000.ycg
            public void onComplete() {
                this.f56974a.m16058a();
            }

            @Override // p000.ycg
            public void onError(Throwable th) {
                this.f56974a.m16059b(th);
            }

            @Override // p000.ycg
            public void onNext(Object obj) {
                mdg.cancel(this);
                this.f56974a.m16058a();
            }

            @Override // p000.lj6, p000.ycg
            public void onSubscribe(fdg fdgVar) {
                mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
            }
        }

        public C8741a(l9a<? super T> l9aVar) {
            this.f56972a = l9aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m16058a() {
            if (ag4.dispose(this)) {
                this.f56972a.onComplete();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m16059b(Throwable th) {
            if (ag4.dispose(this)) {
                this.f56972a.onError(th);
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            mdg.cancel(this.f56973b);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            mdg.cancel(this.f56973b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f56972a.onComplete();
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            mdg.cancel(this.f56973b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f56972a.onError(th);
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            mdg.cancel(this.f56973b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f56972a.onSuccess(t);
            }
        }
    }

    public laa(aaa<T> aaaVar, zjd<U> zjdVar) {
        super(aaaVar);
        this.f56971b = zjdVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        C8741a c8741a = new C8741a(l9aVar);
        l9aVar.onSubscribe(c8741a);
        this.f56971b.subscribe(c8741a.f56973b);
        this.f103681a.subscribe(c8741a);
    }
}
