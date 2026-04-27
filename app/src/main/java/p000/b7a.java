package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class b7a<T, U, R> extends AbstractC15921z2<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends aaa<? extends U>> f12898b;

    /* JADX INFO: renamed from: c */
    public final j11<? super T, ? super U, ? extends R> f12899c;

    /* JADX INFO: renamed from: b7a$a */
    public static final class C1772a<T, U, R> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final py6<? super T, ? extends aaa<? extends U>> f12900a;

        /* JADX INFO: renamed from: b */
        public final a<T, U, R> f12901b;

        /* JADX INFO: renamed from: b7a$a$a */
        public static final class a<T, U, R> extends AtomicReference<mf4> implements l9a<U> {
            private static final long serialVersionUID = -2897979525538174559L;

            /* JADX INFO: renamed from: a */
            public final l9a<? super R> f12902a;

            /* JADX INFO: renamed from: b */
            public final j11<? super T, ? super U, ? extends R> f12903b;

            /* JADX INFO: renamed from: c */
            public T f12904c;

            public a(l9a<? super R> l9aVar, j11<? super T, ? super U, ? extends R> j11Var) {
                this.f12902a = l9aVar;
                this.f12903b = j11Var;
            }

            @Override // p000.l9a
            public void onComplete() {
                this.f12902a.onComplete();
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                this.f12902a.onError(th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(U u) {
                T t = this.f12904c;
                this.f12904c = null;
                try {
                    this.f12902a.onSuccess(xjb.requireNonNull(this.f12903b.apply(t, u), "The resultSelector returned a null value"));
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f12902a.onError(th);
                }
            }
        }

        public C1772a(l9a<? super R> l9aVar, py6<? super T, ? extends aaa<? extends U>> py6Var, j11<? super T, ? super U, ? extends R> j11Var) {
            this.f12901b = new a<>(l9aVar, j11Var);
            this.f12900a = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f12901b);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f12901b.get());
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f12901b.f12902a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f12901b.f12902a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this.f12901b, mf4Var)) {
                this.f12901b.f12902a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                aaa aaaVar = (aaa) xjb.requireNonNull(this.f12900a.apply(t), "The mapper returned a null MaybeSource");
                if (ag4.replace(this.f12901b, null)) {
                    a<T, U, R> aVar = this.f12901b;
                    aVar.f12904c = t;
                    aaaVar.subscribe(aVar);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f12901b.f12902a.onError(th);
            }
        }
    }

    public b7a(aaa<T> aaaVar, py6<? super T, ? extends aaa<? extends U>> py6Var, j11<? super T, ? super U, ? extends R> j11Var) {
        super(aaaVar);
        this.f12898b = py6Var;
        this.f12899c = j11Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super R> l9aVar) {
        this.f103681a.subscribe(new C1772a(l9aVar, this.f12898b, this.f12899c));
    }
}
