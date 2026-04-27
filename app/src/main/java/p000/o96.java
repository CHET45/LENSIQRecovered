package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class o96<T, U> extends ljf<U> implements v07<U> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f66908a;

    /* JADX INFO: renamed from: b */
    public final Callable<? extends U> f66909b;

    /* JADX INFO: renamed from: c */
    public final f11<? super U, ? super T> f66910c;

    /* JADX INFO: renamed from: o96$a */
    public static final class C10270a<T, U> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super U> f66911a;

        /* JADX INFO: renamed from: b */
        public final f11<? super U, ? super T> f66912b;

        /* JADX INFO: renamed from: c */
        public final U f66913c;

        /* JADX INFO: renamed from: d */
        public fdg f66914d;

        /* JADX INFO: renamed from: e */
        public boolean f66915e;

        public C10270a(inf<? super U> infVar, U u, f11<? super U, ? super T> f11Var) {
            this.f66911a = infVar;
            this.f66912b = f11Var;
            this.f66913c = u;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f66914d.cancel();
            this.f66914d = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f66914d == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f66915e) {
                return;
            }
            this.f66915e = true;
            this.f66914d = mdg.CANCELLED;
            this.f66911a.onSuccess(this.f66913c);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f66915e) {
                pfe.onError(th);
                return;
            }
            this.f66915e = true;
            this.f66914d = mdg.CANCELLED;
            this.f66911a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f66915e) {
                return;
            }
            try {
                this.f66912b.accept(this.f66913c, t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f66914d.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f66914d, fdgVar)) {
                this.f66914d = fdgVar;
                this.f66911a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public o96(m86<T> m86Var, Callable<? extends U> callable, f11<? super U, ? super T> f11Var) {
        this.f66908a = m86Var;
        this.f66909b = callable;
        this.f66910c = f11Var;
    }

    @Override // p000.v07
    public m86<U> fuseToFlowable() {
        return pfe.onAssembly(new m96(this.f66908a, this.f66909b, this.f66910c));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super U> infVar) {
        try {
            this.f66908a.subscribe((lj6) new C10270a(infVar, xjb.requireNonNull(this.f66909b.call(), "The initialSupplier returned a null value"), this.f66910c));
        } catch (Throwable th) {
            c05.error(th, infVar);
        }
    }
}
