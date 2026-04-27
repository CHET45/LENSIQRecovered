package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class o9a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final py6<? super Throwable, ? extends aaa<? extends T>> f66916b;

    /* JADX INFO: renamed from: c */
    public final boolean f66917c;

    /* JADX INFO: renamed from: o9a$a */
    public static final class C10271a<T> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = 2026620218879969836L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f66918a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Throwable, ? extends aaa<? extends T>> f66919b;

        /* JADX INFO: renamed from: c */
        public final boolean f66920c;

        /* JADX INFO: renamed from: o9a$a$a */
        public static final class a<T> implements l9a<T> {

            /* JADX INFO: renamed from: a */
            public final l9a<? super T> f66921a;

            /* JADX INFO: renamed from: b */
            public final AtomicReference<mf4> f66922b;

            public a(l9a<? super T> l9aVar, AtomicReference<mf4> atomicReference) {
                this.f66921a = l9aVar;
                this.f66922b = atomicReference;
            }

            @Override // p000.l9a
            public void onComplete() {
                this.f66921a.onComplete();
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                this.f66921a.onError(th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this.f66922b, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(T t) {
                this.f66921a.onSuccess(t);
            }
        }

        public C10271a(l9a<? super T> l9aVar, py6<? super Throwable, ? extends aaa<? extends T>> py6Var, boolean z) {
            this.f66918a = l9aVar;
            this.f66919b = py6Var;
            this.f66920c = z;
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
            this.f66918a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            if (!this.f66920c && !(th instanceof Exception)) {
                this.f66918a.onError(th);
                return;
            }
            try {
                aaa aaaVar = (aaa) xjb.requireNonNull(this.f66919b.apply(th), "The resumeFunction returned a null MaybeSource");
                ag4.replace(this, null);
                aaaVar.subscribe(new a(this.f66918a, this));
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f66918a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f66918a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f66918a.onSuccess(t);
        }
    }

    public o9a(aaa<T> aaaVar, py6<? super Throwable, ? extends aaa<? extends T>> py6Var, boolean z) {
        super(aaaVar);
        this.f66916b = py6Var;
        this.f66917c = z;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C10271a(l9aVar, this.f66916b, this.f66917c));
    }
}
