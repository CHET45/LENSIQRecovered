package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class wec<T, R> extends fec<R> {

    /* JADX INFO: renamed from: a */
    public final fec<? extends T> f94040a;

    /* JADX INFO: renamed from: b */
    public final Callable<R> f94041b;

    /* JADX INFO: renamed from: c */
    public final j11<R, ? super T, R> f94042c;

    /* JADX INFO: renamed from: wec$a */
    public static final class C14567a<T, R> extends i34<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;

        /* JADX INFO: renamed from: N */
        public final j11<R, ? super T, R> f94043N;

        /* JADX INFO: renamed from: Q */
        public R f94044Q;

        /* JADX INFO: renamed from: X */
        public boolean f94045X;

        public C14567a(ycg<? super R> ycgVar, R r, j11<R, ? super T, R> j11Var) {
            super(ycgVar);
            this.f94044Q = r;
            this.f94043N = j11Var;
        }

        @Override // p000.i34, p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f45572L.cancel();
        }

        @Override // p000.i34, p000.ycg
        public void onComplete() {
            if (this.f94045X) {
                return;
            }
            this.f94045X = true;
            R r = this.f94044Q;
            this.f94044Q = null;
            complete(r);
        }

        @Override // p000.i34, p000.ycg
        public void onError(Throwable th) {
            if (this.f94045X) {
                pfe.onError(th);
                return;
            }
            this.f94045X = true;
            this.f94044Q = null;
            this.f52502a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f94045X) {
                return;
            }
            try {
                this.f94044Q = (R) xjb.requireNonNull(this.f94043N.apply(this.f94044Q, t), "The reducer returned a null value");
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

    public wec(fec<? extends T> fecVar, Callable<R> callable, j11<R, ? super T, R> j11Var) {
        this.f94040a = fecVar;
        this.f94041b = callable;
        this.f94042c = j11Var;
    }

    /* JADX INFO: renamed from: b */
    public void m24491b(ycg<?>[] ycgVarArr, Throwable th) {
        for (ycg<?> ycgVar : ycgVarArr) {
            x05.error(th, ycgVar);
        }
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f94040a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super R>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<? super Object>[] ycgVarArr2 = new ycg[length];
            for (int i = 0; i < length; i++) {
                try {
                    ycgVarArr2[i] = new C14567a(ycgVarArr[i], xjb.requireNonNull(this.f94041b.call(), "The initialSupplier returned a null value"), this.f94042c);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    m24491b(ycgVarArr, th);
                    return;
                }
            }
            this.f94040a.subscribe(ycgVarArr2);
        }
    }
}
