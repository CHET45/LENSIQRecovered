package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class d7a<T> extends yd2 {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f28701a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends qh2> f28702b;

    /* JADX INFO: renamed from: d7a$a */
    public static final class C4657a<T> extends AtomicReference<mf4> implements l9a<T>, dh2, mf4 {
        private static final long serialVersionUID = -2177128922851101253L;

        /* JADX INFO: renamed from: a */
        public final dh2 f28703a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends qh2> f28704b;

        public C4657a(dh2 dh2Var, py6<? super T, ? extends qh2> py6Var) {
            this.f28703a = dh2Var;
            this.f28704b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f28703a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f28703a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                qh2 qh2Var = (qh2) xjb.requireNonNull(this.f28704b.apply(t), "The mapper returned a null CompletableSource");
                if (isDisposed()) {
                    return;
                }
                qh2Var.subscribe(this);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    public d7a(aaa<T> aaaVar, py6<? super T, ? extends qh2> py6Var) {
        this.f28701a = aaaVar;
        this.f28702b = py6Var;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        C4657a c4657a = new C4657a(dh2Var, this.f28702b);
        dh2Var.onSubscribe(c4657a);
        this.f28701a.subscribe(c4657a);
    }
}
