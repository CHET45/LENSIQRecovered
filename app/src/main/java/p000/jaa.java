package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jaa<T, U> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final aaa<U> f50106b;

    /* JADX INFO: renamed from: jaa$a */
    public static final class C7825a<T, U> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = -2187421758664251153L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f50107a;

        /* JADX INFO: renamed from: b */
        public final a<U> f50108b = new a<>(this);

        /* JADX INFO: renamed from: jaa$a$a */
        public static final class a<U> extends AtomicReference<mf4> implements l9a<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* JADX INFO: renamed from: a */
            public final C7825a<?, U> f50109a;

            public a(C7825a<?, U> c7825a) {
                this.f50109a = c7825a;
            }

            @Override // p000.l9a
            public void onComplete() {
                this.f50109a.m13916a();
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                this.f50109a.m13917b(th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(Object obj) {
                this.f50109a.m13916a();
            }
        }

        public C7825a(l9a<? super T> l9aVar) {
            this.f50107a = l9aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m13916a() {
            if (ag4.dispose(this)) {
                this.f50107a.onComplete();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m13917b(Throwable th) {
            if (ag4.dispose(this)) {
                this.f50107a.onError(th);
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            ag4.dispose(this.f50108b);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            ag4.dispose(this.f50108b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f50107a.onComplete();
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            ag4.dispose(this.f50108b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f50107a.onError(th);
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
            ag4.dispose(this.f50108b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f50107a.onSuccess(t);
            }
        }
    }

    public jaa(aaa<T> aaaVar, aaa<U> aaaVar2) {
        super(aaaVar);
        this.f50106b = aaaVar2;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        C7825a c7825a = new C7825a(l9aVar);
        l9aVar.onSubscribe(c7825a);
        this.f50106b.subscribe(c7825a.f50108b);
        this.f103681a.subscribe(c7825a);
    }
}
