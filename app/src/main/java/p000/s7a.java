package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class s7a<T, R> extends AbstractC15921z2<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends aaa<? extends R>> f80909b;

    /* JADX INFO: renamed from: s7a$a */
    public static final class C12480a<T, R> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super R> f80910a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends aaa<? extends R>> f80911b;

        /* JADX INFO: renamed from: c */
        public mf4 f80912c;

        /* JADX INFO: renamed from: s7a$a$a */
        public final class a implements l9a<R> {
            public a() {
            }

            @Override // p000.l9a
            public void onComplete() {
                C12480a.this.f80910a.onComplete();
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                C12480a.this.f80910a.onError(th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(C12480a.this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(R r) {
                C12480a.this.f80910a.onSuccess(r);
            }
        }

        public C12480a(l9a<? super R> l9aVar, py6<? super T, ? extends aaa<? extends R>> py6Var) {
            this.f80910a = l9aVar;
            this.f80911b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            this.f80912c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f80910a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f80910a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f80912c, mf4Var)) {
                this.f80912c = mf4Var;
                this.f80910a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                aaa aaaVar = (aaa) xjb.requireNonNull(this.f80911b.apply(t), "The mapper returned a null MaybeSource");
                if (isDisposed()) {
                    return;
                }
                aaaVar.subscribe(new a());
            } catch (Exception e) {
                n75.throwIfFatal(e);
                this.f80910a.onError(e);
            }
        }
    }

    public s7a(aaa<T> aaaVar, py6<? super T, ? extends aaa<? extends R>> py6Var) {
        super(aaaVar);
        this.f80909b = py6Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super R> l9aVar) {
        this.f103681a.subscribe(new C12480a(l9aVar, this.f80909b));
    }
}
