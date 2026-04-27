package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class mdc<T, C> extends fec<C> {

    /* JADX INFO: renamed from: a */
    public final fec<? extends T> f60708a;

    /* JADX INFO: renamed from: b */
    public final Callable<? extends C> f60709b;

    /* JADX INFO: renamed from: c */
    public final f11<? super C, ? super T> f60710c;

    /* JADX INFO: renamed from: mdc$a */
    public static final class C9320a<T, C> extends i34<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;

        /* JADX INFO: renamed from: N */
        public final f11<? super C, ? super T> f60711N;

        /* JADX INFO: renamed from: Q */
        public C f60712Q;

        /* JADX INFO: renamed from: X */
        public boolean f60713X;

        public C9320a(ycg<? super C> ycgVar, C c, f11<? super C, ? super T> f11Var) {
            super(ycgVar);
            this.f60712Q = c;
            this.f60711N = f11Var;
        }

        @Override // p000.i34, p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f45572L.cancel();
        }

        @Override // p000.i34, p000.ycg
        public void onComplete() {
            if (this.f60713X) {
                return;
            }
            this.f60713X = true;
            C c = this.f60712Q;
            this.f60712Q = null;
            complete(c);
        }

        @Override // p000.i34, p000.ycg
        public void onError(Throwable th) {
            if (this.f60713X) {
                pfe.onError(th);
                return;
            }
            this.f60713X = true;
            this.f60712Q = null;
            this.f52502a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f60713X) {
                return;
            }
            try {
                this.f60711N.accept(this.f60712Q, t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // p000.i34, p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f45572L, fdgVar)) {
                this.f45572L = fdgVar;
                this.f52502a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public mdc(fec<? extends T> fecVar, Callable<? extends C> callable, f11<? super C, ? super T> f11Var) {
        this.f60708a = fecVar;
        this.f60709b = callable;
        this.f60710c = f11Var;
    }

    /* JADX INFO: renamed from: b */
    public void m17265b(ycg<?>[] ycgVarArr, Throwable th) {
        for (ycg<?> ycgVar : ycgVarArr) {
            x05.error(th, ycgVar);
        }
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f60708a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super C>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<? super Object>[] ycgVarArr2 = new ycg[length];
            for (int i = 0; i < length; i++) {
                try {
                    ycgVarArr2[i] = new C9320a(ycgVarArr[i], xjb.requireNonNull(this.f60709b.call(), "The initialSupplier returned a null value"), this.f60710c);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    m17265b(ycgVarArr, th);
                    return;
                }
            }
            this.f60708a.subscribe(ycgVarArr2);
        }
    }
}
